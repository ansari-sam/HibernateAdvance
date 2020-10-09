package com.hibernate.Inheritance.TablePerConcreteClassMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="WDSTU1")
public class WeekdaysStudent extends CurrentStudent{
	@Column(name="Qualification")
	private String Qualification;
	@Column(name="Percentage")
	private String Percentage;
	
	public WeekdaysStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeekdaysStudent(int sid,String sname, String city, String status, double totalFee, int feeBal, String timing, String branch,String qualification, String percentage) {
		super(sid,sname, city, status, totalFee,feeBal, timing,  branch);
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
