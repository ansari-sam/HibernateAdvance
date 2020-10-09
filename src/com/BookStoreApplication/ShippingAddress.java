package com.BookStoreApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ShippingAddress")
public class ShippingAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Add_Id")
	private int addId;
	@Column(name="Add_Street")
	private String Street;
	@Column(name="Add_City")
	private String City;
	@Column(name="Add_State")
	private String State;
	@OneToOne(mappedBy="orderShipAddress")
	//@JoinColumn(name="Order_Id")
	private Order order;
	
	public ShippingAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ShippingAddress(String street, String city, String state) {
		super();
		Street = street;
		City = city;
		State = state;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "ShippingAddress [addId=" + addId + ", Street=" + Street + ", City=" + City + ", State=" + State
				+ ", order=" + order + "]";
	}
	
	

}
