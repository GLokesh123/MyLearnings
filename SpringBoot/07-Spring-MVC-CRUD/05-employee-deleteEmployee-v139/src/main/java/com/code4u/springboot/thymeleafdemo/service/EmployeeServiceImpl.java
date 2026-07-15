package com.code4u.springboot.thymeleafdemo.service;


import com.code4u.springboot.thymeleafdemo.entity.Employee;
import com.code4u.springboot.thymeleafdemo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository empRepo;
    public EmployeeServiceImpl(EmployeeRepository empRepo)
    {
        this.empRepo=empRepo;
    }


    @Override
    public List<Employee> findAll() {

        return empRepo.findAll();
    }

    @Override
    @Transactional
    public Employee addEmp(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
          empRepo.deleteById(id);
    }

    @Override
    @Transactional
    public Employee updateEmp(Employee emp) {
       return empRepo.save(emp);
    }

    @Override
    public Employee empById(Integer id) {
        Optional<Employee> empOpt=empRepo.findById(id);
        Employee emp=null;
        if(empOpt.isPresent())
        {
            emp=empOpt.get();
        }
        else throw new RuntimeException("Employee with id "+id+" is not found");
        return emp;
    }

    @Override
    public List<Employee> findAllOrderByLastName() {
        return empRepo.findAllByOrderByLastNameAsc();
    }


}
