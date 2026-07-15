package com.code4u.springboot.demosecurity.controller;

import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String home()
    {
        return "home";
    }


    @GetMapping("/leaders")
    public String leaders()
    {
        return "leaders";
    }
    @GetMapping("/admin")
    public String admin()
    {
        return "admin";
    }




}
