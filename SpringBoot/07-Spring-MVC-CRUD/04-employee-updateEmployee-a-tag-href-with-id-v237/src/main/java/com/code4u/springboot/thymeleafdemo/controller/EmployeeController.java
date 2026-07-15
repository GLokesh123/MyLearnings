package com.code4u.springboot.thymeleafdemo.controller;

import com.code4u.springboot.thymeleafdemo.entity.Employee;
import com.code4u.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @GetMapping("/list")
    public String getAll(Model model)
    {

       // List<Employee> theEmployees=employeeService.findAll();
        List<Employee> theEmployees=employeeService.findAllOrderByLastName();
        System.out.println(theEmployees);
        model.addAttribute("employees",theEmployees);
        return "employees/list_employees";
    }

    @GetMapping("/save-form")
    public String saveForm(Model model)
    {
        model.addAttribute("employee",new Employee());
        return "employees/save_form";

    }
    @PostMapping("/save")
    public String saveEmp(@ModelAttribute("employee") Employee emp)
    {
        employeeService.addEmp(emp);
        return "redirect:/employees/list";
    }

    @GetMapping("/update-form/{id}")
    public String updateForm(@PathVariable int id, Model model)
    {
        model.addAttribute("employee",employeeService.empById(id));
        return "employees/update_form";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("employee") Employee emp)
    {
        System.out.println("put method got hit!!");
        employeeService.updateEmp(emp);
        return "redirect:/employees/list";
    }
}
