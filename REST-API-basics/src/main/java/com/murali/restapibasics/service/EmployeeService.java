package com.murali.restapibasics.service;

import com.murali.restapibasics.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getEmployee();

    public Employee getEmployeeById(int id);
    public void deleteEmployee(int id);

    public void updateDetails(int id,Employee employee);
}
