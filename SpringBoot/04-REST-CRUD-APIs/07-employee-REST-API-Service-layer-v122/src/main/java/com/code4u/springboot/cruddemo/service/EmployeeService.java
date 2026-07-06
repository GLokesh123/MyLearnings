package com.code4u.springboot.cruddemo.service;

import com.code4u.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
