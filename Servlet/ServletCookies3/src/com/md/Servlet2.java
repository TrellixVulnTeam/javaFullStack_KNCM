package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
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
			out.println("<title>Servlet management</title>");
			out.println("</head>");
			out.println("<body>");
			
			Cookie[] cookies=request.getCookies();
			boolean flag=false;
			String name="";
			
			if (cookies==null) {
				out.println("<h1> You're new user, please submit your name.</h1>");
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
				out.println("<h1> Hello, "+name+" Welcome back to the website(servlet2).</h1>");
			}
			
			
			out.println("</body>");
			out.println("</html>");
			
		}
		
		
		
	}
	
	
}
