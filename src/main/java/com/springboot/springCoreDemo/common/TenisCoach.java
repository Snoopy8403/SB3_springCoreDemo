package com.springboot.springCoreDemo.common;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TenisCoach implements Coach{

    public TenisCoach(){
        System.out.println("In contructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "She is a TenisCoach";
    }
}
