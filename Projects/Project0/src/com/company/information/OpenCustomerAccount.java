package com.company.information;

import com.company.dao.BankAccountDao;
import com.company.dao.CustomerDao;
import com.company.daoImpl.BankAccountDaoImpl;
import com.company.daoImpl.CustomerDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class OpenCustomerAccount {

    static Scanner input=new Scanner(System.in);

    static Customer customer=new Customer();
    static CustomerDao customerDao=new CustomerDaoImpl();
    static BankAccountDao bankAccountDao=new BankAccountDaoImpl();


    public static void openAccount(){

        double balance;
        System.out.println("Please Enter Customer first name: ");
        String fName =input.next();
        System.out.println("Please Enter Customer last name: ");
        String lName =input.next();
        System.out.println("Please Enter Customer username: ");
        String uName =input.next();
        System.out.println("Please Enter Customer password: ");
        String pWord =input.next();

        do{
            System.out.println("Please enter your opening balance: ");
            balance=input.nextDouble();
        }while (balance<0);

        try {
            customer.setFirstName(fName);
            customer.setLastName(lName);
            customer.setUsername(uName);
            customer.setPassword(pWord);

            customerDao.addCustomer(customer);
            bankAccountDao.insertNewCustomerData(balance);



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }




}
