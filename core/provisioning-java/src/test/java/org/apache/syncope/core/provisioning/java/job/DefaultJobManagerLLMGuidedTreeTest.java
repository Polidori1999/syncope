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
 * NOTE: The following tests were generated based on the provided DefaultJobManager source.
 *
 * From the provided source:
 * "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements."
 * "The ASF licenses this file to you under the Apache License, Version 2.0 (the \"License\"); you may not use this file except in compliance with the License."
 *
 * These tests focus on observable behavior and Mockito interactions for DefaultJobManager.
 */

package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

import org.apache.syncope.common.lib.types.IdRepoImplementationType;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.ApplicationContextProvider;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Implementation;
import org.apache.syncope.core.persistence.api.entity.Report;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
import org.apache.syncope.core.persistence.api.entity.task.Task;
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
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.support.CronTrigger;

/**
 * Generated JUnit 4 tests for DefaultJobManager.
 *
 * Comments on approach:
 * - Tests prefer observable behavior and Mockito interaction checks.
 * - Static utilities (AuthContextUtils, JobNamer) are not mocked; tests avoid relying on their internals.
 * - The Spring ApplicationContext bean factory is mocked to return TaskJob instances when requested.
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerLLMGuidedTreeTest {

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
    private org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps;

    @Mock
    private SecurityProperties securityProperties;

    @Mock
    private ConfigurableApplicationContext ctx;

    @Mock
    private DefaultListableBeanFactory beanFactory;

    private DefaultJobManager manager;

    @Before
    public void setUp() {
        // Prepare a ConfigurableListableBeanFactory-compatible mock for ctx.getBeanFactory()
        ApplicationContextProvider.setBeanFactory(beanFactory);

        manager = new DefaultJobManager(
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

    @Test
    public void testIsRunning_whenLockReturnsTrue_thenReturnsFalseAndUnlockCalled() {
        // The jobStatusDAO.lock returns true -> isRunning should return false and unlock should be invoked.
        when(jobStatusDAO.lock("job1")).thenReturn(true);

        boolean running = manager.isRunning("job1");

        // Expect false because lock succeeded (meaning it was not running), method returns !locked.
        assertFalse("When lock returns true, isRunning should return false (not running).", running);
        verify(jobStatusDAO).lock("job1");
        verify(jobStatusDAO).unlock("job1");
    }

    @Test
    public void testIsRunning_whenLockReturnsFalse_thenReturnsTrueAndNoUnlock() {
        // The jobStatusDAO.lock returns false -> isRunning should return true and unlock should not be invoked.
        when(jobStatusDAO.lock("job2")).thenReturn(false);

        boolean running = manager.isRunning("job2");

        assertTrue("When lock returns false, isRunning should return true (running).", running);
        verify(jobStatusDAO).lock("job2");
        verify(jobStatusDAO, never()).unlock("job2");
    }

    @Test
    public void testRegisterJob_whenAlreadyRunning_doesNotCreateBeanOrSchedule() {
        // Spy manager to stub isRunning to true to simulate already running job.
        DefaultJobManager spyManager = spy(manager);
        doReturn(true).when(spyManager).isRunning(anyString());

        // Prepare a JobExecutionContext
        JobExecutionContext ctxExec = new JobExecutionContext("domain", "jobName", "exec", false);

        // Call registerJob - since isRunning returns true, no bean creation or scheduling should happen.
        spyManager.registerJob(ctxExec, TaskJob.class, null, null);

        verify(spyManager).isRunning("jobName");
        // beanFactory.createBean should never be called
        verify(beanFactory, never()).createBean(any(Class.class));
        verifyNoInteractions(scheduler);
    }

    @Test
    public void testRegisterJob_withCronExpression_schedulesWithCronTrigger() {
        // isRunning false -> proceed
        DefaultJobManager spyManager = spy(manager);
        doReturn(false).when(spyManager).isRunning(anyString());

        // Mock bean creation to return a TaskJob instance
        TaskJob taskJobMock = mock(TaskJob.class);
        when(beanFactory.createBean(eq(TaskJob.class))).thenReturn(taskJobMock);

        JobExecutionContext ctxExec = new JobExecutionContext("domain", "jobCron", "exec", false);

        spyManager.registerJob(ctxExec, TaskJob.class, "0 0 * * * ?", null);

        // verify bean created and scheduled with CronTrigger
        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(taskJobMock).setContext(ctxExec);
        verify(scheduler).schedule(eq(taskJobMock), any(CronTrigger.class));
    }

    @Test
    public void testRegisterJob_withStartAt_schedulesWithInstant() {
        DefaultJobManager spyManager = spy(manager);
        doReturn(false).when(spyManager).isRunning(anyString());

        TaskJob taskJobMock = mock(TaskJob.class);
        when(beanFactory.createBean(eq(TaskJob.class))).thenReturn(taskJobMock);

        JobExecutionContext ctxExec = new JobExecutionContext("domain", "jobStart", "exec", false);
        OffsetDateTime startAt = OffsetDateTime.now().plusMinutes(5);

        spyManager.registerJob(ctxExec, TaskJob.class, null, startAt);

        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(taskJobMock).setContext(ctxExec);
        // schedule with Instant
        verify(scheduler).schedule(eq(taskJobMock), eq(startAt.toInstant()));
    }

    @Test
    public void testRegisterJob_withoutCronOrStart_registers() {
        DefaultJobManager spyManager = spy(manager);
        doReturn(false).when(spyManager).isRunning(anyString());

        TaskJob taskJobMock = mock(TaskJob.class);
        when(beanFactory.createBean(eq(TaskJob.class))).thenReturn(taskJobMock);

        JobExecutionContext ctxExec = new JobExecutionContext("domain", "jobReg", "exec", false);

        spyManager.registerJob(ctxExec, TaskJob.class, null, null);

        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(taskJobMock).setContext(ctxExec);
        verify(scheduler).register(eq(taskJobMock));
    }

    @Test
    public void testRegister_task_inactive_skipsScheduling() {
        // Prepare a SchedTask mock that is inactive
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(false);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        // Spy manager to call protected register(domain, task, ...)
        DefaultJobManager spyManager = spy(manager);

        // Call protected register via public execute to reuse domain handling
        spyManager.execute(task, null, "exec", false, Map.of());

        // Since task is inactive, no bean creation or scheduling should happen
        verify(beanFactory, never()).createBean(any(Class.class));
        verifyNoInteractions(scheduler);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegister_task_noDelegate_throwsIllegalArgumentException() {
        // Prepare an active SchedTask with no job delegate and not a PullTask/PushTask
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getJobDelegate()).thenReturn(null);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);



        // implementationDAO returns empty list for TASKJOB_DELEGATE

        // Call protected register via public execute to trigger the path that throws
        manager.execute(task, null, "exec", false, Map.of());
    }

    @Test
    public void testExecute_delegatesToRegister_withProvidedArgs() {
        // This test previously stubbed the protected register method on a spy, which caused a NullPointerException
        // because TaskUtilsFactory.getInstance(task) was not stubbed. Instead, set up the task and its utilities
        // so that execute(...) can run the real register(...) without throwing, and verify observable behavior.

        DefaultJobManager spyManager = spy(manager);

        SchedTask task = mock(SchedTask.class);
        // Make the task active so register proceeds
        when(task.isActive()).thenReturn(true);

        // Provide a TaskUtils mock and stub its getType
        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        // Provide a job delegate implementation to avoid IllegalArgumentException path
        Implementation impl = mock(Implementation.class);
        when(task.getJobDelegate()).thenReturn(impl);

        // Provide key/name used in logging and context
        when(task.getKey()).thenReturn("taskKey");

        // Ensure isRunning allows scheduling to proceed by stubbing jobStatusDAO.lock to return true
        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        // Prepare beanFactory to create a TaskJob instance so scheduler can be invoked
        TaskJob taskJobMock = mock(TaskJob.class);
        when(beanFactory.createBean(eq(TaskJob.class))).thenReturn(taskJobMock);

        OffsetDateTime startAt = OffsetDateTime.now();
        String executor = "exec";
        boolean dryRun = true;
        Map<String, Object> jobData = Map.of("k", "v");

        // Call execute which will invoke register and eventually registerJob -> scheduler.schedule(...)
        spyManager.execute(task, startAt, executor, dryRun, jobData);

        // Verify that a TaskJob was created and scheduled with the provided startAt instant
        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(taskJobMock).setContext(any(JobExecutionContext.class));
        verify(scheduler).schedule(eq(taskJobMock), eq(startAt.toInstant()));
    }

    @Test
    public void testUnregister_callsSchedulerStopAndDelete_forTask() {
        // Prepare a Task mock and ensure JobNamer.getJobName(task) returns a name
        Task<?> task = mock(Task.class);
        when(task.getKey()).thenReturn("tkey");
        // We cannot easily mock static JobNamer; just call unregister and verify scheduler interactions with anyString
        manager.unregister(task);

        verify(scheduler).stop(anyString(), anyString());
        verify(scheduler).delete(anyString(), anyString());
    }

    @Test
    public void testUnregister_callsSchedulerStopAndDelete_forReport() {
        Report report = mock(Report.class);
        when(report.getKey()).thenReturn("rkey");

        manager.unregister(report);

        verify(scheduler).stop(anyString(), anyString());
        verify(scheduler).delete(anyString(), anyString());
    }


    @Test
    public void testGetOrder_returns500() {
        assertEquals("DefaultJobManager.getOrder should return 500", 500, manager.getOrder());
    }

    // Additional tests could cover load/unload flows, NotificationJob scheduling, and report registration.
    // Those flows rely on static utilities and multiple DAOs; they are better covered with integration tests or
    // with more extensive static mocking frameworks (e.g., PowerMock) which are intentionally avoided here.

}
