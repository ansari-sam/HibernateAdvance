package com.hibernate.CompositeKey;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PersoncompositeKey")
public class Person {
	@Id
	@Embedded
	@AttributeOverrides({@AttributeOverride(name="HomeId",column=@Column(name="HomeId")),@AttributeOverride(name="OfficeId",column=@Column(name="OfficeId"))})
	private PersonHomeOfficeId PersonId;
	@Column(name="Person_Name")
	private String pNAme;
	@Column(name="Person_Phone")
	private long pPhone;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String pNAme, long pPhone) {
		super();
		this.pNAme = pNAme;
		this.pPhone = pPhone;
	}
	
	public String getpNAme() {
		return pNAme;
	}
	
	public void setpNAme(String pNAme) {
		this.pNAme = pNAme;
	}
	public long getpPhone() {
		return pPhone;
	}
	public void setpPhone(long pPhone) {
		this.pPhone = pPhone;
	}
	public PersonHomeOfficeId getPersonId() {
		return PersonId;
	}
	public void setPersonId(PersonHomeOfficeId personId) {
		PersonId = personId;
	}
	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", pNAme=" + pNAme + ", pPhone=" + pPhone + "]";
	}
	
	
	

}
