package com.verizon.springdemocron;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduledTaskConfig {


    @Scheduled(cron = "${cron.job.expression}")
    public void printHelloWorld() {
        System.out.println("Hello, World!");
    }
}
