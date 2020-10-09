package com.hibernate.VersionMapping;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="StudentNew")
public class Student_Details {
	@Id
	@Column(name="Student_ID")
	private int id;
	@Column(name="Student_Name")
	private String name;
	@Column(name="Student_City")
	private String City;
	@javax.persistence.Version
	private int Version;

	@Temporal(value=TemporalType.DATE)
	@Column(name = "modify_date")
	private Date modifyDate;
	
	
	public Student_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student_Details(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
//	@PrePersist
//    protected void onCreate() {
//		modifyDate =  new Date();
//    }
//
//    @PreUpdate
//    protected void onUpdate() {
//    	modifyDate = new Date();
//    }
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", City=" + City + "]";
	}

}
