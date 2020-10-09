package com.BookStoreApplication;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OrderItems")
public class OrderItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="oItem_Id")
	private int oiId;
	@Column(name="oItem_Qty")
	private int oiQty;
	@Column(name="oItem_Cost")
	private double oiCost;
	@ManyToOne
//	@JoinColumn(name="Order_Id")
	private Order order;
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="Book_Id")
	private Book book;
	
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(int oiQty, double oiCost) {
		super();
		this.oiQty = oiQty;
		this.oiCost = oiCost;
	}
	public int getOiId() {
		return oiId;
	}
	public void setOiId(int oiId) {
		this.oiId = oiId;
	}
	public int getOiQty() {
		return oiQty;
	}
	public void setOiQty(int oiQty) {
		this.oiQty = oiQty;
	}
	public double getOiCost() {
		return oiCost;
	}
	public void setOiCost(double oiCost) {
		this.oiCost = oiCost;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "OrderItem [oiId=" + oiId + ", oiQty=" + oiQty + ", oiCost=" + oiCost + ", order=" + order + ", book="
				+ book + "]";
	}
	
	

}
