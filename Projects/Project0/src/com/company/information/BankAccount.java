package com.company.information;

public class BankAccount {


    private int accId;
    private int custId;
    private double balance;
//    private  double deposit;
//    private double withdraw;

    public BankAccount(){


    }

    public BankAccount(int accId, int custId, double balance) {
        this.accId = accId;
        this.custId = custId;
        this.balance = balance;
//        this.deposit = deposit;
//        this.withdraw = withdraw;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    public double getDeposit() {
//        return deposit;
//    }
//
//    public void setDeposit(double deposit) {
//        this.deposit = deposit;
//    }
//
//    public double getWithdraw() {
//        return withdraw;
//    }

//    public void setWithdraw(double withdraw) {
//        this.withdraw = withdraw;
//    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "acc_id=" + accId +
                ", cust_id=" + custId +
                ", balance=" + balance +
//                ", deposit=" + deposit +
//                ", withdraw=" + withdraw +
                '}';
    }
}
