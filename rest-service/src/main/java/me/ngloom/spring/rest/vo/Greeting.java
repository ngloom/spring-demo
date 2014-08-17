/**
 * Project  : rest-service
 * Package  : main.java
 * FileName : Greeting.java
 * Copyright (c) 2014, Baidu Inc. All rights reserved.
 */
package me.ngloom.spring.rest.vo;


/**
 * @description : Greeting
 * 
 * @author      : WuNing
 * @email       : Wuning01@baidu.com
 * @date        : 2014年8月17日 下午3:53:22
 */

public class Greeting {
    
    private long id = 0L;
    private String name = "default";
    /**
     * @description: 
     *
     * @param id
     * @param name
     */
    public Greeting(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
