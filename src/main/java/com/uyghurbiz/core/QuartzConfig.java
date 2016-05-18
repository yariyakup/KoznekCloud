package com.uyghurbiz.core;

import com.uyghurbiz.batch.TwitterUserServiceTrigger;
import com.uyghurbiz.batch.TwitterUserServicesJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by Yari_Dev on 12/16/15.
 */
@Configuration
@Import(CoreEngineConfig.class)
public class QuartzConfig {

    @Bean
    public TwitterUserServicesJob twitterUserServiceJob() {
        TwitterUserServicesJob job = new TwitterUserServicesJob();
        return job;
    }
    @Bean
    public JobDetail getJobDetail(){
        JobDetail jobDetail = newJob(TwitterUserServicesJob.class)
                .withDescription("TwitterJob")
                .withIdentity("TwitterServices").build();
        return jobDetail;

    }
    @Bean
    public Trigger getTrigger() {
        TwitterUserServiceTrigger trigger = new TwitterUserServiceTrigger();
        return trigger;
    }

    @Bean
    public Trigger cronTrigger() {
        CronTrigger trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("0/20 * * * * ?"))
                .build();
     return trigger;

    }
    @Bean
    public Scheduler twitterServiceScheduler() throws SchedulerException {
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();


        return scheduler;
    }


}
