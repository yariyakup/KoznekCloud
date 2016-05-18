package com.uyghurbiz.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Yari_Dev on 12/16/15.
 */
@Configuration
@Import(TwitterServiceConfig.class)
@EnableScheduling
public class BatchConfig {

}
