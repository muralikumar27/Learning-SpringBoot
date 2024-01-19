package com.murali.restapibasics.controller;

import com.murali.restapibasics.entities.Employee;
import com.murali.restapibasics.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get-employee/{id}")
    public Employee getEmployeeDetailsById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("delete/{id}")
    public String deleteEmployeeDetails(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
        return "DELETION SUCCESSFUL...";
    }
}
