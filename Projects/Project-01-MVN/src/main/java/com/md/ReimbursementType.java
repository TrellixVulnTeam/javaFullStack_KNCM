package com.md;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ReimbursementType {
	
	@Column
	private int typeId;
	@Column
	private String type;
	
	public ReimbursementType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReimbursementType(int typeId, String type) {
		super();
		this.typeId = typeId;
		this.type = type;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ReimbursementType [typeId=" + typeId + ", type=" + type + "]";
	}
	
	
	
	

}
