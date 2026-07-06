package com.code4u.springboot.cruddemo.rest;

import com.code4u.springboot.cruddemo.entity.Employee;
import com.code4u.springboot.cruddemo.dao.EmployeeDAO;
import com.code4u.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private EmployeeService employeeService;

    //constructor injection of employeeDAOImpl
    @Autowired
    public DemoRestController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }

    //checking start endpoint
    @GetMapping("/")
    public String start()
    {
        return "Its Working!";
    }

    //expoxing /employees to get all employees
    @GetMapping("/employees")
    public List<Employee> getAll()
    {
        return employeeService.findAll();
    }

}
