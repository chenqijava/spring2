package com.test.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User createUser() {
        return  new User();
    }
}
