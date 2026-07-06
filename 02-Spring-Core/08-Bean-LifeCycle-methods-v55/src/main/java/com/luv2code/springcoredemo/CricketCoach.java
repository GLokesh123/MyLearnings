package com.luv2code.springcoredemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @PostConstruct
    public void doMyStartUpStuff()
    {
        System.out.println("I am in StartUp");
    }
   public CricketCoach()
   {
       System.out.println("I am in intialization");
   }
    @Override
    public String getDailyWorkout()
    {
        return "practice fast bowling for 15 mins";
    }

    @PreDestroy
    public void doMyCleanUpStuff()
    {
        System.out.println("I am in CleanUp");
    }
}
