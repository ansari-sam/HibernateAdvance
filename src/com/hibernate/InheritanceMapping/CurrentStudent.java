package com.hibernate.InheritanceMapping;

public class CurrentStudent extends Student{
	private int FeeBal;
	private String Timing;
	private String Branch;
	
	public CurrentStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentStudent(String sname, String city, String status, double totalFee, int feeBal, String timing, String branch) {
		super(sname, city, status, totalFee);
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
