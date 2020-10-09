package com.hibernate.associationmapping.OneToOneXML;

public class Address {
	private int Aid;
	private String Street;
	private String City;
	private String State;
	private Customer customer;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [Aid=" + Aid + ", Street=" + Street + ", City=" + City + ", State=" + State + "]";
	}

}
