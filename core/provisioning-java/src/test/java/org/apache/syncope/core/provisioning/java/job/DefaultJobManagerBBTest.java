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
import org.apache.syncope.core.provisioning.api.job.JobManager;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import java.time.OffsetDateTime;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerBBTest {

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

    // TF1 - O1
    // Input: task attivo, startAt futuro, executor valorizzato, dryRun=false, jobData vuota.
    // Atteso: schedulazione del job senza eccezioni.
    @Test
    public void executeShouldScheduleActiveTaskInFuture() {
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

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verify(taskJob).setContext(any());
        verify(scheduler).schedule(taskJob, startAt.toInstant());
    }

    // TF2 - O2
    // Input: task attivo, startAt presente, executor valorizzato, dryRun=true, jobData non vuota.
    // Atteso: schedulazione del job e propagazione dei dati nel contesto.
    @Test
    public void executeShouldScheduleActiveTaskNowWithDryRunAndJobData() {
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

        OffsetDateTime startAt = OffsetDateTime.now();
        String executor = "admin";
        boolean dryRun = true;
        Map<String, Object> jobData = Map.of("sampleKey", "sampleValue");

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        ArgumentCaptor<JobExecutionContext> contextCaptor =
                ArgumentCaptor.forClass(JobExecutionContext.class);

        verify(taskJob).setContext(contextCaptor.capture());

        JobExecutionContext context = contextCaptor.getValue();

        assertTrue(context.isDryRun());
        assertEquals(TaskType.SCHEDULED, context.getData().get(JobManager.TASK_TYPE));
        assertEquals("task-key", context.getData().get(JobManager.TASK_KEY));
        assertEquals("delegate-key", context.getData().get(JobManager.DELEGATE_IMPLEMENTATION));
        assertEquals("sampleValue", context.getData().get("sampleKey"));
        verify(scheduler).schedule(taskJob, startAt.toInstant());
    }

    // TF3 - O3
    // Input: task inattivo, startAt=null, executor valorizzato, dryRun=false, jobData vuota.
    // Atteso: nessuna creazione del job e nessuna schedulazione.
    @Test
    public void executeShouldNotScheduleInactiveTask() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(false);
        when(task.getKey()).thenReturn("inacttive-task-key");

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        OffsetDateTime startAt = null;
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }

    // TF4 - O4
    // Input: task=null, startAt futuro, executor valorizzato, dryRun=false, jobData vuota.
    // Atteso: rifiuto dell'esecuzione e nessuna schedulazione.
    @Test
    public void executeShouldRejectNullTask() {
        SchedTask task = null;

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertThrows(RuntimeException.class, () -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }

    // TF5 - O4
    // Input: task attivo senza job delegate, startAt futuro, executor valorizzato,
    // dryRun=false, jobData vuota.
    // Atteso: rifiuto dell'esecuzione e nessuna schedulazione.
    @Test
    public void executeShouldRejectTaskWithoutJobDelegate() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertThrows(RuntimeException.class, () -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }

    // TF6 - Characterization
    // Input: task attivo, startAt passato, executor valorizzato, dryRun=false, jobData vuota.
    // Osservato in C0: schedulazione delegata allo scheduler.
    @Test
    public void executeWithPastStartAtCurrentlyDelegatesToScheduler() {
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

        OffsetDateTime startAt = OffsetDateTime.now().minusDays(1);
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verify(taskJob).setContext(any());
        verify(scheduler).schedule(taskJob, startAt.toInstant());
    }

    // TF6 - O5
    // Input: task attivo, startAt passato, executor valorizzato, dryRun=false, jobData vuota.
    // Oracolo iniziale: rifiuto dell'input o nessuna schedulazione valida.

    @Ignore("Oracolo iniziale non confermato: la documentazione non specifica esplicitamente che startAt nel passato debba essere rifiutato")
    @Test
    public void executeShouldRejectPastStartAtAccordingToInitialOracle() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        OffsetDateTime startAt = OffsetDateTime.now().minusDays(1);
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertThrows(RuntimeException.class, () -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }

    // TF7 - O6
    // Input: task attivo, startAt futuro, executor=null, dryRun=false, jobData vuota.
    // Oracolo iniziale: rifiuto dell'input.
    @Ignore("Oracolo iniziale non confermato: la documentazione non specifica esplicitamente che executor null debba essere rifiutato")
    @Test
    public void executeShouldRejectNullExecutorAccordingToInitialOracle() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = null;
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertThrows(RuntimeException.class, () -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }

    // TF7 - Characterization
    // Input: task attivo, startAt futuro, executor=null, dryRun=false, jobData vuota.
    // Osservato in C0: schedulazione consentita con executor nullo nel contesto.

    @Test
    public void executeWithNullExecutorCurrentlyDelegatesToScheduler() {
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

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = null;
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        ArgumentCaptor<JobExecutionContext> contextCaptor =
                ArgumentCaptor.forClass(JobExecutionContext.class);

        verify(taskJob).setContext(contextCaptor.capture());

        JobExecutionContext context = contextCaptor.getValue();

        assertEquals(null, context.getExecutor());
        verify(scheduler).schedule(taskJob, startAt.toInstant());
    }

    // TF8 - O6
    // Input: task attivo, startAt futuro, executor="", dryRun=false, jobData vuota.
    // Oracolo iniziale: rifiuto dell'input.

    @Ignore("Oracolo iniziale non confermato: la documentazione non specifica esplicitamente che executor vuoto debba essere rifiutato")
    @Test
    public void executeShouldRejectEmptyExecutorAccordingToInitialOracle() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = "";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertThrows(RuntimeException.class, () -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }

    // TF8 - Characterization
    // Input: task attivo, startAt futuro, executor="", dryRun=false, jobData vuota.
    // Osservato in C0: schedulazione consentita con executor vuoto nel contesto.

    @Test
    public void executeWithEmptyExecutorCurrentlyDelegatesToScheduler() {
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

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = "";
        boolean dryRun = false;
        Map<String, Object> jobData = Map.of();

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        ArgumentCaptor<JobExecutionContext> contextCaptor =
                ArgumentCaptor.forClass(JobExecutionContext.class);

        verify(taskJob).setContext(contextCaptor.capture());

        JobExecutionContext context = contextCaptor.getValue();

        assertEquals("", context.getExecutor());
        verify(scheduler).schedule(taskJob, startAt.toInstant());
    }

    // TF9 - O7
    // Input: task attivo, startAt futuro, executor valorizzato, dryRun=false, jobData=null.
    // Oracolo iniziale: rifiuto controllato o gestione protetta dell'input.

    @Ignore("Oracolo iniziale non soddisfatto: jobData null causa NullPointerException invece di essere rifiutato o gestito esplicitamente")
    @Test
    public void executeShouldHandleNullJobData() {
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

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = null;

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verify(taskJob).setContext(any());
        verify(scheduler).schedule(taskJob, startAt.toInstant());
    }

    // TF9 - Characterization
    // Input: task attivo, startAt futuro, executor valorizzato, dryRun=false, jobData=null.
    // Osservato in C0: NullPointerException e nessuna schedulazione.

    @Test
    public void executeWithNullJobDataCurrentlyThrowsNullPointerException() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        OffsetDateTime startAt = OffsetDateTime.now().plusDays(1);
        String executor = "admin";
        boolean dryRun = false;
        Map<String, Object> jobData = null;

        assertThrows(NullPointerException.class, () -> jobManager.execute(
                task,
                startAt,
                executor,
                dryRun,
                jobData));

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }
}