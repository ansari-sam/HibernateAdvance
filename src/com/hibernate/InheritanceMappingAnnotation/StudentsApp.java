package com.hibernate.InheritanceMappingAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentsApp {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
//		Table per sub class mapping
//		In this mapping you need to take one table per one sub class.
//		Student is the main super class which will have the master table called my students.
//		Every subclass will have its own table.
		
//		 When you save student class object then
//		o Only one record will be inserted in my students.
//		 When you save current student class object then.
//		o One record will be inserted in my students.
//		o One record will be inserted in students
//		 When you save Old Student class object then.
//		o One record will be inserted in my students.
//		o One record will be inserted in ostudents.
//		 When you save weekday student class object then
//		o One record will be inserted in my students.
//		o One record will be inserted in csteudents.
//		o One record will be inserted in wdstudents.
		
		//1.Adding The STUDENTS
//		Student studentnew=new Student("Samy","Noida","Enabled",26000.00);
//		Integer it=(Integer) s.save(studentnew);
//		System.out.println(it.intValue());
		
		
		//2.Adding Current Student
//		CurrentStudent Cstd=new CurrentStudent("Rai", "Noida", "Enable", 15999.00, 2000, "6:30PM", "Sec-2");
//		Integer it=(Integer) s.save(Cstd);
//		System.out.println(it.intValue());
		
		//3.Adding Old Student
		OldStudent Ostd=new OldStudent("Anshuman", "Noida", "Enable", 20000.00,"HCL",500000.00,"Anshu@Jtc.com");
		Integer it=(Integer) s.save(Ostd);
		System.out.println(it.intValue());
		
		//4.Adding Weekdays Student
		WeekdaysStudent wstd=new WeekdaysStudent("Deepak", "Noid-6", "Enable", 17001.00,3000,"6:30PM","Sec-2","B.tech","70%");
		Integer it1=(Integer) s.save(wstd);
		System.out.println(it1.intValue());
		
		//5.Adding Weekend Student
		WeekendStudent Westd=new WeekendStudent("Sadam Husain", "Noid-22", "Enable", 26500.00,100,"6:30PM","Sec-2","TCS","Sam@java.com",700000.00);
		Integer it2=(Integer) s.save(Westd);
		System.out.println(it2.intValue());
		
		tx.commit();
		s.close();
		sf.close();

	}

}
