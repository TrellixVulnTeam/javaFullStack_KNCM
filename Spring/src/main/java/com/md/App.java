package com.md;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();

        //example :1,2
        Student student1 = (Student) context.getBean("st1");
        Student student2 = (Student) context.getBean("st2");
        Student student3 = (Student) context.getBean("st3");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        //example :3
        Employee employee = (Employee) context.getBean("employee1");
        System.out.println(employee.getName());
        System.out.println(employee.getPhones());
        System.out.println(employee.getAddresses());
        System.out.println(employee.getDepartments());


        //example :4
        Calcutation calcutation = (Calcutation) context.getBean("cal1");
        calcutation.sum();
        calcutation.sub();

        Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer);

        EmployeeRef employee2 = (EmployeeRef) context.getBean("emp1");
        System.out.println(employee2);

        //example :5
        EmployeeBean employeeBean = (EmployeeBean) context.getBean("employeeBean");
        System.out.println(employeeBean);

        StudentBean studentBean = (StudentBean) context.getBean("studentBean");
        System.out.println(studentBean);
    }
}
