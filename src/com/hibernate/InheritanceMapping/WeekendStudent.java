package com.hibernate.InheritanceMapping;

public class WeekendStudent extends CurrentStudent{
	private String WCompany;
	private String WEmail;
	private double WCtc;
	public WeekendStudent() {
		super();
	}
	public WeekendStudent(String sname, String city, String status, double totalFee, int feeBal, String timing, String branch,String wCompany, String wEmail, double wCtc) {
		super(sname, city, status, totalFee,feeBal, timing,  branch);
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
