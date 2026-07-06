package com.luv2code.springcoredemo.coachUtil;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice swinging the tennis bat for 10mins";
    }
}
