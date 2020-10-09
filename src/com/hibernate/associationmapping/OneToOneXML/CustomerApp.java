package com.hibernate.associationmapping.OneToOneXML;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerApp {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtilXML.getSessionFactory();
			Session s=sf.openSession();
			tx=s.beginTransaction();
			
			Address add=new Address("Sec-22","Noida","Uttar Pradesh");
			
			Customer cust=new Customer("Saddam","Husain","8873521701","husainsaddam354@gmail.com");
			add.setCustomer(cust);
			cust.setAddress(add);
			s.save(cust);
			s.save(add);
			
			tx.commit();
			s.close();
			sf.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		

	}

}
