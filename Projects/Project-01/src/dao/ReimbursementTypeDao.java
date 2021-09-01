package dao;

import java.sql.SQLException;
import java.util.List;

import com.md.ReimbursementStatus;
import com.md.ReimbursementType;

public interface ReimbursementTypeDao {

	List<ReimbursementType> getAllReimbursementType() throws SQLException;
	
}
