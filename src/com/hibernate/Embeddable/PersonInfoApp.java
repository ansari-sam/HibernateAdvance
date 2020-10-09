package com.hibernate.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonInfoApp {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Tx=session.beginTransaction();
			
			Address add=new Address("Noida","UP",201301);
			
			Person p1=new Person("Saddam",9896654);
			p1.setAddress(add);
			session.save(p1);
			
			
			Tx.commit();
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}

	}

}
