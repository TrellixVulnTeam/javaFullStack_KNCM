package com.company;

import java.util.Arrays;

/*
public class BankAccount implements IBankAccount {

    private static int accountNum = 0;
    private double balance;
    //private double amount;
    private User[] users;

    public BankAccount() {
    }

    public BankAccount(double balance, User[] users) {
        this.balance = balance;
        // this.amount = amount;
        this.users = users;
    }

    public static int getAccountNum() {
        return accountNum;
    }

    public static void setAccountNum(int accountNum) {
        BankAccount.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", users=" + Arrays.toString(users) +
                '}';
    }

    @Override
    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println("please enter a valid amount ");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not enough balance on your account.");
            return 0;
        } else {
            balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
        }
        return balance;
    }
}

class SavingAccount implements IBankAccount {
    private double balance;

    @Override
    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println("please enter a valid amount ");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }
        return balance;
    }


    @Override
    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not enough balance on your account.");
            return 0;
        } else {
            balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
        }
        return balance;
    }
}

class CheckingAccount implements IBankAccount {

    private double balance;

    @Override
    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println("please enter a valid amount ");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not enough balance on your account.");
            return 0;
        } else {
            balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
        }
        return balance;
    }
}


 */