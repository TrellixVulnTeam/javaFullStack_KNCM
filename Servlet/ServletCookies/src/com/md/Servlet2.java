package com.md;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		try(PrintWriter out=response.getWriter()){
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet State Management</title>");
			out.println("</head>");
			out.println("<body>");
			
			//get cookies
			Cookie[] cookies=request.getCookies();
			boolean flag=false;
			String name="";
			
			if (cookies==null) {
				out.println("<h1>You are new user, please submit your name first</h1>");
				return;
			}else {
				for (Cookie cookie : cookies) {
					String tname=cookie.getName();
					if (tname.equals("user_name")) {
						flag=true;
						name=cookie.getValue();
					}
				}
			}
			
			if (flag) {
				out.println("<h1>Hello, "+name+" welcome to my website..</h1>");

			}
			
			
			out.println("</body>");
			out.println("</html>");
			
		}
		
		
		
		
		
	}
	
}
