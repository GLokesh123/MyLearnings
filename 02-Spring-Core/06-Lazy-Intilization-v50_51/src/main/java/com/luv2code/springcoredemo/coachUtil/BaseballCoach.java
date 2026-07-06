package com.luv2code.springcoredemo.coachUtil;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class BaseballCoach implements Coach {
    public BaseballCoach()
    {
        System.out.println("in constructor: "+this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice home run for 12hrs";
    }
}
