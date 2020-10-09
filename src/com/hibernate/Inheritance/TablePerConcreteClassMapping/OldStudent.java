package com.hibernate.Inheritance.TablePerConcreteClassMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OSTU1")
public class OldStudent extends Student{
	@Column(name="OCompany")
	private String OCompany;
	@Column(name="OCtc")
	private double OCtc;
	@Column(name="OEmail")
	private String OEmail;
	public OldStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OldStudent(int sid,String sname, String city, String status, double totalFee,String oCompany, double oCtc, String oEmail) {
		super(sid,sname, city, status, totalFee);
		OCompany = oCompany;
		OCtc = oCtc;
		OEmail = oEmail;
	}
	public String getOCompany() {
		return OCompany;
	}
	public void setOCompany(String oCompany) {
		OCompany = oCompany;
	}
	public double getOCtc() {
		return OCtc;
	}
	public void setOCtc(double oCtc) {
		OCtc = oCtc;
	}
	public String getOEmail() {
		return OEmail;
	}
	public void setOEmail(String oEmail) {
		OEmail = oEmail;
	}
	@Override
	public String toString() {
		return "OldStudent [OCompany=" + OCompany + ", OCtc=" + OCtc + ", OEmail=" + OEmail + "]";
	}
	
	
	
	
}