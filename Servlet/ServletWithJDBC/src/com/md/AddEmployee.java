package com.md;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddEmployee extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){

			request.getRequestDispatcher("/navbar.html").include(request, response);;
			out.println("<br>");
			//getting data from the user and print on the 
			// browser
			
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String country=request.getParameter("country");
			
			
			//database connection 
			Connection con=ConnectionJDBC.getConnection();
			// insert to the add_emp table in database
			PreparedStatement ps=con.prepareStatement("insert into add_emp(name,email,gender,country) values(?,?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, gender);
			ps.setString(4, country);
			
			ps.executeUpdate();
			
			ps.close();
			
			con.close();
			
			out.println("<h1>Successfully provided your information!!</h1>");
			out.println("<h1>Your provided information are Name: "+name+", Email: "+email+", Gender: "+gender+", Country: "+country+"</h1>");
			
			//out.println("<h2><a href='UpdateEmployee'>Update your information here</a></h1>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

