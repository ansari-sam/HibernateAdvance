package com.hibernate.associationmapping.OneToOneAnn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mycustomers")
public class Customer {
	@Id
	@Column(name="Cid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Cid;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="Phone")
	private String Phone;
	@Column(name="Email")
	private String Email;
	@OneToOne
	@JoinColumn(name="Aid")
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
