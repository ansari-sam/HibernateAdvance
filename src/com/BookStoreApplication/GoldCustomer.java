package com.BookStoreApplication;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="GcCustomers")
@PrimaryKeyJoinColumn(name="Customer_Id")
public class GoldCustomer extends Customer {
	@Column(name="GcCustomer_Phone")
	private long gcPhone;
	@CollectionOfElements
	@JoinTable(name="GcCustomer_Refs", joinColumns= @JoinColumn(name="Customer_Id"))
	@IndexColumn(name="idx")
	@Column(name="GcCustomer_Refs")
	private Map<String,String> gcRefs;
	@Column(name="GcCustomer_Points")
	private int gcPoints;
	
	public GoldCustomer() {
		super();
	}

	public GoldCustomer(String cusName, String cusEmail, long cusPhone, long gcPhone, Map<String, String> gcRefs,
			int gcPoints) {
		super(cusName, cusEmail, cusPhone);
		this.gcPhone = gcPhone;
		this.gcRefs = gcRefs;
		this.gcPoints = gcPoints;
	}

	public long getGcPhone() {
		return gcPhone;
	}

	public void setGcPhone(long gcPhone) {
		this.gcPhone = gcPhone;
	}

	public Map<String, String> getGcRefs() {
		return gcRefs;
	}

	public void setGcRefs(Map<String, String> gcRefs) {
		this.gcRefs = gcRefs;
	}

	public int getGcPoints() {
		return gcPoints;
	}

	public void setGcPoints(int gcPoints) {
		this.gcPoints = gcPoints;
	}

	@Override
	public String toString() {
		return "GoldCustomer [gcPhone=" + gcPhone + ", gcRefs=" + gcRefs + ", gcPoints=" + gcPoints + "]";
	}
	
	

}
