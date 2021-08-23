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

public class DeleteEmployee extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter()){
			
			request.getRequestDispatcher("/navbar.html").include(request, response);;
			out.println("<br>");
			
			String id=request.getParameter("id");
			
			Connection con=ConnectionJDBC.getConnection();
			
			String sql="delete from add_emp where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, id);
				
			ps.executeUpdate();
			
			out.println("<h1> You have Successfully delete your information!!</h1>");
			out.println("<h1>Your deleted information is Id: "+id+" </h1>");
			
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
