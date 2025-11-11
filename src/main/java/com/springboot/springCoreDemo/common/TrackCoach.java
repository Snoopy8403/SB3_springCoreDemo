package com.springboot.springCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is a TrackCoach";
    }
}
