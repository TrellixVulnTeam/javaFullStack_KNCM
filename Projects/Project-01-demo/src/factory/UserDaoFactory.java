package factory;

import java.sql.SQLException;

import dao.impl.UserDaoImpl;
import dao1.UserDao;

public class UserDaoFactory {

	
	private static UserDao dao;
	private UserDaoFactory() {}
	
	public static UserDao getUserDao() throws ClassNotFoundException, SQLException {
		if (dao == null) {
			dao=new UserDaoImpl();
		}
		
		return dao;
		
	}
	
}
