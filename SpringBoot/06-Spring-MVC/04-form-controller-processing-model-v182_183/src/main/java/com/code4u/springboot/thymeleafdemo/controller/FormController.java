package com.code4u.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping("/hello-response-v1")
    public String resp1()
    {
        return "hello";
    }

    // i created this mapping to pass html file by given model data
    //which is processed within the controller before reaching the html
    @RequestMapping("/hello-response-v2")
    public String resp2(HttpServletRequest req, Model model)
    {
        String str= req.getParameter("userName");
        str=str.toUpperCase();
        model.addAttribute("name",str);
        return "hello";
    }
}
