package com.murali.restapibasics.errors;


import org.springframework.stereotype.Component;


public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String messsage){
        super(messsage);
    }
}
