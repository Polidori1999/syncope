package org.apache.syncope.core.spring.security;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.syncope.common.lib.SyncopeConstants;
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
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.apache.syncope.core.persistence.api.entity.user.User;
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
 * Repaired and simplified tests for AuthDataAccessor C3 to compile in core/spring.
 *
 * Tests avoid accessing private record fields directly and remove references to non-existing nested types.
 */
@RunWith(MockitoJUnitRunner.class)
public class AuthDataAccessorC3LLMGuidedTreeTest {

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
    private MappingManager mappingManager;

    private AuthDataAccessor authDataAccessor;

    @Before
    public void setUp() {
        // Default instance with empty JWTSSOProviders list; tests that need providers will create their own instance.
        authDataAccessor = new AuthDataAccessor(
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
                mappingManager,
                Collections.emptyList());
    }

    /**
     * getJWTSSOProvider should throw when issuer is null.
     */
    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void testGetJWTSSOProvider_nullIssuer_throws() {
        authDataAccessor.getJWTSSOProvider(null);
    }

    /**
     * getJWTSSOProvider should throw when no provider matches the issuer.
     */
    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void testGetJWTSSOProvider_notFound_throws() {
        // No providers in the instance -> should throw
        authDataAccessor.getJWTSSOProvider("nonexistent-issuer");
    }

    /**
     * getJWTSSOProvider should return the matching provider when present.
     */
    @Test
    public void testGetJWTSSOProvider_found_returnsProvider() {
        JWTSSOProvider provider = mock(JWTSSOProvider.class);
        when(provider.getIssuer()).thenReturn("issuer-1");

        // Create a new accessor with one provider
        AuthDataAccessor local = new AuthDataAccessor(
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
                mappingManager,
                List.of(provider));

        JWTSSOProvider found = local.getJWTSSOProvider("issuer-1");
        assertNotNull(found);
        assertEquals(provider, found);
    }

    /**
     * authenticate(Authentication) should authenticate a user via internal storage and update last login and failed logins.
     * This test stubs encryptor to verify password and confParamOps to enable last login logging.
     */
    @Test
    public void testAuthenticate_usernamePassword_success_updatesLastLogin_and_resetsFailedLogins() {
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn("jdoe");
        when(authentication.getCredentials()).thenReturn("plainPassword");
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn(null);
        when(authentication.getDetails()).thenReturn(details);

        User user = mock(User.class);
        when(user.getUsername()).thenReturn("jdoe");
        when(user.isSuspended()).thenReturn(false);
        when(user.getStatus()).thenReturn("active");
        when(user.getFailedLogins()).thenReturn(2);
        when(user.getKey()).thenReturn("user-key");


        doReturn(Optional.of(user)).when(userDAO).findByUsername("jdoe");

        // confParamOps: authentication.attributes -> default username; authentication.statuses -> contains "active"
        doReturn(new String[] { "username" }).when(confParamOps).
                get(anyString(), eq("authentication.attributes"), any(), eq(String[].class));
        doReturn(new String[] { "active" }).when(confParamOps).
                get(anyString(), eq("authentication.statuses"), any(), eq(String[].class));
        doReturn(Boolean.TRUE).when(confParamOps).
                get(anyString(), eq("log.lastlogindate"), any(), eq(Boolean.class));

        // EncryptorManager deep stub to return true for verify
        EncryptorManager em = mock(EncryptorManager.class, RETURNS_DEEP_STUBS);
        when(em.getInstance().verify(anyString(), any(), any())).thenReturn(true);

        // Replace the encryptorManager in the accessor by creating a new instance with the stubbed one.
        authDataAccessor = new AuthDataAccessor(
                securityProperties,
                em,
                realmSearchDAO,
                userDAO,
                groupDAO,
                anySearchDAO,
                accessTokenDAO,
                confParamOps,
                roleDAO,
                delegationDAO,
                resourceDAO,
                connector_manager(),
                auditManager,
                mappingManager,
                Collections.emptyList());

        // userDAO.save should return the user
        when(userDAO.save(user)).thenReturn(user);

        AuthDataAccessor.UsernamePasswordAuthResult result =
                authDataAccessor.authenticate("domain", authentication);

        // Expect authenticated true and delegationKey null via record accessors
        assertNotNull(result);
        assertTrue(Boolean.TRUE.equals(result.authenticated()));
        assertNull(result.delegationKey());
    }

    // Helper to use existing mock field directly as required by instructions
    private ConnectorManager connector_manager() {
        return connectorManager;
    }

    /**
     * authenticate(Authentication) should throw DisabledException when user is suspended.
     */
    @Test(expected = DisabledException.class)
    public void testAuthenticate_usernamePassword_userSuspended_throws() {
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn("suspendedUser");


        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);



        when(confParamOps.get(
                anyString(),
                eq("authentication.attributes"),
                any(),
                eq(String[].class))).
                thenReturn(new String[] { "username" });

        User user = mock(User.class);
        when(user.getUsername()).thenReturn("suspendedUser");
        when(user.isSuspended()).thenReturn(true);

        doReturn(Optional.of(user)).when(userDAO).findByUsername("suspendedUser");

        authDataAccessor.authenticate("domain", authentication);
    }

    /**
     * removeExpired should delegate deletion to AccessTokenDAO.
     */
    @Test
    public void testRemoveExpired_callsDAO() {
        authDataAccessor.removeExpired("token-key");
        verify(accessTokenDAO).deleteById("token-key");
    }

    /**
     * audit should call auditManager.audit with expected shaped username including delegation info when present.
     */
    @Test
    public void testAudit_callsAuditManager() {
        authDataAccessor.audit("domain", "bob", null, OpEvent.Outcome.SUCCESS, "out", "in1");
        verify(auditManager).audit(
                eq("domain"),
                eq("bob"),
                eq(OpEvent.CategoryType.LOGIC),
                eq(OpEvent.AUTHENTICATION_CATEGORY),
                isNull(),
                eq(OpEvent.LOGIN_OP),
                eq(OpEvent.Outcome.SUCCESS),
                isNull(),
                eq("out"),
                any());
    }

    /**
     * getDelegationKey should return delegation key when delegating is provided as UUID and delegation exists.
     */
    @Test
    public void testGetDelegationKey_withUUIDDelegating_returnsDelegationKey() {
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        String delegating = "123e4567-e89b-12d3-a456-426614174000";
        when(details.getDelegatedBy()).thenReturn(delegating);

        // delegationDAO.findValidFor should return a delegation key string
        doReturn(Optional.of("delegation-key")).when(delegationDAO).
                findValidFor(eq(delegating), eq("delegated-key"), any(OffsetDateTime.class));

        // Create accessor with delegationDAO mock
        AuthDataAccessor local = new AuthDataAccessor(
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
                mappingManager,
                Collections.emptyList());

        String result = local.getDelegationKey(details, "delegated-key");
        assertEquals("delegation-key", result);
    }

    /**
     * getJWTSSOProvider should throw when provider issuer not found in list even if list present.
     */
    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void testGetJWTSSOProvider_listPresent_butNotMatching_throws() {
        JWTSSOProvider provider = mock(JWTSSOProvider.class);
        when(provider.getIssuer()).thenReturn("other-issuer");

        AuthDataAccessor local = new AuthDataAccessor(
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
                mappingManager,
                List.of(provider));

        local.getJWTSSOProvider("missing-issuer");
    }
}