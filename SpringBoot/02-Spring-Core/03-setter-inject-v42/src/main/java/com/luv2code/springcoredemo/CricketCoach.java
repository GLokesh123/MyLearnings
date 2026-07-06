package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements com.code4u.springboot.demo.mycoolapp.springcoreDemo.Coach {


    @Override
    public String getDailyWorkout()
    {
        return "practice fast bowling for 15 mins from setter inject";
    }
}
