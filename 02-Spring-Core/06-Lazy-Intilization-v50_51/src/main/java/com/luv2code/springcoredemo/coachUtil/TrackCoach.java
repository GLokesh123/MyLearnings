package com.luv2code.springcoredemo.coachUtil;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{
    public TrackCoach()
    {
        System.out.println("in constructor: "+this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "track your scorecard!";
    }
}
