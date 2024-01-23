package com.murali.restapibasics.service;

import com.murali.restapibasics.entities.Employee;
import com.murali.restapibasics.errors.EmployeeNotFoundException;
import com.murali.restapibasics.errors.EmployeeAlreadyExsitException;

import java.util.List;

public interface EmployeeService {
    public void saveEmployee(Employee employee) throws EmployeeAlreadyExsitException;
    public List<Employee> getEmployee();

    public Employee getEmployeeById(int id) throws EmployeeNotFoundException;
    public void deleteEmployee(int id);

    public void updateDetails(int id,Employee employee) throws EmployeeNotFoundException;

    public Employee findEmployeeByName(String name);
}
