package com.BookStoreApplication;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Order_Id")
	private int orderId;
	@Column(name="totalQty")
	private int totalQty;
	@Column(name="totalCost")
	private double totalCost;
	@Column(name="Order_Date")
	private Date orderDate;
	@Column(name="Order_Status")
	private String orderStatus;
	@ManyToOne
	@JoinColumn(name="Customer_Id",referencedColumnName="Customer_Id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name="Add_Id")
	private ShippingAddress orderShipAddress;
	@OneToMany(mappedBy="order", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<OrderItem> orderItems;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int totalQty, double totalCost, Date orderDate, String orderStatus) {
		super();
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ShippingAddress getOrderShipAddress() {
		return orderShipAddress;
	}
	public void setOrderShipAddress(ShippingAddress orderShipAddress) {
		this.orderShipAddress = orderShipAddress;
	}
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalQty=" + totalQty + ", totalCost=" + totalCost + ", orderDate="
				+ orderDate + ", orderStatus=" + orderStatus + ", customer=" + customer + ", orderShipAddress="
				+ orderShipAddress + ", orderItems=" + orderItems + "]";
	}
	
	

}
