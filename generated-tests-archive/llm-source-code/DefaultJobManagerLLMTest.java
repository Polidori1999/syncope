package org.apache.syncope.core.provisioning.java.job;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.time.OffsetDateTime;
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
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;

public class DefaultJobManagerLLMTest {

    private DomainHolder<?> domainHolder;
    private SyncopeTaskScheduler scheduler;
    private JobStatusDAO jobStatusDAO;
    private TaskDAO taskDAO;
    private ReportDAO reportDAO;
    private ImplementationDAO implementationDAO;
    private TaskUtilsFactory taskUtilsFactory;
    private TaskUtils taskUtils;
    private ConfParamOps confParamOps;
    private SecurityProperties securityProperties;
    private ConfigurableApplicationContext ctx;
    private ConfigurableListableBeanFactory beanFactory;

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
        taskUtils = mock(TaskUtils.class);
        confParamOps = mock(ConfParamOps.class);
        securityProperties = mock(SecurityProperties.class);
        ctx = mock(ConfigurableApplicationContext.class);
        beanFactory = mock(ConfigurableListableBeanFactory.class);

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

    @Test
    public void testExecuteValidTask() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("123");
        when(task.getName()).thenReturn("myTask");

        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        Implementation impl = mock(Implementation.class);
        when(impl.getKey()).thenReturn("implKey");
        when(task.getJobDelegate()).thenReturn(impl);

        TaskJob job = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(job);

        // job not running
        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        OffsetDateTime startAt = OffsetDateTime.now();
        Map<String, Object> jobData = Map.of("k", "v");

        jobManager.execute(task, startAt, "executorUser", false, jobData);

        verify(job).setContext(any());
        verify(scheduler).schedule(eq(job), eq(startAt.toInstant()));
    }

    @Test
    public void testExecuteInactiveTaskDoesNothing() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(false);

        jobManager.execute(task, OffsetDateTime.now(), "executor", false, Map.of());

        verifyNoInteractions(scheduler);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExecuteMissingDelegateThrowsException() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getJobDelegate()).thenReturn(null);

        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        jobManager.execute(task, OffsetDateTime.now(), "executor", false, Map.of());
    }

    @Test
    public void testExecuteJobAlreadyRunningSkipsScheduling() {
        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getJobDelegate()).thenReturn(mock(Implementation.class));

        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        // job already running → lock returns false
        when(jobStatusDAO.lock(anyString())).thenReturn(false);

        TaskJob job = mock(TaskJob.class);
        when(beanFactory.createBean(TaskJob.class)).thenReturn(job);

        jobManager.execute(task, OffsetDateTime.now(), "executor", false, Map.of());

        verifyNoInteractions(scheduler);
    }
}
