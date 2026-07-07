package com.code4u.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    //mapping to requesting a form
    @RequestMapping("/hello-form")
    public String formDisplay()
    {
        return "hello_form";
    }

    //form response
    @RequestMapping("/hello-response")
    public String resp()
    {
        return "hello";
    }
}
