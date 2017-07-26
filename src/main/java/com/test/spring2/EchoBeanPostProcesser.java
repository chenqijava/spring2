package com.test.spring2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class EchoBeanPostProcesser implements BeanPostProcessor {
    // 这个在bean装配之后，init之前触发
    // 可以返回代理对象
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("____________postProcessBeforeInitialization_________-" + o);
        return o;
    }

    // init 之后触发
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("____________postProcessAfterInitialization_________-" + o);
        return o;
    }
}
