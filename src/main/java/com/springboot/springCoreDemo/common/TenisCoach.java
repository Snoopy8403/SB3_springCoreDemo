package com.springboot.springCoreDemo.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{

    public TenisCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }

    //define our init method
    @PostConstruct
    public void doMyStartupStaff(){
        System.out.println("This is my startupStaff " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStaff(){
        System.out.println("This is my cleanupStaff " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "She is a TenisCoach";
    }
}
