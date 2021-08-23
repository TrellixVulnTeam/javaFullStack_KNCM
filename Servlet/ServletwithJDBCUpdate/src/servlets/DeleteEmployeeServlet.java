package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.md.Employee;
import com.md.EmployeeDao;
import com.md.EmployeeDaoFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			request.getRequestDispatcher("/navbar.html").include(request, response);;
			out.println("<br>");
			
			int id=Integer.valueOf(request.getParameter("id"));
			Employee employee=new Employee();
			
			employee.setId(id);
			
			EmployeeDao dao=EmployeeDaoFactory.getEmployeeDao();

			 dao.deleteEmployee(id);
			
			
			out.println("<br>");
			out.println("Your prvoided id is :"+id);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
