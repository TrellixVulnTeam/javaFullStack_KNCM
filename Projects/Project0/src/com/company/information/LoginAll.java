package com.company.information;

import java.util.Scanner;

public class LoginAll {

    static Scanner input=new Scanner(System.in);

    public static void adminLogin(){
        System.out.println("Enter admin username/email: ");
        String username=input.nextLine();
        System.out.println("Enter admin password: ");
        String password=input.nextLine();

    }
    public static void employeeLogin(){
        System.out.println("Enter employee username/email: ");
        String username=input.nextLine();
        System.out.println("Enter employee password: ");
        String password=input.nextLine();

    }

    public static void customerLogin(){
        System.out.println("Enter your username/email: ");
        String username=input.nextLine();
        System.out.println("Enter your password: ");
        String password=input.nextLine();

    }



}
