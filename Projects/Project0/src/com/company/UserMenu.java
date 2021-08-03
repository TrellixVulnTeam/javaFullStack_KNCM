package com.company;

import java.util.Scanner;

public class UserMenu {

    static int menu;
    static Scanner input=new Scanner(System.in);

    public void option(){

        System.out.println("Welcome to our Bank.\nPlease select your option here");

        System.out.println("1. Open a Saving Account");
        System.out.println("2. Open a Checking Account");
        System.out.println("3. Customer");
        System.out.println("4. Employee");
        System.out.println("5. Admin");
        System.out.println("6. Quit");

        menu=input.nextInt();

        switch (menu){
            case 1:
                System.out.println("Thank you for choosing Saving Account");
                option();
                break;
            case 2:
                System.out.println("Thank you for choosing Checking Account");
                option();
                break;
            case 3:
                System.out.println("Welcome to our Bank");
                option();
                break;
            case 4:
                System.out.println("Welcome to our Employee portal");
                option();
                break;
            case 5:
                System.out.println("Welcome to Admin page");
                option();
                break;
            case 6:
                System.out.println("Thank you for choosing our Bank Application");
                break;
            default:
                System.out.println("Invalid Option!! Please select your option");
                option();


        }

    }


    public static void createSavingAcc(){

        System.out.println("Welcome to our Saving Account page.");
        User user=new User();
        System.out.println("Enter your first name: ");
        input.nextLine();
        System.out.println("Enter your last name: ");
        input.nextLine();
        System.out.println("Enter your email name: ");
        input.nextLine();
        System.out.println("Enter your password name: ");
        input.nextLine();



    }
    public static void createCheckingAcc(){

        System.out.println("Welcome to our Checking Account page.");
        User user=new User();
        System.out.println("Enter your first name: ");
        input.nextLine();
        System.out.println("Enter your last name: ");
        input.nextLine();
        System.out.println("Enter your email name: ");
        input.nextLine();
        System.out.println("Enter your password name: ");
        input.nextLine();


    }

    public static void customerLogin(){
        System.out.println("Customer: ");

        BankAccount customer=new BankAccount();
        System.out.println("Enter your username: ");
        input.nextLine();
        System.out.println("Enter your password");
        input.nextLine();


    }

    public static void employeeLogin(){

        System.out.println("Employee: ");

        BankAccount customer=new BankAccount();
        System.out.println("Enter your username: ");
        input.nextLine();
        System.out.println("Enter your password");
        input.nextLine();



    }
    public static void adminLogin(){
        System.out.println("Admin: ");

        BankAccount customer=new BankAccount();
        System.out.println("Enter your username: ");
        input.nextLine();
        System.out.println("Enter your password");
        input.nextLine();


    }


}
