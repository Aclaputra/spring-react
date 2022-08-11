package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /**
     * 
     * @param name
     * @return
     */
    Employee findByName(String name);
}