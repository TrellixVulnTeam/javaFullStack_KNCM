package com.company.daoImpl;

import com.company.connection.ConnectionFactory;
import com.company.dao.BankAccountDao;
import com.company.dao.CustomerDao;
import com.company.information.BankAccount;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountDaoImpl implements BankAccountDao {

    static Scanner input = new Scanner(System.in);
    private static Statement statement = null;
    Connection connection = null;


    public BankAccountDaoImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void insertNewCustomerData(double balance) throws SQLException {

        BankAccount bankAccount = new BankAccount();
        String sql = "insert into bank_account(cust_id,balance) vlaues(?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, bankAccount.getCustId());
        preparedStatement.setDouble(2, bankAccount.getBalance());

        int count = preparedStatement.executeUpdate();

        if (count > 0)
            System.out.println("Bank account created!!!!!");
        else
            System.out.println("Something went wrong!!!!!");

    }

    @Override
    public List<BankAccount> viewAccountById() throws SQLException {

        List<BankAccount> bankAccounts = new ArrayList<>();

        String sql = "select * from bank_account";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        BankAccount b = null;

        while (rs.next()) {
            b = new BankAccount(rs.getInt(1), rs.getInt(2), rs.getDouble(3));
            System.out.println(b);
            bankAccounts.add(b);
        }

        return bankAccounts;
    }

    @Override
    public BankAccount getByAccId(int accId) throws SQLException {
        String sql = "select * from bank_account where acc_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, accId);

        ResultSet rs = preparedStatement.executeQuery();

        BankAccount b = null;

        while (rs.next()) {
            b = new BankAccount(rs.getInt(1), rs.getInt(2), rs.getDouble(3));
        }

        if (b == null) {
            System.out.println("Please provide the right account id.\n");
        } else {
            System.out.println(b + "\n");

        }

        return b;
    }

    @Override
    public double findBalaceByAccId(int accId) throws SQLException {
        double balance = 0;

        String sql = "select balance from bank_account where acc_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, accId);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            balance = rs.getDouble(1);
            System.out.println("Your balance is: " + balance + "\n");
        }
        return balance;
    }

    @Override
    public void deposit(int accId) throws SQLException {
        CustomerDaoImpl customerDao = null;

        double balance = 0;
        double updatedBal = 0;

        System.out.println("How much would you like to deposit: ");
        double inputBal = input.nextDouble();

        if (inputBal < 0) {
            System.out.println("Negative amount!!!!!!!!!!");
        }

//        String sql = "select balance from bank_account where acc_id=?";
//        PreparedStatement preparedStatement1 = connection.prepareStatement(sql);
//        preparedStatement1.setInt(1, accId);
//        ResultSet rs = preparedStatement1.executeQuery();
//
//        while (rs.next()) {
//            balance = rs.getDouble(1);
//            updatedBal = inputBal + balance;
//        }


        String sqlDeposit = "update p1.bank_account set balance =" +
                "(select balance from p1.bank_account where acc_id ="+accId+")+"+balance+" where acc_id = "+accId;

       // String sql1 = "update bank_account set balance=? where acc_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlDeposit);
        preparedStatement.setDouble(1, balance);
        preparedStatement.setInt(2, accId);

        preparedStatement.executeUpdate();
        System.out.println("Deposit completed !!!!");
        System.out.println("Your deposit amount is: " + inputBal + "\n");


/*
        while (rs.next()){
            balance=rs.getDouble(1);

        }

 */

        // double updatedBal = inputBal + balance;

        //updateAllBalance(customerDao.findId,updatedBal);
        System.out.println("Your balance is: " + updatedBal + "\n");


    }

    @Override
    public void withdraw() throws SQLException {

        CustomerDaoImpl customerDao = null;
        double balance = 0;
        System.out.println("How much would you like to withdraw: ");
        double inputBal = input.nextDouble();

        if (inputBal < 0) {
            System.out.println("Can't withdraw negative amount!!!!!!");
        }

        String sql = "select balance from bank_account where acc_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, customerDao.findId);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            balance = rs.getDouble(1);
        }
        System.out.println("Your withdraw amount is: " + inputBal + "\n");

        double updatedBal = balance - inputBal;

        updateAllBalance(customerDao.findId, updatedBal);
        System.out.println("Your balance is: " + updatedBal + "\n");


    }

    @Override
    public void deleteAccount(int accId) throws SQLException {

        String sql = "delete from bank_account where acc_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, accId);

        int count = preparedStatement.executeUpdate();

        if (count > 0) {
            System.out.println("Customer Account deleted!!!!!!!!");
        } else {
            System.out.println("Something went wrong");
        }

    }

    @Override
    public void updateAllBalance(int accId, double balance) throws SQLException {

        String sql = "update bank_account set balance=? where acc_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, balance);
        preparedStatement.setInt(2, accId);

        preparedStatement.executeUpdate();


    }
}
