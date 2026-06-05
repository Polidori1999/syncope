package org.apache.syncope.core.provisioning.java.job;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.syncope.common.keymaster.client.api.ConfParamOps;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.syncope.core.persistence.api.ApplicationContextProvider;
import org.springframework.scheduling.support.CronTrigger;

public class DefaultJobManager implements JobManager, SyncopeCoreLoader {

    protected static final Logger LOG = LoggerFactory.getLogger(DefaultJobManager.class);

    protected final DomainHolder<?> domainHolder;

    protected final SyncopeTaskScheduler scheduler;

    protected final JobStatusDAO jobStatusDAO;

    protected final TaskDAO taskDAO;

    protected final ReportDAO reportDAO;

    protected final ImplementationDAO implementationDAO;

    protected final TaskUtilsFactory taskUtilsFactory;

    protected final ConfParamOps confParamOps;

    protected final SecurityProperties securityProperties;


    public DefaultJobManager(
            final DomainHolder<?> domainHolder,
            final SyncopeTaskScheduler scheduler,
            final JobStatusDAO jobStatusDAO,
            final TaskDAO taskDAO,
            final ReportDAO reportDAO,
            final ImplementationDAO implementationDAO,
            final TaskUtilsFactory taskUtilsFactory,
            final ConfParamOps confParamOps,
            final SecurityProperties securityProperties) {

        this.domainHolder = domainHolder;
        this.scheduler = scheduler;
        this.jobStatusDAO = jobStatusDAO;
        this.taskDAO = taskDAO;
        this.reportDAO = reportDAO;
        this.implementationDAO = implementationDAO;
        this.taskUtilsFactory = taskUtilsFactory;
        this.confParamOps = confParamOps;
        this.securityProperties = securityProperties;
    }

    @Override
    public boolean isRunning(final String jobName) {
        synchronized (jobName) {
            boolean locked = jobStatusDAO.lock(jobName);
            if (locked) {
                jobStatusDAO.unlock(jobName);
            }
            return !locked;
        }
    }

    protected void registerJob(
            final JobExecutionContext context,
            final Class<? extends Job> jobClass,
            final String cronExpression,
            final OffsetDateTime startAt) {

        if (isRunning(context.getJobName())) {
            LOG.debug("Job {} already running, cancel", context.getJobName());
            return;
        }

        // 1. prepare job
        Job job = ApplicationContextProvider.getBeanFactory().createBean(jobClass);
        job.setContext(context);

        // 2. schedule
        if (cronExpression == null && startAt == null) {
            scheduler.register(job);
        } else {
            if (cronExpression == null) {
                scheduler.schedule(job, startAt.toInstant());
            } else {
                scheduler.schedule(job, new CronTrigger(cronExpression));
            }
        }
    }

    protected void register(
            final String domain,
            final SchedTask task,
            final String cronExpression,
            final OffsetDateTime startAt,
            final String executor,
            final boolean dryRun,
            final Map<String, Object> jobData) {

        TaskType type = taskUtilsFactory.getInstance(task).getType();

        if (!task.isActive()) {
            LOG.debug("{} Task {} {} not active, skipping job registration", type, task.getKey(), task.getName());
            return;
        }

        Implementation jobDelegate = resolveJobDelegate(task);

        if (jobDelegate == null) {
            throw new IllegalArgumentException("Task " + task
                    + " does not provide any " + SchedTaskJobDelegate.class.getSimpleName());
        }

        JobExecutionContext context = prepareTaskJobExecutionContext(domain, task, executor, dryRun, jobData, type, jobDelegate);

        registerJob(
                context,
                TaskJob.class,
                cronExpression,
                startAt);
    }

    private Implementation resolveJobDelegate(final SchedTask task) {
        Implementation explicit = task.getJobDelegate();
        if (explicit != null) {
            return explicit;
        }

        if (task instanceof PullTask) {
            return implementationDAO.findByType(IdRepoImplementationType.TASKJOB_DELEGATE).stream().
                    filter(impl -> PullJobDelegate.class.getName().equals(impl.getBody())).
                    findFirst().orElse(null);
        }

        if (task instanceof PushTask) {
            return implementationDAO.findByType(IdRepoImplementationType.TASKJOB_DELEGATE).stream().
                    filter(impl -> PushJobDelegate.class.getName().equals(impl.getBody())).
                    findFirst().orElse(null);
        }

        return null;
    }

