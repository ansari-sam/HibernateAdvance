package com.hibernate.Embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Embeddable// This will save all data of address into person table with declare property within it
			//(only one table will create i.e. Person and they have column:pId,pName,pPhone,Add_City,Add_State
public class Address {
	@Column(name="Add_City")
	private String City;
	@Column(name="Add_State")
	private String State;
	@Column(name="Add_PinCode")
	private long Pin;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, long Pin) {
		super();
		City = city;
		State = state;
		this.Pin=Pin;
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
	public long getPin() {
		return Pin;
	}
	public void setPin(long pin) {
		Pin = pin;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Pin=" + Pin + "]";
	}
	
	
	

}
