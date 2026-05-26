
package org.apache.syncope.core.spring.security;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.*;

import javax.security.auth.login.AccountNotFoundException;

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
import org.apache.syncope.core.persistence.api.entity.Delegation;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.core.Authentication;

/**
 * AuthDataAccessorLLMGuidedTreeTest
 *
 * Generated focused JUnit 4 tests using Mockito for AuthDataAccessor.
 *
 * Each test includes a short comment explaining the expected behavior.
 */
@RunWith(MockitoJUnitRunner.class)
public class AuthDataAccessorLLMGuidedTreeTest {

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

    // We'll use a real list for JWTSSOProviders as required by instructions.
    private List<JWTSSOProvider> jwtSSOProviders;

    private AuthDataAccessor authDataAccessor;

    @Before
    public void setUp() {
        // Default empty providers list; individual tests may replace it by creating a new instance.
        jwtSSOProviders = Collections.emptyList();

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
                jwtSSOProviders);
    }

    // -------------------------
    // Tests for getJWTSSOProvider
    // -------------------------

    @Test
    public void getJWTSSOProviderShouldReturnMatchingProvider() {
        // Expectation: when a provider with matching issuer exists, it is returned.
        JWTSSOProvider provider = mock(JWTSSOProvider.class);
        when(provider.getIssuer()).thenReturn("issuer-1");

        // Recreate accessor with a real list containing the mock provider
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
                mapping_manager_or_null(),
                List.of(provider));

        JWTSSOProvider found = authDataAccessor.getJWTSSOProvider("issuer-1");
        assertNotNull("Provider should be found for matching issuer", found);
        assertEquals("Returned provider must be the same instance", provider, found);
    }

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void getJWTSSOProviderShouldThrowWhenIssuerMissing() {
        // Expectation: when no provider matches the issuer, an AuthenticationCredentialsNotFoundException is thrown.
        JWTSSOProvider provider = mock(JWTSSOProvider.class);
        when(provider.getIssuer()).thenReturn("other-issuer");

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
                connector_manager_or_null(),
                auditManager,
                mapping_manager_or_null(),
                List.of(provider));

        // This should throw because "missing-issuer" is not provided by the single provider in the list.
        authDataAccessor.getJWTSSOProvider("missing-issuer");
    }

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void getJWTSSOProviderShouldThrowOnNullIssuer() {
        // Expectation: passing null issuer triggers AuthenticationCredentialsNotFoundException as per source code.
        authDataAccessor.getJWTSSOProvider(null);
    }

    // -------------------------
    // Tests for getDelegationKey
    // -------------------------

    @Test
    public void getDelegationKeyShouldReturnNullWhenNoDelegatedBy() {
        // Expectation: when SyncopeAuthenticationDetails.getDelegatedBy() returns null, getDelegationKey returns null.
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn(null);

        String result = authDataAccessor.getDelegationKey(details, "delegatedKey");
        assertNull("Delegation key should be null when no delegatedBy is present", result);
    }

    @Test(expected = SessionAuthenticationException.class)
    public void getDelegationKeyShouldThrowWhenDelegatingUserNotFound() {
        // Expectation: when delegatedBy is a username and userDAO.findKey returns empty, a SessionAuthenticationException is thrown.
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn("nonexistentUser");

        when(userDAO.findKey("nonexistentUser")).thenReturn(Optional.empty());

        authDataAccessor.getDelegationKey(details, "delegatedKey");
    }

    @Test(expected = SessionAuthenticationException.class)
    public void getDelegationKeyShouldThrowWhenDelegationNotValid() {
        // Expectation: when delegatedBy is a UUID and delegationDAO.findValidFor returns empty, a SessionAuthenticationException is thrown.
        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        // Use a UUID-like string that matches the UUID_PATTERN used in source code
        String uuidLike = "123e4567-e89b-12d3-a456-426614174000";
        when(details.getDelegatedBy()).thenReturn(uuidLike);

        // delegationDAO.findValidFor should be called and return Optional.empty() to trigger exception
        when(delegationDAO.findValidFor(eq(uuidLike), eq("delegatedKey"), any(OffsetDateTime.class))).
                thenReturn(Optional.empty());

        authDataAccessor.getDelegationKey(details, "delegatedKey");
    }

    // -------------------------
    // Tests for removeExpired
    // -------------------------

    @Test
    public void removeExpiredShouldInvokeDeleteOnAccessTokenDAO() {
        // Expectation: removeExpired delegates to accessTokenDAO.deleteById(tokenKey).
        String tokenKey = "token-123";
        authDataAccessor.removeExpired(tokenKey);
        verify(accessTokenDAO).deleteById(tokenKey);
    }

    // -------------------------
    // Tests for buildAuthorities
    // -------------------------

    @Test
    public void buildAuthoritiesShouldConvertMapToAuthorities() {
        // Expectation: buildAuthorities converts entitlement->realms map into SyncopeGrantedAuthority objects with matching authority strings.
        Map<String, Set<String>> entForRealms = new HashMap<>();
        entForRealms.put("ENT_A", Set.of("/realmA", "/realmB"));
        entForRealms.put("ENT_B", Set.of("/realmC"));

        Set<SyncopeGrantedAuthority> authorities = authDataAccessor.buildAuthorities(entForRealms);

        // We expect one authority per entitlement key
        assertEquals("Should create an authority per entitlement", 2, authorities.size());

        Set<String> authNames = new HashSet<>();
        for (SyncopeGrantedAuthority a : authorities) {
            authNames.add(a.getAuthority());
        }

        assertTrue("Authority for ENT_A must be present", authNames.contains("ENT_A"));
        assertTrue("Authority for ENT_B must be present", authNames.contains("ENT_B"));
    }

    // -------------------------
    // Tests for getAuthorities
    // -------------------------

    @Test
    public void getAuthoritiesShouldReturnAnonymousAuthoritiesForAnonymousUser() {
        // Expectation: when username equals securityProperties.getAnonymousUser(), ANONYMOUS_AUTHORITIES are returned.
        when(securityProperties.getAnonymousUser()).thenReturn("anonymousUser");

        Set<SyncopeGrantedAuthority> authorities = authDataAccessor.getAuthorities("anonymousUser", null);

        assertNotNull("Authorities must not be null", authorities);
        boolean containsAnonymous = authorities.stream().
                anyMatch(a -> a.getAuthority().contains(IdRepoEntitlement.ANONYMOUS));
        assertTrue("Authorities must contain ANONYMOUS entitlement", containsAnonymous);
    }

    @Test(expected = org.springframework.security.core.userdetails.UsernameNotFoundException.class)
    public void getAuthoritiesShouldThrowWhenNormalUserMissing() {
        // Expectation: when a normal username is provided and userDAO.findByUsername returns empty, UsernameNotFoundException is thrown.
        when(securityProperties.getAnonymousUser()).thenReturn("anonymousUser");
        when(securityProperties.getAdminUser()).thenReturn("adminUser");

        when(userDAO.findByUsername("missingUser")).thenReturn(Optional.empty());

        authDataAccessor.getAuthorities("missingUser", null);
    }

    // -------------------------
    // Tests for audit
    // -------------------------

    @Test
    public void auditShouldInvokeAuditManagerWithDelegationSuffix() {
        // Expectation: auditManager.audit is invoked with username appended with delegation info when delegationKey is provided.
        String domain = "testDomain";
        String username = "jdoe";
        String delegationKey = "delegKey";
        OpEvent.Outcome outcome = OpEvent.Outcome.SUCCESS;
        Object output = "ok";
        Object[] input = new Object[] { "in1", 2 };

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
                eq(input));

        String auditedUser = userCaptor.getValue();
        assertTrue("Audited username must contain delegation suffix", auditedUser.contains(username));
        assertTrue("Audited username must mention delegation", auditedUser.contains("[under delegation"));
    }

    // -------------------------
    // Helper methods to satisfy constructor parameter requirements without duplicating MappingManager
    // -------------------------

    /**
     * Provide a non-null mapping manager or a mock if needed by tests that don't use it directly.
     * This method exists to avoid duplicating MappingManager in constructor parameter list in multiple places.
     */
    private MappingManager mapping_manager_or_null() {
        return mappingManager;
    }

    /**
     * Provide a non-null connector manager or a mock if needed by tests that don't use it directly.
     * Kept for symmetry with constructor parameter ordering in tests that recreate the accessor.
     */
    private ConnectorManager connector_manager_or_null() {
        return connectorManager;
    }
}
