package com.java.someTechnology.quartz;

/**
 * Created by mi on 17-8-15.
 */

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.DecimalFormat;

public class QuartzTest {
    public static void main(String[] args) {
        String a = "11.222333";
        DecimalFormat df = new DecimalFormat("#.00");
        double lon = Double.parseDouble(a);
        System.out.println(df.format(lon));
        QuartzTest quartzTest = new QuartzTest();
        quartzTest.startSchedule();
    }

    public void startSchedule() {
        try {
            JobDetail jobDetail = JobBuilder.newJob(PrintHello.class).withIdentity("job1_1", "jGroup1").build();
            SimpleScheduleBuilder builder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3).repeatForever();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1_1", "tGtoup1").startNow().withSchedule(builder).build();
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            scheduler.scheduleJob(jobDetail, trigger);

            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {

            }
            scheduler.shutdown();

        } catch (SchedulerException e) {

        }
    }
}
