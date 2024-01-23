package com.murali.restapibasics.errors;

public class EmployeeAlreadyExsitException extends Exception{
    public EmployeeAlreadyExsitException(String message){
        super(message);
    }
}
