package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.Employee;
import com.spring.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {
    /**
     * 
     */
    @Autowired
    private EmployeeRepository repository;

    /**
     * 
     * @param employee
     * @return
     */
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
    /**
     * 
     * @param employee
     * @return
     */
    public List<Employee> saveEmployees(List<Employee> employee) {
        return repository.saveAll(employee);
    }
    public List<Employee> getEmployees() {
        return repository.findAll();
    }
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * findByName not listed in library we have to make custom
     * by making new method in ProductRepository
     * @param name
     * @return
     */
    public Employee getEmployeeByName(String name) {
        return repository.findByName(name);
    }
    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "employee removed !! " + id;
    }
    public Employee updateEmployee(Employee employee) {
        Employee existingEmpoyee = repository.findById(employee.getId()).orElse(null);
        existingEmpoyee.setName(employee.getName());
        existingEmpoyee.setPosition(employee.getPosition());
        existingEmpoyee.setSalary(employee.getSalary());
        return repository.save(existingEmpoyee);
    }
}