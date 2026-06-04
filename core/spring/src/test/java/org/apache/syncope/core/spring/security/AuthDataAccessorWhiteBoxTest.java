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

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
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

import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;


@RunWith(MockitoJUnitRunner.class)
public class AuthDataAccessorWhiteBoxTest {

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
        authDataAccessor = org.mockito.Mockito.spy(new AuthDataAccessor(
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
                Collections.emptyList()));
    }




@Test
public void authenticateShouldReturnFailedResultAndIncrementFailedLoginsWhenPasswordIsRejected() {
    String domain = "Master";
    String username = "test-user";
    String password = "wrong-secret";
    String status = "active";

    User user = mock(User.class);
    when(user.isSuspended()).thenReturn(false);
    when(user.getStatus()).thenReturn(status);
    when(user.getFailedLogins()).thenReturn(2);

    SyncopeAuthenticationDetails details = mock(SyncopeAuthenticationDetails.class);

    UsernamePasswordAuthenticationToken authentication =
            new UsernamePasswordAuthenticationToken(username, password);
    authentication.setDetails(details);

    when(confParamOps.get(
            eq(domain),
            eq("authentication.attributes"),
            any(String[].class),
            eq(String[].class))).
            thenReturn(new String[] { "username" });

    when(confParamOps.get(
            eq(domain),
            eq("authentication.statuses"),
            any(String[].class),
            eq(String[].class))).
            thenReturn(new String[] { status });

    doReturn(Optional.of(user)).
            when(userDAO).
            findByUsername(username);

    doReturn(false).
            when(authDataAccessor).
            usernamePasswordAuthentication(user, password);

    when(userDAO.save(user)).thenReturn(user);

    AuthDataAccessor.UsernamePasswordAuthResult result =
            authDataAccessor.authenticate(domain, authentication);

    assertNotNull(result);
    assertSame(user, result.user());
    assertFalse(result.authenticated());
    assertNull(result.delegationKey());

    verify(user).setFailedLogins(3);
    verify(userDAO).save(user);
}
@Test
public void authenticateShouldRejectSuspendedUser() {
    String domain = "Master";
    String username = "test-user";
    String password = "secret";

    User user = mock(User.class);
    when(user.isSuspended()).thenReturn(true);
    when(user.getUsername()).thenReturn(username);

    UsernamePasswordAuthenticationToken authentication =
            new UsernamePasswordAuthenticationToken(username, password);

    when(confParamOps.get(
            eq(domain),
            eq("authentication.attributes"),
            any(String[].class),
            eq(String[].class))).
            thenReturn(new String[] { "username" });

    doReturn(Optional.of(user)).
            when(userDAO).
            findByUsername(username);

    try {
        authDataAccessor.authenticate(domain, authentication);
        fail("Expected DisabledException");
    } catch (DisabledException e) {
        // expected
    }

    verify(userDAO).findByUsername(username);
    verify(authDataAccessor, never()).usernamePasswordAuthentication(eq(user), any(String.class));
    verify(userDAO, never()).save(user);
}


@Test
public void authenticateShouldRejectUserWithNotAllowedStatus() {
    String domain = "Master";
    String username = "test-user";
    String password = "secret";

    User user = mock(User.class);
    when(user.isSuspended()).thenReturn(false);
    when(user.getStatus()).thenReturn("suspended-status");
    when(user.getUsername()).thenReturn(username);

    UsernamePasswordAuthenticationToken authentication =
            new UsernamePasswordAuthenticationToken(username, password);

    when(confParamOps.get(
            eq(domain),
            eq("authentication.attributes"),
            any(String[].class),
            eq(String[].class))).
            thenReturn(new String[] { "username" });

    when(confParamOps.get(
            eq(domain),
            eq("authentication.statuses"),
            any(String[].class),
            eq(String[].class))).
            thenReturn(new String[] { "active" });

    doReturn(Optional.of(user)).
            when(userDAO).
            findByUsername(username);

    try {
        authDataAccessor.authenticate(domain, authentication);
        fail("Expected DisabledException");
    } catch (DisabledException e) {
        // expected
    }

    verify(userDAO).findByUsername(username);
    verify(authDataAccessor, never()).usernamePasswordAuthentication(eq(user), any(String.class));
    verify(userDAO, never()).save(user);
}


// test di getAuthorities
@Test
public void getAuthoritiesShouldReturnAnonymousAuthoritiesForAnonymousUser() {
    String username = "anonymous";
    String delegationKey = null;

    when(securityProperties.getAnonymousUser()).thenReturn(username);

    Set<SyncopeGrantedAuthority> authorities =
            authDataAccessor.getAuthorities(username, delegationKey);

    assertNotNull(authorities);
    assertEquals(1, authorities.size());
    assertTrue(authorities.stream().
            anyMatch(authority -> IdRepoEntitlement.ANONYMOUS.equals(authority.getAuthority())));

    verify(userDAO, never()).findByUsername(username);
    verify(delegationDAO, never()).findById(any(String.class));
}

@Test
public void getAuthoritiesShouldHandleAdminUserAsSpecialIdentity() {
    String username = "admin";
    String delegationKey = null;

    when(securityProperties.getAnonymousUser()).thenReturn("anonymous");
    when(securityProperties.getAdminUser()).thenReturn(username);

    Set<SyncopeGrantedAuthority> authorities =
            authDataAccessor.getAuthorities(username, delegationKey);

    assertNotNull(authorities);

    verify(userDAO, never()).findByUsername(username);
    verify(delegationDAO, never()).findById(any(String.class));
    }
}
