package com.md;

public class Employee {
	
	private String name;
	private String email;
	private String gender;
	private String country;
	private int id;

	public Employee() {}
	
	public Employee(String name, String email, String gender, String country,int id) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", gender=" + gender + ", country=" + country + ", id="
				+ id + "]";
	}
	
	
	
	

}
