package com.hibernate.Inheritance.TablePerConcreteClassMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentsApp {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
//		Table per concrete class mapping
//		In this mapping, you need to take one table for one concrete class.
		//each object of each table class will save to each table only.
		
//		Don‟t specify the primary key generation for Sid.
//		You set the Sid value to all the objects in the client code.
//		Don‟t save all types of student class objects in one session.
		
		//1.Adding The STUDENTS
//		Student studentnew=new Student(1,"Som","Noida","Enabled",27000.00);
//		Integer it=(Integer) s.save(studentnew);
//		System.out.println(it.intValue());
		
		
		//2.Adding Current Student
//		CurrentStudent Cstd=new CurrentStudent(2,"Rai", "Noida", "Enable", 15999.00, 2000, "6:30PM", "Sec-2");
//		Integer it=(Integer) s.save(Cstd);
//		System.out.println(it.intValue());
		
		//3.Adding Old Student
//		OldStudent Ostd=new OldStudent(1,"Anshuman", "Noida", "Enable", 20000.00,"HCL",500000.00,"Anshu@Jtc.com");
//		Integer it=(Integer) s.save(Ostd);
//		System.out.println(it.intValue());
		
		//4.Adding Weekdays Student
//		WeekdaysStudent wstd=new WeekdaysStudent(1,"Deepak", "Noid-6", "Enable", 17001.00,3000,"6:30PM","Sec-2","B.tech","70%");
//		Integer it1=(Integer) s.save(wstd);
//		System.out.println(it1.intValue());
		
		//5.Adding Weekend Student
		WeekendStudent Westd=new WeekendStudent(1,"Sadam Husain", "Noid-22", "Enable", 26500.00,100,"6:30PM","Sec-2","TCS","Sam@java.com",700000.00);
		Integer it2=(Integer) s.save(Westd);
		System.out.println(it2.intValue());
		
		tx.commit();
		s.close();
		sf.close();

	}

}