    private JobExecutionContext prepareTaskJobExecutionContext(
            final String domain,
            final SchedTask task,
            final String executor,
            final boolean dryRun,
            final Map<String, Object> jobData,
            final TaskType type,
            final Implementation jobDelegate) {

        JobExecutionContext context = new JobExecutionContext(
                domain,
                JobNamer.getJobName(task),
                executor,
                dryRun);
        context.getData().put(JobManager.TASK_TYPE, type);
        context.getData().put(JobManager.TASK_KEY, task.getKey());
        context.getData().put(JobManager.DELEGATE_IMPLEMENTATION, jobDelegate.getKey());
        if (jobData != null && !jobData.isEmpty()) {
            context.getData().putAll(jobData);
        } else if (jobData != null && jobData.isEmpty()) {
            // nothing to add
        } else if (jobData == null) {
            // preserve original behavior: allow null to propagate where expected by callers
            context.getData().putAll(Map.of());
        }
        return context;
    }

    @Override
    public void execute(
            final SchedTask task,
            final OffsetDateTime startAt,
            final String executor,
            final boolean dryRun,
            final Map<String, Object> jobData) {

        register(
                AuthContextUtils.getDomain(),
                task,
                null,
                startAt,
                executor,
                dryRun,
                jobData);
    }

    @Override
    public void register(
            final SchedTask task,
            final String executor) {

        register(
                AuthContextUtils.getDomain(),
                task,
                task.getCronExpression(),
                null,
                executor,
                false,
                Map.of());
    }

    protected void register(
            final String domain,
            final Report report,
            final String cronExpression,
            final OffsetDateTime startAt,
            final String executor,
            final boolean dryRun) {

        if (!report.isActive()) {
            LOG.debug("Report {} {} not active, skipping job registration", report.getKey(), report.getName());
            return;
        }

        JobExecutionContext context = new JobExecutionContext(
                domain,
                JobNamer.getJobName(report),
                executor,
                dryRun);
        context.getData().put(JobManager.REPORT_KEY, report.getKey());
        context.getData().put(JobManager.DELEGATE_IMPLEMENTATION, report.getJobDelegate().getKey());

        registerJob(
                context,
                ReportJob.class,
                cronExpression,
                startAt);
    }

    @Override
    public void execute(
            final Report report,
            final OffsetDateTime startAt,
            final String executor,
            final boolean dryRun) {

        register(
                AuthContextUtils.getDomain(),
                report,
                null,
                startAt,
                executor,
                dryRun);
    }

    @Override
    public void register(
            final Report report,
            final String executor) {

        register(AuthContextUtils.getDomain(), report, report.getCronExpression(), null, executor, false);
    }

    protected void unregisterJob(final String jobName) {
        scheduler.stop(AuthContextUtils.getDomain(), jobName);
        scheduler.delete(AuthContextUtils.getDomain(), jobName);
    }

    @Override
    public void unregister(final Task<?> task) {
        unregisterJob(JobNamer.getJobName(task));
    }

    @Override
    public void unregister(final Report report) {
        unregisterJob(JobNamer.getJobName(report));
    }

    @Override
    public int getOrder() {
        return 500;
    }

    @Override
    public void load(final String domain) {
        AuthContextUtils.runAsAdmin(domain, () -> {
            loadSchedTasks(domain);
            loadReports(domain);
        });

        if (SyncopeConstants.MASTER_DOMAIN.equals(domain)) {
            String notificationJobCronExp = AuthContextUtils.callAsAdmin(SyncopeConstants.MASTER_DOMAIN, () -> {
                String result = StringUtils.EMPTY;

                String conf = confParamOps.get(
                        SyncopeConstants.MASTER_DOMAIN, "notificationjob.cronExpression", null, String.class);
                if (conf == null) {
                    result = NotificationJob.DEFAULT_CRON_EXP;
                } else if (!StringUtils.EMPTY.equals(conf)) {
                    result = conf;
                }
                return result;
            });

            scheduleNotificationJobIfNeeded(domain, notificationJobCronExp);
            scheduleSystemLoadReporter(domain);
        }
    }

