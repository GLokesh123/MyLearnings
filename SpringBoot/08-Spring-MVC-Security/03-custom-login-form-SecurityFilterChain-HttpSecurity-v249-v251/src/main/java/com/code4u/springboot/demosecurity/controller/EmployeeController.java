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

    @GetMapping("/showMyLoginPage")
    public String showLoginForm()
    {
        return "plain-login";
    }
}
