package com.rizvi.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rizvi.spring.entities.Employee;
 
 @Repository
public interface EmployeeRepository 
        extends JpaRepository<Employee, Long> {
 
}
