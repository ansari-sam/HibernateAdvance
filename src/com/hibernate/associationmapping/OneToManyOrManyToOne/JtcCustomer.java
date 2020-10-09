package com.hibernate.associationmapping.OneToManyOrManyToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jtccustomers")
public class JtcCustomer {
	@Id
	@Column(name="cid")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="Email")
	private String Email;
	@Column(name="Phone")
	private String Phone;
	@OneToMany(mappedBy="customer1",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Request> request;
	
	public JtcCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JtcCustomer(String firstName, String lastName, String email, String phone) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Phone = phone;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

	public List<Request> getRequest() {
		return request;
	}
	public void setRequest(List<Request> request) {
		this.request = request;
	}
	@Override
	public String toString() {
		return "JtcCustomer [cid=" + cid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Phone=" + Phone + "]";
	}
	
	

}
