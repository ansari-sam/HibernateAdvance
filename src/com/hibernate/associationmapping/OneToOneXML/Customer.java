package com.hibernate.associationmapping.OneToOneXML;

public class Customer {
	private int Cid;
	private String FirstName;
	private String LastName;
	private String Phone;
	private String Email;
	private Address address;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String phone, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Phone = phone;
		Email = email;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone
				+ ", Email=" + Email + ", address=" + address + "]";
	}

}
