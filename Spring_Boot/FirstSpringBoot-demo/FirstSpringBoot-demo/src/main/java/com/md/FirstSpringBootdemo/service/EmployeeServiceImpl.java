package com.md.FirstSpringBootdemo.service;

import com.md.FirstSpringBootdemo.entity.Employee;
import com.md.FirstSpringBootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployeeList() {
        return repository.findAll();
    }

    @Override
    public Employee fetchEmployeeById(long employeeId) {
        Optional<Employee> employee = repository.findById(employeeId);
        if (!employee.isPresent()) {
            System.out.println("Employee does not Exist");
        }
        return employee.get();
    }

    @Override
    public void deleteEmployeeById(long employeeId) {
        repository.deleteById(employeeId);

    }

    @Override
    public Employee updateEmployee(long employeeId, Employee employee) {

        Employee employeeDb = repository.findById(employeeId).get();

        if (Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(employee.getEmployeeName())) {
            employeeDb.setEmployeeName(employee.getEmployeeName());
        }
        if (Objects.nonNull(employee.getCountry()) && !"".equalsIgnoreCase(employee.getCountry())) {
            employeeDb.setCountry(employee.getCountry());
        }

        return repository.save(employeeDb);
    }

//    @Override
//    public Employee fetchEmployeeByName(String employeeName) {
//        return repository.findByEmployeeNameIgnorCase(employeeName);
//    }
}
