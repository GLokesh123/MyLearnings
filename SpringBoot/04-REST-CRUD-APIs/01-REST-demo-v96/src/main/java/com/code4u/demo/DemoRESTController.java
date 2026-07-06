package com.code4u.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRESTController {
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World, 20 june 2026";
    }

    @GetMapping("/")
    public String doIt()
    {
        return "its working!";
    }
}
