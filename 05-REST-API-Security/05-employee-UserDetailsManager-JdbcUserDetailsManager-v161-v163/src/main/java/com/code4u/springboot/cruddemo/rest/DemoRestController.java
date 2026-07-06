package com.code4u.springboot.cruddemo.rest;

import com.code4u.springboot.cruddemo.entity.Employee;
import com.code4u.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private EmployeeService employeeService;
    private JsonMapper jsonMapper;

    //constructor injection of employeeDAOImpl
    @Autowired
    public DemoRestController(EmployeeService employeeService,JsonMapper jsonMapper)
    {
        this.employeeService=employeeService;
        this.jsonMapper=jsonMapper;
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
    public String deleteEmp(@PathVariable int id)
    {
        Employee emp=employeeService.empById(id);
        if(emp==null) return "emp with id "+id+" not found!";
        employeeService.deleteById(id);
        return "emp with id "+id+" deleted!";
    }

    @GetMapping("/employees/{id}")
    public Employee getEmp(@PathVariable int id)
    {
        return employeeService.empById(id);
    }

    @PatchMapping("/employees/{id}")
    public Employee patchEmp(@PathVariable int id, @RequestBody Map<String,Object> jsonData)
    {
        Employee temp=employeeService.empById(id);
        if(temp==null)
            throw new RuntimeException("emp not found");
        if(jsonData.containsKey("id")) throw new RuntimeException("id included in the request body! which creates new emp rather update existing emp");
        temp=jsonMapper.updateValue(temp,jsonData);
        return employeeService.updateEmp(temp);
    }

}
