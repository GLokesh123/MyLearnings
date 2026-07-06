package com.code4u.cruddemo;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImp implements StudentDAO{
    @Override
    public Student findByLastName(String name) {
        TypedQuery<Student> theQuery=entityManager.createQuery("SELECT s FROM Student s WHERE s.lastName=:lName",Student.class);
        theQuery.setParameter("lName",name);
        List<Student> studentList=theQuery.getResultList();
        return studentList.getFirst();
    }

    @Override
    public List<Student> orderByLastName() {

        TypedQuery<Student> theQuery=entityManager.createQuery("from Student s order by s.lastName ",Student.class);
        List<Student> studentList=theQuery.getResultList();
        return studentList;
    }

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

    @Override
    public String findById(int id)
    {
       Student student= entityManager.find(Student.class,id);
       if(student==null) return "nothing there!";
       return student.toString();
    }

    @Override
    public List<Student> findAll()
    {
        TypedQuery<Student> theQuery=entityManager.createQuery("from Student",Student.class);
        List<Student> studentList=theQuery.getResultList();
        return studentList;
    }


}
