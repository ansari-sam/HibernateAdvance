package com.hibernate.CompositeKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Tx=session.beginTransaction();
			
			PersonHomeOfficeId id=CustomCompositeIdGenerator.getIdGenerator();
			Person p1=new Person("Ajay Yadav",99557779);
			p1.setPersonId(id);
			session.save(p1);
			
			
			Tx.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
