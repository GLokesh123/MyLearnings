package com.luv2code.springcoredemo.restcontroller;

import com.code4u.springboot.demo.mycoolapp.springcoreDemo.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach coach;

    @Autowired
    void setCoach(Coach coach)
    {
        this.coach=coach;
    }

    @GetMapping("/")
    public String fun()
    {
        return coach.getDailyWorkout();
    }

    /*

    Spring will do

    1.Coach theCoach=new CricketCoach();
    2.FuncRestController cont=new FunRestController();
    3.cont.setCoach(theCoach);

     */

}
