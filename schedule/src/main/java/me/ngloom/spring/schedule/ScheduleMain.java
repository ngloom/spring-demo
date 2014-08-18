/**
 * Project  : schedule
 * Package  : me.ngloom.spring.schedule
 * FileName : SechduleMain.java
 * Copyright (c) 2014, Baidu Inc. All rights reserved.
 */
package me.ngloom.spring.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/**
 * @description : SechduleMain
 * 
 * @author      : WuNing
 * @email       : Wuning01@baidu.com
 * @date        : 2014年8月18日 上午7:54:03
 */

@ComponentScan
@EnableAutoConfiguration
public class ScheduleMain {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleMain.class,args);
        
    }
}
