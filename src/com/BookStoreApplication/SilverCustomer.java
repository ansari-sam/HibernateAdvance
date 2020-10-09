package com.BookStoreApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ScCustomers")
@PrimaryKeyJoinColumn(name="Customer_Id")
public class SilverCustomer extends Customer {
	@Column(name="ScCustomer_City")
	private String scCity;
	@Column(name="ScCustomer_Points")
	private int scPoint;
	@Column(name="ScCustomer_Email")
	private String scEmail;
	
	public SilverCustomer() {
		super();
	}

	public SilverCustomer(String cusName, String cusEmail, long cusPhone, String scCity, int scPoint, String scEmail) {
		super(cusName, cusEmail, cusPhone);
		this.scCity = scCity;
		this.scPoint = scPoint;
		this.scEmail = scEmail;
	}

	public String getScCity() {
		return scCity;
	}

	public void setScCity(String scCity) {
		this.scCity = scCity;
	}

	public int getScPoint() {
		return scPoint;
	}

	public void setScPoint(int scPoint) {
		this.scPoint = scPoint;
	}

	public String getScEmail() {
		return scEmail;
	}

	public void setScEmail(String scEmail) {
		this.scEmail = scEmail;
	}

	@Override
	public String toString() {
		return "SilverCustomer [scCity=" + scCity + ", scPoint=" + scPoint + ", scEmail=" + scEmail + "]";
	}
	
	

}
