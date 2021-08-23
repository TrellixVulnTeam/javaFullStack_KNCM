package com.md.MyHibernate_Demos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name = "Emp_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	
	
	//	@Column(name = "emp_Street", length = 100)
	// this will provide the column name and length of the values 
	
	@Column(name = "emp_Street", length = 100)
	private String street;
	
	@Column(name = "emp_city", length = 30)
	private String city;
	
	
	private boolean isOpen;
	
	//@Transient means this entity will NOT create 
	// in the table

	@Transient
	private double x;
	
	
	//@Temporal(TemporalType.DATE) will provide the 
	//today's date in the database
	
	@Column(name = "joining_date")
	@Temporal(TemporalType.DATE)
	private Date entry;
	
	
	public Address() {
		
	}


	public Address(int addId, String street, String city, boolean isOpen, double x, Date entry) {
		super();
		this.addId = addId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.entry = entry;
	}


	public int getAddId() {
		return addId;
	}


	public void setAddId(int addId) {
		this.addId = addId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public Date getEntry() {
		return entry;
	}


	public void setEntry(Date entry) {
		this.entry = entry;
	}


	@Override
	public String toString() {
		return "Address [addId=" + addId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x=" + x
				+ ", entry=" + entry + "]";
	}
	
	

}
