package com.code4u.springboot.demo.mycoolapp.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
     @Value("${movie.name}")
     private String name;

    @Value("${movie.genre}")
    private String genre;

    @GetMapping("/")
    public String fun()
    {
        return name+" is a "+genre+" movie";
    }



}
