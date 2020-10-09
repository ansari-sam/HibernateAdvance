package com.hibernate.simplemappingAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerApp {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Customer cust=new Customer(2,"Sunny", "Som@231", "Noida-1", "7739587765");
		
		s.save(cust);
		tx.commit();
		s.close();
		sf.close();

	}

}
