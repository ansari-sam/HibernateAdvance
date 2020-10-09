package com.hibernate.InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentsApp {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtilXML.getSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//1.Adding The STUDENTS
//		Student studentnew=new Student("SOM","Noida","Enabled",15000.00);
//		Integer it=(Integer) s.save(studentnew);
//		System.out.println(it.intValue());
		
		
		//2.Adding Current Student
//		CurrentStudent Cstd=new CurrentStudent("Rai", "Noida", "Enable", 15999.00, 2000, "6:30PM", "Sec-2");
//		Integer it=(Integer) s.save(Cstd);
//		System.out.println(it.intValue());
		
		//3.Adding Old Student
//		OldStudent Ostd=new OldStudent("SRai", "Noida", "Enable", 15000.00,"Wipro",500000.00,"SRai@Jtc.com");
//		Integer it=(Integer) s.save(Ostd);
//		System.out.println(it.intValue());
		
		//4.Adding Weekdays Student
//		WeekdaysStudent wstd=new WeekdaysStudent("Som Rai", "Noid-6", "Enable", 15001.00,3000,"6:30PM","Sec-2","B.tech","66%");
//		Integer it=(Integer) s.save(wstd);
//		System.out.println(it.intValue());
		
		//5.Adding Weekend Student
		WeekendStudent Westd=new WeekendStudent("Sam Husain", "Noid-22", "Enable", 26001.00,100,"6:30PM","Sec-2","HCL","Sam@java.com",600000.00);
		Integer it=(Integer) s.save(Westd);
		System.out.println(it.intValue());
		
		tx.commit();
		s.close();
		sf.close();

	}

}
