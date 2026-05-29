package org.apache.syncope.core.spring.security.randoop.c4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray10 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11, syncopeGrantedAuthorityArray10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult18.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet19);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = jWTAuthResult20.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet21);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray10);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray10, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet21);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "hi!");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str9 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean11 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str8 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str9 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean11 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.lang.String str13 = jWTAuthResult12.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = jWTAuthResult12.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet14);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet14);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult17.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet14);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean5 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        java.lang.String str9 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean11 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean12 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        java.lang.String str8 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean9 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user15 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user16 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user17 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean5 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        java.lang.String str9 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user13 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user15 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties0 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager1 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO2 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO3 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO4 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO5 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO6 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps7 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO8 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO9 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO10 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager11 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager12 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager13 = null;
        java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor15 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, jWTSSOProviderList14);
        org.apache.syncope.common.lib.types.OpEvent.Outcome outcome19 = null;
        org.apache.syncope.core.persistence.api.entity.user.User user20 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user20, (java.lang.Boolean) false, "");
        java.lang.String str24 = usernamePasswordAuthResult23.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user25 = usernamePasswordAuthResult23.user();
        java.lang.Boolean boolean26 = usernamePasswordAuthResult23.authenticated();
        java.lang.String str27 = usernamePasswordAuthResult23.delegationKey();
        java.lang.Boolean boolean28 = usernamePasswordAuthResult23.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user29 = usernamePasswordAuthResult23.user();
        java.lang.Boolean boolean30 = usernamePasswordAuthResult23.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user31 = usernamePasswordAuthResult23.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray39 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40, syncopeGrantedAuthorityArray39);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40);
        java.lang.String str44 = jWTAuthResult43.username();
        java.lang.String str45 = jWTAuthResult43.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet46 = jWTAuthResult43.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult47 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet46);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult48 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet46);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult49 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet46);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult50 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet46);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult51 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet46);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet52 = jWTAuthResult51.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray58 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet59 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet59, syncopeGrantedAuthorityArray58);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult61 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet59);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult62 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet59);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult63 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet59);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult64 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet59);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet65 = jWTAuthResult64.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult66 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet65);
        org.apache.syncope.core.persistence.api.entity.user.User user67 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult70 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user67, (java.lang.Boolean) false, "hi!");
        java.lang.Boolean boolean71 = usernamePasswordAuthResult70.authenticated();
        java.lang.String str72 = usernamePasswordAuthResult70.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user73 = usernamePasswordAuthResult70.user();
        java.lang.Boolean boolean74 = usernamePasswordAuthResult70.authenticated();
        java.lang.Boolean boolean75 = usernamePasswordAuthResult70.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user76 = usernamePasswordAuthResult70.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray80 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet81 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet81, syncopeGrantedAuthorityArray80);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult83 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet81);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult84 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet81);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult85 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet81);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet86 = jWTAuthResult85.authorities();
        java.lang.Object[] objArray87 = new java.lang.Object[] { syncopeGrantedAuthoritySet52, syncopeGrantedAuthoritySet65, usernamePasswordAuthResult70, syncopeGrantedAuthoritySet86 };
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor15.audit("", "", "", outcome19, (java.lang.Object) user31, objArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray39);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray39, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet46);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet52);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray58);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray58, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNull(user73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(user76);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray80);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray80, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet86);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[[], [], UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=hi!], []]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[[], [], UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=hi!], []]");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean5 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties0 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager1 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO2 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO3 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO4 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO5 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO6 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps7 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO8 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO9 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO10 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager11 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager12 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager13 = null;
        java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor15 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, jWTSSOProviderList14);
        org.apache.syncope.common.lib.types.OpEvent.Outcome outcome19 = null;
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray24 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25, syncopeGrantedAuthorityArray24);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult27 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult28 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25);
        java.lang.String str29 = jWTAuthResult28.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult28.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet30);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet33 = jWTAuthResult32.authorities();
        java.lang.Object[] objArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor15.audit("hi!", "hi!", "", outcome19, (java.lang.Object) syncopeGrantedAuthoritySet33, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray24);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray24, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet33);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties0 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager1 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO2 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO3 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO4 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO5 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO6 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps7 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO8 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO9 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO10 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager11 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager12 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager13 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray14 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList15 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList15, jWTSSOProviderArray14);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor17 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList15);
        org.apache.syncope.common.lib.types.OpEvent.Outcome outcome21 = null;
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray29 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30, syncopeGrantedAuthorityArray29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30);
        java.lang.String str34 = jWTAuthResult33.username();
        java.lang.String str35 = jWTAuthResult33.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult33.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet36);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult38 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet36);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult39 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet36);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult40 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet36);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult41 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet36);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray44 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet45 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet45, syncopeGrantedAuthorityArray44);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult47 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet45);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult48 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet45);
        java.lang.String str49 = jWTAuthResult48.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet50 = jWTAuthResult48.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet51 = jWTAuthResult48.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet52 = jWTAuthResult48.authorities();
        java.lang.String str53 = jWTAuthResult48.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet54 = jWTAuthResult48.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet55 = jWTAuthResult48.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user56 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult59 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user56, (java.lang.Boolean) false, "hi!");
        java.lang.Boolean boolean60 = usernamePasswordAuthResult59.authenticated();
        java.lang.String str61 = usernamePasswordAuthResult59.delegationKey();
        java.lang.String str62 = usernamePasswordAuthResult59.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user63 = usernamePasswordAuthResult59.user();
        java.lang.String str64 = usernamePasswordAuthResult59.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user65 = usernamePasswordAuthResult59.user();
        java.lang.String str66 = usernamePasswordAuthResult59.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray70 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet71 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet71, syncopeGrantedAuthorityArray70);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult73 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet71);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet74 = jWTAuthResult73.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult75 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet74);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet76 = jWTAuthResult75.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet77 = jWTAuthResult75.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult78 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet77);
        java.lang.String str79 = jWTAuthResult78.username();
        java.lang.Object[] objArray80 = new java.lang.Object[] { jWTAuthResult48, str66, str79 };
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor17.audit("hi!", "hi!", "", outcome21, (java.lang.Object) "", objArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray14);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray14, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray29);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray29, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray44);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray44, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet50);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet51);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet54);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNull(user63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNull(user65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray70);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray70, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet74);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet76);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[JWTAuthResult[username=hi!, authorities=[]], hi!, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[JWTAuthResult[username=hi!, authorities=[]], hi!, ]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties0 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager1 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO2 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO3 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO4 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO5 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO6 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps7 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO8 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO9 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO10 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager11 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager12 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager13 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties14 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager15 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO16 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO17 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO18 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO19 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO20 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps21 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO22 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO23 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO24 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager25 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager26 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager27 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray28 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList29 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList29, jWTSSOProviderArray28);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor31 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList29);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor32 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList29);
        org.apache.syncope.common.lib.types.OpEvent.Outcome outcome36 = null;
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray39 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40, syncopeGrantedAuthorityArray39);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40);
        java.lang.String str44 = jWTAuthResult43.username();
        java.lang.String str45 = jWTAuthResult43.username();
        java.lang.String str46 = jWTAuthResult43.username();
        java.lang.String str47 = jWTAuthResult43.username();
        java.lang.String str48 = jWTAuthResult43.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet49 = jWTAuthResult43.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray54 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet55 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet55, syncopeGrantedAuthorityArray54);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult57 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet55);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult58 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet55);
        java.lang.String str59 = jWTAuthResult58.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet60 = jWTAuthResult58.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult61 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet60);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult62 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet60);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet63 = jWTAuthResult62.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet64 = jWTAuthResult62.authorities();
        java.lang.Object[] objArray65 = new java.lang.Object[] { syncopeGrantedAuthoritySet64 };
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor32.audit("", "", "", outcome36, (java.lang.Object) jWTAuthResult43, objArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray39);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray39, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet49);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray54);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray54, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet60);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet63);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[[]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[[]]");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray5 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6, syncopeGrantedAuthorityArray5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = jWTAuthResult8.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult10.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult10.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet13);
        java.lang.String str16 = jWTAuthResult15.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult15.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray5);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray5, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet9);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str8 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user10 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean11 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties0 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager1 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO2 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO3 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO4 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO5 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO6 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps7 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO8 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO9 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO10 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager11 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager12 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager13 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties14 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager15 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO16 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO17 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO18 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO19 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO20 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps21 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO22 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO23 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO24 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager25 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager26 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager27 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray28 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList29 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList29, jWTSSOProviderArray28);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor31 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList29);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor32 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList29);
        org.apache.syncope.common.lib.types.OpEvent.Outcome outcome36 = null;
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray38 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet39 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet39, syncopeGrantedAuthorityArray38);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult41 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet39);
        java.lang.String str42 = jWTAuthResult41.username();
        java.lang.String str43 = jWTAuthResult41.username();
        java.lang.String str44 = jWTAuthResult41.username();
        java.lang.String str45 = jWTAuthResult41.username();
        java.lang.String str46 = jWTAuthResult41.username();
        java.lang.Object[] objArray47 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor32.audit("hi!", "hi!", "hi!", outcome36, (java.lang.Object) jWTAuthResult41, objArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray38);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray38, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertArrayEquals(objArray47, new java.lang.Object[] {});
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray5 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6, syncopeGrantedAuthorityArray5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult12.authorities();
        java.lang.String str14 = jWTAuthResult12.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet15 = jWTAuthResult12.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = jWTAuthResult12.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult12.authorities();
        java.lang.String str18 = jWTAuthResult12.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult12.authorities();
        java.lang.String str20 = jWTAuthResult12.username();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray5);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray5, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet15);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet16);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "hi!");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.lang.String str6 = jWTAuthResult5.username();
        java.lang.String str7 = jWTAuthResult5.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        java.lang.String str8 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean9 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = usernamePasswordAuthResult3.user();
        java.lang.String str15 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        java.lang.String str8 = jWTAuthResult7.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = jWTAuthResult7.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet9);
        java.lang.String str11 = jWTAuthResult10.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult10.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult10.authorities();
        java.lang.String str14 = jWTAuthResult10.username();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }
}

