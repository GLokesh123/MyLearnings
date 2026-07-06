package com.code4u.springboot.cruddemo.dao;

import com.code4u.springboot.cruddemo.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> getAll();
}
