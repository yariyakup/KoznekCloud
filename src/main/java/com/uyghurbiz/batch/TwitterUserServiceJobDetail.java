package com.uyghurbiz.batch;

import org.quartz.*;

/**
 * Created by Yari_Dev on 12/16/15.
 */
public class TwitterUserServiceJobDetail implements JobDetail {
    @Override
    public JobKey getKey() {
        return new JobKey("Yari Job");
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Class<? extends Job> getJobClass() {
        return TwitterUserServicesJob.class;
    }

    @Override
    public JobDataMap getJobDataMap() {
        return null;
    }

    @Override
    public boolean isDurable() {
        return false;
    }

    @Override
    public boolean isPersistJobDataAfterExecution() {
        return false;
    }

    @Override
    public boolean isConcurrentExectionDisallowed() {
        return false;
    }

    @Override
    public boolean requestsRecovery() {
        return false;
    }

    @Override
    public JobBuilder getJobBuilder() {
        return null;
    }

    @Override
    public Object clone() {

        return null;
    }

}
