package com.murali.restapibasics.controller;

import com.murali.restapibasics.entities.Employee;
import com.murali.restapibasics.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public void saveEmployeeDetails(@RequestBody Employee employee){
         employeeService.saveEmployee(employee);
    }

    @GetMapping("/get-details")
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployee();
    }
}
