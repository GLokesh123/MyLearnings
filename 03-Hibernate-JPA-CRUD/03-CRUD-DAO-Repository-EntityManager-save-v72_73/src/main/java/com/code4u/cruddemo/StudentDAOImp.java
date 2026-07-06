package com.code4u.cruddemo;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImp implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImp(EntityManager theEnityManager)
    {
        entityManager=theEnityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
