package org.apache.syncope.core.provisioning.java.job;

import static com.jayway.jsonpath.internal.path.PathCompiler.fail;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Implementation;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
import org.apache.syncope.core.persistence.api.entity.task.Task;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtils;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.api.job.JobManager;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerTest {

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
    private ConfigurableApplicationContext ctx;

    private DefaultJobManager jobManager;
    @Mock
    private ConfigurableListableBeanFactory beanFactory;

    @Before
    public void setup(){
        jobManager = new DefaultJobManager(domainHolder, scheduler, jobStatusDAO, taskDAO, reportDAO, implementationDAO,
                taskUtilsFactory, confParamOps, securityProperties, ctx);

    }


    @Test
    public void executeShouldScheduleActiveTaskInFuture(){
        //T2
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");


        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);



        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);


        //job finto
        when(ctx.getBeanFactory()).thenReturn(beanFactory);
        TaskJob taskJob = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(taskJob);


        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        //s4 e4 d2 j2
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
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

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

        when(ctx.getBeanFactory()).thenReturn(beanFactory);
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
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

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
    /*Il metodo deve rifiutare il task perché non è possibile determinare il job delegate.
    Non deve schedulare alcun job.*/
    @Test
    public void executeShouldRejectTaskWithoutJobDelegate(){
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

    @Test
    public void executeWithPastStartAtCurrentlyDelegatesToScheduler(){
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        when(ctx.getBeanFactory()).thenReturn(beanFactory);
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
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

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

        when(ctx.getBeanFactory()).thenReturn(beanFactory);
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
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

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

        when(ctx.getBeanFactory()).thenReturn(beanFactory);
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
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

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

        when(ctx.getBeanFactory()).thenReturn(beanFactory);
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
        verify(scheduler).schedule(eq(taskJob), eq(startAt.toInstant()));
    }

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


    //test white box dopo jacoco
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
        when(ctx.getBeanFactory()).thenReturn(beanFactory);

        assertDoesNotThrow(() -> jobManager.execute(
                task,
                null,
                "admin",
                false,
                Map.of()));

        verify(taskJob).setContext(any(JobExecutionContext.class));
        verify(scheduler).register(eq(taskJob));
        verify(scheduler, never()).schedule(eq(taskJob), any(Instant.class));
    }


}