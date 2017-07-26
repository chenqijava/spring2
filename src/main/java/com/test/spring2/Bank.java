package com.test.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

// c. 只能有一个构造函数， 参数必须在容器里
@Component
public class Bank {
    private ApplicationContext applicationContext;

//    public Bank(ApplicationContext applicationContext){
//        this.applicationContext = applicationContext;
//    }

    public Bank(ApplicationContext applicationContext, User user){
        this.applicationContext = applicationContext;
    }

    public void show() {
        System.out.println(applicationContext.getClass());
    }
}

