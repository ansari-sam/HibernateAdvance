package com.hibernate.HQLAdvanceAndQBC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_Id")
	private int eId;
	@Column(name="Emp_Name")
	private String eName;
	@Column(name="Emp_Email")
	private String eEmail;
	@Column(name="Emp_Phone")
	private long ePhone;
	@Column(name="Emp_City")
	private String eCity;
	@Column(name="Emp_Salary")
	private int eSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String eName, String eEmail, long ePhone, String eCity, int eSalary) {
		super();
		this.eName = eName;
		this.eEmail = eEmail;
		this.ePhone = ePhone;
		this.eCity = eCity;
		this.eSalary = eSalary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public long getePhone() {
		return ePhone;
	}
	public void setePhone(long ePhone) {
		this.ePhone = ePhone;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eEmail=" + eEmail + ", ePhone=" + ePhone + ", eCity="
				+ eCity + ", eSalary=" + eSalary + "]";
	}
	

}
