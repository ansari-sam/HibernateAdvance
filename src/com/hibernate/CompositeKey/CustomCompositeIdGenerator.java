package com.hibernate.CompositeKey;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomCompositeIdGenerator {
	
	public static PersonHomeOfficeId getIdGenerator() {
		PersonHomeOfficeId PHOId=null;
		Transaction Tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Tx=session.beginTransaction();
			
			Query q1=session.createQuery("select count(HomeId) from Person");
//			q1.setParameter(0, HomeId);
			List list=q1.list();
			if(list.size()==0) {
				PHOId=new PersonHomeOfficeId("HM001","OFF001");
			}else {
//				Query q2=session.createQuery("select count(HomeId) from Person");
				String id=q1.list().get(0).toString();
				int x=Integer.parseInt(id);
				x=x+1;
				if(x<=9) {
					PHOId=new PersonHomeOfficeId("HM00"+x,"OFF00"+x);
				}else if(x<=99){
					PHOId=new PersonHomeOfficeId("HM0"+x,"OFF0"+x);
				}else if(x<=999){
					PHOId=new PersonHomeOfficeId("HM"+x,"OFF"+x);
				}
				System.out.println("\n.................Generated ID: ...................");
				System.out.println("Generated HomeId :" +PHOId.getHomeId());
				System.out.println("Generated OfficeId :" +PHOId.getOfficeId());
				System.out.println("\n...........");
				return PHOId;
			}
			Tx.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return PHOId;
	}

}
