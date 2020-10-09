package com.hibernate.associationmapping.ManyToManyAnn;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="jStudent")
public class Student {
	@Id
	@Column(name="studentId")
	private int Sid;
	@Column(name="studentName")
	private String Sname;
	@Column(name="studentEmail")
	private String Email;
	@Column(name="studentPhone")
	private String Phone;
	
	@ManyToMany(mappedBy="student")
	private List<Course> course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String email, String phone, List<Course> course) {
		super();
		Sname = sname;
		Email = email;
		Phone = phone;
		this.course = course;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Email=" + Email + ", Phone=" + Phone + ", course="
				+ course + "]";
	}
	

}
