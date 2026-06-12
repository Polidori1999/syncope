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
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.ApplicationContextProvider;
import org.apache.syncope.core.persistence.api.DomainHolder;
import org.apache.syncope.core.persistence.api.dao.ImplementationDAO;
import org.apache.syncope.core.persistence.api.dao.JobStatusDAO;
import org.apache.syncope.core.persistence.api.dao.ReportDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

@RunWith(MockitoJUnitRunner.class)
public class DefaultJobManagerLoadBBIT {

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

    private void configureEmptyLoadFixture() {
        when(taskDAO.findAll(TaskType.SCHEDULED)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PULL)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PUSH)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.MACRO)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.LIVE_SYNC)).thenReturn(List.of());
        when(reportDAO.findAll()).thenReturn(List.of());

        when(applicationBeanFactory.getBean(SecurityProperties.class)).thenReturn(securityProperties);
        when(securityProperties.getAdminUser()).thenReturn("admin");
    }

    // D1/D2/D3 - L-O1 / Characterization
    // Input: domain valorizzato, domain=null e domain=""; DAO configurati con liste vuote.
    // Atteso/Osservato in C0: completamento dell'inizializzazione senza eccezioni inattese.
    @Test
    public void loadShouldCompleteInitializationForAcceptedDomainValues() {
        for (String domain : new String[] { "test-domain", null, "" }) {
            configureEmptyLoadFixture();

            assertDoesNotThrow(() -> jobManager.load(domain));

            reset(taskDAO, reportDAO, applicationBeanFactory, securityProperties);
        }
    }
    // D2 - L-O2
    // Input: domain=null; DAO configurati con liste vuote.
    // Oracolo iniziale: rifiuto dell'input tramite eccezione.

    @Ignore("Oracolo iniziale non confermato: la documentazione non specifica che domain null debba essere rifiutato")
    @Test
    public void loadWithNullDomainShouldThrowExceptionAccordingToInitialOracle() {
        String domain = null;

        when(taskDAO.findAll(TaskType.SCHEDULED)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PULL)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PUSH)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.MACRO)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.LIVE_SYNC)).thenReturn(List.of());
        when(reportDAO.findAll()).thenReturn(List.of());

        when(applicationBeanFactory.getBean(SecurityProperties.class)).thenReturn(securityProperties);
        when(securityProperties.getAdminUser()).thenReturn("admin");

        try {
            jobManager.load(domain);
            fail("Expected an exception for null domain");
        } catch (RuntimeException e) {
            // Expected according to the initial oracle.
        }
    }

    // D3 - L-O2
    // Input: domain=""; DAO configurati con liste vuote.
    // Oracolo iniziale: rifiuto dell'input tramite eccezione.
    @Ignore("Oracolo iniziale non confermato: la documentazione non specifica che domain vuoto debba essere rifiutato")
    @Test
    public void loadWithEmptyDomainShouldThrowExceptionAccordingToInitialOracle() {
        String domain = "";

        when(taskDAO.findAll(TaskType.SCHEDULED)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PULL)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.PUSH)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.MACRO)).thenReturn(List.of());
        when(taskDAO.findAll(TaskType.LIVE_SYNC)).thenReturn(List.of());
        when(reportDAO.findAll()).thenReturn(List.of());

        when(applicationBeanFactory.getBean(SecurityProperties.class)).thenReturn(securityProperties);
        when(securityProperties.getAdminUser()).thenReturn("admin");

        try {
            jobManager.load(domain);
            fail("Expected an exception for empty domain");
        } catch (RuntimeException e) {
            // Expected according to the initial oracle.
        }
    }
}