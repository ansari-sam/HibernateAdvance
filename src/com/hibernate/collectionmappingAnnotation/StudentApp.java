package com.hibernate.collectionmappingAnnotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentApp {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String cous[]= {"Java-8","JSP-1","Servlet-3"};
		
		List<String> ems=new ArrayList<String>();
		ems.add("aa@Jtc1.com");
		ems.add("bb@Jtc2.com");
		ems.add("cc@Jtc3.com");
		
		List<Integer> mks=new ArrayList<Integer>();
		mks.add(1001);
		mks.add(991);
		mks.add(1001);
		
		Set<Long> phn=new HashSet<Long>();
		phn.add((long) 223333);
		phn.add((long) 3333212);
		phn.add((long) 333386);
		
		Map<String,Long> ref=new HashMap<String,Long>();
		ref.put("aaaaaa", (long) 555555);
		ref.put("bbbbbb", (long) 666666);
		ref.put("cccccc", (long) 777777);
		
		//Creating Object of Student Class and save it into Database i.e. studentdetails
		
//		Student stu=new Student("Sam","10-10-1991","B.Tech",cous,ems,mks,phn,ref);
//		s.save(stu);
		
		Student stu1=(Student) s.load(Student.class, 1);
		System.out.println(stu1.getSid()+" "+stu1.getSname()+" "+stu1.getDob()+" "+stu1.getQualification());

		
		
		tx.commit();
		s.close();
		sf.close();

	}

}
