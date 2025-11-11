package com.springboot.springCoreDemo.common;

public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is a swimCoach class";
    }
}
