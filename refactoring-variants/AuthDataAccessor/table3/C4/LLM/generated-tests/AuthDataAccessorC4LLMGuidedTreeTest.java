package org.apache.syncope.core.spring.security;

import static org.evosuite.shaded.org.mockito.ArgumentMatchers.anyVararg;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

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
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.core.Authentication;

/*
 * Extracted public and protected methods (signatures) from AuthDataAccessor C4:
 *
 * public JWTSSOProvider getJWTSSOProvider(final String issuer)
 * protected String getDelegationKey(final SyncopeAuthenticationDetails details, final String delegatedKey)
 * public UsernamePasswordAuthResult authenticate(final String domain, final Authentication authentication)
 * protected User findUserForAuthentication(final String domain, final Authentication authentication)
 * protected void checkSuspended(final User user)
 * protected void checkAllowedStatus(final String domain, final User user)
 * protected boolean usernamePasswordAuthentication(final User user, final String password)
 * protected Set<ExternalResource> getPassthroughResources(final User user)
 * protected Set<SyncopeGrantedAuthority> getAdminAuthorities()
 * protected Set<SyncopeGrantedAuthority> buildAuthorities(final Map<String, Set<String>> entForRealms)
 * protected Set<SyncopeGrantedAuthority> getUserAuthorities(final User user)
 * protected Set<SyncopeGrantedAuthority> getDelegatedAuthorities(final Delegation delegation)
 * public Set<SyncopeGrantedAuthority> getAuthorities(final String username, final String delegationKey)
 * public JWTAuthResult authenticate(final JWTAuthentication authentication)
 * public void removeExpired(final String tokenKey)
 * public void audit(final String domain, final String username, final String delegationKey,
 *                   final OpEvent.Outcome outcome, final Object output, final Object... input)
 *
 * The tests below focus on observable behaviors that can be exercised with Mockito.
 */

@RunWith(MockitoJUnitRunner.class)
public class AuthDataAccessorC4LLMGuidedTreeTest {

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

    private List<JWTSSOProvider> jwtSSOProviders;

    private AuthDataAccessor authDataAccessor;

    @Before
    public void setUp() {
        // default empty providers list; individual tests may re-create authDataAccessor with different lists
        jwtSSOProviders = new ArrayList<>();
        authDataAccessor = Mockito.spy(new AuthDataAccessor(
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
                jwtSSOProviders));
    }

    // Test getJWTSSOProvider returns the matching provider when issuer matches
    @Test
    public void testGetJWTSSOProviderFound() {
        JWTSSOProvider provider = mock(JWTSSOProvider.class);
        when(provider.getIssuer()).thenReturn("issuer-1");

        jwtSSOProviders.clear();
        jwtSSOProviders.add(provider);

        // re-create accessor with provider list containing the mock
        authDataAccessor = Mockito.spy(new AuthDataAccessor(
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
                mapping_manager_or_null(mappingManager),
                jwtSSOProviders));

        // Expected: returns the provider matching issuer
        JWTSSOProvider found = authDataAccessor.getJWTSSOProvider("issuer-1");
        assertNotNull(found);
        assertSame(provider, found);
    }

    // Helper to satisfy constructor ordering constraint without creating duplicate mappingManager variable
    private MappingManager mapping_manager_or_null(MappingManager mm) {
        return mm;
    }

    // Test getJWTSSOProvider throws when issuer is null
    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void testGetJWTSSOProviderNullIssuer() {
        authDataAccessor.getJWTSSOProvider(null);
    }

    // Test getJWTSSOProvider throws when no provider matches
    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void testGetJWTSSOProviderNotFound() {
        jwtSSOProviders.clear();
        authDataAccessor = Mockito.spy(new AuthDataAccessor(
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
                connector_manager_or_null(connectorManager),
                auditManager,
                mapping_manager_or_null(mappingManager),
                jwtSSOProviders));

        authDataAccessor.getJWTSSOProvider("unknown-issuer");
    }

    private ConnectorManager connector_manager_or_null(ConnectorManager cm) {
        return cm;
    }

