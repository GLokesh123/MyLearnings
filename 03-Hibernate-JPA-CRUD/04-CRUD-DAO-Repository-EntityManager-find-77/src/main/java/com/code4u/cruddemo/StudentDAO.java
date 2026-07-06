package com.code4u.cruddemo;

public interface StudentDAO {
    public void save(Student theStudent);
    public String findById(int id);
}