    private void loadSchedTasks(final String domain) {
        Set<SchedTask> tasks = new HashSet<>(taskDAO.findAll(TaskType.SCHEDULED));
        tasks.addAll(taskDAO.findAll(TaskType.PULL));
        tasks.addAll(taskDAO.findAll(TaskType.PUSH));
        tasks.addAll(taskDAO.findAll(TaskType.MACRO));
        tasks.addAll(taskDAO.findAll(TaskType.LIVE_SYNC));

        boolean loadException = false;
        for (Iterator<SchedTask> it = tasks.iterator(); it.hasNext() && !loadException;) {
            SchedTask task = it.next();

            LOG.debug("Loading job for {} Task {} {}",
                    taskUtilsFactory.getInstance(task).getType(), task.getKey(), task.getName());

            try {
                register(
                        domain,
                        task,
                        task.getCronExpression(),
                        null,
                        securityProperties.getAdminUser(),
                        false,
                        Map.of());
            } catch (Exception e) {
                LOG.error("While loading job instance for task {}", task.getKey(), e);
                loadException = true;
            }
        }
    }

    private void loadReports(final String domain) {
        boolean loadException = false;
        for (Iterator<? extends Report> it = reportDAO.findAll().iterator(); it.hasNext() && !loadException;) {
            Report report = it.next();

            LOG.debug("Loading job for Report {} {}", report.getKey(), report.getName());

            try {
                register(
                        domain,
                        report,
                        report.getCronExpression(),
                        null,
                        securityProperties.getAdminUser(),
                        false);
            } catch (Exception e) {
                LOG.error("While loading job instance for report {}", report.getName(), e);
                loadException = true;
            }
        }
    }

    private void scheduleNotificationJobIfNeeded(final String domain, final String notificationJobCronExp) {
        if (StringUtils.isBlank(notificationJobCronExp)) {
            LOG.debug("Empty value provided for {}'s cron, not scheduling", NotificationJob.class.getSimpleName());
            return;
        }

        LOG.debug("{}'s cron expression: {} - scheduling",
                NotificationJob.class.getSimpleName(), notificationJobCronExp);

        JobExecutionContext context = new JobExecutionContext(
                domain,
                NOTIFICATION_JOB,
                securityProperties.getAdminUser(),
                false);
        try {
            registerJob(
                    context,
                    NotificationJob.class,
                    notificationJobCronExp,
                    null);
        } catch (Exception e) {
            LOG.error("While loading {} instance", NotificationJob.class.getSimpleName(), e);
        }
    }

    private void scheduleSystemLoadReporter(final String domain) {
        LOG.debug("Registering {}", SystemLoadReporterJob.class);

        JobExecutionContext context = new JobExecutionContext(
                domain,
                StringUtils.uncapitalize(SystemLoadReporterJob.class.getSimpleName()),
                securityProperties.getAdminUser(),
                false);
        try {
            registerJob(
                    context,
                    SystemLoadReporterJob.class,
                    "0 * * * * ?",
                    null);
        } catch (Exception e) {
            LOG.error("While loading {} instance", SystemLoadReporterJob.class.getSimpleName(), e);
        }
    }

    @Override
    public void unload(final String domain) {
        AuthContextUtils.runAsAdmin(domain, () -> {
            // 1. jobs for SchedTasks
            Set<SchedTask> tasks = new HashSet<>(taskDAO.findAll(TaskType.SCHEDULED));
            tasks.addAll(taskDAO.findAll(TaskType.PULL));
            tasks.addAll(taskDAO.findAll(TaskType.PUSH));
            tasks.addAll(taskDAO.findAll(TaskType.MACRO));
            tasks.addAll(taskDAO.findAll(TaskType.LIVE_SYNC));

            tasks.forEach(task -> {
                LOG.debug("Unloading job for {} Task {} {}",
                        taskUtilsFactory.getInstance(task).getType(), task.getKey(), task.getName());

                try {
                    unregister(task);
                } catch (Exception e) {
                    LOG.error("While unloading job for task {}", task.getKey(), e);
                }
            });

            // 2. jobs for Reports
            reportDAO.findAll().forEach(report -> {
                LOG.debug("Unloading job for Report {} {}", report.getKey(), report.getName());

                try {
                    unregister(report);
                } catch (Exception e) {
                    LOG.error("While unloading job for report {}", report.getName(), e);
                }
            });
        });
    }
}
