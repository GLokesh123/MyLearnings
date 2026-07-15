package com.code4u.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showLoginForm()
    {
        return "plain-login";
    }

    @GetMapping("/showMyNewFancyLoginPage")
    public String showFancyForm()
    {
        return "fancy-login";
    }

    //access denied page mapping
    @GetMapping("/access-denied")
    public String deniedPage()
    {
        return "access_denied";
    }

}
