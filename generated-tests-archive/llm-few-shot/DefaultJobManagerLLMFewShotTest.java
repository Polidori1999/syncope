package org.apache.syncope.core.provisioning.java.job;

import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

import org.apache.syncope.common.lib.types.TaskType;
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
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;

public class DefaultJobManagerLLMFewShotTest {

    private DomainHolder<?> domainHolder;
    private SyncopeTaskScheduler scheduler;
    private JobStatusDAO jobStatusDAO;
    private TaskDAO taskDAO;
    private ReportDAO reportDAO;
    private ImplementationDAO implementationDAO;
    private TaskUtilsFactory taskUtilsFactory;
    private SecurityProperties securityProperties;
    private ConfigurableApplicationContext ctx;
    private AutowireCapableBeanFactory beanFactory;

    private DefaultJobManager jobManager;

    @Before
    public void setup() {
        domainHolder = mock(DomainHolder.class);
        scheduler = mock(SyncopeTaskScheduler.class);
        jobStatusDAO = mock(JobStatusDAO.class);
        taskDAO = mock(TaskDAO.class);
        reportDAO = mock(ReportDAO.class);
        implementationDAO = mock(ImplementationDAO.class);
        taskUtilsFactory = mock(TaskUtilsFactory.class);
        securityProperties = mock(SecurityProperties.class);
        ctx = mock(ConfigurableApplicationContext.class);
        beanFactory = mock(AutowireCapableBeanFactory.class);

        when(ctx.getBeanFactory()).thenReturn(beanFactory);

        jobManager = new DefaultJobManager(
                domainHolder,
                scheduler,
                jobStatusDAO,
                taskDAO,
                reportDAO,
                implementationDAO,
                taskUtilsFactory,
                null,
                securityProperties,
                ctx);
    }

    /**
     * Example 1 style: inactive task should not schedule anything.
     */
    @Test
    public void testInactiveTaskDoesNotSchedule() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(false);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        jobManager.execute(task, null, "admin", false, Map.of());

        verifyNoInteractions(scheduler);
        verifyNoInteractions(beanFactory);
    }

    /**
     * Example 2 style: active task with startAt == null should register the job.
     */
    @Test
    public void testActiveTaskRegistersJob() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("123");
        when(task.getJobDelegate()).thenReturn(mock(Implementation.class));
        when(task.getJobDelegate().getKey()).thenReturn("implKey");

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        jobManager.execute(task, null, "admin", false, Map.of());

        verify(scheduler).register(taskJob);
        verify(scheduler, never()).schedule(any(), any(OffsetDateTime.class));
        verify(scheduler, never()).schedule(any(), any());
    }

    /**
     * Additional test: if job is already running, registerJob should not schedule anything.
     */
    @Test
    public void testJobAlreadyRunningSkipsScheduling() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("key1");
        when(task.getJobDelegate()).thenReturn(mock(Implementation.class));
        when(task.getJobDelegate().getKey()).thenReturn("implKey");

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        when(jobStatusDAO.lock(anyString())).thenReturn(false); // means running

        jobManager.execute(task, OffsetDateTime.now(), "admin", false, Map.of());

        verifyNoInteractions(scheduler);
        verify(beanFactory, never()).createBean(any());
    }

    /**
     * Additional test: startAt provided should call scheduler.schedule(job, instant).
     */
    @Test
    public void testStartAtSchedulesWithInstant() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("key2");
        when(task.getJobDelegate()).thenReturn(mock(Implementation.class));
        when(task.getJobDelegate().getKey()).thenReturn("implKey");

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        OffsetDateTime startAt = OffsetDateTime.now();
        jobManager.execute(task, startAt, "admin", false, Map.of());

        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
        verify(scheduler, never()).register(any());
    }

    /**
     * Additional test: missing job delegate should throw IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMissingJobDelegateThrows() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getJobDelegate()).thenReturn(null);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.PULL);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        when(implementationDAO.findByType(any())).thenReturn(List.of()); // no delegate found

        jobManager.execute(task, null, "admin", false, Map.of());
    }

    /**
     * Additional test: verify JobExecutionContext is populated correctly.
     */
    @Test
    public void testJobExecutionContextPopulated() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("k777");
        when(task.getJobDelegate()).thenReturn(mock(Implementation.class));
        when(task.getJobDelegate().getKey()).thenReturn("impl777");

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtils.getType()).thenReturn(TaskType.PUSH);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);

        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        jobManager.execute(task, null, "executorX", true, Map.of("A", "B"));

        ArgumentCaptor<JobExecutionContext> ctxCaptor = ArgumentCaptor.forClass(JobExecutionContext.class);
        verify(taskJob).setContext(ctxCaptor.capture());

        JobExecutionContext captured = ctxCaptor.getValue();
        assert captured.getData().get(JobManager.TASK_KEY).equals("k777");
        assert captured.getData().get(JobManager.DELEGATE_IMPLEMENTATION).equals("impl777");
        assert captured.getData().get("A").equals("B");
    }
}
