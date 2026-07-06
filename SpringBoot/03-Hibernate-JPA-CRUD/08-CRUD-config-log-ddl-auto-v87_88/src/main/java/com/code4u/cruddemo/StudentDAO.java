package com.code4u.cruddemo;

import java.util.List;

public interface StudentDAO {
    public void save(Student theStudent);
    public String findById(int id);
    public List<Student> findAll();
    public List<Student> orderByLastName();
    public Student findByLastName(String name);
    public void updateStudentLastName(String lName,int id);
    public void deleteStudentsWithLastName(String name);
    public void deleteStudentWithId(int id);
}