    // Test getDelegationKey returns null when details.getDelegatedBy() is null
    @Test
    public void testGetDelegationKeyReturnsNullWhenNoDelegatedBy() {
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn(null);

        String result = authDataAccessor.getDelegationKey(details, "delegatedKey");
        assertNull(result);
    }

    // Test getDelegationKey throws when delegating user cannot be found
    @Test(expected = SessionAuthenticationException.class)
    public void testGetDelegationKeyDelegatingUserNotFound() {
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn("someUser");

        doReturn(Optional.empty()).when(userDAO).findKey("someUser");

        authDataAccessor.getDelegationKey(details, "delegatedKey");
    }

    // Test getDelegationKey throws when no valid delegation exists
    @Test(expected = SessionAuthenticationException.class)
    public void testGetDelegationKeyDelegationNotFound() {
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn("someUser");

        doReturn(Optional.of("delegatingKey")).when(userDAO).findKey("someUser");
        doReturn(Optional.empty()).when(delegationDAO).findValidFor(eq("delegatingKey"), eq("delegatedKey"), any(OffsetDateTime.class));

        authDataAccessor.getDelegationKey(details, "delegatedKey");
    }

    // Test authenticate returns null result when no user found for authentication attributes
    @Test
    public void testAuthenticateUserNotFoundReturnsNullResult() {
        String domain = "testDomain";
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn("unknownUser");



        // ensure authentication.attributes resolves to username
        when(confParamOps.get(eq(domain), eq("authentication.attributes"), any(), eq(String[].class))).
                thenReturn(new String[] { "username" });

        doReturn(Optional.empty()).when(userDAO).findByUsername("unknownUser");

        AuthDataAccessor.UsernamePasswordAuthResult result = authDataAccessor.authenticate(domain, authentication);
        assertNotNull(result);
        assertNull(result.user());
        assertNull(result.authenticated());
        assertNull(result.delegationKey());
    }

    // Test authenticate throws DisabledException when user is suspended
    @Test(expected = DisabledException.class)
    public void testAuthenticateSuspendedUserThrowsDisabledException() {
        String domain = "testDomain";
        String username = "suspendedUser";

        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn(username);


        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);



        when(confParamOps.get(eq(domain), eq("authentication.attributes"), any(), eq(String[].class))).
                thenReturn(new String[] { "username" });

        org.apache.syncope.core.persistence.api.entity.user.User user =
                mock(org.apache.syncope.core.persistence.api.entity.user.User.class);
        when(user.getUsername()).thenReturn(username);
        when(user.isSuspended()).thenReturn(Boolean.TRUE);

        doReturn(Optional.of(user)).when(userDAO).findByUsername(username);

        authDataAccessor.authenticate(domain, authentication);
    }

    // Test removeExpired delegates to accessTokenDAO.deleteById
    @Test
    public void testRemoveExpiredDeletesToken() {
        String tokenKey = "token-123";
        authDataAccessor.removeExpired(tokenKey);
        verify(accessTokenDAO).deleteById(tokenKey);
    }

    // Test audit invokes auditManager.audit with username including delegation info when provided
    @Test
    public void testAuditInvokesAuditManagerWithDelegation() {
        String domain = "dom";
        String username = "alice";
        String delegationKey = "delKey";
        OpEvent.Outcome outcome = OpEvent.Outcome.SUCCESS;
        Object output = "out";
        Object input = "in";

        authDataAccessor.audit(domain, username, delegationKey, outcome, output, input);

        ArgumentCaptor<String> userCaptor = ArgumentCaptor.forClass(String.class);
        verify(auditManager).audit(
                eq(domain),
                userCaptor.capture(),
                eq(OpEvent.CategoryType.LOGIC),
                eq(OpEvent.AUTHENTICATION_CATEGORY),
                isNull(),
                eq(OpEvent.LOGIN_OP),
                eq(outcome),
                isNull(),
                eq(output),
                any());

        String auditedUser = userCaptor.getValue();
        assertTrue("Audited username should contain delegation key info", auditedUser.contains(delegationKey));
    }
}
