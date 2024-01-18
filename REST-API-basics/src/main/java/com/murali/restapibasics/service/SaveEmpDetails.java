package com.murali.restapibasics.service;

import com.murali.restapibasics.entities.Employee;
import com.murali.restapibasics.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveEmpDetails implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}