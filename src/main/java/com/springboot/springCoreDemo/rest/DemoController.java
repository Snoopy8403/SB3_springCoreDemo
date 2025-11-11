package com.springboot.springCoreDemo.rest;

import com.springboot.springCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    // Constructor injection
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In contructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    //Setter injection
    //@Autowired
    //public void setCoach(Coach theCoach){
    //  myCoach = theCoach;
    //}

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
