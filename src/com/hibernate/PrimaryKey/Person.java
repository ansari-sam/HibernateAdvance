package com.hibernate.PrimaryKey;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Person")
public class Person {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name = "person_id", strategy = "com.hibernate.PrimaryKey.CustomIdGenerator2")
	@GeneratedValue(generator = "person_id")
	@Column(name="Person_Id")
	private String pId;
//	private int pId;
	@Column(name="Person_Name")
	private String pNAme;
	@Column(name="Person_Phone")
	private long pPhone;
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
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
//	public int getpId() {
//		return pId;
//	}
//	public void setpId(int pId) {
//		this.pId = pId;
//	}
	
	public String getpNAme() {
		return pNAme;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
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
