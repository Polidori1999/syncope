package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Map;

import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Implementation;
import org.apache.syncope.core.persistence.api.entity.Report;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtils;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.api.job.JobNamer;
import org.apache.syncope.core.provisioning.java.job.report.ReportJob;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.support.CronTrigger;

/*
 * Generated JUnit 4 tests for DefaultJobManager C1 refactored variant.
 * Tests focus on observable behavior and interactions with mocked collaborators.
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerC1LLMGuidedTreeTest {

    private DomainHolder<?> domainHolder;
    private SyncopeTaskScheduler scheduler;
    private JobStatusDAO jobStatusDAO;
    private TaskDAO taskDAO;
    private ReportDAO reportDAO;
    private ImplementationDAO implementationDAO;
    private TaskUtilsFactory taskUtilsFactory;
    private org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps;
    private SecurityProperties securityProperties;
    private ConfigurableApplicationContext ctx;
    private ConfigurableListableBeanFactory beanFactory;

    private DefaultJobManager manager;

    @Before
    public void setup() {
        domainHolder = mock(DomainHolder.class);
        scheduler = mock(SyncopeTaskScheduler.class);
        jobStatusDAO = mock(JobStatusDAO.class);
        taskDAO = mock(TaskDAO.class);
        reportDAO = mock(ReportDAO.class);
        implementationDAO = mock(ImplementationDAO.class);
        taskUtilsFactory = mock(TaskUtilsFactory.class);
        confParamOps = mock(org.apache.syncope.common.keymaster.client.api.ConfParamOps.class);
        securityProperties = mock(SecurityProperties.class);
        ctx = mock(ConfigurableApplicationContext.class);
        beanFactory = mock(ConfigurableListableBeanFactory.class);

        when(ctx.getBeanFactory()).thenReturn(beanFactory);

        manager = new DefaultJobManager(
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

    // isRunning: when lock succeeds, unlock should be called and method returns false (not running)
    @Test
    public void isRunning_lockSucceeds_returnsFalseAndUnlockCalled() {
        String jobName = "job1";
        when(jobStatusDAO.lock(jobName)).thenReturn(true);

        boolean running = manager.isRunning(jobName);

        assertFalse("isRunning should return false when lock succeeds", running);
        verify(jobStatusDAO).lock(jobName);
        verify(jobStatusDAO).unlock(jobName);
    }

    // isRunning: when lock fails, unlock should not be called and method returns true (running)
    @Test
    public void isRunning_lockFails_returnsTrueAndNoUnlock() {
        String jobName = "job2";
        when(jobStatusDAO.lock(jobName)).thenReturn(false);

        boolean running = manager.isRunning(jobName);

        assertTrue("isRunning should return true when lock fails", running);
        verify(jobStatusDAO).lock(jobName);
        verify(jobStatusDAO, never()).unlock(jobName);
    }

    // registerJob: when no cron and no startAt, scheduler.register(job) should be invoked
    @Test
    public void registerJob_noCronNoStartAt_callsSchedulerRegister() {
        // prepare context and TaskJob bean
        JobExecutionContext context = new JobExecutionContext("domain", "jobName", "exec", false);
        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        // ensure isRunning returns false by stubbing jobStatusDAO.lock to true
        when(jobStatusDAO.lock(Mockito.anyString())).thenReturn(true);

        // call protected method via same-package access
        manager.registerJob(context, TaskJob.class, null, null);

        verify(beanFactory).createBean(TaskJob.class);
        verify(scheduler).register(taskJob);
    }

    // registerJob: when startAt provided, scheduler.schedule(job, startAt.toInstant()) should be invoked
    @Test
    public void registerJob_withStartAt_callsSchedulerScheduleWithInstant() {
        JobExecutionContext context = new JobExecutionContext("domain", "jobName2", "exec", false);
        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);
        when(jobStatusDAO.lock(Mockito.anyString())).thenReturn(true);

        OffsetDateTime startAt = OffsetDateTime.of(2025, 1, 2, 3, 4, 5, 0, ZoneOffset.UTC);

        manager.registerJob(context, TaskJob.class, null, startAt);

        verify(beanFactory).createBean(TaskJob.class);
        verify(scheduler).schedule(taskJob, startAt.toInstant());
    }

    // registerJob: when cronExpression provided, scheduler.schedule(job, CronTrigger) should be invoked
    @Test
    public void registerJob_withCron_callsSchedulerScheduleWithCronTrigger() {
        JobExecutionContext context = new JobExecutionContext("domain", "jobName3", "exec", false);
        ReportJob reportJob = mock(ReportJob.class);
        when(beanFactory.createBean(ReportJob.class)).thenReturn(reportJob);
        when(jobStatusDAO.lock(Mockito.anyString())).thenReturn(true);

        String cron = "0 0 * * * ?";

        manager.registerJob(context, ReportJob.class, cron, null);

        verify(beanFactory).createBean(ReportJob.class);
        verify(scheduler).schedule(eq(reportJob), Mockito.any(CronTrigger.class));
    }

    // execute(SchedTask,...): verify that execute registers and schedules a TaskJob when startAt provided
    @Test
    public void execute_schedTask_registersAndSchedulesTaskJob_whenStartAtProvided() {
        // prepare task and its utilities
        SchedTask task = mock(SchedTask.class);
        TaskUtils mockTaskUtils = mock(TaskUtils.class);
        Implementation impl = mock(Implementation.class);

        // stub TaskUtilsFactory to return a TaskUtils with type
        when(taskUtilsFactory.getInstance(task)).thenReturn(mockTaskUtils);
        when(mockTaskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        // stub task properties used by register(...)
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("taskKey");
        when(task.getJobDelegate()).thenReturn(impl);
        when(impl.getKey()).thenReturn("implKey");

        // ensure registerJob proceeds by making isRunning return false
        when(jobStatusDAO.lock(Mockito.anyString())).thenReturn(true);

        // prepare bean creation for TaskJob and scheduler expectation
        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        OffsetDateTime startAt = OffsetDateTime.now();

        // call real execute which will call register(...) and then registerJob(...)
        manager.execute(task, startAt, "executorUser", false, Collections.singletonMap("k", (Object) "v"));

        // verify TaskJob was created and scheduled at the provided instant
        verify(beanFactory).createBean(TaskJob.class);
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

    // unregisterJob: should call scheduler.stop and scheduler.delete with domain and jobName
    @Test
    public void unregisterJob_callsSchedulerStopAndDelete() {
        String jobName = "toRemove";
        // call protected method directly
        manager.unregisterJob(jobName);

        verify(scheduler).stop(Mockito.anyString(), eq(jobName));
        verify(scheduler).delete(Mockito.anyString(), eq(jobName));
    }

    // unregister(Task): should call unregisterJob with JobNamer.getJobName(task)
    @Test
    public void unregister_task_invokesUnregisterJobWithComputedName() {
        SchedTask task = mock(SchedTask.class);
        when(task.getKey()).thenReturn("taskKey");

        DefaultJobManager spyManager = Mockito.spy(manager);
        doNothing().when(spyManager).unregisterJob(Mockito.anyString());

        spyManager.unregister(task);

        String expected = JobNamer.getJobName(task);
        verify(spyManager).unregisterJob(eq(expected));
    }

    // unregister(Report): should call unregisterJob with JobNamer.getJobName(report)
    @Test
    public void unregister_report_invokesUnregisterJobWithComputedName() {
        Report report = mock(Report.class);
        when(report.getKey()).thenReturn("rKey");

        DefaultJobManager spyManager = Mockito.spy(manager);
        doNothing().when(spyManager).unregisterJob(Mockito.anyString());

        spyManager.unregister(report);

        String expected = JobNamer.getJobName(report);
        verify(spyManager).unregisterJob(eq(expected));
    }

    // getOrder: should return 500 as defined in class
    @Test
    public void getOrder_returns500() {
        assertEquals(500, manager.getOrder());
    }
}