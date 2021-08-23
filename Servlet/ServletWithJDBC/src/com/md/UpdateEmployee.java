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

public class UpdateEmployee extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			request.getRequestDispatcher("/navbar.html").include(request, response);;
			out.println("<br>");
			
			String id=request.getParameter("id");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String country=request.getParameter("country");

			Connection con=ConnectionJDBC.getConnection();

			String sql="update add_emp set name=?,email=?, gender=?,country=? where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, gender);
			ps.setString(4, country);
			ps.setString(5, id);

			ps.executeUpdate();
			
			out.println("<h1> You have Successfully Update your information!!</h1>");
			out.println("<h1>Your provided information are Id: "+id+", Name: "+name+", Email: "+email+", Gender: "+gender+", Country: "+country+"</h1>");
			
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
