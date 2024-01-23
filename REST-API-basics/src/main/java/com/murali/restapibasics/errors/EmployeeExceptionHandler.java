package com.murali.restapibasics.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import com.murali.restapibasics.entities.Error;

@ControllerAdvice
@ResponseStatus
public class EmployeeExceptionHandler {
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity <Error> getEmployeeErrorHandler(EmployeeNotFoundException e, WebRequest request){
        Error error=new Error(e.getMessage(),HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(EmployeeAlreadyExsitException.class)
    public ResponseEntity <Error> setEmployeeErrorHandler(EmployeeAlreadyExsitException e, WebRequest request){
        Error error = new Error(e.getMessage(),HttpStatus.CONFLICT);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }
}
