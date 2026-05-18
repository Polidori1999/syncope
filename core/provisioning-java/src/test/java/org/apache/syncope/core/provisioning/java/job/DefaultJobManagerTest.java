package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.*;
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
import org.apache.syncope.core.persistence.api.entity.task.TaskUtils;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.api.job.JobManager;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;


import java.time.OffsetDateTime;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
class DefaultJobManagerTest {

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

    @BeforeEach
    void setup(){
        jobManager = new DefaultJobManager(domainHolder, scheduler, jobStatusDAO, taskDAO, reportDAO, implementationDAO,
                taskUtilsFactory, confParamOps, securityProperties, ctx);

    }


    @Test
    void executeShouldScheduleActiveTaskInFuture(){
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
    void executeShouldScheduleActiveTaskNowWithDryRunAndJobData() {
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

}