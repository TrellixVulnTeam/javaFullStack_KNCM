package com.md;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ReimbursementStatus {
	
	@Column
	private int statusId;
	@Column
	private String status;
	
	public ReimbursementStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReimbursementStatus(int statusId, String status) {
		super();
		this.statusId = statusId;
		this.status = status;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ReimbursementStatus [statusId=" + statusId + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
	
}
