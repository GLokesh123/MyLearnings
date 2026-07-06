package com.luv2code.springcoredemo.coachUtil;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice home run for 12hrs";
    }
}
