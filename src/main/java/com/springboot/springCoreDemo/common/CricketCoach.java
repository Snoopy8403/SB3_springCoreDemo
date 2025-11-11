package com.springboot.springCoreDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast";
    }
}
