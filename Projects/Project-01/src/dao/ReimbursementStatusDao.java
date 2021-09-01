package dao;

import java.sql.SQLException;
import java.util.List;

import com.md.Reimbursement;
import com.md.ReimbursementStatus;

public interface ReimbursementStatusDao {
	
	List<ReimbursementStatus> getAllReimbursementStaus() throws SQLException;


}
