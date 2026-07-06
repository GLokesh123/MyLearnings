package com.luv2code.springcoredemo.restcontroller;

import com.luv2code.springcoredemo.coachUtil.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach theCoach;
    private Coach theAnotherCoach;

    @Autowired
    DemoRestController(@Qualifier("cricketCoach") Coach theCoach,@Qualifier("cricketCoach") Coach theAnotherCoach)
    {
        this.theCoach=theCoach;
        this.theAnotherCoach=theAnotherCoach;
    }
    @GetMapping("/")
    public String fun()
    {
        return (theCoach==theAnotherCoach)?"Singleton Scope":"Prototype Scope";
    }

}
