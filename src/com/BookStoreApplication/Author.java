package com.BookStoreApplication;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="Authors")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Author_Id")
	private int aID;
	@Column(name="Author_Name")
	private String aName;
	@Column(name="Author_Email")
	private String aEmail;
	@Column(name="Author_Phone")
	private long aPhone;
	@CollectionOfElements
	@JoinTable(name="Author_Qualification", joinColumns= @JoinColumn(name="Author_Id"))
	@IndexColumn(name="idx")
	@Column(name="Author_Qualification")
	private List<String> aQualification;
	@CollectionOfElements
	@JoinTable(name="Author_Experience", joinColumns= @JoinColumn(name="Author_Id"))
	@IndexColumn(name="idx")
	@Column(name="Author_Experience")
	private Set<String> aExperience;
	@ManyToMany
	@JoinTable(name="Books_Authors",joinColumns=@JoinColumn(name="Author_Id",referencedColumnName="Author_Id"),inverseJoinColumns=@JoinColumn(name="Book_Id",referencedColumnName="Book_Id"))
	private Set<Book> books;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Author(String aName, String aEmail, long aPhone, List<String> aQualification, Set<String> aExperience) {
		super();
		this.aName = aName;
		this.aEmail = aEmail;
		this.aPhone = aPhone;
		this.aQualification = aQualification;
		this.aExperience = aExperience;
	}
	
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public long getaPhone() {
		return aPhone;
	}
	public void setaPhone(long aPhone) {
		this.aPhone = aPhone;
	}
	public List<String> getaQualification() {
		return aQualification;
	}
	public void setaQualification(List<String> aQualification) {
		this.aQualification = aQualification;
	}
	public Set<String> getaExperience() {
		return aExperience;
	}
	public void setaExperience(Set<String> aExperience) {
		this.aExperience = aExperience;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [aID=" + aID + ", aName=" + aName + ", aEmail=" + aEmail + ", aPhone=" + aPhone
				+ ", aQualification=" + aQualification + ", aExperience=" + aExperience + ", books=" + books + "]";
	}
	

}
