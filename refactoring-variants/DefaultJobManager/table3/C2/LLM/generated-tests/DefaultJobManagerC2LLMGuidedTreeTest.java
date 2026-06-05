package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;

import org.apache.syncope.common.lib.types.IdRepoImplementationType;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Implementation;
import org.apache.syncope.core.persistence.api.entity.Report;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.persistence.api.entity.task.Task;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtils;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.java.pushpull.PullJobDelegate;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.support.CronTrigger;

/*
 * Generated JUnit4 tests for DefaultJobManager (C2 refactored variant).
 * Tests focus on observable behavior and Mockito interactions.
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerC2LLMGuidedTreeTest {

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
    private ConfigurableListableBeanFactory beanFactory;

    private DefaultJobManager jobManager;

    @Before
    public void setUp() {
        // Wire bean factory into application context
        when(ctx.getBeanFactory()).thenReturn(beanFactory);

        jobManager = new DefaultJobManager(
                domainHolder,
                scheduler,
                jobStatusDAO,
                taskDAO,
                reportDAO,
                implementationDAO,
                taskUtilsFactory,
                confParamOps,
                securityProperties,
                ctx);
    }

    // Test isRunning returns false when lock succeeds (job not running)
    @Test
    public void isRunningWhenLockSucceedsShouldReturnFalse() {
        String jobName = "jobA";
        when(jobStatusDAO.lock(jobName)).thenReturn(true);

        boolean running = jobManager.isRunning(jobName);

        // lock succeeded -> not running
        assertFalse(running);
        verify(jobStatusDAO).lock(jobName);
        verify(jobStatusDAO).unlock(jobName);
    }

    // Test isRunning returns true when lock fails (job running)
    @Test
    public void isRunningWhenLockFailsShouldReturnTrue() {
        String jobName = "jobB";
        when(jobStatusDAO.lock(jobName)).thenReturn(false);

        boolean running = jobManager.isRunning(jobName);

        // lock failed -> running
        assertTrue(running);
        verify(jobStatusDAO).lock(jobName);
        verify(jobStatusDAO, never()).unlock(jobName);
    }

    // Test registerJob with no cron and no startAt should call scheduler.register
    @Test
    public void registerJobWithoutCronOrStartAtShouldRegister() {
        // prepare context and job bean
        JobExecutionContext context = new JobExecutionContext("DOMAIN", "jobNoCron", "exec", false);

        // ensure isRunning returns false by making lock succeed
        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        // create TaskJob bean mock and ensure beanFactory returns it
        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        jobManager.registerJob(context, TaskJob.class, null, null);

        // verify bean creation and scheduler.register called
        verify(beanFactory).createBean(TaskJob.class);
        verify(taskJob).setContext(context);
        verify(scheduler).register(taskJob);
    }

    // Test registerJob with startAt should call scheduler.schedule with Instant
    @Test
    public void registerJobWithStartAtShouldScheduleAtInstant() {
        JobExecutionContext context = new JobExecutionContext("DOMAIN", "jobStartAt", "exec", false);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        OffsetDateTime startAt = OffsetDateTime.of(2025, 1, 2, 3, 4, 5, 0, ZoneOffset.UTC);

        jobManager.registerJob(context, TaskJob.class, null, startAt);

        verify(beanFactory).createBean(TaskJob.class);
        verify(taskJob).setContext(context);
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

    // Test registerJob with cron expression should schedule with CronTrigger
    @Test
    public void registerJobWithCronShouldScheduleWithCronTrigger() {
        JobExecutionContext context = new JobExecutionContext("DOMAIN", "jobCron", "exec", false);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        String cron = "0 0 * * * ?";

        jobManager.registerJob(context, TaskJob.class, cron, null);

        verify(beanFactory).createBean(TaskJob.class);
        verify(taskJob).setContext(context);
        // CronTrigger equality is complex; verify scheduler.schedule called with any CronTrigger
        verify(scheduler).schedule(eq(taskJob), any(CronTrigger.class));
    }

    // Test execute(SchedTask...) path: ensure TaskJob scheduled when startAt provided
    @Test
    public void executeSchedTaskShouldScheduleTaskJobWhenStartAtProvided() {
        // create a PullTask mock (so resolveJobDelegate picks PullJobDelegate)
        PullTask task = mock(PullTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("pullTaskKey");

        // TaskUtilsFactory must return TaskUtils with a type
        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.PULL);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        // ImplementationDAO should return an Implementation whose body matches PullJobDelegate
        Implementation impl = mock(Implementation.class);
        when(impl.getBody()).thenReturn(PullJobDelegate.class.getName());
        when(impl.getKey()).thenReturn("implKey");
        when(implementationDAO.findByType(IdRepoImplementationType.TASKJOB_DELEGATE)).
                thenReturn(Collections.singletonList(impl));

        // ensure jobStatusDAO.lock returns true so registerJob proceeds
        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        // beanFactory should create a TaskJob bean
        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        OffsetDateTime startAt = OffsetDateTime.now().plusMinutes(5);

        jobManager.execute(task, startAt, "executor", false, Collections.emptyMap());

        // verify bean creation and scheduling at instant
        verify(beanFactory).createBean(TaskJob.class);
        verify(taskJob).setContext(any(JobExecutionContext.class));
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

    // Test unregister(Task) delegates to unregisterJob with JobNamer-generated name
    @Test
    public void unregisterTaskShouldCallSchedulerStopAndDelete() {
        @SuppressWarnings("unchecked")
        Task<?> task = mock(Task.class);
        when(task.getKey()).thenReturn("taskKeyForUnregister");

        // call unregister which uses JobNamer.getJobName(task)
        jobManager.unregister(task);

        // verify scheduler stop/delete called with the job name computed by JobNamer
        String expectedJobName = org.apache.syncope.core.provisioning.api.job.JobNamer.getJobName(task);
        verify(scheduler).stop(anyString(), eq(expectedJobName));
        verify(scheduler).delete(anyString(), eq(expectedJobName));
    }

    // Test unregister(Report) delegates to unregisterJob with JobNamer-generated name
    @Test
    public void unregisterReportShouldCallSchedulerStopAndDelete() {
        Report report = mock(Report.class);
        when(report.getKey()).thenReturn("reportKeyForUnregister");

        jobManager.unregister(report);

        String expectedJobName = org.apache.syncope.core.provisioning.api.job.JobNamer.getJobName(report);
        verify(scheduler).stop(anyString(), eq(expectedJobName));
        verify(scheduler).delete(anyString(), eq(expectedJobName));
    }

    // Test getOrder returns expected value
    @Test
    public void getOrderShouldReturn500() {
        assertEquals(500, jobManager.getOrder());
    }
}