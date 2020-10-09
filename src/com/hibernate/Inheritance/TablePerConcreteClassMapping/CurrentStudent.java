package com.hibernate.Inheritance.TablePerConcreteClassMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CSTU1")
public class CurrentStudent extends Student{
	@Column(name="FeeBal")
	private int FeeBal;
	@Column(name="Timing")
	private String Timing;
	@Column(name="Branch")
	private String Branch;
	
	public CurrentStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentStudent(int sid,String sname, String city, String status, double totalFee, int feeBal, String timing, String branch) {
		super(sid,sname, city, status, totalFee);
		FeeBal = feeBal;
		Timing = timing;
		Branch = branch;
	}
	
	public int getFeeBal() {
		return FeeBal;
	}
	public void setFeeBal(int feeBal) {
		FeeBal = feeBal;
	}
	public String getTiming() {
		return Timing;
	}
	public void setTiming(String timing) {
		Timing = timing;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	@Override
	public String toString() {
		return "CurrentStudent [FeeBal=" + FeeBal + ", Timing=" + Timing + ", Branch=" + Branch + "]";
	}
	
	

}
