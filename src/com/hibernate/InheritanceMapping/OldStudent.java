package com.hibernate.InheritanceMapping;

public class OldStudent extends Student{
	private String OCompany;
	private double OCtc;
	private String OEmail;
	public OldStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OldStudent(String sname, String city, String status, double totalFee,String oCompany, double oCtc, String oEmail) {
		super(sname, city, status, totalFee);
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