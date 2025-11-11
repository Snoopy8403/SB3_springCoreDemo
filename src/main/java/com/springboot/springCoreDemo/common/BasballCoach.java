package com.springboot.springCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasballCoach implements Coach {

    public BasballCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "He is a basballCoach";
    }
}
