package dao.impl;

import java.util.List;

import com.md.User;

public interface UserDao {

	void addEmployee(User user);

	void updateEmployee(User user);

	void deleteEmployee(int userId);

	User findEmployeeById(int userId);

	List<User> getAllEmployee();

}