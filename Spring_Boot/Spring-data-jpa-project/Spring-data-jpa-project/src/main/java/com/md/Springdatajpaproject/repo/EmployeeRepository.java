package com.md.Springdatajpaproject.repo;

import com.md.Springdatajpaproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
