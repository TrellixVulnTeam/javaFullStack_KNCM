package com.md.FirstSpringBootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;

    // You have to put @valid annotation on controller
    //infront of request body

    @NotEmpty(message = "Please provide the employee name here")
    private String employeeName;
    private String country;



    public Employee(){

    }

    public Employee(long employeeId, String employeeName, String country) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.country = country;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
