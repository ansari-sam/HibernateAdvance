package com.hibernate.associationmapping.OneToManyOrManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Request")
public class Request {
	@Id
	@Column(name = "Rid")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Rid;
	private String ReqDate;
	private String Description;
	private String Status;

	@ManyToOne
//	@JoinColumn(name="cid", referencedColumnName="cid")
	private JtcCustomer customer1;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(String reqDate, String description, String status, JtcCustomer Customer) {
		super();
		ReqDate = reqDate;
		Description = description;
		Status = status;
		customer1 = Customer;
	}

	public int getRid() {
		return Rid;
	}

	public void setRid(int rid) {
		Rid = rid;
	}

	public String getReqDate() {
		return ReqDate;
	}

	public void setReqDate(String reqDate) {
		ReqDate = reqDate;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public JtcCustomer getCustomer() {
		return customer1;
	}

	public void setCustomer(JtcCustomer customer) {
		this.customer1 = customer;
	}

	@Override
	public String toString() {
		return "Request [Rid=" + Rid + ", ReqDate=" + ReqDate + ", Description=" + Description + ", Status=" + Status
				+ "]";
	}

}
