package com.md.Springdatajpaproject.service;

import com.md.Springdatajpaproject.entity.Employee;
import com.md.Springdatajpaproject.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository repository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long emplId) {
        Optional<Employee> employee=repository.findById(emplId);
        if (!employee.isPresent()){
            System.out.println("please provide the correct employee id");
        }
        return employee.get();
    }

    @Override
    public Employee deleteEmployee(long emplId) {
        Employee employeeDb=repository.findById(emplId).get();
        repository.delete(employeeDb);
        return employeeDb;
    }

    @Override
    public Employee updateEmployee(long emplId, Employee employee) {
        Employee employeeDb=repository.findById(emplId).get();

        employeeDb.setName(employee.getName());
        employeeDb.setEmail(employee.getEmail());

        return repository.save(employeeDb);
    }
}
