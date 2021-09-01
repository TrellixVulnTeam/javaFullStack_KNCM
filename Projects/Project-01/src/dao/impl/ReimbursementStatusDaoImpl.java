package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.md.ReimbursementStatus;

import dao.ReimbursementStatusDao;
import factory.ConnectionFactory;

public class ReimbursementStatusDaoImpl implements ReimbursementStatusDao{
	
	Connection connection=null;
    private static Statement statement = null;

	
	public  ReimbursementStatusDaoImpl() throws ClassNotFoundException, SQLException {
		this.connection=ConnectionFactory.getConnection();
	}
	
	@Override
	public List<ReimbursementStatus> getAllReimbursementStaus() throws SQLException {
		
		List<ReimbursementStatus> reimbursementStatus = new ArrayList();
		
		String sql="select * from  reimbursement_status order by status_id";
		
		 statement = connection.createStatement();
	     ResultSet rs = statement.executeQuery(sql);
	     
	     while(rs.next()) {
	    	 ReimbursementStatus reim=new ReimbursementStatus();
	    	 
	    	 reim.setStatusId(rs.getInt(1));
	    	 reim.setStatus(rs.getString(2));
	    	 
	    	 reimbursementStatus.add(reim);
	     }
	     
		return reimbursementStatus;
	}

}
