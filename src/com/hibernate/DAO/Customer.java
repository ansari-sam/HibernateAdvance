package com.hibernate.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Details")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CID")
	private int cid;
	@Column(name="Name",length=100,nullable=false)
	private String name;
	@Column(name="Email",unique=true)
	private String email;
	@Column(name="City")
	private String City;
	@Column(name="Phone")
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
