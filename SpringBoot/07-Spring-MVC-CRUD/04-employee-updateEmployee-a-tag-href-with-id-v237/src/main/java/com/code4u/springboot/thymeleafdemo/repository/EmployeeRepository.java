package com.code4u.springboot.thymeleafdemo.repository;

import com.code4u.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
