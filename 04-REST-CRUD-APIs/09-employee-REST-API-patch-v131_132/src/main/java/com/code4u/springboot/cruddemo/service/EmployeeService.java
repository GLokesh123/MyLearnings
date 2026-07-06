package com.code4u.springboot.cruddemo.service;

import com.code4u.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee addEmp(Employee emp);
    void deleteById(int id);
    Employee updateEmp(Employee emp);
    Employee empById(int id);
}
