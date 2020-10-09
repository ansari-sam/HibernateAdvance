package com.BookStoreApplication;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="creditcard")
public class CreditCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cCard_Id")
	private int ccId;
	@Column(name="cCard_Number")
	private int ccNo;
	@Column(name="cCard_Type")
	private String ccType;
	@Column(name="cCard_Code")
	private int ccCode;
	@Column(name="cCard_ExpDate")
	private Date ccExpDate;
	@OneToOne(mappedBy="cCard")
	//@JoinColumn(name="Customer_Id",referencedColumnName="Customer_Id")
	private Customer customer;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(int ccNo, String ccType, int ccCode, Date ccExpDate) {
		super();
		this.ccNo = ccNo;
		this.ccType = ccType;
		this.ccCode = ccCode;
		this.ccExpDate = ccExpDate;
	}
	public int getCcId() {
		return ccId;
	}
	public void setCcId(int ccId) {
		this.ccId = ccId;
	}
	public int getCcNo() {
		return ccNo;
	}
	public void setCcNo(int ccNo) {
		this.ccNo = ccNo;
	}
	public String getCcType() {
		return ccType;
	}
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	public int getCcCode() {
		return ccCode;
	}
	public void setCcCode(int ccCode) {
		this.ccCode = ccCode;
	}
	public Date getCcExpDate() {
		return ccExpDate;
	}
	public void setCcExpDate(Date ccExpDate) {
		this.ccExpDate = ccExpDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "CreditCard [ccId=" + ccId + ", ccNo=" + ccNo + ", ccType=" + ccType + ", ccCode=" + ccCode
				+ ", ccExpDate=" + ccExpDate + ", customer=" + customer + "]";
	}
	
	

}
