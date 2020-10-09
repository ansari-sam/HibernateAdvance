package com.hibernate.associationmapping.ManyToManyAnn;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JtcStudentCourseApp {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session session=sf.openSession();
			Tx=session.beginTransaction();
			
			//Creating Student Object
			Student s1=new Student();
			s1.setSid(21);
			s1.setSname("Sadam");
			s1.setEmail("husain@123");
			s1.setPhone("8976445533");
			
			Student s2=new Student();
			s2.setSid(22);
			s2.setSname("Samy");
			s2.setEmail("samy@123");
			s2.setPhone("667543533");
			
			//Creating Course Object
			Course c1=new Course();
			c1.setcId(31);
			c1.setcName("Java");
			c1.setcDuration("6 Month");
			c1.setcCost("18000");
			
			Course c2=new Course();
			c2.setcId(32);
			c2.setcName("Python");
			c2.setcDuration("3 Month");
			c2.setcCost("15000");
			
			Course c3=new Course();
			c3.setcId(33);
			c3.setcName("Php");
			c3.setcDuration("4 Month");
			c3.setcCost("16000");
			
			//Creating List Of Student
			List<Student> list1=new ArrayList<Student>();
			list1.add(s1);
			list1.add(s2);
			c1.setStudent(list1);
			c2.setStudent(list1);
			
			List<Course> list2=new ArrayList<Course>();
			list2.add(c3);
			list2.add(c2);
			list2.add(c1);
			s1.setCourse(list2);
			s2.setCourse(list2);
			
			//Save Data to Database
			session.saveOrUpdate(s1);
			session.saveOrUpdate(s2);
			
			session.saveOrUpdate(c1);
			session.saveOrUpdate(c2);
			session.saveOrUpdate(c3);
			
			
			Tx.commit();
			session.close();
			sf.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}

	}

}
