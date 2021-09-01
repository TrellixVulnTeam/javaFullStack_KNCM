package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter()){
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet state managment</title>");
			out.println("</head>");
			out.println("<body style='background-color:grey'>");
			
			String name=request.getParameter("name");
			
			out.println("<h1>Hello, "+name+" !!!!!!!!!!! Welcome to my website.</h1>");
			out.println("<h1><a href='servlet2'>Go to servlet2 </a></h1>");
			
			//create cookies
			Cookie cookies=new Cookie("user_name",name);
			response.addCookie(cookies);
			
			out.println("</body>");
			out.println("</html>");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	
}
