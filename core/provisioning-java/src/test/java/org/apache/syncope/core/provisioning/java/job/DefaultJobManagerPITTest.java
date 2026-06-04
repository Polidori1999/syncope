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

package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.apache.syncope.core.persistence.api.ApplicationContextProvider;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerPITTest {

    @Mock
    private DomainHolder<?> domainHolder;

    @Mock
    private SyncopeTaskScheduler scheduler;

    @Mock
    private JobStatusDAO jobStatusDAO;

    @Mock
    private TaskDAO taskDAO;

    @Mock
    private ReportDAO reportDAO;

    @Mock
    private ImplementationDAO implementationDAO;

    @Mock
    private TaskUtilsFactory taskUtilsFactory;

    @Mock
    private ConfParamOps confParamOps;

    @Mock
    private SecurityProperties securityProperties;

    @Mock
    private DefaultListableBeanFactory beanFactory;

    private DefaultJobManager jobManager;

    @Before
    public void setup() {
        ApplicationContextProvider.setBeanFactory(beanFactory);

        jobManager = new DefaultJobManager(
                domainHolder,
                scheduler,
                jobStatusDAO,
                taskDAO,
                reportDAO,
                implementationDAO,
                taskUtilsFactory,
                confParamOps,
                securityProperties);
    }

    // Test aggiunti dopo PIT: uno copre getOrder(), l'altro rafforza isRunning().
    @Test
    public void getOrderShouldReturnExpectedOrder() {
        assertEquals(500, jobManager.getOrder());
    }

    @Test
    public void isRunningShouldUnlockWhenLockIsAcquired() {
        String jobName = "test-job";

        when(jobStatusDAO.lock(jobName)).thenReturn(true);

        boolean running = jobManager.isRunning(jobName);

        assertFalse(running);
        verify(jobStatusDAO).lock(jobName);
        verify(jobStatusDAO).unlock(jobName);
    }
}