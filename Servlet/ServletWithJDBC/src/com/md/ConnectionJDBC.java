package com.md;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC  {
	
    private static Connection connection = null;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		 String dbDriver = "com.mysql.jdbc.Driver";
		 
		String url="jdbc:mysql://localhost:3306/servlet";
        String username="root";
        String password="12345";
        
		Class.forName(dbDriver);

		connection=DriverManager.getConnection(url,username,password);
		return connection;
		
	}

	
    
	
}
