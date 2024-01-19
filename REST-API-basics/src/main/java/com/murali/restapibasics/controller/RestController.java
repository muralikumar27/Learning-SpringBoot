package com.murali.restapibasics.controller;

import com.murali.restapibasics.entities.Employee;
import com.murali.restapibasics.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public void saveEmployeeDetails(@RequestBody Employee employee){
         employeeService.saveEmployee(employee);
    }
}
