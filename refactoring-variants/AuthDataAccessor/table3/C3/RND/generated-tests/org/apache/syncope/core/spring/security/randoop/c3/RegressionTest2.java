package org.apache.syncope.core.spring.security.randoop.c3;

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
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        java.lang.String str7 = jWTAuthResult6.username();
        java.lang.String str8 = jWTAuthResult6.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = jWTAuthResult6.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet11);
        java.lang.String str13 = jWTAuthResult12.username();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet9);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "hi!");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str8 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean9 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
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
        org.apache.syncope.core.persistence.api.entity.user.User user13 = usernamePasswordAuthResult3.user();
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
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }
}

