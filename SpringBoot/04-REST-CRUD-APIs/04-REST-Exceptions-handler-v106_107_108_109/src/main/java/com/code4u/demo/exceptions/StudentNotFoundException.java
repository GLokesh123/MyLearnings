package com.code4u.demo.exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String msg)
    {
        super(msg);
    }
}
