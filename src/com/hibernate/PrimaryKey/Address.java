package com.hibernate.PrimaryKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Person_Address")
//@Embeddable// This will save all data of address into person table with declare property within it(only one table will create i.e. Person and they have column:pId,pName,pPhone,Add_City,Add_State
public class Address {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name = "add_id", strategy = "com.hibernate.PrimaryKey.CustomIdForAdd")
	@GeneratedValue(generator = "add_id")
	@Column(name="Add_Id")
	private String aId;
//	private int aId;
	@Column(name="Add_City")
	private String City;
	@Column(name="Add_State")
	private String State;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state) {
		super();
		City = city;
		State = state;
	}
//	public int getaId() {
//		return aId;
//	}
//	public void setaId(int aId) {
//		this.aId = aId;
//	}
	
	
	public String getCity() {
		return City;
	}
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
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
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", City=" + City + ", State=" + State + "]";
	}
	
	

}
