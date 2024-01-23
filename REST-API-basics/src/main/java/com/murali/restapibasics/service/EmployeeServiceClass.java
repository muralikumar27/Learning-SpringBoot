package com.murali.restapibasics.service;

import com.murali.restapibasics.entities.Employee;
import com.murali.restapibasics.errors.EmployeeNotFoundException;
import com.murali.restapibasics.errors.EmployeeAlreadyExsitException;
import com.murali.restapibasics.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceClass implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public void saveEmployee(Employee employee) throws EmployeeAlreadyExsitException {
         int id = employee.getId();
         if(employeeRepo.existsById(id)){
            throw new EmployeeAlreadyExsitException("ID already exists...");
         }
         employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {

        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {

        EmployeeNotFoundException employeeNotFoundException;
        Optional<Employee>employee=employeeRepo.findById(id);
        if(!employee.isPresent()){
            throw new EmployeeNotFoundException("Employee Data not Found for ID "+id);
        }
        return employee.get();
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public void updateDetails(int id,Employee employee) throws EmployeeNotFoundException {
        //getting already existing employee data from DB for corresponding ID
        Employee empFromDB;
        Optional<Employee>emp=employeeRepo.findById(id);
        if(!emp.isPresent()){
            throw new EmployeeNotFoundException("Employee Data not Found for ID "+id);
        }
        empFromDB = emp.get();
        //Checking if any field from request body is empty
        //if any field is empty or null means we do not want update that field
        //if a field is not means we will replace the field in already existing object
        //after replacing the particular field we can save the data in DB
        if(Objects.nonNull(employee.getName()) && !"".equals(employee.getName())){
            empFromDB.setName(employee.getName());
        }
        if(Objects.nonNull(employee.getAddress()) && !"".equals(employee.getAddress())){
            empFromDB.setAddress(employee.getAddress());
        }
        if(Objects.nonNull(employee.getRole()) && !"".equals(employee.getRole())){
            empFromDB.setRole(employee.getRole());
        }

        employeeRepo.save(empFromDB);
    }

    @Override
    public Employee findEmployeeByName(String name) {
        return employeeRepo.findByName(name);
    }
}
