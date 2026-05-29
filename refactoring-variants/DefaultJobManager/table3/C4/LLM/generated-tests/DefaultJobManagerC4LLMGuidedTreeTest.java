package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;

import org.apache.syncope.common.lib.types.IdRepoImplementationType;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Implementation;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtils;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.support.CronTrigger;
import org.apache.syncope.core.provisioning.java.job.report.ReportJob;

/*
 * Comprehensive JUnit 4 tests for DefaultJobManager (C4 refactored variant).
 *
 * Tests focus on observable behavior and Mockito interaction checks:
 * - isRunning behavior with JobStatusDAO.lock outcomes
 * - registerJob scheduling paths (register, schedule with Instant, schedule with CronTrigger)
 * - registerJob early exit when job already running
 * - execute for SchedTask that triggers registerJob scheduling with startAt
 * - unregister and unregisterJob interactions with scheduler
 * - getOrder value
 *
 * Mocks are used for all constructor dependencies. BeanFactory.createBean(...) returns typed job mocks.
 */

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerC4LLMGuidedTreeTest {

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
    private org.apache.syncope.core.provisioning.java.job.TaskJob taskJobBean;

    @Mock
    private org.apache.syncope.core.provisioning.java.job.report.ReportJob reportJobBean;

    @Mock
    private TaskUtils taskUtils;

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
        // Wire application context bean factory to return typed job mocks when createBean is invoked.
        when(ctx.getBeanFactory()).thenReturn(beanFactory);
        // createBean for TaskJob and ReportJob must return the specific typed mocks
        doReturn(taskJobBean).when(beanFactory).createBean(eq(org.apache.syncope.core.provisioning.java.job.TaskJob.class));


        // Default security admin user


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

    // isRunning: when jobStatusDAO.lock returns true, job is NOT running and unlock is called.
    @Test
    public void isRunning_lockSucceeds_unlockCalled_andReturnsFalse() {
        String jobName = "jobA";
        when(jobStatusDAO.lock(jobName)).thenReturn(true);

        boolean running = jobManager.isRunning(jobName);

        // lock succeeded -> not running -> returns false
        assertFalse(running);
        verify(jobStatusDAO).unlock(jobName);
    }

    // isRunning: when jobStatusDAO.lock returns false, job is running and unlock is not called.
    @Test
    public void isRunning_lockFails_noUnlock_andReturnsTrue() {
        String jobName = "jobB";
        when(jobStatusDAO.lock(jobName)).thenReturn(false);

        boolean running = jobManager.isRunning(jobName);

        // lock failed -> running -> returns true
        assertTrue(running);
        verify(jobStatusDAO, never()).unlock(jobName);
    }

    // registerJob: when not running and no cron/startAt provided, scheduler.register(job) must be invoked.
    @Test
    public void registerJob_noCronNoStartAt_callsSchedulerRegister() {
        // prepare context
        JobExecutionContext context = new JobExecutionContext("domainX", "jobNameX", "exec", false);

        // ensure isRunning returns false by making lock succeed
        when(jobStatusDAO.lock(context.getJobName())).thenReturn(true);

        jobManager.registerJob(context, org.apache.syncope.core.provisioning.java.job.TaskJob.class, null, null);

        // beanFactory.createBean(TaskJob.class) should have been used and scheduler.register called
        verify(beanFactory).createBean(eq(org.apache.syncope.core.provisioning.java.job.TaskJob.class));
        verify(scheduler).register(taskJobBean);
    }

    // registerJob: when not running and startAt provided, scheduler.schedule(job, startAt.toInstant()) must be invoked.
    @Test
    public void registerJob_withStartAt_callsSchedulerScheduleWithInstant() {
        JobExecutionContext context = new JobExecutionContext("domainY", "jobNameY", "exec", false);
        when(jobStatusDAO.lock(context.getJobName())).thenReturn(true);

        OffsetDateTime startAt = OffsetDateTime.of(2025, 1, 2, 3, 4, 5, 0, ZoneOffset.UTC);

        jobManager.registerJob(context, org.apache.syncope.core.provisioning.java.job.TaskJob.class, null, startAt);

        verify(beanFactory).createBean(eq(org.apache.syncope.core.provisioning.java.job.TaskJob.class));
        verify(scheduler).schedule(taskJobBean, startAt.toInstant());
    }

    // registerJob: when not running and cronExpression provided, scheduler.schedule(job, CronTrigger) must be invoked.
    @Test
    public void registerJob_withCron_callsSchedulerScheduleWithCronTrigger() {
        JobExecutionContext context = new JobExecutionContext("domainZ", "jobNameZ", "exec", false);
        when(jobStatusDAO.lock(context.getJobName())).thenReturn(true);

        String cron = "0 0 12 * * ?";

        jobManager.registerJob(context, org.apache.syncope.core.provisioning.java.job.TaskJob.class, cron, null);

        verify(beanFactory).createBean(eq(org.apache.syncope.core.provisioning.java.job.TaskJob.class));
        // verify schedule called with a CronTrigger instance
        verify(scheduler).schedule(eq(taskJobBean), any(CronTrigger.class));
    }

    // registerJob: when job is already running (lock returns false), no scheduling should occur.
    @Test
    public void registerJob_whenAlreadyRunning_noScheduling() {
        JobExecutionContext context = new JobExecutionContext("domainW", "jobNameW", "exec", false);
        when(jobStatusDAO.lock(context.getJobName())).thenReturn(false);

        jobManager.registerJob(context, org.apache.syncope.core.provisioning.java.job.TaskJob.class, "0 0 * * * ?", null);

        // createBean should not be invoked because method returns early
        verify(beanFactory, never()).createBean(eq(org.apache.syncope.core.provisioning.java.job.TaskJob.class));
        verify(scheduler, never()).register(any(org.apache.syncope.core.provisioning.java.job.Job.class));
        verify(scheduler, never()).schedule(any(org.apache.syncope.core.provisioning.java.job.Job.class), any(CronTrigger.class));
    }

    // execute(SchedTask, startAt, executor, dryRun, jobData): exercise path where register(...) schedules a job with startAt.
    @Test
    public void execute_schedTask_withStartAt_schedulesTaskJob() {
        // Prepare a PullTask mock and required stubbing so register(...) can proceed.
        PullTask task = org.mockito.Mockito.mock(PullTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("taskKey1");

        // Provide an explicit job delegate implementation to avoid implementationDAO lookup
        Implementation impl = org.mockito.Mockito.mock(Implementation.class);
        when(impl.getKey()).thenReturn("implKey1");
        when(task.getJobDelegate()).thenReturn(impl);

        // TaskUtilsFactory must return a TaskUtils with a valid TaskType
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.PULL);

        // Ensure registerJob will proceed by making isRunning return false (lock succeeds)
        // register(...) will call prepareTaskJobExecutionContext and then registerJob -> isRunning check
        // The jobName used in JobExecutionContext is derived from JobNamer.getJobName(task)
        // Stub jobStatusDAO.lock for that job name to return true
        String expectedJobName = org.apache.syncope.core.provisioning.api.job.JobNamer.getJobName(task);
        when(jobStatusDAO.lock(expectedJobName)).thenReturn(true);

        // startAt for scheduling
        OffsetDateTime startAt = OffsetDateTime.now().plusMinutes(5);

        // execute should call register which will schedule the TaskJob with startAt instant
        jobManager.execute(task, startAt, "executorX", false, Map.of("k", "v"));

        // verify bean creation and scheduling with instant
        verify(beanFactory).createBean(eq(org.apache.syncope.core.provisioning.java.job.TaskJob.class));
        verify(scheduler).schedule(taskJobBean, startAt.toInstant());
    }

    // unregisterJob should call scheduler.stop(domain, jobName) and scheduler.delete(domain, jobName)
    @Test
    public void unregisterJob_callsSchedulerStopAndDelete() {
        String jobName = "toRemoveJob";
        // Call directly; AuthContextUtils.getDomain() may return null in test environment; verify with that value.
        jobManager.unregisterJob(jobName);

        // stop and delete should be invoked with the domain value returned by AuthContextUtils.getDomain()
        verify(scheduler).stop(org.apache.syncope.core.spring.security.AuthContextUtils.getDomain(), jobName);
        verify(scheduler).delete(org.apache.syncope.core.spring.security.AuthContextUtils.getDomain(), jobName);
    }

    // unregister(Task) should compute job name via JobNamer and call unregisterJob
    @Test
    public void unregister_task_invokesSchedulerStopAndDelete() {
        // Mock a SchedTask with key and name so JobNamer can build the job name
        SchedTask task = org.mockito.Mockito.mock(SchedTask.class);
        when(task.getKey()).thenReturn("tk-123");


        // Call unregister which internally calls unregisterJob
        jobManager.unregister(task);

        String jobName = org.apache.syncope.core.provisioning.api.job.JobNamer.getJobName(task);
        verify(scheduler).stop(org.apache.syncope.core.spring.security.AuthContextUtils.getDomain(), jobName);
        verify(scheduler).delete(org.apache.syncope.core.spring.security.AuthContextUtils.getDomain(), jobName);
    }

    // unregister(Report) should compute job name via JobNamer and call unregisterJob
    @Test
    public void unregister_report_invokesSchedulerStopAndDelete() {
        // Create a minimal Report mock with key and name
        org.apache.syncope.core.persistence.api.entity.Report report =
                org.mockito.Mockito.mock(org.apache.syncope.core.persistence.api.entity.Report.class);
        when(report.getKey()).thenReturn("r-1");


        jobManager.unregister(report);

        String jobName = org.apache.syncope.core.provisioning.api.job.JobNamer.getJobName(report);
        verify(scheduler).stop(org.apache.syncope.core.spring.security.AuthContextUtils.getDomain(), jobName);
        verify(scheduler).delete(org.apache.syncope.core.spring.security.AuthContextUtils.getDomain(), jobName);
    }

    // getOrder returns 500 as per implementation
    @Test
    public void getOrder_returns500() {
        assertEquals(500, jobManager.getOrder());
    }
}
