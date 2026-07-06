package com.code4u.springboot.demo.mycoolapp.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String fun()
    {
        return "Hello world from Properties Demo";
        // hit "http://localhost:7070/my-silly-app/"
    }



}
