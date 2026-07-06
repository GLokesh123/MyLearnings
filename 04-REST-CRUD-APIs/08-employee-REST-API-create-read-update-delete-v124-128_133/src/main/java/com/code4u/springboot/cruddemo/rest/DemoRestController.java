package com.code4u.springboot.cruddemo.rest;

import com.code4u.springboot.cruddemo.entity.Employee;
import com.code4u.springboot.cruddemo.dao.EmployeeDAO;
import com.code4u.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/employees")
    public Employee addEmp(@RequestBody Employee emp)
    {
        Employee theEmp=employeeService.updateEmp(emp);
        if(theEmp==null) throw new RuntimeException("given data is not correct");
        return theEmp;
    }

    @PutMapping("/employees")
    public Employee updateEmp(@RequestBody Employee emp)
    {
        Employee theEmp=employeeService.updateEmp(emp);
        if(theEmp==null) throw new RuntimeException("given data is not correct");
        return theEmp;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmp(@PathVariable int id)
    {
        employeeService.deleteEmp(id);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmp(@PathVariable int id)
    {
        return employeeService.getEmp(id);
    }

}
