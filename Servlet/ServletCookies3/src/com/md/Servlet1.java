package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet management</title>");
			out.println("</head>");
			out.println("<body>");
			
			String name=request.getParameter("name");
			
			out.println("<h1>Hello, "+name+" !!!!!!!!!!!! Welcome to my website.</h1>");
			out.println("<h1> <a href='servlet2'>Go to servlet 2</a></h1>");
			
			//create cookies
			Cookie cookie=new Cookie("user_name",name);
			response.addCookie(cookie);
			
			out.println("</body>");
			out.println("</html>");
			
		}
		
		
		
	}
	
	
}
