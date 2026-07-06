package com.code4u.springboot.demo.mycoolapp.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String fun()
    {
        return "Hello world";
    }

    @GetMapping("/autoRun")
    public String running()
    {
        return "auto-running successfully! Voila";
    }

    @GetMapping("/fortune")
    public String fortune()
    {
        return "Today is a Lucky day as Stock market rose by ~2%";
    }

}
