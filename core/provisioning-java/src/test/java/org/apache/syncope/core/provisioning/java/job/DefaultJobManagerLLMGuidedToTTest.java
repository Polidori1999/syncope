package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Map;

import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.apache.syncope.common.lib.types.TaskType;
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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerLLMGuidedToTTest {

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
    private ConfigurableApplicationContext ctx;

    @Mock
    private ConfigurableListableBeanFactory beanFactory;

    @Mock
    private SchedTask task;

    @Mock
    private TaskUtils taskUtils;

    @Mock
    private Implementation implementation;

    @Mock
    private TaskJob taskJob;

    private DefaultJobManager jobManager;

    @Before
    public void setUp() {
        when(ctx.getBeanFactory()).thenReturn(beanFactory);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);

        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        when(task.isActive()).thenReturn(true);
        when(task.getJobDelegate()).thenReturn(implementation);
        when(task.getKey()).thenReturn("taskKey");
        when(task.getName()).thenReturn("taskName");
        when(implementation.getKey()).thenReturn("implKey");

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

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

    @Test
    public void testExecuteActiveTaskWithFutureStartAtSchedulesTaskJobAndPropagatesContext() {
        OffsetDateTime startAt = OffsetDateTime.of(2030, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        String executor = "executorUser";
        boolean dryRun = true;
        Map<String, Object> jobData = Collections.singletonMap("k", "v");

        jobManager.execute(task, startAt, executor, dryRun, jobData);

        ArgumentCaptor<JobExecutionContext> contextCaptor = ArgumentCaptor.forClass(JobExecutionContext.class);
        verify(taskJob).setContext(contextCaptor.capture());
        JobExecutionContext capturedContext = contextCaptor.getValue();

        assertNotNull(capturedContext);
        assertEquals(executor, capturedContext.getExecutor());
        assertTrue(capturedContext.isDryRun());
        assertEquals(TaskType.SCHEDULED, capturedContext.getData().get(JobManager.TASK_TYPE));
        assertEquals("taskKey", capturedContext.getData().get(JobManager.TASK_KEY));
        assertEquals("implKey", capturedContext.getData().get(JobManager.DELEGATE_IMPLEMENTATION));
        assertEquals("v", capturedContext.getData().get("k"));

        ArgumentCaptor<Instant> instantCaptor = ArgumentCaptor.forClass(Instant.class);
        verify(scheduler).schedule(eq(taskJob), instantCaptor.capture());
        assertEquals(startAt.toInstant(), instantCaptor.getValue());

        verify(scheduler, never()).register(any(TaskJob.class));
    }

    @Test
    public void testExecuteActiveTaskWithNullStartAtRegistersTaskJob() {
        String executor = "executorUser";
        boolean dryRun = false;
        Map<String, Object> jobData = Collections.singletonMap("k2", "v2");

        jobManager.execute(task, null, executor, dryRun, jobData);

        ArgumentCaptor<JobExecutionContext> contextCaptor = ArgumentCaptor.forClass(JobExecutionContext.class);
        verify(taskJob).setContext(contextCaptor.capture());
        JobExecutionContext capturedContext = contextCaptor.getValue();

        assertNotNull(capturedContext);
        assertEquals(executor, capturedContext.getExecutor());
        assertFalse(capturedContext.isDryRun());
        assertEquals("v2", capturedContext.getData().get("k2"));

        verify(scheduler).register(taskJob);
        verify(scheduler, never()).schedule(any(TaskJob.class), any(Instant.class));
    }

    @Test
    public void testExecuteInactiveTaskDoesNotScheduleOrRegister() {
        when(task.isActive()).thenReturn(false);

        jobManager.execute(task, OffsetDateTime.now(), "executor", false, Collections.<String, Object>emptyMap());

        verify(beanFactory, never()).createBean(TaskJob.class);
        verify(scheduler, never()).register(any(TaskJob.class));
        verify(scheduler, never()).schedule(any(TaskJob.class), any(Instant.class));
    }

    @Test
    public void testExecuteWithNullJobDataThrowsNullPointerException() {
        try {
            jobManager.execute(task, OffsetDateTime.now(), "executor", true, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testExecuteWithNullExecutorPropagatedInContext() {
        OffsetDateTime startAt = OffsetDateTime.of(2031, 2, 2, 10, 0, 0, 0, ZoneOffset.UTC);
        boolean dryRun = false;
        Map<String, Object> jobData = Collections.singletonMap("k3", "v3");

        jobManager.execute(task, startAt, null, dryRun, jobData);

        ArgumentCaptor<JobExecutionContext> contextCaptor = ArgumentCaptor.forClass(JobExecutionContext.class);
        verify(taskJob).setContext(contextCaptor.capture());
        JobExecutionContext capturedContext = contextCaptor.getValue();

        assertNotNull(capturedContext);
        assertNull(capturedContext.getExecutor());
        assertFalse(capturedContext.isDryRun());
        assertEquals("v3", capturedContext.getData().get("k3"));

        verify(scheduler).schedule(eq(taskJob), any(Instant.class));
    }
}
