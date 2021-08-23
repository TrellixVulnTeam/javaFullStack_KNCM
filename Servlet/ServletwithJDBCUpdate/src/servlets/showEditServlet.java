package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.md.Employee;
import com.md.EmployeeDao;
import com.md.EmployeeDaoFactory;
import com.md.EmployeeDaoImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class showEditServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter()){
			int id=Integer.parseInt(request.getParameter("id"));
			
			EmployeeDao dao=EmployeeDaoFactory.getEmployeeDao();
			dao.findById(id);
			RequestDispatcher dispat=request.getRequestDispatcher("");
			request.setAttribute("user", dao);
			dispat.forward(request, response);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
