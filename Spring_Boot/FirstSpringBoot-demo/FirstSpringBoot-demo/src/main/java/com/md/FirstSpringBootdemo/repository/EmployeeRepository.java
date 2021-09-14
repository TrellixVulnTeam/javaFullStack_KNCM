package com.md.FirstSpringBootdemo.repository;

import com.md.FirstSpringBootdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

//    public Employee findByEmployeeName(String employeeName);
//    public Employee findByEmployeeNameIgnorCase(String employeeName);

}
