package com.test.spring2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// ApplicationConetext依赖注入有三种
// a. 实现接口ApplicationContextAware
@Component
public class User implements ApplicationContextAware{

    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void show() {
        System.out.println(applicationContext.getClass());
    }
}
