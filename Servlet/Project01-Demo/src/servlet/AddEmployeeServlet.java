package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.md.User;

import dao.impl.UserDao;
import dao.impl.UserDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{

	//private UserDao dao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			request.getRequestDispatcher("/navbar.jsp").include(request, response);;
			out.println("<br>");
			
			
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			User employee=new User();
			employee.setName(name);
			employee.setEmail(email);
			employee.setUsername(username);
			employee.setPassword(password);
			
			UserDaoImpl dao=new UserDaoImpl();
			
			dao.addEmployee(employee);
			out.println("Employee added");
			
			
			
			
		}
		
	}
	}
	

