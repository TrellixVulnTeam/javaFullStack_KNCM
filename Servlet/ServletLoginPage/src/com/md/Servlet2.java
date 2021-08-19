package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Home Page</title>");
			out.println("</head>");
			out.println("body");
			
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			out.println("<h1> <a href='servlet2'>Login</a></h1>");
			
			out.println("<>");
			out.println("<>");
			out.println("<>");

			out.println("</body>");
			out.println("</html>");
			
			
			
			
			
			
		}
		
		
	}
}

