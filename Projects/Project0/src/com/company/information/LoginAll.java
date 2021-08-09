package com.company.information;

import com.company.dao.AdminDao;
import com.company.dao.CustomerDao;
import com.company.daoImpl.AdminDapImpl;
import com.company.daoImpl.CustomerDaoImpl;
import com.company.menu.UserMenu;

import java.sql.*;
import java.util.Scanner;

public class LoginAll {

    static Scanner input = new Scanner(System.in);

    public static void adminLogin() {

        System.out.println("Enter admin username: ");
        String username = input.next();
        System.out.println("Enter admin password: ");
        String password = input.next();

        //from database
        AdminDao adminDao = new AdminDapImpl();

        try {
            if (adminDao.adminByUsername(username) == adminDao.adminByPassword(password)) {
                System.out.println("Try next time!!!!! Thanks");

            } else {
                System.out.println("Admin logged in!!!!!!!!!!!!!");
                UserMenu.adminLog();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void customerLogin() {


        System.out.println("Enter customer username: ");
        String username = input.next();
        System.out.println("Enter customer password: ");
        String password = input.next();

        //from database
        CustomerDao customerDao=new CustomerDaoImpl();

        try {
            if (customerDao.findByUsername(username) == customerDao.findByPassword(password)) {
                System.out.println("Try next time!!!!! Thanks");
            } else {
                System.out.println("Customer logged in!!!!!!!!!!!!!");
                UserMenu.customerLog();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
