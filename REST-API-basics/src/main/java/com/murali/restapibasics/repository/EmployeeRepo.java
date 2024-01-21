package com.murali.restapibasics.repository;

import com.murali.restapibasics.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    /* Create our own functions will work in Spring Boot
     * spring will identify based on which field the data has to be retrieved
     * we can also add our own SQL queries using @Query */
    public Employee findByName(String name);
}
