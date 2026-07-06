package com.code4u.demo;

import com.code4u.demo.exceptions.StudentNotFoundException;
import com.code4u.demo.pojo.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionsHandler {

    //handling thrown custom excepitons
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception)
    {
        StudentErrorResponse stError=new StudentErrorResponse();
        stError.setStatusCode(HttpStatus.NOT_FOUND.value());
        stError.setMsg(exception.getMessage());
        stError.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(stError,HttpStatus.NOT_FOUND);
    }

    //handle generic exceptions
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleGenericExc(Exception exc)
    {
        StudentErrorResponse stError=new StudentErrorResponse();
        stError.setStatusCode(HttpStatus.BAD_REQUEST.value());
        stError.setMsg(exc.getMessage());
        stError.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(stError,HttpStatus.BAD_REQUEST);
    }
}
