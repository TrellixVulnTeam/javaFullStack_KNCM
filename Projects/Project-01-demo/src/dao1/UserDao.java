package dao1;

import java.sql.SQLException;
import java.util.List;

import com.md.User;

public interface UserDao {

	void addEmployee(User user) throws SQLException;

	void updateEmployee(User user) throws SQLException;

	void deleteEmployee(int userId) throws SQLException;

	User findEmployeeById(int userId) throws SQLException;

	List<User> getAllEmployee() throws SQLException;

}