/**
 * Project  : schedule
 * Package  : me.ngloom.spring.schedule
 * FileName : ScheduledTasks.java
 * Copyright (c) 2014, Baidu Inc. All rights reserved.
 */
package me.ngloom.spring.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @description : ScheduledTasks
 * 
 * schedule task with 3 schedule tasks
 * 
 * @author      : WuNing
 * @email       : Wuning01@baidu.com
 * @date        : 2014年8月18日 上午7:49:30
 */

@EnableScheduling
@Component
public class ScheduledTask {
    
    // repeated every 1 sec
    @Scheduled(fixedRate=1000L)
    public void repeatedTask() {
        
        System.out.println(Thread.currentThread() + "Short Schedule The time is now :" + new Date());
        
    }
    
    // repeated every 5 secs
    @Scheduled(fixedRate=5000L)
    public void repeatedTask2() {
        
        System.out.println(Thread.currentThread() +  "Long Schedule The time is now :" + new Date());
        
    }
    
    // repeated every 7 second
    @Scheduled(cron="*/7 * * * * *")
    public void repeatedTask3() {
        System.out.println(Thread.currentThread() +  "Cron Schedule The time is now :" + new Date());
    }
    
    
}
