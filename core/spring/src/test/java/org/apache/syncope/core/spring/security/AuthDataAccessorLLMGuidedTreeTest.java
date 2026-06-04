/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.syncope.core.spring.security;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
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
import org.apache.syncope.core.persistence.api.entity.Delegation;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.Authentication;

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

    private List<JWTSSOProvider> jwtSSOProviders = Collections.emptyList();

    private AuthDataAccessor authDataAccessor;

    @Before
    public void setUp() {
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
                mappingManager,
                jwtSSOProviders));
    }

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void getJWTSSOProviderNullIssuerThrows() {
        authDataAccessor.getJWTSSOProvider(null);
    }

    @Test
    public void getJWTSSOProviderReturnsMatchingProvider() {
        JWTSSOProvider provider = mock(JWTSSOProvider.class);
        when(provider.getIssuer()).thenReturn("issuer");

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

        JWTSSOProvider found = local.getJWTSSOProvider("issuer");
        assertSame(provider, found);
    }

    @Test
    public void removeExpiredDelegatesToDAO() {
        String tokenKey = "token";
        authDataAccessor.removeExpired(tokenKey);
        verify(accessTokenDAO).deleteById(tokenKey);
    }

    @Test
    public void getAuthoritiesAnonymousUser() {
        when(securityProperties.getAnonymousUser()).thenReturn("anon");
        Set<SyncopeGrantedAuthority> authorities =
                authDataAccessor.getAuthorities("anon", null);
        assertEquals(AuthDataAccessor.ANONYMOUS_AUTHORITIES, authorities);
    }

    @Test
    public void getAuthoritiesAdminUser() {
        // Expected behavior: admin is handled as a special identity and does not require normal user lookup.
        when(securityProperties.getAnonymousUser()).thenReturn("anon");
        when(securityProperties.getAdminUser()).thenReturn("admin");

        Set<SyncopeGrantedAuthority> authorities =
                authDataAccessor.getAuthorities("admin", null);

        assertNotNull(authorities);
        verify(userDAO, never()).findByUsername("admin");
        verify(delegationDAO, never()).findById(anyString());
    }

    @Test
    public void usernamePasswordAuthenticateSuccessViaSpy() {
        String domain = "MASTER";
        String username = "user";
        String password = "pwd";

        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn(username);
        when(authentication.getCredentials()).thenReturn(password);

        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);
        when(details.getDelegatedBy()).thenReturn(null);
        when(authentication.getDetails()).thenReturn(details);

        when(confParamOps.get(eq(domain), eq("authentication.attributes"),
                any(String[].class), eq(String[].class)))
                .thenReturn(new String[] { "username" });

        User user = mock(User.class);

        when(user.isSuspended()).thenReturn(false);
        when(user.getStatus()).thenReturn("active");
        when(user.getFailedLogins()).thenReturn(0);
        doReturn(Optional.of(user)).when(userDAO).findByUsername(username);

        when(confParamOps.get(eq(domain), eq("authentication.statuses"),
                any(String[].class), eq(String[].class)))
                .thenReturn(new String[] { "active" });

        // Spy: force internal usernamePasswordAuthentication to succeed
        doReturn(true).when(authDataAccessor).usernamePasswordAuthentication(user, password);

        when(confParamOps.get(eq(domain), eq("log.lastlogindate"),
                anyBoolean(), eq(Boolean.class))).thenReturn(Boolean.TRUE);

        doReturn(user).when(userDAO).save(user);

        UsernamePasswordAuthResult result = authDataAccessor.authenticate(domain, authentication);
        assertNotNull(result);
        assertTrue(Boolean.TRUE.equals(result.authenticated()));
        assertSame(user, result.user());
    }

    @Test
    public void usernamePasswordAuthenticateWrongPasswordViaSpy() {
        String domain = "MASTER";
        String username = "user";
        String password = "wrong";

        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn(username);
        when(authentication.getCredentials()).thenReturn(password);

        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);



        when(confParamOps.get(eq(domain), eq("authentication.attributes"),
                any(String[].class), eq(String[].class)))
                .thenReturn(new String[] { "username" });

        User user = mock(User.class);

        when(user.isSuspended()).thenReturn(false);
        when(user.getStatus()).thenReturn("active");
        when(user.getFailedLogins()).thenReturn(1);
        doReturn(Optional.of(user)).when(userDAO).findByUsername(username);

        when(confParamOps.get(eq(domain), eq("authentication.statuses"),
                any(String[].class), eq(String[].class)))
                .thenReturn(new String[] { "active" });

        // Spy: force internal usernamePasswordAuthentication to fail
        doReturn(false).when(authDataAccessor).usernamePasswordAuthentication(user, password);

        doReturn(user).when(userDAO).save(user);

        UsernamePasswordAuthResult result = authDataAccessor.authenticate(domain, authentication);
        assertNotNull(result);
        assertFalse(Boolean.TRUE.equals(result.authenticated()));
        verify(userDAO).save(user);
    }

    @Test(expected = DisabledException.class)
    public void usernamePasswordAuthenticateSuspendedUserThrows() {
        String domain = "MASTER";
        String username = "user";

        Authentication authentication = mock(Authentication.class);
        when(authentication.getName()).thenReturn(username);


        SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);


        when(confParamOps.get(eq(domain), eq("authentication.attributes"),
                any(String[].class), eq(String[].class)))
                .thenReturn(new String[] { "username" });

        User user = mock(User.class);
        when(user.getUsername()).thenReturn(username);
        when(user.isSuspended()).thenReturn(true);
        doReturn(Optional.of(user)).when(userDAO).findByUsername(username);

        authDataAccessor.authenticate(domain, authentication);
    }

    @Test
    public void getAuthoritiesDelegationUsesDelegationDAO() {
        String username = "user";
        String delegationKey = "delegKey";

        when(securityProperties.getAnonymousUser()).thenReturn("anon");
        when(securityProperties.getAdminUser()).thenReturn("admin");

        Delegation delegation = mock(Delegation.class);
        doReturn(Optional.of(delegation)).when(delegationDAO).findById(delegationKey);
        when(delegation.getRoles()).thenReturn(Collections.emptySet());

        User delegating = mock(User.class);
        when(delegation.getDelegating()).thenReturn(delegating);
        when(delegating.isMustChangePassword()).thenReturn(false);

        Set<SyncopeGrantedAuthority> authorities =
                authDataAccessor.getAuthorities(username, delegationKey);
        assertNotNull(authorities);
    }

    @Test
    public void auditDelegatesToAuditManager() {
        String domain = "MASTER";
        String username = "user";
        String delegationKey = "delegKey";

        authDataAccessor.audit(domain, username, delegationKey,
                OpEvent.Outcome.SUCCESS, "out");

        verify(auditManager).audit(
                eq(domain),
                contains(username),
                eq(OpEvent.CategoryType.LOGIC),
                eq(OpEvent.AUTHENTICATION_CATEGORY),
                isNull(),
                eq(OpEvent.LOGIN_OP),
                eq(OpEvent.Outcome.SUCCESS),
                isNull(),
                eq("out"),
                any(Object[].class));
    }
}