package com.springboot.springCoreDemo.config;

import com.springboot.springCoreDemo.common.Coach;
import com.springboot.springCoreDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
