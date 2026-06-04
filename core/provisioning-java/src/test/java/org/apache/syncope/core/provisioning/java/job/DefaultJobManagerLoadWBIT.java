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

package org.apache.syncope.core.provisioning.java.job;

import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.apache.syncope.common.lib.SyncopeConstants;
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
import org.apache.syncope.core.persistence.api.entity.task.TaskUtils;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.java.job.notification.NotificationJob;
import org.apache.syncope.core.provisioning.java.job.report.ReportJob;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.scheduling.support.CronTrigger;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerLoadWBIT {

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
    private DefaultListableBeanFactory applicationBeanFactory;

    private DefaultJobManager jobManager;

    @Before
    public void setup() {
        ApplicationContextProvider.setBeanFactory(applicationBeanFactory);

        jobManager = new DefaultJobManager(
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
    public void loadShouldScheduleTaskReturnedByTaskDAOWithCronExpression() {
        String domain = "test-domain";

        SchedTask task = mock(SchedTask.class);
        when(task.isActive()).thenReturn(true);
        when(task.getKey()).thenReturn("task-key");
        when(task.getName()).thenReturn("task-name");
        when(task.getCronExpression()).thenReturn("0 0 12 * * ?");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(task.getJobDelegate()).thenReturn(jobDelegate);

        TaskUtils taskUtils = mock(TaskUtils.class);
        when(taskUtilsFactory.getInstance(task)).thenReturn(taskUtils);
        when(taskUtils.getType()).thenReturn(TaskType.SCHEDULED);

        TaskJob taskJob = mock(TaskJob.class);
        doReturn(taskJob).when(applicationBeanFactory).createBean(TaskJob.class);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        when(taskDAO.<SchedTask>findAll(TaskType.SCHEDULED)).thenReturn(List.of(task));
        when(taskDAO.findAll(TaskType.PULL)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PUSH)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.MACRO)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.LIVE_SYNC)).thenReturn(List.of());
        when(reportDAO.findAll()).thenReturn(List.of());

        when(applicationBeanFactory.getBean(SecurityProperties.class)).thenReturn(securityProperties);
        when(securityProperties.getAdminUser()).thenReturn("admin");

        assertDoesNotThrow(() -> jobManager.load(domain));

        verify(taskJob).setContext(any(JobExecutionContext.class));
        verify(scheduler).schedule(eq(taskJob), any(CronTrigger.class));
    }

    @Test
    public void loadShouldScheduleReportReturnedByReportDAOWithCronExpression() {
        String domain = "test-domain";

        Report report = mock(Report.class);
        when(report.isActive()).thenReturn(true);
        when(report.getKey()).thenReturn("report-key");
        when(report.getName()).thenReturn("report-name");
        when(report.getCronExpression()).thenReturn("0 0 12 * * ?");

        Implementation jobDelegate = mock(Implementation.class);
        when(jobDelegate.getKey()).thenReturn("delegate-key");
        when(report.getJobDelegate()).thenReturn(jobDelegate);

        ReportJob reportJob = mock(ReportJob.class);
        doReturn(reportJob).when(applicationBeanFactory).createBean(ReportJob.class);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        when(taskDAO.findAll(TaskType.SCHEDULED)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PULL)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PUSH)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.MACRO)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.LIVE_SYNC)).thenReturn(List.of());

        doReturn(List.of(report)).when(reportDAO).findAll();

        when(applicationBeanFactory.getBean(SecurityProperties.class)).thenReturn(securityProperties);
        when(securityProperties.getAdminUser()).thenReturn("admin");

        assertDoesNotThrow(() -> jobManager.load(domain));

        verify(scheduler).schedule(eq(reportJob), any(CronTrigger.class));
    }

    @Test
    public void loadShouldEnterMasterDomainBranchWithBlankNotificationCronExpression() {
        String domain = SyncopeConstants.MASTER_DOMAIN;

        when(taskDAO.findAll(TaskType.SCHEDULED)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PULL)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PUSH)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.MACRO)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.LIVE_SYNC)).thenReturn(List.of());
        when(reportDAO.findAll()).thenReturn(List.of());

        when(applicationBeanFactory.getBean(SecurityProperties.class)).thenReturn(securityProperties);
        when(securityProperties.getAdminUser()).thenReturn("admin");

        when(confParamOps.get(
                eq(SyncopeConstants.MASTER_DOMAIN),
                eq("notificationjob.cronExpression"),
                isNull(),
                eq(String.class)))
                .thenReturn("");

        SystemLoadReporterJob systemLoadReporterJob = mock(SystemLoadReporterJob.class);
        doReturn(systemLoadReporterJob).when(applicationBeanFactory).createBean(SystemLoadReporterJob.class);

        when(jobStatusDAO.lock(anyString())).thenReturn(true);

        assertDoesNotThrow(() -> jobManager.load(domain));

        verify(applicationBeanFactory, never()).createBean(NotificationJob.class);
        verify(applicationBeanFactory).createBean(SystemLoadReporterJob.class);
        verify(scheduler, atLeastOnce()).schedule(eq(systemLoadReporterJob), any(CronTrigger.class));
    }

    @Test
    public void loadShouldScheduleNotificationJobWhenMasterDomainCronExpressionIsConfigured() {
        String domain = SyncopeConstants.MASTER_DOMAIN;
        String cronExpression = "0 0 12 * * ?";

        when(taskDAO.findAll(TaskType.SCHEDULED)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PULL)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PUSH)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.MACRO)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.LIVE_SYNC)).thenReturn(List.of());
        doReturn(List.of()).when(reportDAO).findAll();

        when(confParamOps.get(
                eq(SyncopeConstants.MASTER_DOMAIN),
                eq("notificationjob.cronExpression"),
                isNull(),
                eq(String.class)))
                .thenReturn(cronExpression);

        NotificationJob notificationJob = mock(NotificationJob.class);
        SystemLoadReporterJob systemLoadReporterJob = mock(SystemLoadReporterJob.class);

        doReturn(notificationJob).when(applicationBeanFactory).createBean(NotificationJob.class);
        doReturn(systemLoadReporterJob).when(applicationBeanFactory).createBean(SystemLoadReporterJob.class);

        when(securityProperties.getAdminUser()).thenReturn("admin");
        when(jobStatusDAO.lock(anyString())).thenReturn(true);
        when(applicationBeanFactory.getBean(SecurityProperties.class)).thenReturn(securityProperties);

        assertDoesNotThrow(() -> jobManager.load(domain));

        verify(applicationBeanFactory).createBean(NotificationJob.class);
        verify(applicationBeanFactory).createBean(SystemLoadReporterJob.class);

        verify(notificationJob).setContext(any(JobExecutionContext.class));
        verify(systemLoadReporterJob).setContext(any(JobExecutionContext.class));

        verify(scheduler).schedule(eq(notificationJob), any(CronTrigger.class));
        verify(scheduler).schedule(eq(systemLoadReporterJob), any(CronTrigger.class));
    }
}