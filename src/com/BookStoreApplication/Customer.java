package com.BookStoreApplication;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Customer_Id")
	private int cusId;
	@Column(name="Customer_Name")
	private String cusName;
	@Column(name="Customer_Email")
	private String cusEmail;
	@Column(name="Customer_Phone")
	private long cusPhone;
	@OneToOne
	@JoinColumn(name="cCard_Id")
	private CreditCard cCard;
	@OneToMany(mappedBy="customer")
	private Set<Order> orders;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cusName, String cusEmail, long cusPhone) {
		super();
		this.cusName = cusName;
		this.cusEmail = cusEmail;
		this.cusPhone = cusPhone;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	public long getCusPhone() {
		return cusPhone;
	}
	public void setCusPhone(long cusPhone) {
		this.cusPhone = cusPhone;
	}
	public CreditCard getcCard() {
		return cCard;
	}
	public void setcCard(CreditCard cCard) {
		this.cCard = cCard;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusEmail=" + cusEmail + ", cusPhone=" + cusPhone
				+ ", cCard=" + cCard + ", orders=" + orders + "]";
	}
	
	

}
