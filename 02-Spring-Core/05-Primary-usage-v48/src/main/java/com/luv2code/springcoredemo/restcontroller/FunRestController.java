package com.luv2code.springcoredemo.restcontroller;

import com.luv2code.springcoredemo.coachUtil.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach coach;

    @Autowired
    FunRestController(@Qualifier("cricketCoach") Coach coach)
    {
        this.coach=coach;
    }
    @GetMapping("/")
    public String fun()
    {
        return coach.getDailyWorkout();
    }

    /*
    Qualifier(cricketCoach) has more priority than Primary TennisCoach
     */

}
