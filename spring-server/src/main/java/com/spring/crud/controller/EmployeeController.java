package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.Employee;
import com.spring.crud.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // POST

    /**
     * addEmployee function
     * @param employee
     * @return
     */
    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }
    /**
     * addEmployees function
     * @param employee
     * @return
     */
    @PostMapping("/addemployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employee) {
        return service.saveEmployees(employee);
    }

    // GET

    /**
     * 
     * @return
     */
    @GetMapping("/employees")
    public List<Employee> findAlEmployees() {
        return service.getEmployees();
    }
    /**
     * 
     * @param id
     * @return
     */
    @GetMapping("/employeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    /**
     * 
     * @param name
     * @return
     */
    @GetMapping("/employee/{name}")
    public Employee findEmployeeByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    // PUT

    /**
     * updateProduct function
     * @param product
     * @return
     */
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    // DELETE

    /**
     * deleteProduct function
     * @param id
     * @return
     */
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }

}