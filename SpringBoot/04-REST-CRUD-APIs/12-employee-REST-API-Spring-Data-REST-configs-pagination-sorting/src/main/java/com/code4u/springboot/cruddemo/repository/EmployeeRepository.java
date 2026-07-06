package com.code4u.springboot.cruddemo.repository;

import com.code4u.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

//http://localhost:8080/api/members?page=0&size=5&sort=lastName