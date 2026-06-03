package org.apache.syncope.core.spring.security;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Set;

import javax.security.auth.login.AccountNotFoundException;

import org.apache.syncope.common.lib.types.IdRepoEntitlement;
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
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

@RunWith(MockitoJUnitRunner.class)
public class AuthDataAccessorC1LLMGuidedTreeTest {

// Mocks for constructor parameters
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

private AuthDataAccessor authDataAccessor; // will be a spy

@Before
public void setUp() {
// Use an empty list for JWTSSOProviders as required
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
mapping_manager_or_mappingManager(),
Collections.emptyList()));
}

// Helper to satisfy constructor signature without creating a second MappingManager mock variable name
private MappingManager mapping_manager_or_mappingManager() {
return mappingManager;
}

/**
* Test getJWTSSOProvider throws AuthenticationCredentialsNotFoundException when issuer is null.
* Expected behavior: method should reject null issuer.
*/
@Test(expected = org.springframework.security.authentication.AuthenticationCredentialsNotFoundException.class)
public void getJWTSSOProviderNullIssuerShouldThrow() {
authDataAccessor.getJWTSSOProvider(null);
}

/**
* Test authenticate(Authentication) returns null when no user is found for authentication.
* Expected behavior: when findUserForAuthentication returns null, authenticate returns a result with null user.
*/
@Test
public void authenticateWithNoUserReturnsNullUser() {
Authentication authentication = mock(Authentication.class);

// Spy and stub findUserForAuthentication to return null
doReturn(null).when(authDataAccessor).findUserForAuthentication(eq("DOMAIN"), eq(authentication));

AuthDataAccessor.UsernamePasswordAuthResult result =
authDataAccessor.authenticate("DOMAIN", authentication);

Assert.assertNull("User should be null when not found", result.user());
Assert.assertNull("Authenticated flag should be null when no user", result.authenticated());
Assert.assertNull("Delegation key should be null when no user", result.delegationKey());
}

/**
* Test authenticate(Authentication) increments failedLogins and saves user when authentication fails.
* Expected behavior: when usernamePasswordAuthentication returns false, failedLogins is incremented and userDAO.save is called.
*/
@Test
public void authenticateFailedIncrementsFailedLoginsAndSaves() {
Authentication authentication = mock(Authentication.class);

when(authentication.getCredentials()).thenReturn("badpass");
// Create a mock user and stub findUserForAuthentication to return it
User user = mock(User.class);

when(user.getFailedLogins()).thenReturn(1);
when(user.getStatus()).thenReturn("active");
doReturn(user).when(authDataAccessor).findUserForAuthentication(eq("DOMAIN"), eq(authentication));

// Stub checkUserSuspension to do nothing
doNothing().when(authDataAccessor).checkUserSuspension(user);

// Stub confParamOps to return an array that contains the user's status so authentication allowed
when(confParamOps.get(eq("DOMAIN"), eq("authentication.statuses"), any(), eq(String[].class))).
thenReturn(new String[] { "active" });

// Stub usernamePasswordAuthentication to return false (failed)
doReturn(false).when(authDataAccessor).usernamePasswordAuthentication(eq(user), anyString());

// Stub userDAO.save to return the same user
when(userDAO.save(user)).thenReturn(user);

AuthDataAccessor.UsernamePasswordAuthResult result =
authDataAccessor.authenticate("DOMAIN", authentication);

Assert.assertNotNull("User should be returned when found", result.user());
Assert.assertEquals("Authentication should be false on failure", Boolean.FALSE, result.authenticated());
// Verify failedLogins increment: setFailedLogins called with previous+1
verify(user).setFailedLogins(2);
verify(userDAO).save(user);
}

