/**
 * Project  : rest-service
 * Package  : main.java
 * FileName : GreetController.java
 * Copyright (c) 2014, Baidu Inc. All rights reserved.
 */
package me.ngloom.spring.rest.controller;

import java.util.concurrent.atomic.AtomicLong;

import me.ngloom.spring.rest.vo.Greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description : GreetController
 * 
 * @author      : WuNing
 * @email       : Wuning01@baidu.com
 * @date        : 2014年8月17日 下午3:53:31
 */

@RestController
public class GreetingController {

    AtomicLong counter = new AtomicLong(0);

    @RequestMapping("/hello")
    public Greeting hello(
            @RequestParam(value = "name", required = false, defaultValue = "tom") String name) {
        return new Greeting(counter.incrementAndGet(), name);
    }

}
