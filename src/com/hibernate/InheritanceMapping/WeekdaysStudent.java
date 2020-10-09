package com.hibernate.InheritanceMapping;

public class WeekdaysStudent extends CurrentStudent{
	private String Qualification;
	private String Percentage;
	
	public WeekdaysStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeekdaysStudent(String sname, String city, String status, double totalFee, int feeBal, String timing, String branch,String qualification, String percentage) {
		super(sname, city, status, totalFee,feeBal, timing,  branch);
		Qualification = qualification;
		Percentage = percentage;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getPercentage() {
		return Percentage;
	}

	public void setPercentage(String percentage) {
		Percentage = percentage;
	}

	@Override
	public String toString() {
		return "WeekdaysStudent [Qualification=" + Qualification + ", Percentage=" + Percentage + "]";
	}
	
	
}
