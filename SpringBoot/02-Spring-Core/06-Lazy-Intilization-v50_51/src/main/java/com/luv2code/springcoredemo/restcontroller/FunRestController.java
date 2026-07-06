package com.luv2code.springcoredemo.restcontroller;

import com.luv2code.springcoredemo.coachUtil.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach coach;
    public FunRestController()
    {
        System.out.println("in constructor: "+this.getClass().getSimpleName());
    }
    @Autowired
    void doIt(@Qualifier("cricketCoach") Coach coach)
    {
        System.out.println("in method Doit()");
        this.coach=coach;
    }
    @GetMapping("/")
    public String fun()
    {
        return coach.getDailyWorkout();
    }

    /*

    After @Lazy only at TrackCoach
    Before hitting the URL
    o/p:    in constructor: BaseballCoach
            in constructor: CricketCoach
            in constructor: TennisCoach
            in constructor: FunRestController
            in method doIt()

     */

    /*
    After spring.main.lazy-initialization=true in Application.properties
    o/p: "Nothing"

    After Hitting url
    o/p:   in constructor: FunRestController
           in constructor: CricketCoach
           in method Doit()

     */



}
