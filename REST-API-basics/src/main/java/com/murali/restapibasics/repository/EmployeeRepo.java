package com.murali.restapibasics.repository;

import com.murali.restapibasics.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
