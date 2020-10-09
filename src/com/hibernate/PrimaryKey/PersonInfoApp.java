package com.hibernate.PrimaryKey;

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
			
			Address add=new Address("Patna","HR");
			
			Person p1=new Person("Pankaj",989118);
			p1.setAddress(add);
//			p1.setpId(CustomIdGenerator3.getNextCid());
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
