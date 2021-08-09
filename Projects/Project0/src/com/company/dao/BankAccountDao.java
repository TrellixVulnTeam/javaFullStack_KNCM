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

    void  deposit() throws SQLException;

    void withdraw() throws SQLException;

    // delete account by account id
    void  deleteAccount(int accId) throws SQLException;

    // update all balance
    void  updateAllBalance(int accId,double balance) throws SQLException;




}
