package com.uyghurbiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Yari_Dev on 5/17/16.
 */
@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class EngineStart extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(EngineStart.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EngineStart.class);
    }
}
