package com.springboot.springCoreDemo.rest;

import com.springboot.springCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    // Constructor injection
    @Autowired
    public DemoController(
            @Qualifier("tenisCoach") Coach theCoach,
            @Qualifier("tenisCoach") Coach otherCoach) {
        System.out.println("In contructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = otherCoach;
    }

    //Setter injection
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach: " +  (myCoach == anotherCoach);
    }
}
