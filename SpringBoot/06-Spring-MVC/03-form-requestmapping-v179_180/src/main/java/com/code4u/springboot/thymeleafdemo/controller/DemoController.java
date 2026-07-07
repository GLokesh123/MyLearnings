package com.code4u.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String hello(Model model)
    {
        System.out.println("it working........");
        model.addAttribute("theData",java.time.LocalDateTime.now());
        return "hello";
    }


}
