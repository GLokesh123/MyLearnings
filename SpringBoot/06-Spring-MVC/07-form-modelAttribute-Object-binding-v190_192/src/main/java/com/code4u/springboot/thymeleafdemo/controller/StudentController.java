package com.code4u.springboot.thymeleafdemo.controller;

import com.code4u.springboot.thymeleafdemo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    //mapping to requesting a form
    @RequestMapping("/student-form")
    public String formDisplay(Model model)
    {
        //create student object
        Student student=new Student();

        //add student obj to model
        model.addAttribute("student",student);

        return "student_form";
    }




    @PostMapping("/student-response")
    public String response(@ModelAttribute("student") Student student)
    {
        return "student_Response";
    }
}

