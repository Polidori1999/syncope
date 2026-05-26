package org.apache.syncope.core.spring.security.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthDataAccessorRandoopRegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1501");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult11.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult11.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean18 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str19 = usernamePasswordAuthResult17.delegationKey();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult17.authenticated();
        java.lang.Boolean boolean21 = usernamePasswordAuthResult17.authenticated();
        boolean boolean22 = jWTAuthResult11.equals((java.lang.Object) boolean21);
        java.lang.String str23 = jWTAuthResult11.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult11.authorities();
        boolean boolean25 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet24);
        java.lang.String str26 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean27 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str28 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str23, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str28, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1502");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.lang.String str5 = jWTAuthResult4.toString();
        java.lang.String str6 = jWTAuthResult4.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.String str11 = usernamePasswordAuthResult10.delegationKey();
        java.lang.String str12 = usernamePasswordAuthResult10.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user13 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user13, (java.lang.Boolean) false, "");
        java.lang.String str17 = usernamePasswordAuthResult16.delegationKey();
        java.lang.String str18 = usernamePasswordAuthResult16.toString();
        java.lang.String str19 = usernamePasswordAuthResult16.delegationKey();
        java.lang.String str20 = usernamePasswordAuthResult16.toString();
        boolean boolean21 = usernamePasswordAuthResult10.equals((java.lang.Object) str20);
        org.apache.syncope.core.persistence.api.entity.user.User user22 = usernamePasswordAuthResult10.user();
        java.lang.Boolean boolean23 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str24 = usernamePasswordAuthResult10.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray27 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28, syncopeGrantedAuthorityArray27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray33 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34, syncopeGrantedAuthorityArray33);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = jWTAuthResult36.authorities();
        boolean boolean38 = jWTAuthResult31.equals((java.lang.Object) jWTAuthResult36);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet39 = jWTAuthResult36.authorities();
        boolean boolean40 = usernamePasswordAuthResult10.equals((java.lang.Object) jWTAuthResult36);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult36.authorities();
        java.lang.String str42 = jWTAuthResult36.username();
        boolean boolean43 = jWTAuthResult4.equals((java.lang.Object) str42);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str5, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str6, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str12, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str18, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str20, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray27);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray27, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray33);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray33, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1503");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        boolean boolean6 = jWTAuthResult4.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str14 = usernamePasswordAuthResult10.delegationKey();
        java.lang.String str15 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Class<?> wildcardClass16 = usernamePasswordAuthResult10.getClass();
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult10);
        java.lang.String str18 = jWTAuthResult4.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray21 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22, syncopeGrantedAuthorityArray21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22);
        java.lang.String str25 = jWTAuthResult24.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray27 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28, syncopeGrantedAuthorityArray27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        boolean boolean31 = jWTAuthResult24.equals((java.lang.Object) "hi!");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray33 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34, syncopeGrantedAuthorityArray33);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = jWTAuthResult36.authorities();
        java.lang.String str38 = jWTAuthResult36.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet39 = jWTAuthResult36.authorities();
        boolean boolean40 = jWTAuthResult24.equals((java.lang.Object) jWTAuthResult36);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult24.authorities();
        boolean boolean42 = jWTAuthResult4.equals((java.lang.Object) syncopeGrantedAuthoritySet41);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray45 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet46 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet46, syncopeGrantedAuthorityArray45);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult48 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet46);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet49 = jWTAuthResult48.authorities();
        java.lang.String str50 = jWTAuthResult48.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet51 = jWTAuthResult48.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult52 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet51);
        java.lang.String str53 = jWTAuthResult52.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray57 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet58 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet58, syncopeGrantedAuthorityArray57);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult60 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet58);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet61 = jWTAuthResult60.authorities();
        java.lang.String str62 = jWTAuthResult60.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet63 = jWTAuthResult60.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult64 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet63);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult65 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", syncopeGrantedAuthoritySet63);
        java.lang.Class<?> wildcardClass66 = syncopeGrantedAuthoritySet63.getClass();
        boolean boolean67 = jWTAuthResult52.equals((java.lang.Object) wildcardClass66);
        boolean boolean68 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult52);
        java.lang.String str69 = jWTAuthResult52.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray72 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet73 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet73, syncopeGrantedAuthorityArray72);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult75 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet73);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet76 = jWTAuthResult75.authorities();
        java.lang.String str77 = jWTAuthResult75.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet78 = jWTAuthResult75.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult79 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet78);
        java.lang.String str80 = jWTAuthResult79.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet81 = jWTAuthResult79.authorities();
        java.lang.Class<?> wildcardClass82 = syncopeGrantedAuthoritySet81.getClass();
        boolean boolean83 = jWTAuthResult52.equals((java.lang.Object) wildcardClass82);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray21);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray21, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray27);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray27, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray33);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray33, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str38, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray45);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray45, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str50, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str53, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray57);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray57, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str62, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet63);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str69, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray72);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray72, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str77, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str80, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1504");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray6 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7, syncopeGrantedAuthorityArray6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult9.authorities();
        java.lang.String str11 = jWTAuthResult9.toString();
        java.lang.String str12 = jWTAuthResult9.username();
        java.lang.String str13 = jWTAuthResult9.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.String str18 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str19 = usernamePasswordAuthResult17.toString();
        java.lang.String str20 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str21 = usernamePasswordAuthResult17.toString();
        java.lang.Boolean boolean22 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str23 = usernamePasswordAuthResult17.toString();
        boolean boolean24 = jWTAuthResult9.equals((java.lang.Object) str23);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult9.authorities();
        boolean boolean26 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet25);
        java.lang.Object obj27 = null;
        boolean boolean28 = usernamePasswordAuthResult3.equals(obj27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray6);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray6, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str11, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str13, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str19, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str21, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str23, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1505");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties56 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager57 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO58 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO59 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO60 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO61 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO62 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps63 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO64 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO65 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO66 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager67 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager68 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager69 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray70 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList71 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71, jWTSSOProviderArray70);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor73 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties56, encryptorManager57, realmSearchDAO58, userDAO59, groupDAO60, anySearchDAO61, accessTokenDAO62, confParamOps63, roleDAO64, delegationDAO65, externalResourceDAO66, connectorManager67, auditManager68, mappingManager69, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor74 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor75 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor76 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor77 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.JWTSSOProvider jWTSSOProvider79 = authDataAccessor77.getJWTSSOProvider("JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=null]");
            org.junit.Assert.fail("Expected exception of type org.springframework.security.authentication.AuthenticationCredentialsNotFoundException; message: Could not find any registered JWTSSOProvider for issuer JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=null]");
        } catch (org.springframework.security.authentication.AuthenticationCredentialsNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray70);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray70, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1506");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user6, (java.lang.Boolean) false, "");
        java.lang.String str10 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str11 = usernamePasswordAuthResult9.toString();
        java.lang.String str12 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str13 = usernamePasswordAuthResult9.toString();
        boolean boolean14 = usernamePasswordAuthResult3.equals((java.lang.Object) str13);
        org.apache.syncope.core.persistence.api.entity.user.User user15 = usernamePasswordAuthResult3.user();
        java.lang.String str16 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean17 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user18 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user19 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str11, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1507");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.persistence.api.entity.user.User user9 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user9, (java.lang.Boolean) false, "");
        java.lang.String str13 = usernamePasswordAuthResult12.delegationKey();
        java.lang.String str14 = usernamePasswordAuthResult12.toString();
        java.lang.String str15 = usernamePasswordAuthResult12.toString();
        java.lang.String str16 = usernamePasswordAuthResult12.toString();
        java.lang.Boolean boolean17 = usernamePasswordAuthResult12.authenticated();
        java.lang.Boolean boolean18 = usernamePasswordAuthResult12.authenticated();
        boolean boolean19 = jWTAuthResult8.equals((java.lang.Object) usernamePasswordAuthResult12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str14, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str15, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str16, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1508");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult4.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult10.authenticated();
        boolean boolean15 = jWTAuthResult4.equals((java.lang.Object) boolean14);
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) 0);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult4.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user19 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user19, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean23 = usernamePasswordAuthResult22.authenticated();
        java.lang.String str24 = usernamePasswordAuthResult22.delegationKey();
        java.lang.Boolean boolean25 = usernamePasswordAuthResult22.authenticated();
        java.lang.String str26 = usernamePasswordAuthResult22.toString();
        boolean boolean28 = usernamePasswordAuthResult22.equals((java.lang.Object) 100);
        boolean boolean29 = jWTAuthResult4.equals((java.lang.Object) 100);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult4.authorities();
        java.lang.String str31 = jWTAuthResult4.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray34 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet35, syncopeGrantedAuthorityArray34);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet35);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet38 = jWTAuthResult37.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet39 = jWTAuthResult37.authorities();
        java.lang.String str40 = jWTAuthResult37.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult37.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet41);
        java.lang.String str43 = jWTAuthResult42.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet44 = jWTAuthResult42.authorities();
        boolean boolean45 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult42);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str26, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray34);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray34, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet38);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str40, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str43, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1509");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "JWTAuthResult[username=, authorities=[]]");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult10.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user13 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user13, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean17 = usernamePasswordAuthResult16.authenticated();
        java.lang.String str18 = usernamePasswordAuthResult16.delegationKey();
        java.lang.Boolean boolean19 = usernamePasswordAuthResult16.authenticated();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult16.authenticated();
        boolean boolean21 = jWTAuthResult10.equals((java.lang.Object) boolean20);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray24 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25, syncopeGrantedAuthorityArray24);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult27 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult27.authorities();
        java.lang.String str29 = jWTAuthResult27.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult27.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet30);
        boolean boolean32 = jWTAuthResult10.equals((java.lang.Object) syncopeGrantedAuthoritySet30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]]", syncopeGrantedAuthoritySet30);
        boolean boolean34 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult33);
        java.lang.Boolean boolean35 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray24);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray24, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str29, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1510");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult5.authorities();
        java.lang.String str7 = jWTAuthResult5.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet8);
        java.lang.String str10 = jWTAuthResult9.toString();
        java.lang.String str11 = jWTAuthResult9.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult9.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user13 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user13, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean17 = usernamePasswordAuthResult16.authenticated();
        java.lang.String str18 = usernamePasswordAuthResult16.delegationKey();
        java.lang.Boolean boolean19 = usernamePasswordAuthResult16.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray21 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22, syncopeGrantedAuthorityArray21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22);
        java.lang.String str25 = jWTAuthResult24.username();
        boolean boolean26 = usernamePasswordAuthResult16.equals((java.lang.Object) jWTAuthResult24);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult24.authorities();
        java.lang.String str28 = jWTAuthResult24.username();
        java.lang.Class<?> wildcardClass29 = jWTAuthResult24.getClass();
        boolean boolean30 = jWTAuthResult9.equals((java.lang.Object) jWTAuthResult24);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str7, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str10, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray21);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray21, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1511");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.lang.String str5 = jWTAuthResult4.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        boolean boolean11 = jWTAuthResult4.equals((java.lang.Object) "hi!");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult16.authorities();
        java.lang.String str18 = jWTAuthResult16.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult16.authorities();
        boolean boolean20 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult16);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = jWTAuthResult16.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray26 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet27, syncopeGrantedAuthorityArray26);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.persistence.api.entity.user.User user33 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user33, (java.lang.Boolean) false, "");
        java.lang.String str37 = usernamePasswordAuthResult36.delegationKey();
        java.lang.String str38 = usernamePasswordAuthResult36.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user39 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user39, (java.lang.Boolean) false, "");
        java.lang.String str43 = usernamePasswordAuthResult42.delegationKey();
        java.lang.String str44 = usernamePasswordAuthResult42.toString();
        java.lang.String str45 = usernamePasswordAuthResult42.delegationKey();
        java.lang.String str46 = usernamePasswordAuthResult42.toString();
        boolean boolean47 = usernamePasswordAuthResult36.equals((java.lang.Object) str46);
        org.apache.syncope.core.persistence.api.entity.user.User user48 = usernamePasswordAuthResult36.user();
        org.apache.syncope.core.persistence.api.entity.user.User user49 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult52 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user49, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean53 = usernamePasswordAuthResult52.authenticated();
        java.lang.String str54 = usernamePasswordAuthResult52.delegationKey();
        boolean boolean55 = usernamePasswordAuthResult36.equals((java.lang.Object) str54);
        java.lang.String str56 = usernamePasswordAuthResult36.delegationKey();
        boolean boolean57 = jWTAuthResult32.equals((java.lang.Object) usernamePasswordAuthResult36);
        boolean boolean58 = jWTAuthResult16.equals((java.lang.Object) boolean57);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str18, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet21);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray26);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray26, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str38, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str44, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str46, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(user48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1512");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet10);
        java.lang.String str12 = jWTAuthResult11.toString();
        boolean boolean13 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult11);
        java.lang.String str14 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str15 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean16 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JWTAuthResult[username=, authorities=null]" + "'", str12, "JWTAuthResult[username=, authorities=null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1513");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult5.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = jWTAuthResult5.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user8, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean12 = usernamePasswordAuthResult11.authenticated();
        java.lang.String str13 = usernamePasswordAuthResult11.delegationKey();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult11.authenticated();
        java.lang.Boolean boolean15 = usernamePasswordAuthResult11.authenticated();
        boolean boolean16 = jWTAuthResult5.equals((java.lang.Object) boolean15);
        java.lang.String str17 = jWTAuthResult5.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult5.authorities();
        java.lang.String str19 = jWTAuthResult5.username();
        java.lang.String str20 = jWTAuthResult5.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=null]", syncopeGrantedAuthoritySet21);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str17, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet21);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1514");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        java.lang.String str7 = jWTAuthResult6.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray9 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10, syncopeGrantedAuthorityArray9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10);
        boolean boolean13 = jWTAuthResult6.equals((java.lang.Object) "hi!");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray15 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16, syncopeGrantedAuthorityArray15);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult18.authorities();
        java.lang.String str20 = jWTAuthResult18.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = jWTAuthResult18.authorities();
        boolean boolean22 = jWTAuthResult6.equals((java.lang.Object) jWTAuthResult18);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = jWTAuthResult18.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]", syncopeGrantedAuthoritySet23);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult24.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray9);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray9, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray15);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray15, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str20, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet23);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1515");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult5.authorities();
        java.lang.String str7 = jWTAuthResult5.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet8);
        java.lang.String str10 = jWTAuthResult9.toString();
        java.lang.String str11 = jWTAuthResult9.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult9.authorities();
        java.lang.Class<?> wildcardClass13 = syncopeGrantedAuthoritySet12.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str7, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str10, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1516");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.lang.String str7 = jWTAuthResult6.username();
        java.lang.String str8 = jWTAuthResult6.username();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user9, (java.lang.Boolean) true, "");
        java.lang.String str13 = usernamePasswordAuthResult12.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.String str18 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str19 = usernamePasswordAuthResult17.toString();
        java.lang.String str20 = usernamePasswordAuthResult17.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user21 = usernamePasswordAuthResult17.user();
        boolean boolean23 = usernamePasswordAuthResult17.equals((java.lang.Object) 1L);
        java.lang.String str24 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str25 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str26 = usernamePasswordAuthResult17.delegationKey();
        boolean boolean27 = usernamePasswordAuthResult12.equals((java.lang.Object) str26);
        org.apache.syncope.core.persistence.api.entity.user.User user28 = usernamePasswordAuthResult12.user();
        java.lang.String str29 = usernamePasswordAuthResult12.delegationKey();
        java.lang.String str30 = usernamePasswordAuthResult12.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user31 = usernamePasswordAuthResult12.user();
        boolean boolean32 = jWTAuthResult6.equals((java.lang.Object) usernamePasswordAuthResult12);
        java.lang.Boolean boolean33 = usernamePasswordAuthResult12.authenticated();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str7, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str8, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str19, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(user28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1517");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.lang.String str7 = jWTAuthResult6.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray9 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10, syncopeGrantedAuthorityArray9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult12.authorities();
        boolean boolean14 = jWTAuthResult6.equals((java.lang.Object) jWTAuthResult12);
        java.lang.String str15 = jWTAuthResult12.username();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str7, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray9);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray9, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1518");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray5 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6, syncopeGrantedAuthorityArray5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult9.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet10);
        java.lang.String str14 = jWTAuthResult13.username();
        boolean boolean16 = jWTAuthResult13.equals((java.lang.Object) "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray5);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray5, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1519");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.lang.String str5 = jWTAuthResult4.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        boolean boolean11 = jWTAuthResult4.equals((java.lang.Object) "hi!");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult16.authorities();
        java.lang.String str18 = jWTAuthResult16.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult16.authorities();
        boolean boolean20 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult16);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = jWTAuthResult4.authorities();
        java.lang.String str23 = jWTAuthResult4.toString();
        java.lang.String str24 = jWTAuthResult4.toString();
        java.lang.String str25 = jWTAuthResult4.username();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str18, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet21);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str23, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str24, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1520");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str9 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Object obj10 = null;
        boolean boolean11 = usernamePasswordAuthResult3.equals(obj10);
        java.lang.String str12 = usernamePasswordAuthResult3.toString();
        java.lang.String str13 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str12, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1521");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user6, (java.lang.Boolean) false, "");
        java.lang.String str10 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str11 = usernamePasswordAuthResult9.toString();
        java.lang.String str12 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str13 = usernamePasswordAuthResult9.toString();
        boolean boolean14 = usernamePasswordAuthResult3.equals((java.lang.Object) str13);
        java.lang.String str15 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean16 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str11, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str15, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1522");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean9 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1523");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.lang.String str5 = jWTAuthResult4.toString();
        java.lang.String str6 = jWTAuthResult4.toString();
        java.lang.String str7 = jWTAuthResult4.toString();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str5, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str6, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str7, "JWTAuthResult[username=hi!, authorities=[]]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1524");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties56 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager57 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO58 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO59 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO60 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO61 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO62 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps63 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO64 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO65 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO66 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager67 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager68 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager69 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties70 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager71 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO72 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO73 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO74 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO75 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO76 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps77 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO78 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO79 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO80 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager81 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager82 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager83 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray84 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList85 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85, jWTSSOProviderArray84);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor87 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties70, encryptorManager71, realmSearchDAO72, userDAO73, groupDAO74, anySearchDAO75, accessTokenDAO76, confParamOps77, roleDAO78, delegationDAO79, externalResourceDAO80, connectorManager81, auditManager82, mappingManager83, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor88 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties56, encryptorManager57, realmSearchDAO58, userDAO59, groupDAO60, anySearchDAO61, accessTokenDAO62, confParamOps63, roleDAO64, delegationDAO65, externalResourceDAO66, connectorManager67, auditManager68, mappingManager69, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor89 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor90 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor91 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor92 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.springframework.security.core.Authentication authentication94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult95 = authDataAccessor92.authenticate("JWTAuthResult[username=JWTAuthResult[username=, authorities=null], authorities=[]]", authentication94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray84);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray84, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1525");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1526");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = authDataAccessor15.getAuthorities("JWTAuthResult[username=hi!, authorities=[]]", "JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1527");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray42 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList43 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43, jWTSSOProviderArray42);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor45 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor46 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor47 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.springframework.security.core.Authentication authentication49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult50 = authDataAccessor47.authenticate("JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]", authentication49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray42);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray42, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1528");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.lang.String str7 = jWTAuthResult6.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray9 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10, syncopeGrantedAuthorityArray9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult12.authorities();
        boolean boolean14 = jWTAuthResult6.equals((java.lang.Object) jWTAuthResult12);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet15 = jWTAuthResult6.authorities();
        boolean boolean17 = jWTAuthResult6.equals((java.lang.Object) 0.0f);
        java.lang.String str18 = jWTAuthResult6.username();
        java.lang.String str19 = jWTAuthResult6.toString();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str7, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray9);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray9, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str18, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str19, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1529");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]");
        java.lang.String str4 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]]" + "'", str4, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]]");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1530");
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
        org.apache.syncope.core.persistence.api.entity.user.User user22 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user22, (java.lang.Boolean) false, "");
        java.lang.String str26 = usernamePasswordAuthResult25.delegationKey();
        java.lang.String str27 = usernamePasswordAuthResult25.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user28 = usernamePasswordAuthResult25.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray30 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet31 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet31, syncopeGrantedAuthorityArray30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet31);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = jWTAuthResult33.authorities();
        java.lang.String str35 = jWTAuthResult33.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult33.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray39 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40, syncopeGrantedAuthorityArray39);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40);
        boolean boolean44 = jWTAuthResult33.equals((java.lang.Object) jWTAuthResult43);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet45 = jWTAuthResult33.authorities();
        boolean boolean46 = usernamePasswordAuthResult25.equals((java.lang.Object) syncopeGrantedAuthoritySet45);
        boolean boolean48 = usernamePasswordAuthResult25.equals((java.lang.Object) (byte) 1);
        java.lang.String str49 = usernamePasswordAuthResult25.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user50 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult53 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user50, (java.lang.Boolean) false, "");
        java.lang.String str54 = usernamePasswordAuthResult53.delegationKey();
        java.lang.String str55 = usernamePasswordAuthResult53.toString();
        java.lang.String str56 = usernamePasswordAuthResult53.delegationKey();
        java.lang.String str57 = usernamePasswordAuthResult53.toString();
        java.lang.Boolean boolean58 = usernamePasswordAuthResult53.authenticated();
        java.lang.String str59 = usernamePasswordAuthResult53.toString();
        java.lang.String str60 = usernamePasswordAuthResult53.delegationKey();
        java.lang.String str61 = usernamePasswordAuthResult53.toString();
        java.lang.String str62 = usernamePasswordAuthResult53.delegationKey();
        java.lang.Object[] objArray63 = new java.lang.Object[] { str62 };
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor17.audit("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]], authorities=[]]", "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]", "", outcome21, (java.lang.Object) usernamePasswordAuthResult25, objArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray14);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray14, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(user28);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray30);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray30, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str35, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray39);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray39, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str55, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str57, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str59, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str61, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1531");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        boolean boolean7 = jWTAuthResult5.equals((java.lang.Object) (byte) 10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult5.authorities();
        java.lang.String str9 = jWTAuthResult5.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties11 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager12 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO13 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO14 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO15 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO16 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO17 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps18 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO19 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO20 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO21 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager22 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager23 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager24 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties25 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager26 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO27 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO28 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO29 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO31 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps32 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO34 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO35 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager36 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager37 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager38 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties39 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager40 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO41 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO42 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO43 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO45 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps46 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO48 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO49 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager50 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager51 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager52 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties53 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager54 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO55 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO56 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO57 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO58 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO59 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps60 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO61 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO62 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO63 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager64 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager65 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager66 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray67 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList68 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList68, jWTSSOProviderArray67);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor70 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties53, encryptorManager54, realmSearchDAO55, userDAO56, groupDAO57, anySearchDAO58, accessTokenDAO59, confParamOps60, roleDAO61, delegationDAO62, externalResourceDAO63, connectorManager64, auditManager65, mappingManager66, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList68);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor71 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties39, encryptorManager40, realmSearchDAO41, userDAO42, groupDAO43, anySearchDAO44, accessTokenDAO45, confParamOps46, roleDAO47, delegationDAO48, externalResourceDAO49, connectorManager50, auditManager51, mappingManager52, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList68);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor72 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties25, encryptorManager26, realmSearchDAO27, userDAO28, groupDAO29, anySearchDAO30, accessTokenDAO31, confParamOps32, roleDAO33, delegationDAO34, externalResourceDAO35, connectorManager36, auditManager37, mappingManager38, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList68);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor73 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties11, encryptorManager12, realmSearchDAO13, userDAO14, groupDAO15, anySearchDAO16, accessTokenDAO17, confParamOps18, roleDAO19, delegationDAO20, externalResourceDAO21, connectorManager22, auditManager23, mappingManager24, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList68);
        boolean boolean74 = jWTAuthResult5.equals((java.lang.Object) mappingManager24);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet75 = jWTAuthResult5.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet76 = jWTAuthResult5.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet77 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult78 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet77);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertNotNull(jWTSSOProviderArray67);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray67, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet75);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet76);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet77);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1532");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray5 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6, syncopeGrantedAuthorityArray5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.persistence.api.entity.user.User user12 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user12, (java.lang.Boolean) false, "");
        java.lang.String str16 = usernamePasswordAuthResult15.delegationKey();
        java.lang.String str17 = usernamePasswordAuthResult15.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user18 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user18, (java.lang.Boolean) false, "");
        java.lang.String str22 = usernamePasswordAuthResult21.delegationKey();
        java.lang.String str23 = usernamePasswordAuthResult21.toString();
        java.lang.String str24 = usernamePasswordAuthResult21.delegationKey();
        java.lang.String str25 = usernamePasswordAuthResult21.toString();
        boolean boolean26 = usernamePasswordAuthResult15.equals((java.lang.Object) str25);
        org.apache.syncope.core.persistence.api.entity.user.User user27 = usernamePasswordAuthResult15.user();
        org.apache.syncope.core.persistence.api.entity.user.User user28 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user28, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean32 = usernamePasswordAuthResult31.authenticated();
        java.lang.String str33 = usernamePasswordAuthResult31.delegationKey();
        boolean boolean34 = usernamePasswordAuthResult15.equals((java.lang.Object) str33);
        java.lang.String str35 = usernamePasswordAuthResult15.delegationKey();
        boolean boolean36 = jWTAuthResult11.equals((java.lang.Object) usernamePasswordAuthResult15);
        java.lang.String str37 = jWTAuthResult11.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet38 = jWTAuthResult11.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult39 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=hi!]", syncopeGrantedAuthoritySet38);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray5);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray5, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str17, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str23, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str25, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str37, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet38);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1533");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        java.lang.String str11 = jWTAuthResult10.username();
        java.lang.String str12 = jWTAuthResult10.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray15 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16, syncopeGrantedAuthorityArray15);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult18.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = jWTAuthResult18.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user21 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user21, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean25 = usernamePasswordAuthResult24.authenticated();
        java.lang.String str26 = usernamePasswordAuthResult24.delegationKey();
        java.lang.Boolean boolean27 = usernamePasswordAuthResult24.authenticated();
        java.lang.Boolean boolean28 = usernamePasswordAuthResult24.authenticated();
        boolean boolean29 = jWTAuthResult18.equals((java.lang.Object) boolean28);
        boolean boolean31 = jWTAuthResult18.equals((java.lang.Object) 0);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet32 = jWTAuthResult18.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet32);
        boolean boolean34 = jWTAuthResult10.equals((java.lang.Object) jWTAuthResult33);
        boolean boolean35 = usernamePasswordAuthResult3.equals((java.lang.Object) boolean34);
        java.lang.Class<?> wildcardClass36 = usernamePasswordAuthResult3.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray15);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray15, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1534");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = usernamePasswordAuthResult3.equals((java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = usernamePasswordAuthResult3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1535");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult5.authorities();
        java.lang.String str7 = jWTAuthResult5.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray11 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12, syncopeGrantedAuthorityArray11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12);
        boolean boolean16 = jWTAuthResult5.equals((java.lang.Object) jWTAuthResult15);
        java.lang.String str17 = jWTAuthResult15.toString();
        java.lang.String str18 = jWTAuthResult15.toString();
        java.lang.String str19 = jWTAuthResult15.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = jWTAuthResult15.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]", syncopeGrantedAuthoritySet20);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str7, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray11);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray11, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str17, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str18, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str19, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet20);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1536");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray4 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5, syncopeGrantedAuthorityArray4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult7.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet8);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray14 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet15 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet15, syncopeGrantedAuthorityArray14);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet15);
        org.apache.syncope.core.persistence.api.entity.user.User user18 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user18, (java.lang.Boolean) false, "");
        java.lang.String str22 = usernamePasswordAuthResult21.delegationKey();
        java.lang.String str23 = usernamePasswordAuthResult21.toString();
        boolean boolean24 = jWTAuthResult17.equals((java.lang.Object) str23);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult17.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet25);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult27 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet25);
        boolean boolean28 = jWTAuthResult10.equals((java.lang.Object) syncopeGrantedAuthoritySet25);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]", syncopeGrantedAuthoritySet25);
        org.apache.syncope.core.persistence.api.entity.user.User user30 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user30, (java.lang.Boolean) false, "");
        java.lang.String str34 = usernamePasswordAuthResult33.delegationKey();
        java.lang.String str35 = usernamePasswordAuthResult33.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user36 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult39 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user36, (java.lang.Boolean) false, "");
        java.lang.String str40 = usernamePasswordAuthResult39.delegationKey();
        java.lang.String str41 = usernamePasswordAuthResult39.toString();
        java.lang.String str42 = usernamePasswordAuthResult39.delegationKey();
        java.lang.String str43 = usernamePasswordAuthResult39.toString();
        boolean boolean44 = usernamePasswordAuthResult33.equals((java.lang.Object) str43);
        org.apache.syncope.core.persistence.api.entity.user.User user45 = usernamePasswordAuthResult33.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray49 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet50 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet50, syncopeGrantedAuthorityArray49);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult52 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet50);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult53 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet50);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult54 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet50);
        boolean boolean55 = usernamePasswordAuthResult33.equals((java.lang.Object) "JWTAuthResult[username=, authorities=[]]");
        org.apache.syncope.core.persistence.api.entity.user.User user56 = usernamePasswordAuthResult33.user();
        org.apache.syncope.core.persistence.api.entity.user.User user57 = usernamePasswordAuthResult33.user();
        java.lang.String str58 = usernamePasswordAuthResult33.delegationKey();
        java.lang.String str59 = usernamePasswordAuthResult33.delegationKey();
        boolean boolean60 = jWTAuthResult29.equals((java.lang.Object) str59);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray4);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray4, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray14);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray14, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str23, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str35, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str41, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str43, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(user45);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray49);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray49, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(user56);
        org.junit.Assert.assertNull(user57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1537");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "JWTAuthResult[username=, authorities=null]");
        org.apache.syncope.core.persistence.api.entity.user.User user6 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user6, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean10 = usernamePasswordAuthResult9.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult9.delegationKey();
        java.lang.Boolean boolean12 = usernamePasswordAuthResult9.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray14 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet15 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet15, syncopeGrantedAuthorityArray14);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet15);
        java.lang.String str18 = jWTAuthResult17.username();
        boolean boolean19 = usernamePasswordAuthResult9.equals((java.lang.Object) jWTAuthResult17);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = jWTAuthResult17.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet20);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]", syncopeGrantedAuthoritySet20);
        java.lang.Class<?> wildcardClass23 = jWTAuthResult22.getClass();
        boolean boolean24 = usernamePasswordAuthResult3.equals((java.lang.Object) wildcardClass23);
        java.lang.String str25 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray14);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray14, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JWTAuthResult[username=, authorities=null]" + "'", str25, "JWTAuthResult[username=, authorities=null]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1538");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        boolean boolean6 = jWTAuthResult4.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str14 = usernamePasswordAuthResult10.delegationKey();
        java.lang.String str15 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Class<?> wildcardClass16 = usernamePasswordAuthResult10.getClass();
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult10);
        org.apache.syncope.core.persistence.api.entity.user.User user18 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user18, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean22 = usernamePasswordAuthResult21.authenticated();
        java.lang.String str23 = usernamePasswordAuthResult21.delegationKey();
        java.lang.Boolean boolean24 = usernamePasswordAuthResult21.authenticated();
        java.lang.String str25 = usernamePasswordAuthResult21.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user26 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user26, (java.lang.Boolean) false, "");
        java.lang.String str30 = usernamePasswordAuthResult29.delegationKey();
        java.lang.String str31 = usernamePasswordAuthResult29.toString();
        boolean boolean33 = usernamePasswordAuthResult29.equals((java.lang.Object) (byte) 0);
        java.lang.String str34 = usernamePasswordAuthResult29.delegationKey();
        boolean boolean35 = usernamePasswordAuthResult21.equals((java.lang.Object) str34);
        java.lang.Class<?> wildcardClass36 = usernamePasswordAuthResult21.getClass();
        boolean boolean37 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult21);
        java.lang.String str38 = jWTAuthResult4.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet39 = jWTAuthResult4.authorities();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str31, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet39);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1539");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1540");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.lang.String str5 = jWTAuthResult4.username();
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties6 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager7 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO8 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO9 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO10 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO11 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO12 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps13 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO14 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO15 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO16 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager17 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager18 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager19 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties20 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager21 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO22 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO23 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO24 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO25 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO26 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps27 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO28 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO29 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO30 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager31 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager32 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager33 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray34 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList35 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList35, jWTSSOProviderArray34);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor37 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties20, encryptorManager21, realmSearchDAO22, userDAO23, groupDAO24, anySearchDAO25, accessTokenDAO26, confParamOps27, roleDAO28, delegationDAO29, externalResourceDAO30, connectorManager31, auditManager32, mappingManager33, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList35);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor38 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties6, encryptorManager7, realmSearchDAO8, userDAO9, groupDAO10, anySearchDAO11, accessTokenDAO12, confParamOps13, roleDAO14, delegationDAO15, externalResourceDAO16, connectorManager17, auditManager18, mappingManager19, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList35);
        boolean boolean39 = jWTAuthResult4.equals((java.lang.Object) delegationDAO15);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult4.authorities();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(jWTSSOProviderArray34);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray34, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet40);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1541");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray42 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList43 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43, jWTSSOProviderArray42);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor45 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor46 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor47 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.JWTSSOProvider jWTSSOProvider49 = authDataAccessor47.getJWTSSOProvider("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]]");
            org.junit.Assert.fail("Expected exception of type org.springframework.security.authentication.AuthenticationCredentialsNotFoundException; message: Could not find any registered JWTSSOProvider for issuer UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]]");
        } catch (org.springframework.security.authentication.AuthenticationCredentialsNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray42);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray42, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1542");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = authDataAccessor32.getAuthorities("JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=null]", "JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1543");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray42 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList43 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43, jWTSSOProviderArray42);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor45 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor46 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor47 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet50 = authDataAccessor47.getAuthorities("hi!", "JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray42);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray42, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1544");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user8, (java.lang.Boolean) false, "");
        java.lang.String str12 = usernamePasswordAuthResult11.delegationKey();
        java.lang.String str13 = usernamePasswordAuthResult11.toString();
        boolean boolean15 = usernamePasswordAuthResult11.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = usernamePasswordAuthResult11.delegationKey();
        boolean boolean17 = usernamePasswordAuthResult3.equals((java.lang.Object) str16);
        java.lang.Boolean boolean18 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user19 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user20 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean21 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1545");
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
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor15.removeExpired("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AccessTokenDAO.deleteById(String)\" because \"this.accessTokenDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1546");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult11.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult11.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean18 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str19 = usernamePasswordAuthResult17.delegationKey();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult17.authenticated();
        java.lang.Boolean boolean21 = usernamePasswordAuthResult17.authenticated();
        boolean boolean22 = jWTAuthResult11.equals((java.lang.Object) boolean21);
        java.lang.String str23 = jWTAuthResult11.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult11.authorities();
        boolean boolean25 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet24);
        java.lang.Boolean boolean26 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user27 = usernamePasswordAuthResult3.user();
        java.lang.String str28 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str23, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str28, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1547");
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
        org.apache.syncope.core.persistence.api.entity.user.User user22 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user22, (java.lang.Boolean) false, "");
        java.lang.String str26 = usernamePasswordAuthResult25.delegationKey();
        java.lang.String str27 = usernamePasswordAuthResult25.toString();
        java.lang.String str28 = usernamePasswordAuthResult25.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user29 = usernamePasswordAuthResult25.user();
        org.apache.syncope.core.persistence.api.entity.user.User user30 = usernamePasswordAuthResult25.user();
        org.apache.syncope.core.persistence.api.entity.user.User user31 = usernamePasswordAuthResult25.user();
        org.apache.syncope.core.persistence.api.entity.user.User user32 = usernamePasswordAuthResult25.user();
        java.lang.String str33 = usernamePasswordAuthResult25.delegationKey();
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor17.audit("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]", "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]", "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]", outcome21, (java.lang.Object) usernamePasswordAuthResult25, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray14);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray14, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str27, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertNull(user30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNull(user32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1548");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]], authorities=[]]");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1549");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user11, (java.lang.Boolean) false, "");
        java.lang.String str15 = usernamePasswordAuthResult14.delegationKey();
        java.lang.String str16 = usernamePasswordAuthResult14.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user17 = usernamePasswordAuthResult14.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray19 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet20, syncopeGrantedAuthorityArray19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet20);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = jWTAuthResult22.authorities();
        java.lang.String str24 = jWTAuthResult22.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult22.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray28 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29, syncopeGrantedAuthorityArray28);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29);
        boolean boolean33 = jWTAuthResult22.equals((java.lang.Object) jWTAuthResult32);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = jWTAuthResult22.authorities();
        boolean boolean35 = usernamePasswordAuthResult14.equals((java.lang.Object) syncopeGrantedAuthoritySet34);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]]", syncopeGrantedAuthoritySet34);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]", syncopeGrantedAuthoritySet34);
        boolean boolean38 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet34);
        java.lang.Boolean boolean39 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray19);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray19, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str24, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray28);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray28, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1550");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        java.lang.String str6 = jWTAuthResult4.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult11.authorities();
        java.lang.String str13 = jWTAuthResult11.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = jWTAuthResult11.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray17 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18, syncopeGrantedAuthorityArray17);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18);
        boolean boolean22 = jWTAuthResult11.equals((java.lang.Object) jWTAuthResult21);
        boolean boolean23 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult11);
        java.lang.String str24 = jWTAuthResult4.username();
        java.lang.String str25 = jWTAuthResult4.username();
        java.lang.String str26 = jWTAuthResult4.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult4.authorities();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str6, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str13, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet14);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray17);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray17, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str26, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1551");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult4.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult10.authenticated();
        boolean boolean15 = jWTAuthResult4.equals((java.lang.Object) boolean14);
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) 0);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult4.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user19 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user19, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean23 = usernamePasswordAuthResult22.authenticated();
        java.lang.String str24 = usernamePasswordAuthResult22.delegationKey();
        java.lang.Boolean boolean25 = usernamePasswordAuthResult22.authenticated();
        java.lang.String str26 = usernamePasswordAuthResult22.toString();
        boolean boolean28 = usernamePasswordAuthResult22.equals((java.lang.Object) 100);
        boolean boolean29 = jWTAuthResult4.equals((java.lang.Object) 100);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult4.authorities();
        java.lang.String str31 = jWTAuthResult4.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet32 = jWTAuthResult4.authorities();
        java.lang.Class<?> wildcardClass33 = syncopeGrantedAuthoritySet32.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str26, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1552");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        java.lang.String str12 = jWTAuthResult10.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult10.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray16 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17, syncopeGrantedAuthorityArray16);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        boolean boolean21 = jWTAuthResult10.equals((java.lang.Object) jWTAuthResult20);
        boolean boolean22 = jWTAuthResult4.equals((java.lang.Object) boolean21);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult4.authorities();
        java.lang.String str25 = jWTAuthResult4.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray27 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28, syncopeGrantedAuthorityArray27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet31 = jWTAuthResult30.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet32 = jWTAuthResult30.authorities();
        java.lang.String str33 = jWTAuthResult30.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = jWTAuthResult30.authorities();
        java.lang.String str35 = jWTAuthResult30.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult30.authorities();
        boolean boolean37 = jWTAuthResult4.equals((java.lang.Object) syncopeGrantedAuthoritySet36);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray41 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet42 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet42, syncopeGrantedAuthorityArray41);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult44 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet42);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet45 = jWTAuthResult44.authorities();
        java.lang.String str46 = jWTAuthResult44.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet47 = jWTAuthResult44.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult48 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet47);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult49 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", syncopeGrantedAuthoritySet47);
        boolean boolean50 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult49);
        java.lang.Class<?> wildcardClass51 = jWTAuthResult49.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str12, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray16);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray16, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet23);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray27);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray27, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet31);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str33, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray41);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray41, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str46, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1553");
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
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray22 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23, syncopeGrantedAuthorityArray22);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = jWTAuthResult25.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult25.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user28 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user28, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean32 = usernamePasswordAuthResult31.authenticated();
        java.lang.String str33 = usernamePasswordAuthResult31.delegationKey();
        java.lang.Boolean boolean34 = usernamePasswordAuthResult31.authenticated();
        java.lang.Boolean boolean35 = usernamePasswordAuthResult31.authenticated();
        boolean boolean36 = jWTAuthResult25.equals((java.lang.Object) boolean35);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray39 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40, syncopeGrantedAuthorityArray39);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet40);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet43 = jWTAuthResult42.authorities();
        java.lang.String str44 = jWTAuthResult42.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet45 = jWTAuthResult42.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult46 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet45);
        boolean boolean47 = jWTAuthResult25.equals((java.lang.Object) syncopeGrantedAuthoritySet45);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult48 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]]", syncopeGrantedAuthoritySet45);
        org.apache.syncope.core.persistence.api.entity.user.User user49 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult52 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user49, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean53 = usernamePasswordAuthResult52.authenticated();
        java.lang.String str54 = usernamePasswordAuthResult52.delegationKey();
        java.lang.Boolean boolean55 = usernamePasswordAuthResult52.authenticated();
        java.lang.Boolean boolean56 = usernamePasswordAuthResult52.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user57 = usernamePasswordAuthResult52.user();
        org.apache.syncope.core.persistence.api.entity.user.User user58 = usernamePasswordAuthResult52.user();
        org.apache.syncope.core.persistence.api.entity.user.User user59 = usernamePasswordAuthResult52.user();
        java.lang.String str60 = usernamePasswordAuthResult52.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user61 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult64 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user61, (java.lang.Boolean) false, "");
        java.lang.String str65 = usernamePasswordAuthResult64.delegationKey();
        java.lang.String str66 = usernamePasswordAuthResult64.toString();
        java.lang.String str67 = usernamePasswordAuthResult64.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user68 = usernamePasswordAuthResult64.user();
        java.lang.Boolean boolean69 = usernamePasswordAuthResult64.authenticated();
        java.lang.String str70 = usernamePasswordAuthResult64.delegationKey();
        java.lang.Object[] objArray71 = new java.lang.Object[] { str60, str70 };
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor15.audit("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]]", "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]]", "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]]", outcome19, (java.lang.Object) syncopeGrantedAuthoritySet45, objArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray22);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray22, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet26);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray39);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray39, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str44, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(user57);
        org.junit.Assert.assertNull(user58);
        org.junit.Assert.assertNull(user59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str66, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(user68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[, ]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1554");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 0);
        org.apache.syncope.core.persistence.api.entity.user.User user10 = usernamePasswordAuthResult3.user();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean12 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray15 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16, syncopeGrantedAuthorityArray15);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray21 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22, syncopeGrantedAuthorityArray21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult24.authorities();
        boolean boolean26 = jWTAuthResult19.equals((java.lang.Object) jWTAuthResult24);
        java.lang.String str27 = jWTAuthResult24.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult24.authorities();
        boolean boolean29 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet28);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray31 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet32 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet32, syncopeGrantedAuthorityArray31);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult34 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet32);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = jWTAuthResult34.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult34.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user37 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult40 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user37, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean41 = usernamePasswordAuthResult40.authenticated();
        java.lang.String str42 = usernamePasswordAuthResult40.delegationKey();
        java.lang.Boolean boolean43 = usernamePasswordAuthResult40.authenticated();
        java.lang.Boolean boolean44 = usernamePasswordAuthResult40.authenticated();
        boolean boolean45 = jWTAuthResult34.equals((java.lang.Object) boolean44);
        java.lang.String str46 = jWTAuthResult34.username();
        boolean boolean47 = usernamePasswordAuthResult3.equals((java.lang.Object) str46);
        java.lang.String str48 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str49 = usernamePasswordAuthResult3.toString();
        java.lang.String str50 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray15);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray15, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray21);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray21, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str27, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray31);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray31, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet35);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str49, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str50, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1555");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        boolean boolean6 = jWTAuthResult4.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str14 = usernamePasswordAuthResult10.delegationKey();
        java.lang.String str15 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Class<?> wildcardClass16 = usernamePasswordAuthResult10.getClass();
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult10);
        org.apache.syncope.core.persistence.api.entity.user.User user18 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user18, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean22 = usernamePasswordAuthResult21.authenticated();
        java.lang.String str23 = usernamePasswordAuthResult21.delegationKey();
        java.lang.Boolean boolean24 = usernamePasswordAuthResult21.authenticated();
        java.lang.String str25 = usernamePasswordAuthResult21.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user26 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user26, (java.lang.Boolean) false, "");
        java.lang.String str30 = usernamePasswordAuthResult29.delegationKey();
        java.lang.String str31 = usernamePasswordAuthResult29.toString();
        boolean boolean33 = usernamePasswordAuthResult29.equals((java.lang.Object) (byte) 0);
        java.lang.String str34 = usernamePasswordAuthResult29.delegationKey();
        boolean boolean35 = usernamePasswordAuthResult21.equals((java.lang.Object) str34);
        java.lang.Class<?> wildcardClass36 = usernamePasswordAuthResult21.getClass();
        boolean boolean37 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult21);
        java.lang.String str38 = jWTAuthResult4.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet39 = jWTAuthResult4.authorities();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str31, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str38, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet39);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1556");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray5 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6, syncopeGrantedAuthorityArray5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = jWTAuthResult8.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=hi!]", syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=hi!, authorities=[]]], authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray5);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray5, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet9);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1557");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1558");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray42 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList43 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43, jWTSSOProviderArray42);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor45 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor46 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor47 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.springframework.security.core.Authentication authentication49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult50 = authDataAccessor47.authenticate("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]]", authentication49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray42);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray42, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1559");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = jWTAuthResult6.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray9 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10, syncopeGrantedAuthorityArray9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult12.authorities();
        java.lang.String str14 = jWTAuthResult12.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet15 = jWTAuthResult12.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray18 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19, syncopeGrantedAuthorityArray18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        boolean boolean23 = jWTAuthResult12.equals((java.lang.Object) jWTAuthResult22);
        boolean boolean24 = jWTAuthResult6.equals((java.lang.Object) boolean23);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult6.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = jWTAuthResult6.authorities();
        java.lang.String str27 = jWTAuthResult6.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray29 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30, syncopeGrantedAuthorityArray29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet33 = jWTAuthResult32.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = jWTAuthResult32.authorities();
        java.lang.String str35 = jWTAuthResult32.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult32.authorities();
        java.lang.String str37 = jWTAuthResult32.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet38 = jWTAuthResult32.authorities();
        boolean boolean39 = jWTAuthResult6.equals((java.lang.Object) syncopeGrantedAuthoritySet38);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult40 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet38);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult41 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet38);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet42 = jWTAuthResult41.authorities();
        java.lang.Class<?> wildcardClass43 = syncopeGrantedAuthoritySet42.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet7);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray9);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray9, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str14, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet15);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray18);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray18, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray29);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray29, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet33);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str35, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1560");
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
        org.apache.syncope.core.persistence.api.entity.user.User user27 = usernamePasswordAuthResult23.user();
        org.apache.syncope.core.persistence.api.entity.user.User user28 = usernamePasswordAuthResult23.user();
        java.lang.Object[] objArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor15.audit("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]]", "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]", "JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]], authorities=[]]", outcome19, (java.lang.Object) user28, objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertNull(user28);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1561");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str4, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1562");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "hi!");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult11.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult11.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean18 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str19 = usernamePasswordAuthResult17.delegationKey();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult17.authenticated();
        java.lang.Boolean boolean21 = usernamePasswordAuthResult17.authenticated();
        boolean boolean22 = jWTAuthResult11.equals((java.lang.Object) boolean21);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray25 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet26, syncopeGrantedAuthorityArray25);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult28 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet26);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = jWTAuthResult28.authorities();
        java.lang.String str30 = jWTAuthResult28.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet31 = jWTAuthResult28.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet31);
        boolean boolean33 = jWTAuthResult11.equals((java.lang.Object) syncopeGrantedAuthoritySet31);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray35 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet36, syncopeGrantedAuthorityArray35);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult38 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet36);
        boolean boolean39 = jWTAuthResult11.equals((java.lang.Object) "hi!");
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = jWTAuthResult11.authorities();
        boolean boolean41 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray25);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray25, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str30, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray35);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray35, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1563");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray56 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList57 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57, jWTSSOProviderArray56);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor59 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor60 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor61 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor62 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.springframework.security.core.Authentication authentication64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult65 = authDataAccessor62.authenticate("JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=null]", authentication64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray56);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray56, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1564");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        boolean boolean13 = jWTAuthResult11.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean18 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str19 = usernamePasswordAuthResult17.delegationKey();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str21 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str22 = usernamePasswordAuthResult17.delegationKey();
        java.lang.Class<?> wildcardClass23 = usernamePasswordAuthResult17.getClass();
        boolean boolean24 = jWTAuthResult11.equals((java.lang.Object) usernamePasswordAuthResult17);
        org.apache.syncope.core.persistence.api.entity.user.User user25 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult28 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user25, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean29 = usernamePasswordAuthResult28.authenticated();
        java.lang.String str30 = usernamePasswordAuthResult28.delegationKey();
        java.lang.Boolean boolean31 = usernamePasswordAuthResult28.authenticated();
        java.lang.String str32 = usernamePasswordAuthResult28.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user33 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user33, (java.lang.Boolean) false, "");
        java.lang.String str37 = usernamePasswordAuthResult36.delegationKey();
        java.lang.String str38 = usernamePasswordAuthResult36.toString();
        boolean boolean40 = usernamePasswordAuthResult36.equals((java.lang.Object) (byte) 0);
        java.lang.String str41 = usernamePasswordAuthResult36.delegationKey();
        boolean boolean42 = usernamePasswordAuthResult28.equals((java.lang.Object) str41);
        java.lang.Class<?> wildcardClass43 = usernamePasswordAuthResult28.getClass();
        boolean boolean44 = jWTAuthResult11.equals((java.lang.Object) usernamePasswordAuthResult28);
        boolean boolean45 = usernamePasswordAuthResult3.equals((java.lang.Object) boolean44);
        java.lang.String str46 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user47 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean48 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str38, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str46, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1565");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 1L);
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        java.lang.String str13 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray15 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16, syncopeGrantedAuthorityArray15);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16);
        boolean boolean20 = jWTAuthResult18.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user21 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user21, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean25 = usernamePasswordAuthResult24.authenticated();
        java.lang.String str26 = usernamePasswordAuthResult24.delegationKey();
        java.lang.Boolean boolean27 = usernamePasswordAuthResult24.authenticated();
        java.lang.String str28 = usernamePasswordAuthResult24.delegationKey();
        java.lang.String str29 = usernamePasswordAuthResult24.delegationKey();
        java.lang.Class<?> wildcardClass30 = usernamePasswordAuthResult24.getClass();
        boolean boolean31 = jWTAuthResult18.equals((java.lang.Object) usernamePasswordAuthResult24);
        org.apache.syncope.core.persistence.api.entity.user.User user32 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult35 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user32, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean36 = usernamePasswordAuthResult35.authenticated();
        java.lang.String str37 = usernamePasswordAuthResult35.delegationKey();
        java.lang.Boolean boolean38 = usernamePasswordAuthResult35.authenticated();
        java.lang.String str39 = usernamePasswordAuthResult35.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user40 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user40, (java.lang.Boolean) false, "");
        java.lang.String str44 = usernamePasswordAuthResult43.delegationKey();
        java.lang.String str45 = usernamePasswordAuthResult43.toString();
        boolean boolean47 = usernamePasswordAuthResult43.equals((java.lang.Object) (byte) 0);
        java.lang.String str48 = usernamePasswordAuthResult43.delegationKey();
        boolean boolean49 = usernamePasswordAuthResult35.equals((java.lang.Object) str48);
        java.lang.Class<?> wildcardClass50 = usernamePasswordAuthResult35.getClass();
        boolean boolean51 = jWTAuthResult18.equals((java.lang.Object) usernamePasswordAuthResult35);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet52 = jWTAuthResult18.authorities();
        java.lang.Class<?> wildcardClass53 = jWTAuthResult18.getClass();
        boolean boolean54 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray15);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray15, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str45, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1566");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.lang.String str7 = jWTAuthResult6.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray9 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10, syncopeGrantedAuthorityArray9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult12.authorities();
        boolean boolean14 = jWTAuthResult6.equals((java.lang.Object) jWTAuthResult12);
        boolean boolean16 = jWTAuthResult6.equals((java.lang.Object) "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]");
        java.lang.Class<?> wildcardClass17 = jWTAuthResult6.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str7, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray9);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray9, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1567");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray9 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10, syncopeGrantedAuthorityArray9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult12.authorities();
        boolean boolean14 = jWTAuthResult7.equals((java.lang.Object) jWTAuthResult12);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet15 = jWTAuthResult7.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet15);
        java.lang.String str17 = jWTAuthResult16.toString();
        java.lang.Class<?> wildcardClass18 = jWTAuthResult16.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray9);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray9, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=[]]" + "'", str17, "JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1568");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray4 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5, syncopeGrantedAuthorityArray4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult7.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet8);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult9.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=hi!]", syncopeGrantedAuthoritySet10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult12.authorities();
        java.lang.String str14 = jWTAuthResult12.toString();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray4);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray4, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str14, "JWTAuthResult[username=hi!, authorities=[]]");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1569");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = authDataAccessor32.getAuthorities("JWTAuthResult[username=, authorities=[]]", "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1570");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 1L);
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray12 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13, syncopeGrantedAuthorityArray12);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13);
        boolean boolean17 = jWTAuthResult15.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = usernamePasswordAuthResult3.equals((java.lang.Object) (byte) 10);
        java.lang.String str19 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user20 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user21 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray12);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray12, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1571");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 1L);
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        java.lang.String str13 = usernamePasswordAuthResult3.toString();
        java.lang.String str14 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray17 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18, syncopeGrantedAuthorityArray17);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray23 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet24, syncopeGrantedAuthorityArray23);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet24);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult26.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult26.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user29 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user29, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean33 = usernamePasswordAuthResult32.authenticated();
        java.lang.String str34 = usernamePasswordAuthResult32.delegationKey();
        java.lang.Boolean boolean35 = usernamePasswordAuthResult32.authenticated();
        java.lang.Boolean boolean36 = usernamePasswordAuthResult32.authenticated();
        boolean boolean37 = jWTAuthResult26.equals((java.lang.Object) boolean36);
        boolean boolean39 = jWTAuthResult26.equals((java.lang.Object) 0);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = jWTAuthResult26.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult26.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray44 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet45 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet45, syncopeGrantedAuthorityArray44);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult47 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet45);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult48 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet45);
        java.lang.String str49 = jWTAuthResult48.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray51 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet52 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet52, syncopeGrantedAuthorityArray51);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult54 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet52);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet55 = jWTAuthResult54.authorities();
        boolean boolean56 = jWTAuthResult48.equals((java.lang.Object) jWTAuthResult54);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet57 = jWTAuthResult48.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet58 = jWTAuthResult48.authorities();
        boolean boolean59 = jWTAuthResult26.equals((java.lang.Object) jWTAuthResult48);
        boolean boolean60 = jWTAuthResult21.equals((java.lang.Object) jWTAuthResult48);
        boolean boolean61 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult48);
        org.apache.syncope.core.persistence.api.entity.user.User user62 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray17);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray17, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray23);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray23, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet40);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray44);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray44, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str49, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray51);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray51, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet57);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(user62);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1572");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray42 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList43 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43, jWTSSOProviderArray42);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor45 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor46 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor47 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.springframework.security.core.Authentication authentication49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult50 = authDataAccessor47.authenticate("JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=null]", authentication49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray42);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray42, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1573");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        java.lang.String str12 = jWTAuthResult10.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult10.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray16 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17, syncopeGrantedAuthorityArray16);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        boolean boolean21 = jWTAuthResult10.equals((java.lang.Object) jWTAuthResult20);
        boolean boolean22 = jWTAuthResult4.equals((java.lang.Object) boolean21);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult4.authorities();
        java.lang.String str25 = jWTAuthResult4.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = jWTAuthResult4.authorities();
        java.lang.String str27 = jWTAuthResult4.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray30 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet31 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet31, syncopeGrantedAuthorityArray30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet31);
        boolean boolean35 = jWTAuthResult33.equals((java.lang.Object) (byte) 10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult33.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet36);
        boolean boolean38 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult37);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str12, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray16);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray16, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet23);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str27, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray30);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray30, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1574");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.lang.String str13 = jWTAuthResult12.username();
        boolean boolean14 = usernamePasswordAuthResult3.equals((java.lang.Object) str13);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray18 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19, syncopeGrantedAuthorityArray18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = jWTAuthResult22.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet23);
        boolean boolean25 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet23);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray27 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28, syncopeGrantedAuthorityArray27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        java.lang.String str31 = jWTAuthResult30.username();
        java.lang.String str32 = jWTAuthResult30.username();
        java.lang.String str33 = jWTAuthResult30.toString();
        boolean boolean34 = usernamePasswordAuthResult3.equals((java.lang.Object) str33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray18);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray18, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray27);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray27, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str33, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1575");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean5 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user6, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean10 = usernamePasswordAuthResult9.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult9.delegationKey();
        java.lang.Boolean boolean12 = usernamePasswordAuthResult9.authenticated();
        java.lang.String str13 = usernamePasswordAuthResult9.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.String str18 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str19 = usernamePasswordAuthResult17.toString();
        boolean boolean21 = usernamePasswordAuthResult17.equals((java.lang.Object) (byte) 0);
        java.lang.String str22 = usernamePasswordAuthResult17.delegationKey();
        boolean boolean23 = usernamePasswordAuthResult9.equals((java.lang.Object) str22);
        boolean boolean24 = usernamePasswordAuthResult3.equals((java.lang.Object) usernamePasswordAuthResult9);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray28 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29, syncopeGrantedAuthorityArray28);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29);
        java.lang.String str34 = jWTAuthResult33.toString();
        java.lang.String str35 = jWTAuthResult33.username();
        boolean boolean36 = usernamePasswordAuthResult3.equals((java.lang.Object) str35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str19, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray28);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray28, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str34, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str35, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1576");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        java.lang.String str9 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray12 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13, syncopeGrantedAuthorityArray12);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray18 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19, syncopeGrantedAuthorityArray18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = jWTAuthResult21.authorities();
        java.lang.String str23 = jWTAuthResult21.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult21.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray27 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28, syncopeGrantedAuthorityArray27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        boolean boolean32 = jWTAuthResult21.equals((java.lang.Object) jWTAuthResult31);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet33 = jWTAuthResult21.authorities();
        java.lang.String str34 = jWTAuthResult21.username();
        boolean boolean35 = jWTAuthResult16.equals((java.lang.Object) str34);
        java.lang.String str36 = jWTAuthResult16.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = jWTAuthResult16.authorities();
        boolean boolean38 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet37);
        java.lang.String str39 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str40 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray12);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray12, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray18);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray18, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str23, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray27);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray27, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str36, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1577");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.lang.String str13 = jWTAuthResult12.toString();
        boolean boolean14 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult12);
        java.lang.String str15 = jWTAuthResult4.toString();
        java.lang.Class<?> wildcardClass16 = jWTAuthResult4.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str13, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str15, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1578");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult16.authorities();
        java.lang.String str18 = jWTAuthResult16.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult16.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray22 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23, syncopeGrantedAuthorityArray22);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        boolean boolean27 = jWTAuthResult16.equals((java.lang.Object) jWTAuthResult26);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult16.authorities();
        java.lang.String str29 = jWTAuthResult16.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult16.authorities();
        boolean boolean31 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet30);
        java.lang.String str32 = usernamePasswordAuthResult3.toString();
        java.lang.Class<?> wildcardClass33 = usernamePasswordAuthResult3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str18, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray22);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray22, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str32, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1579");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult16.authorities();
        java.lang.String str18 = jWTAuthResult16.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult16.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray22 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23, syncopeGrantedAuthorityArray22);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        boolean boolean27 = jWTAuthResult16.equals((java.lang.Object) jWTAuthResult26);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult16.authorities();
        java.lang.String str29 = jWTAuthResult16.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult16.authorities();
        boolean boolean31 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet30);
        java.lang.Class<?> wildcardClass32 = usernamePasswordAuthResult3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str18, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray22);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray22, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1580");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.JWTSSOProvider jWTSSOProvider34 = authDataAccessor32.getJWTSSOProvider("JWTAuthResult[username=, authorities=[]]");
            org.junit.Assert.fail("Expected exception of type org.springframework.security.authentication.AuthenticationCredentialsNotFoundException; message: Could not find any registered JWTSSOProvider for issuer JWTAuthResult[username=, authorities=[]]");
        } catch (org.springframework.security.authentication.AuthenticationCredentialsNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1581");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 100);
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray15 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16, syncopeGrantedAuthorityArray15);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16);
        org.apache.syncope.core.persistence.api.entity.user.User user19 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user19, (java.lang.Boolean) false, "");
        java.lang.String str23 = usernamePasswordAuthResult22.delegationKey();
        java.lang.String str24 = usernamePasswordAuthResult22.toString();
        boolean boolean25 = jWTAuthResult18.equals((java.lang.Object) str24);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = jWTAuthResult18.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult27 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet26);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult28 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet26);
        boolean boolean29 = usernamePasswordAuthResult3.equals((java.lang.Object) "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str11, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray15);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray15, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str24, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1582");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 100);
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult16.authorities();
        java.lang.String str18 = jWTAuthResult16.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray20 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21, syncopeGrantedAuthorityArray20);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult23.authorities();
        java.lang.String str25 = jWTAuthResult23.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = jWTAuthResult23.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray29 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30, syncopeGrantedAuthorityArray29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30);
        boolean boolean34 = jWTAuthResult23.equals((java.lang.Object) jWTAuthResult33);
        boolean boolean35 = jWTAuthResult16.equals((java.lang.Object) jWTAuthResult23);
        boolean boolean36 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult16);
        java.lang.Boolean boolean37 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user38 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str11, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str18, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray20);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray20, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str25, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet26);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray29);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray29, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1583");
        org.apache.syncope.core.persistence.api.entity.user.User user5 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user5, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean9 = usernamePasswordAuthResult8.authenticated();
        java.lang.String str10 = usernamePasswordAuthResult8.delegationKey();
        java.lang.Boolean boolean11 = usernamePasswordAuthResult8.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.lang.String str17 = jWTAuthResult16.username();
        boolean boolean18 = usernamePasswordAuthResult8.equals((java.lang.Object) jWTAuthResult16);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult16.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]", syncopeGrantedAuthoritySet19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", syncopeGrantedAuthoritySet19);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray24 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25, syncopeGrantedAuthorityArray24);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult27 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25);
        boolean boolean28 = jWTAuthResult22.equals((java.lang.Object) "");
        org.apache.syncope.core.persistence.api.entity.user.User user29 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user29, (java.lang.Boolean) true, "");
        java.lang.String str33 = usernamePasswordAuthResult32.delegationKey();
        java.lang.Class<?> wildcardClass34 = usernamePasswordAuthResult32.getClass();
        boolean boolean35 = jWTAuthResult22.equals((java.lang.Object) usernamePasswordAuthResult32);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult22.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet36);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult38 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray24);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray24, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1584");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        org.apache.syncope.core.persistence.api.entity.user.User user12 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user12, (java.lang.Boolean) false, "");
        java.lang.String str16 = usernamePasswordAuthResult15.delegationKey();
        java.lang.String str17 = usernamePasswordAuthResult15.toString();
        boolean boolean18 = jWTAuthResult11.equals((java.lang.Object) str17);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult11.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet19);
        boolean boolean21 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult20);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = jWTAuthResult20.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user23 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user23, (java.lang.Boolean) true, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]");
        boolean boolean27 = jWTAuthResult20.equals((java.lang.Object) usernamePasswordAuthResult26);
        org.apache.syncope.core.persistence.api.entity.user.User user28 = usernamePasswordAuthResult26.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str4, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str5, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str17, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(user28);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1585");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str8 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str9 = usernamePasswordAuthResult3.toString();
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean11 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str9, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1586");
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
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor32.removeExpired("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AccessTokenDAO.deleteById(String)\" because \"this.accessTokenDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1587");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "JWTAuthResult[username=, authorities=[]]");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str4, "JWTAuthResult[username=, authorities=[]]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1588");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        boolean boolean6 = jWTAuthResult4.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str14 = usernamePasswordAuthResult10.delegationKey();
        java.lang.String str15 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Class<?> wildcardClass16 = usernamePasswordAuthResult10.getClass();
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult10);
        java.lang.String str18 = jWTAuthResult4.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray21 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22, syncopeGrantedAuthorityArray21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22);
        java.lang.String str25 = jWTAuthResult24.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray27 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28, syncopeGrantedAuthorityArray27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        boolean boolean31 = jWTAuthResult24.equals((java.lang.Object) "hi!");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray33 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34, syncopeGrantedAuthorityArray33);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = jWTAuthResult36.authorities();
        java.lang.String str38 = jWTAuthResult36.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet39 = jWTAuthResult36.authorities();
        boolean boolean40 = jWTAuthResult24.equals((java.lang.Object) jWTAuthResult36);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult24.authorities();
        boolean boolean42 = jWTAuthResult4.equals((java.lang.Object) syncopeGrantedAuthoritySet41);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray45 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet46 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet46, syncopeGrantedAuthorityArray45);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult48 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet46);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet49 = jWTAuthResult48.authorities();
        java.lang.String str50 = jWTAuthResult48.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet51 = jWTAuthResult48.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult52 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet51);
        java.lang.String str53 = jWTAuthResult52.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray57 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet58 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet58, syncopeGrantedAuthorityArray57);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult60 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet58);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet61 = jWTAuthResult60.authorities();
        java.lang.String str62 = jWTAuthResult60.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet63 = jWTAuthResult60.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult64 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet63);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult65 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", syncopeGrantedAuthoritySet63);
        java.lang.Class<?> wildcardClass66 = syncopeGrantedAuthoritySet63.getClass();
        boolean boolean67 = jWTAuthResult52.equals((java.lang.Object) wildcardClass66);
        boolean boolean68 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult52);
        org.apache.syncope.core.persistence.api.entity.user.User user69 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult72 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user69, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean73 = usernamePasswordAuthResult72.authenticated();
        java.lang.String str74 = usernamePasswordAuthResult72.delegationKey();
        java.lang.Boolean boolean75 = usernamePasswordAuthResult72.authenticated();
        java.lang.String str76 = usernamePasswordAuthResult72.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user77 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult80 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user77, (java.lang.Boolean) false, "");
        java.lang.String str81 = usernamePasswordAuthResult80.delegationKey();
        java.lang.String str82 = usernamePasswordAuthResult80.toString();
        boolean boolean84 = usernamePasswordAuthResult80.equals((java.lang.Object) (byte) 0);
        java.lang.String str85 = usernamePasswordAuthResult80.delegationKey();
        boolean boolean86 = usernamePasswordAuthResult72.equals((java.lang.Object) str85);
        java.lang.Class<?> wildcardClass87 = usernamePasswordAuthResult72.getClass();
        boolean boolean88 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult72);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray21);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray21, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray27);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray27, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray33);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray33, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str38, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray45);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray45, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str50, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str53, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray57);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray57, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str62, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet63);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str82, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1589");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 0);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray12 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13, syncopeGrantedAuthorityArray12);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = jWTAuthResult15.authorities();
        java.lang.String str17 = jWTAuthResult15.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult15.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet18);
        java.lang.Class<?> wildcardClass20 = jWTAuthResult19.getClass();
        boolean boolean21 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray12);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray12, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str17, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1590");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.lang.String str13 = jWTAuthResult12.username();
        boolean boolean14 = usernamePasswordAuthResult3.equals((java.lang.Object) str13);
        java.lang.String str15 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray18 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19, syncopeGrantedAuthorityArray18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        boolean boolean23 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult22);
        java.lang.Boolean boolean24 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str15, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray18);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray18, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1591");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray6 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7, syncopeGrantedAuthorityArray6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult9.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet10);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray16 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17, syncopeGrantedAuthorityArray16);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        org.apache.syncope.core.persistence.api.entity.user.User user20 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user20, (java.lang.Boolean) false, "");
        java.lang.String str24 = usernamePasswordAuthResult23.delegationKey();
        java.lang.String str25 = usernamePasswordAuthResult23.toString();
        boolean boolean26 = jWTAuthResult19.equals((java.lang.Object) str25);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult19.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult28 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet27);
        boolean boolean30 = jWTAuthResult12.equals((java.lang.Object) syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]", syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]", syncopeGrantedAuthoritySet27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray6);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray6, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray16);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray16, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str25, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1592");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean5 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1593");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user6, (java.lang.Boolean) false, "");
        java.lang.String str10 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str11 = usernamePasswordAuthResult9.toString();
        java.lang.String str12 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str13 = usernamePasswordAuthResult9.toString();
        boolean boolean14 = usernamePasswordAuthResult3.equals((java.lang.Object) str13);
        org.apache.syncope.core.persistence.api.entity.user.User user15 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user16 = usernamePasswordAuthResult3.user();
        java.lang.String str17 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str18 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean19 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str11, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1594");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray4 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5, syncopeGrantedAuthorityArray4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray10 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11, syncopeGrantedAuthorityArray10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = jWTAuthResult13.authorities();
        boolean boolean15 = jWTAuthResult8.equals((java.lang.Object) jWTAuthResult13);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = jWTAuthResult8.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]", syncopeGrantedAuthoritySet16);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet16);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult18.authorities();
        java.lang.String str20 = jWTAuthResult18.username();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray4);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray4, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray10);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray10, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet16);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str20, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1595");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "hi!");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1596");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult11.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult11.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean18 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str19 = usernamePasswordAuthResult17.delegationKey();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult17.authenticated();
        java.lang.Boolean boolean21 = usernamePasswordAuthResult17.authenticated();
        boolean boolean22 = jWTAuthResult11.equals((java.lang.Object) boolean21);
        java.lang.String str23 = jWTAuthResult11.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult11.authorities();
        boolean boolean25 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet24);
        java.lang.String str26 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str23, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str26, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1597");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        boolean boolean7 = jWTAuthResult5.equals((java.lang.Object) (byte) 10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult5.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet8);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray11 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12, syncopeGrantedAuthorityArray11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12);
        java.lang.String str15 = jWTAuthResult14.toString();
        java.lang.String str16 = jWTAuthResult14.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult14.authorities();
        boolean boolean18 = jWTAuthResult9.equals((java.lang.Object) syncopeGrantedAuthoritySet17);
        java.lang.Class<?> wildcardClass19 = jWTAuthResult9.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray11);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray11, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str15, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str16, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1598");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 100);
        java.lang.String str10 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        java.lang.String str12 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str13 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str10, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1599");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = authDataAccessor15.getAuthorities("JWTAuthResult[username=hi!, authorities=[]]", "JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1600");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult5.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = jWTAuthResult5.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user8, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean12 = usernamePasswordAuthResult11.authenticated();
        java.lang.String str13 = usernamePasswordAuthResult11.delegationKey();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult11.authenticated();
        java.lang.Boolean boolean15 = usernamePasswordAuthResult11.authenticated();
        boolean boolean16 = jWTAuthResult5.equals((java.lang.Object) boolean15);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray19 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet20, syncopeGrantedAuthorityArray19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet20);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = jWTAuthResult22.authorities();
        java.lang.String str24 = jWTAuthResult22.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult22.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet25);
        boolean boolean27 = jWTAuthResult5.equals((java.lang.Object) syncopeGrantedAuthoritySet25);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult28 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]]", syncopeGrantedAuthoritySet25);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = jWTAuthResult28.authorities();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray19);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray19, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str24, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet29);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1601");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str8 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str9 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray14 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet15 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet15, syncopeGrantedAuthorityArray14);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet15);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult17.authorities();
        java.lang.String str19 = jWTAuthResult17.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = jWTAuthResult17.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet20);
        java.lang.String str22 = jWTAuthResult21.username();
        boolean boolean23 = usernamePasswordAuthResult3.equals((java.lang.Object) str22);
        java.lang.String str24 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str9, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray14);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray14, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str19, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str24, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1602");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]], authorities=[]], authorities=null]");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1603");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray10 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11, syncopeGrantedAuthorityArray10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.String str18 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str19 = usernamePasswordAuthResult17.toString();
        boolean boolean20 = jWTAuthResult13.equals((java.lang.Object) str19);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = jWTAuthResult13.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet21);
        boolean boolean24 = jWTAuthResult4.equals((java.lang.Object) "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray28 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29, syncopeGrantedAuthorityArray28);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet29);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet32 = jWTAuthResult31.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet33 = jWTAuthResult31.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user34 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user34, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean38 = usernamePasswordAuthResult37.authenticated();
        java.lang.String str39 = usernamePasswordAuthResult37.delegationKey();
        java.lang.Boolean boolean40 = usernamePasswordAuthResult37.authenticated();
        java.lang.Boolean boolean41 = usernamePasswordAuthResult37.authenticated();
        boolean boolean42 = jWTAuthResult31.equals((java.lang.Object) boolean41);
        boolean boolean44 = jWTAuthResult31.equals((java.lang.Object) 0);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet45 = jWTAuthResult31.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult46 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet45);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult47 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet45);
        boolean boolean48 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult47);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray10);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray10, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str19, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray28);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray28, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet32);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1604");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        boolean boolean8 = jWTAuthResult6.equals((java.lang.Object) (byte) 10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = jWTAuthResult6.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet9);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1605");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = usernamePasswordAuthResult3.user();
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1606");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user6, (java.lang.Boolean) false, "");
        java.lang.String str10 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str11 = usernamePasswordAuthResult9.toString();
        java.lang.String str12 = usernamePasswordAuthResult9.delegationKey();
        java.lang.String str13 = usernamePasswordAuthResult9.toString();
        boolean boolean14 = usernamePasswordAuthResult3.equals((java.lang.Object) str13);
        org.apache.syncope.core.persistence.api.entity.user.User user15 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user16 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user16, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean20 = usernamePasswordAuthResult19.authenticated();
        java.lang.String str21 = usernamePasswordAuthResult19.delegationKey();
        boolean boolean22 = usernamePasswordAuthResult3.equals((java.lang.Object) str21);
        java.lang.String str23 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str24 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean25 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str26 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray31 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet32 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet32, syncopeGrantedAuthorityArray31);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult34 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet32);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = jWTAuthResult34.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet35);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = jWTAuthResult36.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult38 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=, authorities=null], authorities=[]]", syncopeGrantedAuthoritySet37);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult39 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet37);
        boolean boolean40 = usernamePasswordAuthResult3.equals((java.lang.Object) "JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]], authorities=[]]");
        java.lang.Boolean boolean41 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str11, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str24, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str26, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray31);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray31, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet35);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1607");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray56 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList57 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57, jWTSSOProviderArray56);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor59 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor60 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor61 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor62 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet65 = authDataAccessor62.getAuthorities("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]", "JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=hi!, authorities=[]]], authorities=[]], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray56);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray56, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1608");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray42 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList43 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43, jWTSSOProviderArray42);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor45 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor46 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor47 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList43);
        org.springframework.security.core.Authentication authentication49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult50 = authDataAccessor47.authenticate("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=hi!, authorities=[]]]", authentication49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray42);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray42, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1609");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]]");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray6 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7, syncopeGrantedAuthorityArray6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult9.authorities();
        java.lang.String str11 = jWTAuthResult9.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult9.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet12);
        boolean boolean15 = jWTAuthResult13.equals((java.lang.Object) "JWTAuthResult[username=, authorities=[]]");
        boolean boolean16 = usernamePasswordAuthResult3.equals((java.lang.Object) "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray6);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray6, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str11, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1610");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties56 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager57 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO58 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO59 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO60 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO61 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO62 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps63 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO64 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO65 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO66 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager67 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager68 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager69 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties70 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager71 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO72 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO73 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO74 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO75 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO76 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps77 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO78 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO79 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO80 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager81 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager82 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager83 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray84 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList85 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85, jWTSSOProviderArray84);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor87 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties70, encryptorManager71, realmSearchDAO72, userDAO73, groupDAO74, anySearchDAO75, accessTokenDAO76, confParamOps77, roleDAO78, delegationDAO79, externalResourceDAO80, connectorManager81, auditManager82, mappingManager83, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor88 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties56, encryptorManager57, realmSearchDAO58, userDAO59, groupDAO60, anySearchDAO61, accessTokenDAO62, confParamOps63, roleDAO64, delegationDAO65, externalResourceDAO66, connectorManager67, auditManager68, mappingManager69, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor89 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor90 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor91 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor92 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.springframework.security.core.Authentication authentication94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult95 = authDataAccessor92.authenticate("JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]], authorities=[]], authorities=null]", authentication94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray84);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray84, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1611");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]]");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray6 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7, syncopeGrantedAuthorityArray6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7);
        boolean boolean11 = jWTAuthResult9.equals((java.lang.Object) (byte) 10);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult9.authorities();
        java.lang.String str13 = jWTAuthResult9.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = jWTAuthResult9.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray17 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18, syncopeGrantedAuthorityArray17);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet18);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = jWTAuthResult20.authorities();
        java.lang.String str22 = jWTAuthResult20.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = jWTAuthResult20.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet23);
        java.lang.String str25 = jWTAuthResult24.toString();
        boolean boolean26 = jWTAuthResult9.equals((java.lang.Object) jWTAuthResult24);
        boolean boolean27 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult9);
        java.lang.String str28 = jWTAuthResult9.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]]" + "'", str4, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray6);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray6, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet14);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray17);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray17, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str22, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str25, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str28, "JWTAuthResult[username=hi!, authorities=[]]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1612");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = authDataAccessor32.getAuthorities("JWTAuthResult[username=, authorities=[]]", "JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=hi!, authorities=[]]], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1613");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult16.authorities();
        java.lang.String str18 = jWTAuthResult16.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult16.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray22 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23, syncopeGrantedAuthorityArray22);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        boolean boolean27 = jWTAuthResult16.equals((java.lang.Object) jWTAuthResult26);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult16.authorities();
        java.lang.String str29 = jWTAuthResult16.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult16.authorities();
        boolean boolean31 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet30);
        org.apache.syncope.core.persistence.api.entity.user.User user32 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult35 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user32, (java.lang.Boolean) false, "");
        java.lang.String str36 = usernamePasswordAuthResult35.delegationKey();
        java.lang.String str37 = usernamePasswordAuthResult35.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user38 = usernamePasswordAuthResult35.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray40 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet41, syncopeGrantedAuthorityArray40);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet41);
        boolean boolean45 = jWTAuthResult43.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user46 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult49 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user46, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean50 = usernamePasswordAuthResult49.authenticated();
        java.lang.String str51 = usernamePasswordAuthResult49.delegationKey();
        java.lang.Boolean boolean52 = usernamePasswordAuthResult49.authenticated();
        java.lang.String str53 = usernamePasswordAuthResult49.delegationKey();
        java.lang.String str54 = usernamePasswordAuthResult49.delegationKey();
        java.lang.Class<?> wildcardClass55 = usernamePasswordAuthResult49.getClass();
        boolean boolean56 = jWTAuthResult43.equals((java.lang.Object) usernamePasswordAuthResult49);
        org.apache.syncope.core.persistence.api.entity.user.User user57 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult60 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user57, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean61 = usernamePasswordAuthResult60.authenticated();
        java.lang.String str62 = usernamePasswordAuthResult60.delegationKey();
        java.lang.Boolean boolean63 = usernamePasswordAuthResult60.authenticated();
        java.lang.String str64 = usernamePasswordAuthResult60.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user65 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult68 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user65, (java.lang.Boolean) false, "");
        java.lang.String str69 = usernamePasswordAuthResult68.delegationKey();
        java.lang.String str70 = usernamePasswordAuthResult68.toString();
        boolean boolean72 = usernamePasswordAuthResult68.equals((java.lang.Object) (byte) 0);
        java.lang.String str73 = usernamePasswordAuthResult68.delegationKey();
        boolean boolean74 = usernamePasswordAuthResult60.equals((java.lang.Object) str73);
        java.lang.Class<?> wildcardClass75 = usernamePasswordAuthResult60.getClass();
        boolean boolean76 = jWTAuthResult43.equals((java.lang.Object) usernamePasswordAuthResult60);
        boolean boolean77 = usernamePasswordAuthResult35.equals((java.lang.Object) boolean76);
        java.lang.String str78 = usernamePasswordAuthResult35.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user79 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult82 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user79, (java.lang.Boolean) true, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]]");
        boolean boolean83 = usernamePasswordAuthResult35.equals((java.lang.Object) user79);
        java.lang.Object obj84 = null;
        boolean boolean85 = usernamePasswordAuthResult35.equals(obj84);
        boolean boolean86 = usernamePasswordAuthResult3.equals((java.lang.Object) boolean85);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str18, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray22);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray22, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str37, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray40);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray40, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str70, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str78, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1614");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str4, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]]");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1615");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray3 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet4 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4, syncopeGrantedAuthorityArray3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet4);
        java.lang.String str9 = jWTAuthResult8.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult8.authorities();
        java.lang.String str11 = jWTAuthResult8.username();
        java.lang.String str12 = jWTAuthResult8.toString();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray3);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray3, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str12, "JWTAuthResult[username=hi!, authorities=[]]");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1616");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray2 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet3 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3, syncopeGrantedAuthorityArray2);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult5 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult6 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet3);
        java.lang.Object obj7 = null;
        boolean boolean8 = jWTAuthResult6.equals(obj7);
        org.apache.syncope.core.persistence.api.entity.user.User user9 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user9, (java.lang.Boolean) false, "");
        java.lang.String str13 = usernamePasswordAuthResult12.delegationKey();
        java.lang.String str14 = usernamePasswordAuthResult12.toString();
        boolean boolean15 = jWTAuthResult6.equals((java.lang.Object) usernamePasswordAuthResult12);
        java.lang.String str16 = jWTAuthResult6.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray20 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21, syncopeGrantedAuthorityArray20);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21);
        java.lang.Class<?> wildcardClass26 = syncopeGrantedAuthoritySet21.getClass();
        boolean boolean27 = jWTAuthResult6.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray2);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray2, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str14, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str16, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray20);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray20, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1617");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray5 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6, syncopeGrantedAuthorityArray5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        java.lang.String str12 = jWTAuthResult11.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult11.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]]", syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray5);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray5, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]], authorities=[]]" + "'", str12, "JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1618");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str9 = usernamePasswordAuthResult3.toString();
        java.lang.String str10 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray16 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17, syncopeGrantedAuthorityArray16);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray22 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23, syncopeGrantedAuthorityArray22);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = jWTAuthResult25.authorities();
        boolean boolean27 = jWTAuthResult20.equals((java.lang.Object) jWTAuthResult25);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult20.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]", syncopeGrantedAuthoritySet28);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet28);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet31 = jWTAuthResult30.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray36 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet37, syncopeGrantedAuthorityArray36);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult39 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet37);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult40 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet37);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult40.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", syncopeGrantedAuthoritySet41);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet41);
        boolean boolean44 = jWTAuthResult30.equals((java.lang.Object) syncopeGrantedAuthoritySet41);
        boolean boolean45 = usernamePasswordAuthResult3.equals((java.lang.Object) boolean44);
        java.lang.Boolean boolean46 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str9, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray16);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray16, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray22);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray22, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet31);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray36);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray36, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1619");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        java.lang.String str12 = jWTAuthResult10.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult10.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray16 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17, syncopeGrantedAuthorityArray16);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult20 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet17);
        boolean boolean21 = jWTAuthResult10.equals((java.lang.Object) jWTAuthResult20);
        boolean boolean22 = jWTAuthResult4.equals((java.lang.Object) boolean21);
        java.lang.String str23 = jWTAuthResult4.username();
        java.lang.String str24 = jWTAuthResult4.toString();
        java.lang.String str25 = jWTAuthResult4.toString();
        java.lang.String str26 = jWTAuthResult4.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray29 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30, syncopeGrantedAuthorityArray29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet33 = jWTAuthResult32.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult34 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", syncopeGrantedAuthoritySet33);
        java.lang.String str35 = jWTAuthResult34.toString();
        java.lang.String str36 = jWTAuthResult34.username();
        boolean boolean37 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult34);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet38 = jWTAuthResult34.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user39 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user39, (java.lang.Boolean) false, "");
        java.lang.String str43 = usernamePasswordAuthResult42.delegationKey();
        java.lang.String str44 = usernamePasswordAuthResult42.delegationKey();
        java.lang.Boolean boolean45 = usernamePasswordAuthResult42.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user46 = usernamePasswordAuthResult42.user();
        java.lang.String str47 = usernamePasswordAuthResult42.toString();
        boolean boolean48 = jWTAuthResult34.equals((java.lang.Object) str47);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str12, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray16);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray16, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str24, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str25, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str26, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray29);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray29, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]" + "'", str35, "JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]" + "'", str36, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(user46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str47, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1620");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties56 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager57 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO58 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO59 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO60 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO61 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO62 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps63 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO64 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO65 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO66 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager67 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager68 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager69 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties70 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager71 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO72 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO73 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO74 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO75 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO76 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps77 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO78 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO79 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO80 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager81 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager82 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager83 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray84 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList85 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85, jWTSSOProviderArray84);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor87 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties70, encryptorManager71, realmSearchDAO72, userDAO73, groupDAO74, anySearchDAO75, accessTokenDAO76, confParamOps77, roleDAO78, delegationDAO79, externalResourceDAO80, connectorManager81, auditManager82, mappingManager83, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor88 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties56, encryptorManager57, realmSearchDAO58, userDAO59, groupDAO60, anySearchDAO61, accessTokenDAO62, confParamOps63, roleDAO64, delegationDAO65, externalResourceDAO66, connectorManager67, auditManager68, mappingManager69, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor89 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor90 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor91 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor92 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList85);
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor92.removeExpired("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AccessTokenDAO.deleteById(String)\" because \"this.accessTokenDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray84);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray84, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1621");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult4.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult10.authenticated();
        boolean boolean15 = jWTAuthResult4.equals((java.lang.Object) boolean14);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray18 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19, syncopeGrantedAuthorityArray18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = jWTAuthResult21.authorities();
        java.lang.String str23 = jWTAuthResult21.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult21.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet24);
        boolean boolean26 = jWTAuthResult4.equals((java.lang.Object) syncopeGrantedAuthoritySet24);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult4.authorities();
        java.lang.String str28 = jWTAuthResult4.toString();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray18);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray18, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str23, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str28, "JWTAuthResult[username=hi!, authorities=[]]");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1622");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user8, (java.lang.Boolean) false, "");
        java.lang.String str12 = usernamePasswordAuthResult11.delegationKey();
        java.lang.String str13 = usernamePasswordAuthResult11.toString();
        boolean boolean15 = usernamePasswordAuthResult11.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = usernamePasswordAuthResult11.delegationKey();
        boolean boolean17 = usernamePasswordAuthResult3.equals((java.lang.Object) str16);
        java.lang.Boolean boolean18 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean19 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray21 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22, syncopeGrantedAuthorityArray21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult24.authorities();
        java.lang.String str26 = jWTAuthResult24.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult24.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray30 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet31 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet31, syncopeGrantedAuthorityArray30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet31);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult34 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet31);
        boolean boolean35 = jWTAuthResult24.equals((java.lang.Object) jWTAuthResult34);
        java.lang.String str36 = jWTAuthResult34.username();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = jWTAuthResult34.authorities();
        boolean boolean38 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult34);
        java.lang.String str39 = jWTAuthResult34.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray21);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray21, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str26, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray30);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray30, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str36, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str39, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1623");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray6 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7, syncopeGrantedAuthorityArray6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = jWTAuthResult9.authorities();
        java.lang.String str11 = jWTAuthResult9.toString();
        java.lang.String str12 = jWTAuthResult9.username();
        java.lang.String str13 = jWTAuthResult9.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.String str18 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str19 = usernamePasswordAuthResult17.toString();
        java.lang.String str20 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str21 = usernamePasswordAuthResult17.toString();
        java.lang.Boolean boolean22 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str23 = usernamePasswordAuthResult17.toString();
        boolean boolean24 = jWTAuthResult9.equals((java.lang.Object) str23);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = jWTAuthResult9.authorities();
        boolean boolean26 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet25);
        org.apache.syncope.core.persistence.api.entity.user.User user27 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user27, (java.lang.Boolean) false, "");
        java.lang.String str31 = usernamePasswordAuthResult30.delegationKey();
        java.lang.String str32 = usernamePasswordAuthResult30.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user33 = usernamePasswordAuthResult30.user();
        java.lang.String str34 = usernamePasswordAuthResult30.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray36 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet37 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet37, syncopeGrantedAuthorityArray36);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult39 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet37);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = jWTAuthResult39.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = jWTAuthResult39.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user42 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult45 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user42, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean46 = usernamePasswordAuthResult45.authenticated();
        java.lang.String str47 = usernamePasswordAuthResult45.delegationKey();
        java.lang.Boolean boolean48 = usernamePasswordAuthResult45.authenticated();
        java.lang.Boolean boolean49 = usernamePasswordAuthResult45.authenticated();
        boolean boolean50 = jWTAuthResult39.equals((java.lang.Object) boolean49);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray53 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet54 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet54, syncopeGrantedAuthorityArray53);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult56 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet54);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet57 = jWTAuthResult56.authorities();
        java.lang.String str58 = jWTAuthResult56.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet59 = jWTAuthResult56.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult60 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet59);
        boolean boolean61 = jWTAuthResult39.equals((java.lang.Object) syncopeGrantedAuthoritySet59);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet62 = jWTAuthResult39.authorities();
        boolean boolean63 = usernamePasswordAuthResult30.equals((java.lang.Object) jWTAuthResult39);
        boolean boolean64 = usernamePasswordAuthResult3.equals((java.lang.Object) usernamePasswordAuthResult30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray6);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray6, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str11, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str13, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str19, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str21, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str23, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str32, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray36);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray36, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet40);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray53);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray53, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str58, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1624");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]], authorities=[]]]");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1625");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray56 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList57 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57, jWTSSOProviderArray56);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor59 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor60 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor61 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor62 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.springframework.security.core.Authentication authentication64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult65 = authDataAccessor62.authenticate("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]]", authentication64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray56);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray56, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1626");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        java.lang.String str4 = usernamePasswordAuthResult3.toString();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]" + "'", str4, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1627");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.lang.String str5 = jWTAuthResult4.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        boolean boolean11 = jWTAuthResult4.equals((java.lang.Object) "hi!");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray13 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14, syncopeGrantedAuthorityArray13);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet14);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet17 = jWTAuthResult16.authorities();
        java.lang.String str18 = jWTAuthResult16.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult16.authorities();
        boolean boolean20 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult16);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray23 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet24, syncopeGrantedAuthorityArray23);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet24);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult26.authorities();
        java.lang.String str28 = jWTAuthResult26.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = jWTAuthResult26.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet29);
        boolean boolean31 = jWTAuthResult4.equals((java.lang.Object) "");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray33 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet34 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34, syncopeGrantedAuthorityArray33);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet34);
        boolean boolean38 = jWTAuthResult36.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user39 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user39, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean43 = usernamePasswordAuthResult42.authenticated();
        java.lang.String str44 = usernamePasswordAuthResult42.delegationKey();
        java.lang.Boolean boolean45 = usernamePasswordAuthResult42.authenticated();
        java.lang.String str46 = usernamePasswordAuthResult42.delegationKey();
        java.lang.String str47 = usernamePasswordAuthResult42.delegationKey();
        java.lang.Class<?> wildcardClass48 = usernamePasswordAuthResult42.getClass();
        boolean boolean49 = jWTAuthResult36.equals((java.lang.Object) usernamePasswordAuthResult42);
        org.apache.syncope.core.persistence.api.entity.user.User user50 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult53 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user50, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean54 = usernamePasswordAuthResult53.authenticated();
        java.lang.String str55 = usernamePasswordAuthResult53.delegationKey();
        java.lang.Boolean boolean56 = usernamePasswordAuthResult53.authenticated();
        java.lang.String str57 = usernamePasswordAuthResult53.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user58 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult61 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user58, (java.lang.Boolean) false, "");
        java.lang.String str62 = usernamePasswordAuthResult61.delegationKey();
        java.lang.String str63 = usernamePasswordAuthResult61.toString();
        boolean boolean65 = usernamePasswordAuthResult61.equals((java.lang.Object) (byte) 0);
        java.lang.String str66 = usernamePasswordAuthResult61.delegationKey();
        boolean boolean67 = usernamePasswordAuthResult53.equals((java.lang.Object) str66);
        java.lang.Class<?> wildcardClass68 = usernamePasswordAuthResult53.getClass();
        boolean boolean69 = jWTAuthResult36.equals((java.lang.Object) usernamePasswordAuthResult53);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray72 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet73 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet73, syncopeGrantedAuthorityArray72);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult75 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet73);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet76 = jWTAuthResult75.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult77 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet76);
        boolean boolean78 = jWTAuthResult36.equals((java.lang.Object) jWTAuthResult77);
        boolean boolean79 = jWTAuthResult4.equals((java.lang.Object) boolean78);
        java.lang.Class<?> wildcardClass80 = jWTAuthResult4.getClass();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray13);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray13, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str18, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray23);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray23, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str28, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray33);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray33, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str63, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray72);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray72, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1628");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        boolean boolean7 = usernamePasswordAuthResult3.equals((java.lang.Object) (byte) 0);
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str9 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult3.user();
        java.lang.String str13 = usernamePasswordAuthResult3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str9, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str13, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1629");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray4 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5, syncopeGrantedAuthorityArray4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = jWTAuthResult7.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = jWTAuthResult7.authorities();
        java.lang.String str10 = jWTAuthResult7.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult7.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet11);
        java.lang.String str13 = jWTAuthResult12.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray15 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16, syncopeGrantedAuthorityArray15);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult18 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet16);
        java.lang.String str19 = jWTAuthResult18.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray21 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22, syncopeGrantedAuthorityArray21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22);
        boolean boolean25 = jWTAuthResult18.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass26 = jWTAuthResult18.getClass();
        boolean boolean27 = jWTAuthResult12.equals((java.lang.Object) jWTAuthResult18);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult12.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = jWTAuthResult12.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", syncopeGrantedAuthoritySet29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=hi!, authorities=[]]], authorities=[]]", syncopeGrantedAuthoritySet29);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray4);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray4, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet8);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str10, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str13, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray15);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray15, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray21);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray21, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet29);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1630");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray5 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6, syncopeGrantedAuthorityArray5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet6);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = jWTAuthResult8.authorities();
        java.lang.String str10 = jWTAuthResult8.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult8.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=null]", syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]", syncopeGrantedAuthoritySet11);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray18 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19, syncopeGrantedAuthorityArray18);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult21 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet19);
        java.lang.String str23 = jWTAuthResult22.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray25 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet26 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet26, syncopeGrantedAuthorityArray25);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult28 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet26);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet29 = jWTAuthResult28.authorities();
        boolean boolean30 = jWTAuthResult22.equals((java.lang.Object) jWTAuthResult28);
        org.apache.syncope.core.persistence.api.entity.user.User user31 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult34 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user31, (java.lang.Boolean) false, "");
        java.lang.String str35 = usernamePasswordAuthResult34.delegationKey();
        java.lang.String str36 = usernamePasswordAuthResult34.toString();
        java.lang.String str37 = usernamePasswordAuthResult34.delegationKey();
        java.lang.String str38 = usernamePasswordAuthResult34.toString();
        java.lang.Boolean boolean39 = usernamePasswordAuthResult34.authenticated();
        java.lang.String str40 = usernamePasswordAuthResult34.toString();
        java.lang.String str41 = usernamePasswordAuthResult34.delegationKey();
        java.lang.String str42 = usernamePasswordAuthResult34.toString();
        boolean boolean43 = jWTAuthResult22.equals((java.lang.Object) usernamePasswordAuthResult34);
        boolean boolean44 = jWTAuthResult15.equals((java.lang.Object) usernamePasswordAuthResult34);
        java.lang.String str45 = usernamePasswordAuthResult34.toString();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray5);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray5, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str10, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray18);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray18, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str23, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray25);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray25, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str36, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str38, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str40, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str42, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str45, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1631");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "JWTAuthResult[username=, authorities=[]]");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray7 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet8 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8, syncopeGrantedAuthorityArray7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet8);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = jWTAuthResult10.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult10.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user13 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user13, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean17 = usernamePasswordAuthResult16.authenticated();
        java.lang.String str18 = usernamePasswordAuthResult16.delegationKey();
        java.lang.Boolean boolean19 = usernamePasswordAuthResult16.authenticated();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult16.authenticated();
        boolean boolean21 = jWTAuthResult10.equals((java.lang.Object) boolean20);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray24 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet25 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25, syncopeGrantedAuthorityArray24);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult27 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet25);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult27.authorities();
        java.lang.String str29 = jWTAuthResult27.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult27.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet30);
        boolean boolean32 = jWTAuthResult10.equals((java.lang.Object) syncopeGrantedAuthoritySet30);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult33 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]]", syncopeGrantedAuthoritySet30);
        boolean boolean34 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult33);
        java.lang.Class<?> wildcardClass35 = jWTAuthResult33.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray7);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray7, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet11);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray24);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray24, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str29, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1632");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean5 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user6, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean10 = usernamePasswordAuthResult9.authenticated();
        java.lang.String str11 = usernamePasswordAuthResult9.delegationKey();
        java.lang.Boolean boolean12 = usernamePasswordAuthResult9.authenticated();
        java.lang.String str13 = usernamePasswordAuthResult9.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.String str18 = usernamePasswordAuthResult17.delegationKey();
        java.lang.String str19 = usernamePasswordAuthResult17.toString();
        boolean boolean21 = usernamePasswordAuthResult17.equals((java.lang.Object) (byte) 0);
        java.lang.String str22 = usernamePasswordAuthResult17.delegationKey();
        boolean boolean23 = usernamePasswordAuthResult9.equals((java.lang.Object) str22);
        boolean boolean24 = usernamePasswordAuthResult3.equals((java.lang.Object) usernamePasswordAuthResult9);
        java.lang.String str25 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str19, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1633");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1634");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user5 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user5, (java.lang.Boolean) false, "");
        java.lang.String str9 = usernamePasswordAuthResult8.delegationKey();
        java.lang.String str10 = usernamePasswordAuthResult8.toString();
        java.lang.String str11 = usernamePasswordAuthResult8.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user12 = usernamePasswordAuthResult8.user();
        boolean boolean14 = usernamePasswordAuthResult8.equals((java.lang.Object) 1L);
        java.lang.String str15 = usernamePasswordAuthResult8.delegationKey();
        java.lang.String str16 = usernamePasswordAuthResult8.delegationKey();
        java.lang.String str17 = usernamePasswordAuthResult8.delegationKey();
        boolean boolean18 = usernamePasswordAuthResult3.equals((java.lang.Object) str17);
        org.apache.syncope.core.persistence.api.entity.user.User user19 = usernamePasswordAuthResult3.user();
        java.lang.String str20 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str21 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user22 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user23 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.persistence.api.entity.user.User user24 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str10, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1635");
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
        org.apache.syncope.core.persistence.api.entity.user.User user26 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user26, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean30 = usernamePasswordAuthResult29.authenticated();
        java.lang.String str31 = usernamePasswordAuthResult29.delegationKey();
        java.lang.Boolean boolean32 = usernamePasswordAuthResult29.authenticated();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray34 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet35, syncopeGrantedAuthorityArray34);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet35);
        java.lang.String str38 = jWTAuthResult37.username();
        boolean boolean39 = usernamePasswordAuthResult29.equals((java.lang.Object) jWTAuthResult37);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet40 = jWTAuthResult37.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult41 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet40);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult42 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]", syncopeGrantedAuthoritySet40);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", syncopeGrantedAuthoritySet40);
        java.lang.Class<?> wildcardClass44 = syncopeGrantedAuthoritySet40.getClass();
        java.lang.Object[] objArray45 = new java.lang.Object[] { syncopeGrantedAuthoritySet40 };
        // The following exception was thrown during execution in test generation
        try {
            authDataAccessor17.audit("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]]", "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=]", "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]]]", outcome21, (java.lang.Object) 0.0f, objArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.AuditManager.audit(String, String, org.apache.syncope.common.lib.types.OpEvent$CategoryType, String, String, String, org.apache.syncope.common.lib.types.OpEvent$Outcome, Object, Object, Object[])\" because \"this.auditManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray14);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray14, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray34);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray34, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet40);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[[]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[[]]");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1636");
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
        org.springframework.security.core.Authentication authentication34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult35 = authDataAccessor32.authenticate("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]]", authentication34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray28);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray28, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1637");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        org.apache.syncope.core.persistence.api.entity.user.User user4 = usernamePasswordAuthResult3.user();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray8 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet9 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9, syncopeGrantedAuthorityArray8);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet9);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = jWTAuthResult11.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = jWTAuthResult11.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user14, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean18 = usernamePasswordAuthResult17.authenticated();
        java.lang.String str19 = usernamePasswordAuthResult17.delegationKey();
        java.lang.Boolean boolean20 = usernamePasswordAuthResult17.authenticated();
        java.lang.Boolean boolean21 = usernamePasswordAuthResult17.authenticated();
        boolean boolean22 = jWTAuthResult11.equals((java.lang.Object) boolean21);
        java.lang.String str23 = jWTAuthResult11.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = jWTAuthResult11.authorities();
        boolean boolean25 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet24);
        java.lang.String str26 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean27 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str28 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray8);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray8, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet12);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str23, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1638");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        java.lang.Object obj10 = null;
        boolean boolean11 = usernamePasswordAuthResult3.equals(obj10);
        java.lang.String str12 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1639");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray56 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList57 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57, jWTSSOProviderArray56);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor59 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor60 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor61 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor62 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet65 = authDataAccessor62.getAuthorities("hi!", "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray56);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray56, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1640");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = usernamePasswordAuthResult3.user();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet10 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", syncopeGrantedAuthoritySet10);
        java.lang.String str12 = jWTAuthResult11.toString();
        boolean boolean13 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult11);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = jWTAuthResult11.authorities();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JWTAuthResult[username=, authorities=null]" + "'", str12, "JWTAuthResult[username=, authorities=null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(syncopeGrantedAuthoritySet14);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1641");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        boolean boolean6 = jWTAuthResult4.equals((java.lang.Object) (byte) 10);
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str14 = usernamePasswordAuthResult10.delegationKey();
        java.lang.String str15 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Class<?> wildcardClass16 = usernamePasswordAuthResult10.getClass();
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) usernamePasswordAuthResult10);
        java.lang.String str18 = jWTAuthResult4.username();
        java.lang.String str19 = jWTAuthResult4.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = jWTAuthResult4.authorities();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str19, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet20);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1642");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties56 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager57 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO58 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO59 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO60 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO61 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO62 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps63 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO64 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO65 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO66 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager67 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager68 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager69 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray70 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList71 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71, jWTSSOProviderArray70);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor73 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties56, encryptorManager57, realmSearchDAO58, userDAO59, groupDAO60, anySearchDAO61, accessTokenDAO62, confParamOps63, roleDAO64, delegationDAO65, externalResourceDAO66, connectorManager67, auditManager68, mappingManager69, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor74 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor75 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor76 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor77 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.springframework.security.core.Authentication authentication79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult80 = authDataAccessor77.authenticate("hi!", authentication79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray70);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray70, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1643");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]]");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1644");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        boolean boolean9 = usernamePasswordAuthResult3.equals((java.lang.Object) 100);
        java.lang.String str10 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean11 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user14 = usernamePasswordAuthResult3.user();
        java.lang.String str15 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str10, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str12, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1645");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = authDataAccessor17.getAuthorities("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]]", "JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]], authorities=[]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.spring.security.SecurityProperties.getAnonymousUser()\" because \"this.securityProperties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray14);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray14, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1646");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        java.lang.String str7 = usernamePasswordAuthResult3.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray11 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet12 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12, syncopeGrantedAuthorityArray11);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult14 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult16 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet12);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray19 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet20 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet20, syncopeGrantedAuthorityArray19);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult22 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet20);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet20);
        java.lang.Object obj24 = null;
        boolean boolean25 = jWTAuthResult23.equals(obj24);
        org.apache.syncope.core.persistence.api.entity.user.User user26 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult29 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user26, (java.lang.Boolean) false, "");
        java.lang.String str30 = usernamePasswordAuthResult29.delegationKey();
        java.lang.String str31 = usernamePasswordAuthResult29.toString();
        boolean boolean32 = jWTAuthResult23.equals((java.lang.Object) usernamePasswordAuthResult29);
        java.lang.String str33 = jWTAuthResult23.toString();
        boolean boolean34 = jWTAuthResult16.equals((java.lang.Object) jWTAuthResult23);
        java.lang.String str35 = jWTAuthResult23.toString();
        boolean boolean36 = usernamePasswordAuthResult3.equals((java.lang.Object) jWTAuthResult23);
        java.lang.String str37 = usernamePasswordAuthResult3.delegationKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray11);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray11, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray19);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray19, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str31, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str33, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]" + "'", str35, "JWTAuthResult[username=JWTAuthResult[username=hi!, authorities=[]], authorities=[]]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1647");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        org.apache.syncope.core.persistence.api.entity.user.User user6 = usernamePasswordAuthResult3.user();
        boolean boolean8 = usernamePasswordAuthResult3.equals((java.lang.Object) 1.0d);
        org.apache.syncope.core.persistence.api.entity.user.User user9 = usernamePasswordAuthResult3.user();
        java.lang.Boolean boolean10 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user11 = usernamePasswordAuthResult3.user();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1648");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) true, "hi!");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray6 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet7 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7, syncopeGrantedAuthorityArray6);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult9 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet7);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray12 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet13 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13, syncopeGrantedAuthorityArray12);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult15 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet13);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = jWTAuthResult15.authorities();
        boolean boolean17 = jWTAuthResult10.equals((java.lang.Object) jWTAuthResult15);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult10.authorities();
        boolean boolean19 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet18);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray23 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet24 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet24, syncopeGrantedAuthorityArray23);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet24);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet27 = jWTAuthResult26.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = jWTAuthResult26.authorities();
        java.lang.String str29 = jWTAuthResult26.toString();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = jWTAuthResult26.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult31 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", syncopeGrantedAuthoritySet30);
        java.lang.String str32 = jWTAuthResult31.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray34 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet35, syncopeGrantedAuthorityArray34);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult37 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet35);
        java.lang.String str38 = jWTAuthResult37.username();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray40 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet41 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet41, syncopeGrantedAuthorityArray40);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult43 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet41);
        boolean boolean44 = jWTAuthResult37.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass45 = jWTAuthResult37.getClass();
        boolean boolean46 = jWTAuthResult31.equals((java.lang.Object) jWTAuthResult37);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet47 = jWTAuthResult31.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet48 = jWTAuthResult31.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult49 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=], authorities=[]]]", syncopeGrantedAuthoritySet48);
        boolean boolean50 = usernamePasswordAuthResult3.equals((java.lang.Object) syncopeGrantedAuthoritySet48);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray6);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray6, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray12);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray12, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray23);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray23, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet27);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JWTAuthResult[username=hi!, authorities=[]]" + "'", str29, "JWTAuthResult[username=hi!, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JWTAuthResult[username=, authorities=[]]" + "'", str32, "JWTAuthResult[username=, authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray34);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray34, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray40);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray40, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet47);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1649");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray1 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet2 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2, syncopeGrantedAuthorityArray1);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult4 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet2);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet6 = jWTAuthResult4.authorities();
        org.apache.syncope.core.persistence.api.entity.user.User user7 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult10 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user7, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean11 = usernamePasswordAuthResult10.authenticated();
        java.lang.String str12 = usernamePasswordAuthResult10.delegationKey();
        java.lang.Boolean boolean13 = usernamePasswordAuthResult10.authenticated();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult10.authenticated();
        boolean boolean15 = jWTAuthResult4.equals((java.lang.Object) boolean14);
        boolean boolean17 = jWTAuthResult4.equals((java.lang.Object) 0);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult4.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet19 = jWTAuthResult4.authorities();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray22 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet23 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23, syncopeGrantedAuthorityArray22);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult25 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult26 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet23);
        java.lang.String str27 = jWTAuthResult26.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray29 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet30 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30, syncopeGrantedAuthorityArray29);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult32 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet30);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet33 = jWTAuthResult32.authorities();
        boolean boolean34 = jWTAuthResult26.equals((java.lang.Object) jWTAuthResult32);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet35 = jWTAuthResult26.authorities();
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet36 = jWTAuthResult26.authorities();
        boolean boolean37 = jWTAuthResult4.equals((java.lang.Object) jWTAuthResult26);
        java.lang.String str38 = jWTAuthResult26.toString();
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray1);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray1, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet5);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet19);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray22);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray22, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str27, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray29);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray29, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet35);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str38, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1650");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.String str4 = usernamePasswordAuthResult3.delegationKey();
        java.lang.String str5 = usernamePasswordAuthResult3.toString();
        java.lang.String str6 = usernamePasswordAuthResult3.toString();
        java.lang.String str7 = usernamePasswordAuthResult3.toString();
        java.lang.Boolean boolean8 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user9 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult12 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user9, (java.lang.Boolean) false, "");
        java.lang.String str13 = usernamePasswordAuthResult12.delegationKey();
        java.lang.String str14 = usernamePasswordAuthResult12.toString();
        java.lang.String str15 = usernamePasswordAuthResult12.delegationKey();
        org.apache.syncope.core.persistence.api.entity.user.User user16 = usernamePasswordAuthResult12.user();
        boolean boolean18 = usernamePasswordAuthResult12.equals((java.lang.Object) 1L);
        java.lang.String str19 = usernamePasswordAuthResult12.delegationKey();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray21 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet22 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22, syncopeGrantedAuthorityArray21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet22);
        boolean boolean26 = jWTAuthResult24.equals((java.lang.Object) (byte) 10);
        boolean boolean27 = usernamePasswordAuthResult12.equals((java.lang.Object) (byte) 10);
        java.lang.Boolean boolean28 = usernamePasswordAuthResult12.authenticated();
        boolean boolean29 = usernamePasswordAuthResult3.equals((java.lang.Object) usernamePasswordAuthResult12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str5, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str6, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str7, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str14, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray21);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray21, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1651");
        org.apache.syncope.core.persistence.api.entity.user.User user0 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult3 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user0, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean4 = usernamePasswordAuthResult3.authenticated();
        java.lang.String str5 = usernamePasswordAuthResult3.delegationKey();
        java.lang.Boolean boolean6 = usernamePasswordAuthResult3.authenticated();
        java.lang.Boolean boolean7 = usernamePasswordAuthResult3.authenticated();
        org.apache.syncope.core.persistence.api.entity.user.User user8 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult11 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user8, (java.lang.Boolean) false, "");
        java.lang.Boolean boolean12 = usernamePasswordAuthResult11.authenticated();
        java.lang.String str13 = usernamePasswordAuthResult11.delegationKey();
        java.lang.Boolean boolean14 = usernamePasswordAuthResult11.authenticated();
        java.lang.Boolean boolean15 = usernamePasswordAuthResult11.authenticated();
        java.lang.Boolean boolean16 = usernamePasswordAuthResult11.authenticated();
        boolean boolean17 = usernamePasswordAuthResult3.equals((java.lang.Object) boolean16);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray20 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet21 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21, syncopeGrantedAuthorityArray20);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult23 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult24 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet21);
        java.lang.String str25 = jWTAuthResult24.toString();
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray27 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet28 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28, syncopeGrantedAuthorityArray27);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult30 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet28);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet31 = jWTAuthResult30.authorities();
        boolean boolean32 = jWTAuthResult24.equals((java.lang.Object) jWTAuthResult30);
        org.apache.syncope.core.persistence.api.entity.user.User user33 = null;
        org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult36 = new org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult(user33, (java.lang.Boolean) false, "");
        java.lang.String str37 = usernamePasswordAuthResult36.delegationKey();
        java.lang.String str38 = usernamePasswordAuthResult36.toString();
        java.lang.String str39 = usernamePasswordAuthResult36.delegationKey();
        java.lang.String str40 = usernamePasswordAuthResult36.toString();
        java.lang.Boolean boolean41 = usernamePasswordAuthResult36.authenticated();
        java.lang.String str42 = usernamePasswordAuthResult36.toString();
        java.lang.String str43 = usernamePasswordAuthResult36.delegationKey();
        java.lang.String str44 = usernamePasswordAuthResult36.toString();
        boolean boolean45 = jWTAuthResult24.equals((java.lang.Object) usernamePasswordAuthResult36);
        boolean boolean46 = usernamePasswordAuthResult3.equals((java.lang.Object) usernamePasswordAuthResult36);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray20);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray20, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]" + "'", str25, "JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]]");
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray27);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray27, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str38, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str40, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str42, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]" + "'", str44, "UsernamePasswordAuthResult[user=null, authenticated=false, delegationKey=]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1652");
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
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties28 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager29 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO30 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO31 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO32 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO33 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO34 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps35 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO36 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO37 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO38 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager39 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager40 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager41 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties42 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager43 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO44 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO45 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO46 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO47 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO48 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps49 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO50 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO51 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO52 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager53 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager54 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager55 = null;
        org.apache.syncope.core.spring.security.SecurityProperties securityProperties56 = null;
        org.apache.syncope.core.persistence.api.EncryptorManager encryptorManager57 = null;
        org.apache.syncope.core.persistence.api.dao.RealmSearchDAO realmSearchDAO58 = null;
        org.apache.syncope.core.persistence.api.dao.UserDAO userDAO59 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO60 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO61 = null;
        org.apache.syncope.core.persistence.api.dao.AccessTokenDAO accessTokenDAO62 = null;
        org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps63 = null;
        org.apache.syncope.core.persistence.api.dao.RoleDAO roleDAO64 = null;
        org.apache.syncope.core.persistence.api.dao.DelegationDAO delegationDAO65 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO66 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager67 = null;
        org.apache.syncope.core.provisioning.api.AuditManager auditManager68 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager69 = null;
        org.apache.syncope.core.spring.security.JWTSSOProvider[] jWTSSOProviderArray70 = new org.apache.syncope.core.spring.security.JWTSSOProvider[] {};
        java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider> jWTSSOProviderList71 = new java.util.ArrayList<org.apache.syncope.core.spring.security.JWTSSOProvider>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71, jWTSSOProviderArray70);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor73 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties56, encryptorManager57, realmSearchDAO58, userDAO59, groupDAO60, anySearchDAO61, accessTokenDAO62, confParamOps63, roleDAO64, delegationDAO65, externalResourceDAO66, connectorManager67, auditManager68, mappingManager69, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor74 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties42, encryptorManager43, realmSearchDAO44, userDAO45, groupDAO46, anySearchDAO47, accessTokenDAO48, confParamOps49, roleDAO50, delegationDAO51, externalResourceDAO52, connectorManager53, auditManager54, mappingManager55, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor75 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties28, encryptorManager29, realmSearchDAO30, userDAO31, groupDAO32, anySearchDAO33, accessTokenDAO34, confParamOps35, roleDAO36, delegationDAO37, externalResourceDAO38, connectorManager39, auditManager40, mappingManager41, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor76 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties14, encryptorManager15, realmSearchDAO16, userDAO17, groupDAO18, anySearchDAO19, accessTokenDAO20, confParamOps21, roleDAO22, delegationDAO23, externalResourceDAO24, connectorManager25, auditManager26, mappingManager27, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.apache.syncope.core.spring.security.AuthDataAccessor authDataAccessor77 = new org.apache.syncope.core.spring.security.AuthDataAccessor(securityProperties0, encryptorManager1, realmSearchDAO2, userDAO3, groupDAO4, anySearchDAO5, accessTokenDAO6, confParamOps7, roleDAO8, delegationDAO9, externalResourceDAO10, connectorManager11, auditManager12, mappingManager13, (java.util.List<org.apache.syncope.core.spring.security.JWTSSOProvider>) jWTSSOProviderList71);
        org.springframework.security.core.Authentication authentication79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.core.spring.security.AuthDataAccessor.UsernamePasswordAuthResult usernamePasswordAuthResult80 = authDataAccessor77.authenticate("JWTAuthResult[username=JWTAuthResult[username=JWTAuthResult[username=, authorities=[]], authorities=[]], authorities=[]]", authentication79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.keymaster.client.api.ConfParamOps.get(String, String, Object, java.lang.Class)\" because \"this.confParamOps\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jWTSSOProviderArray70);
        org.junit.Assert.assertArrayEquals(jWTSSOProviderArray70, new org.apache.syncope.core.spring.security.JWTSSOProvider[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AuthDataAccessorRandoopRegressionTest3.test1653");
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray4 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet5 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5, syncopeGrantedAuthorityArray4);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult7 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult8 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=hi!, authorities=[]]", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet5);
        org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] syncopeGrantedAuthorityArray10 = new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {};
        java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet11 = new java.util.LinkedHashSet<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11, syncopeGrantedAuthorityArray10);
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult13 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("hi!", (java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority>) syncopeGrantedAuthoritySet11);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet14 = jWTAuthResult13.authorities();
        boolean boolean15 = jWTAuthResult8.equals((java.lang.Object) jWTAuthResult13);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet16 = jWTAuthResult13.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult17 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]]", syncopeGrantedAuthoritySet16);
        java.util.Set<org.apache.syncope.core.spring.security.SyncopeGrantedAuthority> syncopeGrantedAuthoritySet18 = jWTAuthResult17.authorities();
        org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult jWTAuthResult19 = new org.apache.syncope.core.spring.security.AuthDataAccessor.JWTAuthResult("JWTAuthResult[username=JWTAuthResult[username=UsernamePasswordAuthResult[user=null, authenticated=true, delegationKey=], authorities=[]], authorities=[]]", syncopeGrantedAuthoritySet18);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray4);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray4, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthorityArray10);
        org.junit.Assert.assertArrayEquals(syncopeGrantedAuthorityArray10, new org.apache.syncope.core.spring.security.SyncopeGrantedAuthority[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet16);
        org.junit.Assert.assertNotNull(syncopeGrantedAuthoritySet18);
    }
}

