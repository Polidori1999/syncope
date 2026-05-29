package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.types.IdRepoImplementationType;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.SyncopeCoreLoader;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Implementation;
import org.apache.syncope.core.persistence.api.entity.Report;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.persistence.api.entity.task.PushTask;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
import org.apache.syncope.core.persistence.api.entity.task.Task;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.api.job.JobManager;
import org.apache.syncope.core.provisioning.api.job.JobNamer;
import org.apache.syncope.core.provisioning.api.job.SchedTaskJobDelegate;
import org.apache.syncope.core.provisioning.java.job.notification.NotificationJob;
import org.apache.syncope.core.provisioning.java.job.report.ReportJob;
import org.apache.syncope.core.provisioning.java.pushpull.PullJobDelegate;
import org.apache.syncope.core.provisioning.java.pushpull.PushJobDelegate;
import org.apache.syncope.core.spring.security.AuthContextUtils;
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

/*
  Generated JUnit 4 test suite for DefaultJobManager (C3 refactored variant).
  Tests focus on observable behavior and Mockito interactions for key methods:
  isRunning, registerJob, execute (SchedTask), unregisterJob, unregister(Task), unregister(Report), getOrder.
*/
@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerC3LLMGuidedTreeTest {

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
    private org.apache.syncope.core.persistence.api.entity.task.TaskUtils taskUtils;

    @Mock
    private org.apache.syncope.common.keymaster.client.api.ConfParamOps confParamOps;

    @Mock
    private SecurityProperties securityProperties;

    @Mock
    private ConfigurableApplicationContext ctx;

    @Mock
    private ConfigurableListableBeanFactory beanFactory;

    @Mock
    private TaskJob taskJobBean;

    @Mock
    private ReportJob reportJobBean;

    private DefaultJobManager jobManager;

    @Before
    public void setUp() {
        // Configure application context bean factory to return specific Job beans
        when(ctx.getBeanFactory()).thenReturn(beanFactory);
        // Ensure createBean for TaskJob and ReportJob returns dedicated mocks
        doReturn(taskJobBean).when(beanFactory).createBean(eq(TaskJob.class));



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

    // Test isRunning when jobStatusDAO.lock returns true (lock acquired -> not running)
    @Test
    public void isRunning_lockSucceeds_returnsFalse() {
        when(jobStatusDAO.lock("job1")).thenReturn(true);

        boolean running = jobManager.isRunning("job1");

        assertFalse("When lock succeeds, isRunning should return false (job not running).", running);
        verify(jobStatusDAO).lock("job1");
        verify(jobStatusDAO).unlock("job1");
    }

    // Test isRunning when jobStatusDAO.lock returns false (lock not acquired -> running)
    @Test
    public void isRunning_lockFails_returnsTrue() {
        when(jobStatusDAO.lock("job2")).thenReturn(false);

        boolean running = jobManager.isRunning("job2");

        assertTrue("When lock fails, isRunning should return true (job running).", running);
        verify(jobStatusDAO).lock("job2");
        verify(jobStatusDAO, never()).unlock("job2");
    }

    // Test registerJob with no cronExpression and no startAt -> scheduler.register(job) invoked
    @Test
    public void registerJob_noCronNoStartAt_callsSchedulerRegister() {
        // Ensure isRunning returns false by making lock(...) return true
        when(jobStatusDAO.lock("jobNoCron")).thenReturn(true);

        JobExecutionContext context = new JobExecutionContext("domain", "jobNoCron", "exec", false);

        jobManager.registerJob(context, TaskJob.class, null, null);

        // verify beanFactory created a TaskJob and scheduler.register was invoked with that instance
        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(scheduler).register(eq(taskJobBean));
    }

    // Test registerJob with startAt provided -> scheduler.schedule(job, startAt.toInstant()) invoked
    @Test
    public void registerJob_withStartAt_callsSchedulerScheduleWithInstant() {
        when(jobStatusDAO.lock("jobStart")).thenReturn(true);

        JobExecutionContext context = new JobExecutionContext("domain", "jobStart", "exec", false);
        OffsetDateTime startAt = OffsetDateTime.now().plusMinutes(5);

        jobManager.registerJob(context, TaskJob.class, null, startAt);

        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(scheduler).schedule(eq(taskJobBean), eq(startAt.toInstant()));
    }

    // Test registerJob with cronExpression provided -> scheduler.schedule(job, CronTrigger) invoked
    @Test
    public void registerJob_withCron_callsSchedulerScheduleWithCronTrigger() {
        when(jobStatusDAO.lock("jobCron")).thenReturn(true);

        JobExecutionContext context = new JobExecutionContext("domain", "jobCron", "exec", false);
        String cron = "0 0/5 * * * ?";

        jobManager.registerJob(context, TaskJob.class, cron, null);

        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(scheduler).schedule(eq(taskJobBean), any(CronTrigger.class));
    }

    // Test execute for a SchedTask that is active and has a job delegate -> should schedule with startAt instant
    @Test
    public void execute_schedTask_withStartAt_schedulesTaskJob() {
        // Prepare a mock PullTask (implements SchedTask)
        PullTask task = mock(PullTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("pullKey");

        // Provide a job delegate implementation so resolveJobDelegate returns non-null
        Implementation impl = mock(Implementation.class);
        when(impl.getKey()).thenReturn("implKey");
        when(task.getJobDelegate()).thenReturn(impl);

        // TaskUtilsFactory must return a TaskUtils with a valid TaskType
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.PULL);

        // Ensure isRunning check inside registerJob passes (lock returns true)
        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        OffsetDateTime startAt = OffsetDateTime.now().plusMinutes(2);

        jobManager.execute(task, startAt, "executor", false, Collections.emptyMap());

        // verify bean creation and scheduling with instant
        verify(beanFactory).createBean(eq(TaskJob.class));
        verify(scheduler).schedule(eq(taskJobBean), eq(startAt.toInstant()));
    }

    // Test unregisterJob invokes scheduler.stop and scheduler.delete with provided jobName
    @Test
    public void unregisterJob_callsSchedulerStopAndDelete() {
        String jobName = "toUnregister";

        jobManager.unregisterJob(jobName);

        verify(scheduler).stop(anyString(), eq(jobName));
        verify(scheduler).delete(anyString(), eq(jobName));
    }

    // Test unregister(Task) results in scheduler stop/delete being invoked (domain may vary)
    @Test
    public void unregister_task_invokesSchedulerStopAndDelete() {
        @SuppressWarnings("unchecked")
        Task<?> task = mock(Task.class);
        when(task.getKey()).thenReturn("taskKey");

        jobManager.unregister(task);

        // unregister should call scheduler.stop and delete once each
        verify(scheduler).stop(anyString(), anyString());
        verify(scheduler).delete(anyString(), anyString());
    }

    // Test unregister(Report) results in scheduler stop/delete being invoked (domain may vary)
    @Test
    public void unregister_report_invokesSchedulerStopAndDelete() {
        Report report = mock(Report.class);
        when(report.getKey()).thenReturn("reportKey");

        jobManager.unregister(report);

        verify(scheduler).stop(anyString(), anyString());
        verify(scheduler).delete(anyString(), anyString());
    }

    // Test getOrder returns expected value
    @Test
    public void getOrder_returns500() {
        assertEquals("DefaultJobManager.getOrder should return 500", 500, jobManager.getOrder());
    }
}
