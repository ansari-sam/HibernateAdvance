package com.hibernate.associationmapping.ManyToManyAnn;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="jCourse")
public class Course {
	@Id
	@Column(name="courseId")
	private int cId;
	@Column(name="courseName")
	private String cName;
	@Column(name="courseDuration")
	private String cDuration;
	@Column(name="courseCost")
	private String cCost;
	
	@ManyToMany
	@JoinTable(name="Student_Course")
	private List<Student> student;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cId, String cName, String cDuration, String cCost, List<Student> student) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cDuration = cDuration;
		this.cCost = cCost;
		this.student = student;
	}

	public Course(String cName, String cDuration, String cCost, List<Student> student) {
		super();
		this.cName = cName;
		this.cDuration = cDuration;
		this.cCost = cCost;
		this.student = student;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcDuration() {
		return cDuration;
	}

	public void setcDuration(String cDuration) {
		this.cDuration = cDuration;
	}

	public String getcCost() {
		return cCost;
	}

	public void setcCost(String cCost) {
		this.cCost = cCost;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cDuration=" + cDuration + ", cCost=" + cCost
				+ ", student=" + student + "]";
	}
	
	

}
