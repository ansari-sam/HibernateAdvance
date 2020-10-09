package com.hibernate.Embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PersonDetails")
public class Person {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Person_Id")
	private int pId;
	@Column(name="Person_Name")
	private String pNAme;
	@Column(name="Person_Phone")
	private long pPhone;
	private Address address;//Here Person Table responsible add all declare property of Address with the help of @Embeddable Annotation 
							//	if we use in Address class and only one table will create
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String pNAme, long pPhone) {
		super();
		this.pNAme = pNAme;
		this.pPhone = pPhone;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpNAme() {
		return pNAme;
	}
	public void setpNAme(String pNAme) {
		this.pNAme = pNAme;
	}
	public long getpPhone() {
		return pPhone;
	}
	public void setpPhone(long pPhone) {
		this.pPhone = pPhone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pNAme=" + pNAme + ", pPhone=" + pPhone + ", address=" + address + "]";
	}
	
	

}
