package com.md.Springdatajpaproject.controller;

import com.md.Springdatajpaproject.entity.Employee;
import com.md.Springdatajpaproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        return service.getEmployee();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") long emplId) {
        return service.getEmployeeById(emplId);
    }

    @DeleteMapping("/employees/{id}")
    public Employee deleteEmployeeById(@PathVariable("id") long emplId) {
        return service.deleteEmployee(emplId);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") long emplId, @RequestBody Employee employee) {
        return service.updateEmployee(emplId, employee);
    }
}
