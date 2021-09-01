package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.md.Reimbursement;

import dao.ReimbursementDao;
import factory.ConnectionFactory;

public class ReimbursementDaoImpl implements ReimbursementDao{

	Connection connection=null;
    private static Statement statement = null;

	
	public  ReimbursementDaoImpl() throws ClassNotFoundException, SQLException {
		this.connection=ConnectionFactory.getConnection();
	}
	
	@Override
	public void addReimbursement(Reimbursement reim) throws SQLException {
		String sql="insert into reimbursement (empl_id,amount,submit_date,type,status)values(?,?,?,?,?)";
		
		PreparedStatement ps=connection.prepareStatement(sql);
		
		ps.setInt(1, reim.getEmplId());
		ps.setDouble(2, reim.getAmount());
		ps.setString(3,reim.getSubmitDate());
		
		int count=ps.executeUpdate();
		
		if (count>0) {
			System.out.println("Reimbursement added");
		}else {
			System.out.println("Something went wrong!!!!");
		}
		
	}

	@Override
	public void updateReimbursement(Reimbursement reim) throws SQLException {
		String sql="update reimbursement set empl_id=?,amount=?,submit_date=? where reimbursement_id=?";
	
		PreparedStatement ps=connection.prepareStatement(sql);
		
		ps.setInt(1, reim.getEmplId());
		ps.setDouble(2, reim.getAmount());
		ps.setString(3, reim.getSubmitDate());
		ps.setInt(4, reim.getReimbursementId());
		
		int count=ps.executeUpdate();
		
		if (count>0) {
			System.out.println("Reimbursement updated!!");
		}else {
			System.out.println("Something went Wrong!!!!");
		}
		
	}

	@Override
	public List<Reimbursement> getAllReimbursement() throws SQLException {
		
		List<Reimbursement> reimbursements=new ArrayList();
		
		String sql="select * from reimbursement";
		
		 statement = connection.createStatement();
	     ResultSet rs = statement.executeQuery(sql);
	     
	     while(rs.next()) {
	    	 Reimbursement reimbursement=new Reimbursement();
	    	 
	    	 reimbursement.setReimbursementId(rs.getInt(1));
	    	 reimbursement.setEmplId(rs.getInt(2));
	    	 reimbursement.setAmount(rs.getDouble(3));
	    	 reimbursement.setSubmitDate(rs.getString(4));

	    	 reimbursements.add(reimbursement);
	    	 
	     }
		return reimbursements;
	}

	@Override
	public void getReimbursementByUserId(int userId) throws SQLException {
		String sql="select * from reimbursement where  empl_id=?";
		
		PreparedStatement ps=connection.prepareStatement(sql);
		
		ps.setInt(1, userId);
		
		ResultSet rs=ps.executeQuery();
		
		Reimbursement reim=null;
		
		while(rs.next()) {
			 reim=new Reimbursement(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getString(6));
		}
		
		if (reim==null) {
			System.out.println("Please provide the right user id\n");
		}else {
			System.out.println(reim+"\n");
		}
		
		
	}

}
