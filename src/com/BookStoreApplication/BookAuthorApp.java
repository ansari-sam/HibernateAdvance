package com.BookStoreApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookAuthorApp {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Tx=session.beginTransaction();
			
			//Author Qualification List
			List<String> aQualification=new ArrayList<String>();
			aQualification.add("MSc");
			aQualification.add("M.C.A");
			aQualification.add("M.Tech");
			
			//Author Experience List
			Set<String> aExperience =new HashSet<String>();
			aExperience.add("SUN");
			aExperience.add("IBM");
			aExperience.add("Oracle");
			
			//Creating Author Object
			Author a1=new Author("Vikash","Vikash@123",989766,aQualification,aExperience);
			session.save(a1);
			Author a2=new Author("SOM","Rai@123",912766,aQualification,aExperience);
			session.save(a2);
			
			//Creating Book Object
			Book b1=new Book("Master Java",999.00,1,"Jtc");
			session.save(b1);
			Book b2=new Book("Master Hibernate",899.00,1,"Jtc");
			session.save(b2);
			Book b3=new Book("Master Spring",799.00,1,"Jtc");
			session.save(b3);
			
			//Setting Author list in Book Object
			Set<Author> as1=new HashSet<Author>();
			as1.add(a1);
			Set<Author> as2=new HashSet<Author>();
			as2.add(a1);
			as2.add(a2);
			b1.setAuthors(as1);
			b2.setAuthors(as2);
			b3.setAuthors(as2);
			
			//Setting Book list in Author Object
			Set<Book> bs1=new HashSet<Book>();
			bs1.add(b1);
			bs1.add(b2);
			Set<Book> bs2=new HashSet<Book>();
			bs2.add(b3);
			bs2.add(b2);
			a1.setBooks(bs1);
			a2.setBooks(bs2);
			
			Tx.commit();
			session.close();
			System.out.println("Record Inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}

	}

}
