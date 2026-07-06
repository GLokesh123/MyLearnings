package com.code4u.springboot.cruddemo.service;

import com.code4u.springboot.cruddemo.dao.EmployeeDAO;
import com.code4u.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO)
    {
        this.employeeDAO=employeeDAO;
    }

    @Override
    public List<Employee> findAll() {

        return employeeDAO.getAll();
    }

    @Override
    @Transactional
    public Employee addEmp(Employee emp) {
        return employeeDAO.saveOrUpdateEmp(emp);
    }

    @Override
    @Transactional
    public void deleteEmp(int id) {
          employeeDAO.deleteEmp(id);
    }

    @Override
    @Transactional
    public Employee updateEmp(Employee emp) {
       return employeeDAO.saveOrUpdateEmp(emp);
    }

    @Override
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }


}
