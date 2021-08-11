package com.company.information;

public class BankAccount {


    private int accId;
    private int custId;
    private int balance;
    private double openingAmount;



    public BankAccount(){


    }

    public BankAccount(int accId, int custId, int balance, double openingAmount) {
        this.accId = accId;
        this.custId = custId;
        this.balance = balance;
        this.openingAmount = openingAmount;
    }
    public BankAccount(double balance){

    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getOpeningAmount() {
        return openingAmount;
    }

    public void setOpeningAmount(double openingAmount) {
        this.openingAmount = openingAmount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accId=" + accId +
                ", custId=" + custId +
                ", balance=" + balance +
                ", openingAmount=" + openingAmount +
                '}';
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Withdrawal processing");
        if (this.balance < amount) {
            System.out.println("Insufficient Balance");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.balance -= amount;
            System.out.println("Withdrawal complete");
        }
    }

    public synchronized void deposit(int amount) {
        System.out.println("Deposit processing.");
        balance += amount;
        System.out.println("Deposit completed");
        notify();
    }




}
