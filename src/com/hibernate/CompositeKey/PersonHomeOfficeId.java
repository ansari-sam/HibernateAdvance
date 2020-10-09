package com.hibernate.CompositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonHomeOfficeId implements Serializable{

	private String HomeId;
	private String OfficeId;
	
	public PersonHomeOfficeId() {
		super();
	}

	public PersonHomeOfficeId(String homeId, String officeId) {
		super();
		HomeId = homeId;
		OfficeId = officeId;
	}

	public String getHomeId() {
		return HomeId;
	}

	public void setHomeId(String homeId) {
		HomeId = homeId;
	}

	public String getOfficeId() {
		return OfficeId;
	}

	public void setOfficeId(String officeId) {
		OfficeId = officeId;
	}
	
	
}
