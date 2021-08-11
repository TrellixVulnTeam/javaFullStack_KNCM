package com.company.dao;

import com.company.information.BankAccount;

import java.sql.SQLException;
import java.util.List;

public interface BankAccountDao {

    //insert
    void insertNewCustomerData(double balance) throws SQLException;

    // view information by account id
    public List<BankAccount> viewAccountById() throws SQLException;

    //get all the data by account id
    public BankAccount getByAccId(int accId) throws SQLException;

    // view balance
    double findBalaceByAccId(int accId) throws SQLException;

    void depositAccount(BankAccount bankAccount) throws SQLException;

    void withdrawAccount(BankAccount bankAccount) throws SQLException;

    void deleteAccount(int acc_id) throws SQLException;

    // update all balance
    void updateAllBalance(int accId, double balance) throws SQLException;


}
