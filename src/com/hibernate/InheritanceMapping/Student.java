package com.hibernate.InheritanceMapping;

public class Student {
	private int Sid;
	private String Sname;
	private String City;
	private String Status;
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
