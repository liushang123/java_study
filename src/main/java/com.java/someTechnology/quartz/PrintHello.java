package com.java.someTechnology.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mi on 17-8-15.
 */
public class PrintHello implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("hello quartz " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));
    }
}
