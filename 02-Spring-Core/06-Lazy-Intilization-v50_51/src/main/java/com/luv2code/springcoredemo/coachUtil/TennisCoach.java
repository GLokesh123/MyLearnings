package com.luv2code.springcoredemo.coachUtil;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach{
    public TennisCoach()
    {
        System.out.println("in constructor: "+this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice swinging the tennis bat for 10mins";
    }
}
