package com.BookStoreApplication;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Book_Id")
	private int bId;
	@Column(name="Book_Name")
	private String bName;
	@Column(name="Book_Cost")
	private double bCost;
	@Column(name="Book_Edition")
	private int bEdition;
	@Column(name="Book_Publication")
	private String bPublication;
	@OneToOne
	@JoinColumn(name="oItem_Id")
	private OrderItem oItems;
	@ManyToMany(mappedBy="books")
	private Set<Author> authors;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bName, double bCost, int bEdition, String bPublication) {
		super();
		this.bName = bName;
		this.bCost = bCost;
		this.bEdition = bEdition;
		this.bPublication = bPublication;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public double getbCost() {
		return bCost;
	}
	public void setbCost(double bCost) {
		this.bCost = bCost;
	}
	public int getbEdition() {
		return bEdition;
	}
	public void setbEdition(int bEdition) {
		this.bEdition = bEdition;
	}
	public String getbPublication() {
		return bPublication;
	}
	public void setbPublication(String bPublication) {
		this.bPublication = bPublication;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
		
	public OrderItem getoItems() {
		return oItems;
	}

	public void setoItems(OrderItem oItems) {
		this.oItems = oItems;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bCost=" + bCost + ", bEdition=" + bEdition
				+ ", bPublication=" + bPublication + ", authors=" + authors + "]";
	}
	
	

}
