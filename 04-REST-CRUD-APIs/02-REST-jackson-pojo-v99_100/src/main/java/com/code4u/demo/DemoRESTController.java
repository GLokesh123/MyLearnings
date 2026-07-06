package com.code4u.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRESTController {
    @GetMapping("/students")
    public List<Student> hello()
    {
        List<Student> stList=new ArrayList<>();
        stList.add(new Student("loki","gubbala"));
        stList.add(new Student("raghu","guna"));
        stList.add(new Student("tarun","kumar"));
        return stList;
    }

    @GetMapping("/")
    public String doIt()
    {
        return "its working!";
    }
}
