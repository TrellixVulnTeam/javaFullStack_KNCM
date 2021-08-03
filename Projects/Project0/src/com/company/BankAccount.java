package com.company;

import com.company.dao.IBankAccount;

import java.util.Arrays;

public class BankAccount implements IBankAccount {

    private static int accountNum=0;
    private double balance;
    //private double amount;
    private User[] users;

    public BankAccount() {
    }

    public BankAccount(double balance,  User[] users) {
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
    public boolean deposit(double amount) {
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }
}
