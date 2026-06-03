package org.apache.syncope.core.spring.security;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import org.apache.syncope.common.lib.types.IdRepoEntitlement;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.core.persistence.api.EncryptorManager;
import org.apache.syncope.core.persistence.api.dao.AccessTokenDAO;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.DelegationDAO;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.RoleDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

/**
 * AuthDataAccessorC2LLMGuidedTreeTest
 *
 * Focused, stable tests for AuthDataAccessor C2 variant.
 */
@RunWith(MockitoJUnitRunner.class)
public class AuthDataAccessorC2LLMGuidedTreeTest {

    @Mock
    private SecurityProperties securityProperties;

    @Mock
    private EncryptorManager encryptorManager;

    @Mock
    private RealmSearchDAO realmSearchDAO;

    @Mock
    private UserDAO userDAO;

    @Mock
    private GroupDAO groupDAO;

    @Mock
    private AnySearchDAO anySearchDAO;

    @Mock
    private AccessTokenDAO accessTokenDAO;

    @Mock
    private ConfParamOps confParamOps;

    @Mock
    private RoleDAO roleDAO;

    @Mock
    private DelegationDAO delegationDAO;

    @Mock
    private ExternalResourceDAO resourceDAO;

    @Mock
    private ConnectorManager connectorManager;

    @Mock
    private AuditManager auditManager;

    @Mock
    private MappingManager mapping_manager;

    // Use a real empty list for JWTSSOProviders as required
    private java.util.List<JWTSSOProvider> jwtSSOProviders = Collections.emptyList();

    // The spy under test
    private AuthDataAccessor authDataAccessor;

    @Before
    public void setUp() {
        // Instantiate the AuthDataAccessor spy with mocks in the exact constructor order required.
        authDataAccessor = spy(new AuthDataAccessor(
                securityProperties,
                encryptorManager,
                realmSearchDAO,
                userDAO,
                groupDAO,
                anySearchDAO,
                accessTokenDAO,
                confParamOps,
                roleDAO,
                delegationDAO,
                resourceDAO,
                connectorManager,
                auditManager,
                mapping_manager,
                jwtSSOProviders));
    }

    // -------------------------
    // Tests for getJWTSSOProvider
    // -------------------------

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void getJWTSSOProviderShouldRejectNullIssuer() {
        // Null issuer is not permitted and should throw AuthenticationCredentialsNotFoundException.
        authDataAccessor.getJWTSSOProvider(null);
    }

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void getJWTSSOProviderShouldRejectUnknownIssuer() {
        // Unknown issuer should cause AuthenticationCredentialsNotFoundException (no providers registered).
        authDataAccessor.getJWTSSOProvider("unknown-issuer");
    }

    // -------------------------
    // Tests for username/password authenticate(domain, authentication)
    // -------------------------

    @Test
    public void authenticateShouldReturnNullWhenUserNotFound() {
        // When no user matches authentication name, UsernamePasswordAuthResult.user is null.
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn("nonexistent");
        doReturn(new String[] { "username" }).when(confParamOps).
                get(anyString(), eq("authentication.attributes"), any(), eq(String[].class));

        doReturn(Optional.empty()).when(userDAO).findByUsername("nonexistent");

        AuthDataAccessor.UsernamePasswordAuthResult result =
                authDataAccessor.authenticate("domain", authentication);

        assertNull("User should be null when not found", result.user());
        assertNull("Authenticated flag should be null when no user found", result.authenticated());
    }

    @Test(expected = DisabledException.class)
    public void authenticateShouldThrowWhenUserSuspended() {
        // Suspended user should cause DisabledException.
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn("suspendedUser");
        doReturn(new String[] { "username" }).when(confParamOps).
                get(anyString(), eq("authentication.attributes"), any(), eq(String[].class));

        org.apache.syncope.core.persistence.api.entity.user.User user =
                mock(org.apache.syncope.core.persistence.api.entity.user.User.class);
        doReturn(Optional.of(user)).when(userDAO).findByUsername("suspendedUser");
        when(user.isSuspended()).thenReturn(Boolean.TRUE);

        authDataAccessor.authenticate("domain", authentication);
    }

    @Test
    public void authenticateShouldSetLastLoginAndResetFailedLoginsOnSuccess() {
        // When authentication succeeds, lastLoginDate is set and failedLogins reset to 0.
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn("goodUser");
        when(authentication.getCredentials()).thenReturn("password");
        when(authentication.getDetails()).thenReturn(mock(SyncopeAuthenticationDetails.class));
        doReturn(new String[] { "username" }).when(confParamOps).
                get(anyString(), eq("authentication.attributes"), any(), eq(String[].class));
        // Allow status "active"
        doReturn(new String[] { "active" }).when(confParamOps).
                get(anyString(), eq("authentication.statuses"), any(), eq(String[].class));

        org.apache.syncope.core.persistence.api.entity.user.User user =
                mock(org.apache.syncope.core.persistence.api.entity.user.User.class);
        doReturn(Optional.of(user)).when(userDAO).findByUsername("goodUser");
        when(user.isSuspended()).thenReturn(Boolean.FALSE);
        when(user.getStatus()).thenReturn("active");
        when(user.getFailedLogins()).thenReturn(2);

        // Stub usernamePasswordAuthentication to avoid encryption/connector internals
        doReturn(true).when(authDataAccessor).usernamePasswordAuthentication(eq(user), anyString());

        // When user is saved, return the same user
        when(userDAO.save(user)).thenReturn(user);
        when(confParamOps.get(
                anyString(),
                eq("log.lastlogindate"),
                any(),
                eq(Boolean.class))).
                thenReturn(Boolean.TRUE);
        AuthDataAccessor.UsernamePasswordAuthResult result =
                authDataAccessor.authenticate("domain", authentication);

        assertNotNull("User should be returned on success", result.user());
        assertTrue("Authenticated should be true on success", result.authenticated());
        // Verify that lastLoginDate and failedLogins were updated on the user object
        verify(user).setLastLoginDate(any(OffsetDateTime.class));
        verify(user).setFailedLogins(0);
    }

