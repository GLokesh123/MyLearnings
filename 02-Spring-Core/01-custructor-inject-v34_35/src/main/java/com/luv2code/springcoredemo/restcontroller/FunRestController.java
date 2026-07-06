package com.luv2code.springcoredemo.restcontroller;

import com.code4u.springboot.demo.mycoolapp.springcoreDemo.Coach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach coach;

    FunRestController(Coach coach)
    {
        this.coach=coach;
    }
    @GetMapping("/")
    public String fun()
    {
        return coach.getDailyWorkout();
    }

}
