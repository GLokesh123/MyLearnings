package com.luv2code.springcoredemo.coachUtil;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {



    public String getDailyWorkout()
    {
        return "practice fast bowling for 15 mins";
    }
}
