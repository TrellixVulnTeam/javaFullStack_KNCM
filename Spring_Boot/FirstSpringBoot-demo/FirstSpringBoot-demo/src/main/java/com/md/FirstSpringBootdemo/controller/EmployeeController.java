package com.md.FirstSpringBootdemo.controller;

import com.md.FirstSpringBootdemo.entity.Employee;
import com.md.FirstSpringBootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class EmployeeController {

   // Logger logger=
    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public Employee saveEmployee(@Valid @RequestBody Employee employee) {
        System.out.println("employee saved");
        return service.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        return service.fetchEmployeeList();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") long employeeId) {

        return service.fetchEmployeeById(employeeId);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable("id") long employeeId) {
        service.deleteEmployeeById(employeeId);
        return "Employee deleted";
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") long employeeId,@RequestBody Employee employee
    ){
        return  service.updateEmployee(employeeId,employee);
    }

//   @GetMapping("/employees/name/{name}")
//    public Employee getEmployeeByName(@PathVariable("name") String employeeName){
//        return service.fetchEmployeeByName(employeeName);
//   }
}
