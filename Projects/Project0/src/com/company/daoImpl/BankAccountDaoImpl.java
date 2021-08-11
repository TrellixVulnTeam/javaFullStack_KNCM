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
        String sql = "insert into bank_account(balance) vlaues(?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

       // preparedStatement.setInt(1, bankAccount.getCustId());
        preparedStatement.setDouble(1, balance);

        int count = preparedStatement.executeUpdate();

        if (count > 0)
            System.out.println("Bank deposit Successfully completed!!!!!");
        else
            System.out.println("Something went wrong!!!!!");

    }

    @Override
    public List<BankAccount> viewAccountById() throws SQLException {

        List<BankAccount> bankAccounts = new ArrayList<>();

        String sql = "select * from bank_account";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        BankAccount b = null;

        while (rs.next()) {
            b = new BankAccount(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4));
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
            b = new BankAccount(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4));
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
    public void depositAccount(BankAccount bankAccount) throws SQLException {
        String sql = "update bank_account set balance=balance+ ? where acc_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, bankAccount.getBalance());
        preparedStatement.setInt(2, bankAccount.getAccId());

        int count = preparedStatement.executeUpdate();

        if (count > 0) {
            System.out.println("Bank Account deposit updated");
        } else {
            System.out.println("Bank Account NOT updated, Please try again!!!!!");
        }


    }

    @Override
    public void withdrawAccount(BankAccount bankAccount) throws SQLException {
        String sql = "update bank_account set balance=balance- ? where acc_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, bankAccount.getBalance());
        preparedStatement.setInt(2, bankAccount.getAccId());

        int count = preparedStatement.executeUpdate();

        if (count > 0) {
            System.out.println("Bank Account withdraw updated");
        } else {
            System.out.println("Bank Account NOT updated, Please try again!!!!!");
        }
    }

    @Override
    public void deleteAccount(int acc_id) throws SQLException {
        String sql = "delete from bank_accounts where acc_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, acc_id);
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
