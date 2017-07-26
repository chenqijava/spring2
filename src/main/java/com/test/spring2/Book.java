package com.test.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//b. 使用Autowired
@Component
public class Book {
    //@Autowired
//    @Resource
    private ApplicationContext applicationContext;

    public void show() {
        System.out.println(applicationContext.getClass());
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext)
    {
        this.applicationContext = applicationContext;
    }
}
