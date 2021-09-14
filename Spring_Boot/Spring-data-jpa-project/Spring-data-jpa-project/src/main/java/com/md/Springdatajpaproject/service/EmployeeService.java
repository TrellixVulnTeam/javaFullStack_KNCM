package com.md.Springdatajpaproject.service;

import com.md.Springdatajpaproject.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getEmployee();

    Employee getEmployeeById(long emplId);

    Employee deleteEmployee(long emplId);

    Employee updateEmployee(long emplId,Employee employee);

}
