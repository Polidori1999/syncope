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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.ApplicationContextProvider;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Implementation;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtils;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import java.time.Instant;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerWBTest {

    @FunctionalInterface
    private interface ThrowingAction {
        void run() throws Exception;
    }

    private static void assertDoesNotThrow(final ThrowingAction action) {
        try {
            action.run();
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getName() + " - " + e.getMessage());
        }
    }

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

    // WB1 - JaCoCo
    // Obiettivo: coprire il ramo execute(...) con task attivo e startAt=null.
    // Atteso: creazione del contesto e registrazione del job, senza schedulazione a Instant.
    @Test
    public void executeShouldRegisterActiveTaskWhenStartAtIsNull() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                null,
                "admin",
                false,
                Map.of()));

        verify(taskJob).setContext(any(JobExecutionContext.class));
        verify(scheduler).register(taskJob);
        verify(scheduler, never()).schedule(any(TaskJob.class), any(Instant.class));
    }
}