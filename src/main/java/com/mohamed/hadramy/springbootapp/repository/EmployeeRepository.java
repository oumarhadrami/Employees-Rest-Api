package com.mohamed.hadramy.springbootapp.repository;

import com.mohamed.hadramy.springbootapp.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
