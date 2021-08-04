package com.company.menu;


import com.company.information.Customer;

import java.util.Scanner;

public class UserMenu {

    static int menu;
    static Scanner input = new Scanner(System.in);

    static Customer customer = new Customer();
    // static BankAccount bankAccount = new BankAccount();


    public static void option() {

        System.out.println("Welcome to our Bank.\nPlease select your option here");

        System.out.println("1. Open a Saving Account");
        System.out.println("2. Open a Checking Account");
        System.out.println("3. Customer");
        System.out.println("4. Employee");
        System.out.println("5. Admin");
        System.out.println("6. Quit");

        menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Thank you for choosing Saving Account\n");
                createSavingAcc();
                break;
            case 2:
                System.out.println("Thank you for choosing Checking Account\n");
                createCheckingAcc();
                break;
            case 3:
                System.out.println("Welcome to our Bank\n");
                customerLogin();
                break;
            case 4:
                System.out.println("Welcome to our Employee portal\n");
                employeeLogin();
                break;
            case 5:
                System.out.println("Welcome to Admin page\n");
                adminLogin();
                break;
            case 6:
                System.out.println("Thank you for choosing our Bank Application\n");
                break;
            default:
                System.out.println("Invalid Option!! Please select your option\n");
                option();
        }
    }

    //1.
    public static void createSavingAcc() {

        System.out.println("Welcome to our Saving Account page.");
        Customer user = new Customer();
        System.out.println("Enter your first name: ");
        input.nextLine();
        System.out.println("Enter your last name: ");
        input.nextLine();
        System.out.println("Enter your email name: ");
        input.nextLine();
        System.out.println("Enter your password name: ");
        input.nextLine();
        option();

    }

    //2.
    public static void createCheckingAcc() {

        System.out.println("Welcome to our Checking Account page.");
        Customer user = new Customer();
        System.out.println("Enter your first name: ");
        input.nextLine();
        System.out.println("Enter your last name: ");
        input.nextLine();
        System.out.println("Enter your email name: ");
        input.nextLine();
        System.out.println("Enter your password name: ");
        input.nextLine();
        option();
    }

    //3.
    public static void customerLogin() {

        customerLogin();
        customerLog();
    }

    public static void customerLog() {
        System.out.println("Welcome to customer portal.");

        System.out.println("1. View Balance.");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw.");
        System.out.println("4. Update.");
        System.out.println("5. Logout.");

        switch (menu) {
            case 1:
                // view balance operation here
                //database
                System.out.println("Your balance is: ");
                customerLog();
                break;
            case 2:
                // deposit  operation here
                //database
                System.out.println("Your deposit balance is: ");
                customerLog();
                break;
            case 3:
                // Withdraw balance operation here
                //database
                System.out.println("Your Withdraw balance is: ");
                customerLog();
                break;
            case 4:
                // Update operation here
                //database
                System.out.println("Successfully update");
                customerLog();
                break;
            case 5:
                // Logout operation here
                //database
                System.out.println("Successfully Logout ");
                customerLog();
                break;
            default:
                System.out.println("Wrong option!!! Try again");
                option();
                break;
        }
    }

    //4.
    public static void employeeLogin() {

        employeeLogin();
        employeeLog();
    }

    public static void employeeLog() {
        System.out.println("Welcome to employee portal.");

        System.out.println("1. View all Customer.");
        System.out.println("2. create Customer Account.");
        System.out.println("3. Update Customer Information.");
        System.out.println("4. Logout.");

        switch (menu) {
            case 1:
                System.out.println("All customer Information here ");
                // database
                employeeLog();
                break;
            case 2:
                System.out.println("Create customer here ");
                // database
                employeeLog();
                break;
            case 3:
                System.out.println("Update customer Information here ");
                // database
                employeeLog();
                break;
            case 4:
                System.out.println("Thank you for using bank application ");
                employeeLog();
                break;
            default:
                System.out.println("Wrong option!!! Try again");
                option();
                break;
        }

    }

    //5.
    public static void adminLogin() {
        adminLogin();
        adminLog();
    }

    public static void adminLog() {
        System.out.println("Welcome to admin portal.");

        System.out.println("1. View all Customer.");
        System.out.println("2. create Customer Account.");
        System.out.println("3. Delete Customer.");
        System.out.println("4. Update Customer Information.");
        System.out.println("5. Logout.");


        switch (menu) {
            case 1:
                System.out.println("All customer Information here ");
                // database
                adminLog();
                break;
            case 2:
                System.out.println("Create customer Information here ");
                // database
                adminLog();
                break;
            case 3:
                System.out.println("Delete customer Information here ");
                // database
                adminLog();
                break;
            case 4:
                System.out.println("Update customer Information here ");
                // database
                adminLog();
                break;
            case 5:
                System.out.println("Thank you using our bank application.  ");
                option();
                break;
            default:
                System.out.println("Wrong option!!! Try again");
                option();
                break;
        }


    }
}
