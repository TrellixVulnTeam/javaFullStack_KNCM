package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        //step:1 load the driver
        //Class.forName("jdbc:mysql://localhost:3306/revature");

        String url="jdbc:mysql://localhost:3306/revature";
        String username="root";
        String password="12345";

        //step: 2 Create connection Object
        Connection con= DriverManager.getConnection(url,username,password);

        //step: 3 Create Statement Object
        Statement statement=con.createStatement();

        // Step 4: Execute Query
        ResultSet resultSet=statement.executeQuery("select * from admin");


        while (resultSet.next()){
            System.out.println("id "+resultSet.getInt(1)+
                    ", name: "+resultSet.getString(2)+
                    ", Email: "+resultSet.getString(3)+
                    ", Password: "+resultSet.getString(4));
        }
        con.close();

    }
}
