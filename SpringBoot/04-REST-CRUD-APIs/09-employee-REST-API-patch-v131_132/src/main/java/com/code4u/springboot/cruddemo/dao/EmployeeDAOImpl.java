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

    @Override
    public Employee getEmp(int id) {
        Employee emp=entityManager.find(Employee.class,id);
        return emp;
    }

    /*@Override
    public void addEmployee(Employee emp) {
         entityManager.persist(emp);
    }*/

    @Override
    public Employee saveOrUpdateEmp(Employee emp) {
      return entityManager.merge(emp);
    }

    @Override
    public void deleteEmp(int id) {
        Employee theEmp=entityManager.find(Employee.class,id);
        entityManager.remove(theEmp);
    }

}