/**
* Test authenticate(Authentication) sets lastLoginDate and resets failedLogins when authentication succeeds.
* Expected behavior: when usernamePasswordAuthentication returns true, lastLoginDate is set and failedLogins reset to 0 and user saved.
*/
@Test
public void authenticateSuccessUpdatesLastLoginAndResetsFailedLogins() {
Authentication authentication = mock(Authentication.class);

when(authentication.getCredentials()).thenReturn("goodpass");
// Mock details to provide delegation info (no delegation)
SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
when(details.getDelegatedBy()).thenReturn(null);
when(authentication.getDetails()).thenReturn(details);

User user = mock(User.class);

when(user.getFailedLogins()).thenReturn(3);
when(user.getStatus()).thenReturn("active");
doReturn(user).when(authDataAccessor).findUserForAuthentication(eq("DOMAIN"), eq(authentication));

doNothing().when(authDataAccessor).checkUserSuspension(user);

when(confParamOps.get(eq("DOMAIN"), eq("authentication.statuses"), any(), eq(String[].class))).
thenReturn(new String[] { "active" });

// Indicate that last login date logging is enabled
when(confParamOps.get(eq("DOMAIN"), eq("log.lastlogindate"), eq(true), eq(Boolean.class))).thenReturn(true);

// Stub usernamePasswordAuthentication to return true (success)
doReturn(true).when(authDataAccessor).usernamePasswordAuthentication(eq(user), anyString());

// Stub delegation retrieval to not be invoked (delegationKey null)
// Stub userDAO.save to return the same user
when(userDAO.save(user)).thenReturn(user);

AuthDataAccessor.UsernamePasswordAuthResult result =
authDataAccessor.authenticate("DOMAIN", authentication);

Assert.assertNotNull("User should be returned when found", result.user());
Assert.assertEquals("Authentication should be true on success", Boolean.TRUE, result.authenticated());
// Verify last login date set and failedLogins reset
verify(user).setLastLoginDate(any(OffsetDateTime.class));
verify(user).setFailedLogins(0);
verify(userDAO).save(user);
}

/**
* Test removeExpired delegates to accessTokenDAO.deleteById.
* Expected behavior: accessTokenDAO.deleteById is invoked with the provided token key.
*/
@Test
public void removeExpiredShouldDeleteToken() {
String tokenKey = "token-123";
authDataAccessor.removeExpired(tokenKey);
verify(accessTokenDAO).deleteById(eq(tokenKey));
}

/**
* Test audit delegates to auditManager.audit and includes delegationKey in username when provided.
* Expected behavior: auditManager.audit is called with username containing delegation info when delegationKey is non-null.
*/
@Test
public void auditShouldCallAuditManagerWithDelegationInfo() {
String domain = "DOMAIN";
String username = "bob";
String delegationKey = "del-1";

authDataAccessor.audit(domain, username, delegationKey, org.apache.syncope.common.lib.types.OpEvent.Outcome.SUCCESS, "out", "in1");

ArgumentCaptor<String> userCaptor = ArgumentCaptor.forClass(String.class);
verify(auditManager).audit(
eq(domain),
userCaptor.capture(),
any(),
any(),
any(),
any(),
eq(org.apache.syncope.common.lib.types.OpEvent.Outcome.SUCCESS),
any(),
eq("out"),
eq((Object[]) new Object[] { "in1" }));
String auditedUser = userCaptor.getValue();
Assert.assertTrue("Audited username should contain delegation info", auditedUser.contains("[under delegation " + delegationKey + "]"));
}

/**
* Test getJWTSSOProvider throws when no provider matches issuer.
* Expected behavior: AuthenticationCredentialsNotFoundException is thrown if no provider found.
*/
@Test(expected = org.springframework.security.authentication.AuthenticationCredentialsNotFoundException.class)
public void getJWTSSOProviderNotFoundShouldThrow() {
// authDataAccessor was constructed with empty provider list in setUp
authDataAccessor.getJWTSSOProvider("unknown-issuer");
}

/**
* Test getJWTSSOProvider returns provider when present in the list.
* Expected behavior: provider with matching issuer is returned.
*/
@Test
public void getJWTSSOProviderReturnsProviderWhenPresent() {
// Create a real AuthDataAccessor with a single provider in the list
JWTSSOProvider provider = mock(JWTSSOProvider.class);
when(provider.getIssuer()).thenReturn("issuer-1");

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
connector_manager_or_connectorManager(),
auditManager,
mapping_manager_or_mappingManager(),
Collections.singletonList(provider));

JWTSSOProvider found = local.getJWTSSOProvider("issuer-1");
Assert.assertSame("Should return the same provider instance", provider, found);
}

// Helper to satisfy constructor signature for connectorManager parameter in local instance
private ConnectorManager connector_manager_or_connectorManager() {
return connectorManager;
}
}
