package com.hibernate.Inheritance.TablePerConcreteClassMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="InheritanceTablePerConcreteClass")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Student {
	@Id
	@Column(name="sid")
	//@GeneratedValue(strategy=GenerationType.AUTO)//Cannot use identity column key generation
	private int Sid;
	@Column(name="Sname")
	private String Sname;
	@Column(name="City")
	private String City;
	@Column(name="Status")
	private String Status;
	@Column(name="TotalFee")
	private double TotalFee;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String city, String status, double totalFee) {
		super();
		Sname = sname;
		City = city;
		Status = status;
		TotalFee = totalFee;
	}
	
	public Student(int sid, String sname, String city, String status, double totalFee) {
		super();
		Sid = sid;
		Sname = sname;
		City = city;
		Status = status;
		TotalFee = totalFee;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public double getTotalFee() {
		return TotalFee;
	}
	public void setTotalFee(double totalFee) {
		TotalFee = totalFee;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", City=" + City + ", Status=" + Status + ", TotalFee="
				+ TotalFee + "]";
	}
	

}
