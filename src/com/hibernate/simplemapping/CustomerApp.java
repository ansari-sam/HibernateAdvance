package com.hibernate.simplemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerApp {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtilXML.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Customer cust=new Customer("Sam", "Sam@123", "Noida", "7739587574");
		
		s.save(cust);
		tx.commit();
		s.close();
		sf.close();

	}

}
