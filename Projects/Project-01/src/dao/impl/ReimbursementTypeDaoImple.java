package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.md.ReimbursementStatus;
import com.md.ReimbursementType;

import dao.ReimbursementTypeDao;
import factory.ConnectionFactory;

public class ReimbursementTypeDaoImple implements ReimbursementTypeDao{

	Connection connection=null;
    private static Statement statement = null;

	
	public  ReimbursementTypeDaoImple() throws ClassNotFoundException, SQLException {
		this.connection=ConnectionFactory.getConnection();
	}
	
	@Override
	public List<ReimbursementType> getAllReimbursementType() throws SQLException {

		List<ReimbursementType> reimbursementType = new ArrayList();
		
		String sql="select * from  reimbursement_type";
		
		 statement = connection.createStatement();
	     ResultSet rs = statement.executeQuery(sql);
	     
	     while(rs.next()) {
	    	 
	    	 ReimbursementType reim=new ReimbursementType();
	    	 
	    	 reim.setTypeId(rs.getInt(1));
	    	 reim.setType(rs.getString(2));
	    	 
	    	 reimbursementType.add(reim);
	     }
	     
		return reimbursementType;
	}

}