    @Test
    public void authenticateShouldIncrementFailedLoginsOnFailure() {
        // When authentication fails, failedLogins is incremented and user saved.
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn("badUser");
        when(authentication.getCredentials()).thenReturn("wrong");

        doReturn(new String[] { "username" }).when(confParamOps).
                get(anyString(), eq("authentication.attributes"), any(), eq(String[].class));
        // Allow status "active"
        doReturn(new String[] { "active" }).when(confParamOps).
                get(anyString(), eq("authentication.statuses"), any(), eq(String[].class));

        org.apache.syncope.core.persistence.api.entity.user.User user =
                mock(org.apache.syncope.core.persistence.api.entity.user.User.class);
        doReturn(Optional.of(user)).when(userDAO).findByUsername("badUser");
        when(user.isSuspended()).thenReturn(Boolean.FALSE);
        when(user.getStatus()).thenReturn("active");
        when(user.getFailedLogins()).thenReturn(1);

        // Force authentication to fail
        doReturn(false).when(authDataAccessor).usernamePasswordAuthentication(eq(user), anyString());

        when(userDAO.save(user)).thenReturn(user);

        AuthDataAccessor.UsernamePasswordAuthResult result =
                authDataAccessor.authenticate("domain", authentication);

        assertNotNull("User should be returned even on failed authentication", result.user());
        assertFalse("Authenticated should be false on failure", result.authenticated());
        verify(user).setFailedLogins(2);
    }

    // -------------------------
    // Tests for getAuthorities
    // -------------------------

    @Test
    public void getAuthoritiesShouldReturnAnonymousAuthoritiesForAnonymousUser() {
        // When username equals configured anonymous user, return ANONYMOUS_AUTHORITIES.
        when(securityProperties.getAnonymousUser()).thenReturn("anonymous");
        Set<SyncopeGrantedAuthority> authorities =
                authDataAccessor.getAuthorities("anonymous", null);

        assertNotNull(authorities);
        boolean containsAnonymous = authorities.stream()
                .anyMatch(a -> a.getAuthority().contains(IdRepoEntitlement.ANONYMOUS));
        assertTrue("Authorities should contain ANONYMOUS entitlement", containsAnonymous);
    }

    @Test
    public void getAuthoritiesShouldTreatAdminAsSpecialIdentity() {
        // When username equals configured admin user, ensure admin path is taken without normal user lookup.
        when(securityProperties.getAnonymousUser()).thenReturn("anonymous");
        when(securityProperties.getAdminUser()).thenReturn("admin");
        Set<SyncopeGrantedAuthority> authorities =
                authDataAccessor.getAuthorities("admin", null);

        assertNotNull(authorities);
        // Verify that no user lookup or delegation lookup was performed for admin identity
        verify(userDAO, never()).findByUsername("admin");
        verify(delegationDAO, never()).findById(anyString());
    }

    // -------------------------
    // Tests for removeExpired
    // -------------------------

    @Test
    public void removeExpiredShouldDeleteAccessTokenById() {
        // removeExpired delegates to accessTokenDAO.deleteById
        authDataAccessor.removeExpired("token-key");
        verify(accessTokenDAO).deleteById("token-key");
    }

    // -------------------------
    // Tests for audit
    // -------------------------

    @Test
    public void auditShouldDelegateToAuditManager() {
        // audit method calls auditManager.audit with composed username including delegation info when present.
        authDataAccessor.audit("domain", "user", null, OpEvent.Outcome.SUCCESS, "out");

        // Verify auditManager.audit was invoked with expected domain and outcome and exact argument shape.
        verify(auditManager).audit(
                eq("domain"),
                eq("user"),
                eq(OpEvent.CategoryType.LOGIC),
                eq(OpEvent.AUTHENTICATION_CATEGORY),
                isNull(),
                eq(OpEvent.LOGIN_OP),
                eq(OpEvent.Outcome.SUCCESS),
                isNull(),
                eq("out"));
    }

    // -------------------------
    // Tests for getDelegationKey protected behavior via delegation path
    // -------------------------

    @Test(expected = SessionAuthenticationException.class)
    public void getDelegationKeyShouldThrowWhenDelegatingUserNotFound() {
        // When details.getDelegatedBy is set but delegating user cannot be found, throw SessionAuthenticationException.
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn("nonexistent-delegator");
        doReturn(Optional.empty()).when(userDAO).findKey("nonexistent-delegator");

        // Call protected method directly (same package) to trigger exception
        authDataAccessor.getDelegationKey(details, "delegatedKey");
    }
}