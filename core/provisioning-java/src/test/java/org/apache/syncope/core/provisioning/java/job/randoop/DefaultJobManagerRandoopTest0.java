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

package org.apache.syncope.core.provisioning.java.job.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultJobManagerRandoopTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test1");
        java.lang.String str0 = org.apache.syncope.core.provisioning.api.job.JobManager.NOTIFICATION_JOB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "notificationJob" + "'", str0, "notificationJob");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test2");
        int int0 = org.springframework.core.Ordered.LOWEST_PRECEDENCE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test3");
        int int0 = org.springframework.core.Ordered.HIGHEST_PRECEDENCE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test4");
        java.lang.String str0 = org.apache.syncope.core.provisioning.api.job.JobManager.REPORT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "reportKey" + "'", str0, "reportKey");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test5");
        java.lang.String str0 = org.apache.syncope.core.provisioning.api.job.JobManager.DELEGATE_IMPLEMENTATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "delegateImpl" + "'", str0, "delegateImpl");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test6");
        java.lang.String str0 = org.apache.syncope.core.provisioning.api.job.JobManager.TASK_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "taskType" + "'", str0, "taskType");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test7");
        java.lang.String str0 = org.apache.syncope.core.provisioning.api.job.JobManager.TASK_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "taskKey" + "'", str0, "taskKey");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultJobManagerRandoopTest0.test8");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

