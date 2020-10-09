package com.hibernate.simplemapping;

public class Customer {
	private int cid;
	private String name;
	private String email;
	private String City;
	private String Phone;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name, String email, String city, String phone) {
		super();
		this.name = name;
		this.email = email;
		City = city;
		Phone = phone;
	}
	public Customer(int cid, String name, String email, String city, String phone) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		City = city;
		Phone = phone;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", City=" + City + ", Phone=" + Phone
				+ "]";
	}
	

}
