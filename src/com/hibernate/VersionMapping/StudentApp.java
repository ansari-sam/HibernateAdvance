package com.hibernate.VersionMapping;


import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StudentApp {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Tx=session.beginTransaction();
			
			
//			Timestamp mapping
//			Timestamp mapping is used to Time stamping the data i.e. you can track when the record was updated recently.
			
//			Student_Details std=new Student_Details();
//			std.setId(3);
//			std.setName("dev");
//			std.setCity("Noida-63");
//			session.save(std);
			
			//Version Mapping
//			When you insert a new record, then version value will be 0.
//			Whenever you update the record then version will be increased by one automatically.
			
			Student_Details sd=(Student_Details) session.load(Student_Details.class, 2);
			sd.setCity("Noida-11");
			sd.setModifyDate(new Date());
			session.save(sd);
			
			Tx.commit();
			session.close();
			sf.close();
			System.out.println("Record Updated");
//			System.out.println("Record Inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}

	}

}
