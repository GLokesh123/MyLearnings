package com.code4u.springboot.cruddemo.dao;

import com.code4u.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    EntityManager entityManager;

    //constructor injection of entity manager
    public EmployeeDAOImpl(EntityManager entityManager)
    {
        this.entityManager=entityManager;
    }

    //method to get all employees from the database
    @Override
    public List<Employee> getAll() {
        TypedQuery<Employee> theEmps=entityManager.createQuery("FROM Employee",Employee.class);
        return theEmps.getResultList();
    }
}
