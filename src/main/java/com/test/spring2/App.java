package com.test.spring2;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.test.spring2");
        //System.out.println(context.getBean(User.class));
        System.out.println(context.getBean("user", User.class));
        context.getBean(Bank.class).show();
        System.out.println(context.getBean("aa"));
        //System.out.println( "Hello World!" );
        context.close();
    }
}
