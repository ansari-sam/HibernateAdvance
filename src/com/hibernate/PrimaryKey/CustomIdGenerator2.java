package com.hibernate.PrimaryKey;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator2 implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor si, Object obj) throws HibernateException {

		String prefix="JTCSTD00";
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Transaction Tx=session.beginTransaction();
				
			Query query=session.createQuery("select count(pId) from Person");
				List list=query.list();
				Object o=list.get(0);
				String id=o.toString();
				int x=Integer.parseInt(id);
				x=x+1;
				if(x<=9) {
					prefix="JTCSTD00"+x;
				}else if(x<=99){
					prefix="JTCSTD0"+x;
				}else if(x<=999){
					prefix="JTCSTD"+x;
				}
				
				String generatedId = prefix;
				System.out.println("...............\n");
				System.out.println("Generated Id: " + generatedId);
				System.out.println("Total Number of Person Present in this data :"+x);
				System.out.println("\n...............\n");
                return generatedId;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

}
