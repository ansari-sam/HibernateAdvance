package com.hibernate.Inheritance.TablePerConcreteClassMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="WESTU1")
public class WeekendStudent extends CurrentStudent{
	@Column(name="WCompany")
	private String WCompany;
	@Column(name="WEmail")
	private String WEmail;
	@Column(name="WCtc")
	private double WCtc;
	public WeekendStudent() {
		super();
	}
	public WeekendStudent(int sid,String sname, String city, String status, double totalFee, int feeBal, String timing, String branch,String wCompany, String wEmail, double wCtc) {
		super(sid,sname, city, status, totalFee,feeBal, timing,  branch);
		WCompany = wCompany;
		WEmail = wEmail;
		WCtc = wCtc;
	}
	public String getWCompany() {
		return WCompany;
	}
	public void setWCompany(String wCompany) {
		WCompany = wCompany;
	}
	public String getWEmail() {
		return WEmail;
	}
	public void setWEmail(String wEmail) {
		WEmail = wEmail;
	}
	public double getWCtc() {
		return WCtc;
	}
	public void setWCtc(double wCtc) {
		WCtc = wCtc;
	}
	@Override
	public String toString() {
		return "WeekendStudent [WCompany=" + WCompany + ", WEmail=" + WEmail + ", WCtc=" + WCtc + "]";
	}
	
	

}
