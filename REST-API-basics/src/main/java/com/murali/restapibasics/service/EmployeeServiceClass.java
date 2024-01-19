package com.murali.restapibasics.service;

import com.murali.restapibasics.entities.Employee;
import com.murali.restapibasics.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceClass implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
