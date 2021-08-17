package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Welcome to my Registration Page</h1>");
		
		String name=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		String password=request.getParameter("user_password");
		String con_password=request.getParameter("user_con_password");
		String gender=request.getParameter("user_gender");
		String country=request.getParameter("user_country");
		String agreement=request.getParameter("agreement");
		
		
		if (agreement.equals("accepted")) {
			out.println("<h1>Name: "+ name+"</h1>");
			out.println("<h1>Email: "+ email+"</h1>");
			out.println("<h1>Password: "+ password+"</h1>");
			out.println("<h1>Confirm Password: "+ con_password+"</h1>");
			out.println("<h1>Gender: "+ gender+"</h1>");
			out.println("<h1>Country: "+ country+"</h1>");
			out.println("<h1>Agreement: "+ agreement+"</h1>");

		}else {
			out.println("<h1>You have not accepted terms and conditions </h1>");
		}
		
		
		
	}
	
	
	
	
}
