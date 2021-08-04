package com.company.information;

public class BankAccount {

    private  int accountId;
    private double balance;
    private double amount;
    private String accountType;


    public BankAccount(){

    }

    public BankAccount(int accountId, double balance, double amount, String accountType) {
        this.accountId = accountId;
        this.balance = balance;
        this.amount = amount;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", amount=" + amount +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
