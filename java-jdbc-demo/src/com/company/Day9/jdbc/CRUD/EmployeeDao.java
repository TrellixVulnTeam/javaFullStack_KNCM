package com.company.Day9.jdbc.CRUD;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {

    void addEmaployee(Employee employee) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;
    void deleteEmployee(int id) throws SQLException;
    List<Employee> getEmployee() throws SQLException;
    Employee employeeById(int id) throws SQLException;


}
