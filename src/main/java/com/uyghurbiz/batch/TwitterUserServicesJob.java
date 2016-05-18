package com.uyghurbiz.batch;

import com.uyghurbiz.core.CoreEngineConfig;
import com.uyghurbiz.service.TwitterUserServices;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

/**
 * Created by Yari_Dev on 12/16/15.
 */
@Import(CoreEngineConfig.class)
public class TwitterUserServicesJob implements Job {

    @Autowired
    TwitterUserServices userServices;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        System.out.println("Hello" + userServices);

    }
}
