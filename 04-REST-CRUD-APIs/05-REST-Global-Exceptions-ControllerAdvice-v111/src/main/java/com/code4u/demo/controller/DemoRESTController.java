package com.code4u.demo.controller;

import com.code4u.demo.exceptions.StudentNotFoundException;
import com.code4u.demo.pojo.Student;
import com.code4u.demo.pojo.StudentErrorResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;


@RestController
@RequestMapping("/api")
public class DemoRESTController {

    public List<Student> stList;

    //loading common data required by most of the http requests
    @PostConstruct
    public void doOnce()
    {
        stList=new ArrayList<>();
        stList.add(new Student("loki","gubbala"));
        stList.add(new Student("raghu","guna"));
        stList.add(new Student("tarun","kumar"));
    }


    //getting student details based on given id
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        if(studentId>=stList.size()||studentId<0)
        {
            throw new StudentNotFoundException("Student is not Found with id "+studentId);
        }
        return stList.get(studentId);
    }

    //for checking whether rest controller is working or not!
    @GetMapping("/")
    public String start()
    {
        return "its working!";
    }


}
