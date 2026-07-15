package com.code4u.springboot.thymeleafdemo.controller;

import com.code4u.springboot.thymeleafdemo.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;


    //mapping to requesting a form
    @GetMapping("/student-form")
    public String formDisplay(Model model)
    {
        //create student object
        Student student=new Student();

        //add student obj to model
        model.addAttribute("student",student);

        //add countries to model
        model.addAttribute("countries",countries);

        //add languages to model
        model.addAttribute("languages",languages);

        //add systems to model
        model.addAttribute("systems",systems);

        return "student_form";
    }




    @PostMapping("/student-response")
    public String response(@ModelAttribute("student") Student student)
    {
        return "student_Response";
    }
}

