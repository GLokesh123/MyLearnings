package com.code4u.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import java.util.List;


@RestController
@RequestMapping("/api")
public class DemoRESTController {
    public List<Student> stList;
    @PostConstruct
    public void doIt()
    {
        stList=new ArrayList<>();
        stList.add(new Student("loki","gubbala"));
        stList.add(new Student("raghu","guna"));
        stList.add(new Student("tarun","kumar"));
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        return stList.get(studentId);
    }

    @GetMapping("/")
    public String start()
    {
        return "its working!";
    }
}
