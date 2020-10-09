package com.hibernate.associationmapping.OneToOneAnn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cusaddress")
public class Address {
	@Id
	@Column(name="Aid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Aid;
	@Column(name="Street")
	private String Street;
	@Column(name="City")
	private String City;
	@Column(name="State")
	private String State;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String state) {
		super();
		Street = street;
		City = city;
		State = state;
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
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


	@Override
	public String toString() {
		return "Address [Aid=" + Aid + ", Street=" + Street + ", City=" + City + ", State=" + State + "]";
	}

}
