package com.hibernate.collectionmappingAnnotation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="MyStudents")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Sid")
	private int sid;
	@Column(name="Sname")
	private String sname;
	@Column(name="DOB")
	private String dob;
	@Column(name="Quali")
	private String qualification;
	@CollectionOfElements
	@JoinTable(name="courses", joinColumns= @JoinColumn(name="Sid"))
	@IndexColumn(name="idx")
	@Column(name="Courses")
	private String[] courses;
	@CollectionOfElements
	@JoinTable(name="emails", joinColumns= @JoinColumn(name="Sid"))
	@IndexColumn(name="idx")
	@Column(name="Emails")
	private List<String> emails;
	@CollectionOfElements
	@JoinTable(name="marks", joinColumns= @JoinColumn(name="Sid"))
	@Column(name="Marks")
	private List<Integer> marks;//if we mapping this into XML we must declare it with <bag><bag/> TAG.
	@CollectionOfElements
	@JoinTable(name="phone", joinColumns= @JoinColumn(name="Sid"))
	@Column(name="Phone")
	private Set<Long> phone;
	@CollectionOfElements
	@JoinTable(name="refs", joinColumns= @JoinColumn(name="Sid"))
	@IndexColumn(name="Rname")
	@Column(name="Rphone")
	private Map<String,Long> refs;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String dob, String qualification, String[] courses, List<String> emails,
			List<Integer> marks, Set<Long> phone, Map<String, Long> refs) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phone = phone;
		this.refs = refs;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Set<Long> getPhone() {
		return phone;
	}
	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}
	public Map<String, Long> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}
	
	

}
