/**
 * Project  : rest-service
 * Package  : main.java
 * FileName : GreetingMain.java
 * Copyright (c) 2014, Baidu Inc. All rights reserved.
 */
package me.ngloom.spring.rest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/**
 * @description : GreetingMain
 * 
 * @author      : WuNing
 * @email       : Wuning01@baidu.com
 * @date        : 2014年8月17日 下午3:53:38
 */

@ComponentScan
@EnableAutoConfiguration
public class GreetingMain {
    
    public static void main(String[] args) {
        
        SpringApplication.run(GreetingMain.class, args);
        
    }
}
