package com.luv2code.springcoredemo.restcontroller;



import com.luv2code.springcoredemo.Coach;
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

    /*
    cricketCoach bean lifecycle:

    intialization
    o/p: I am in constructor

    After Initializatoin before ready to use
    o/p:I am in StartUp

    After termination of application
    o/p: I am in CleanUp

     */
}
