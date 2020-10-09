package com.hibernate.collectionMapping;

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
		SessionFactory sf=HibernateUtilXML.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String cous[]= {"Java","JSP","Servlet"};
		
		List<String> ems=new ArrayList<String>();
		ems.add("aa@Jtc.com");
		ems.add("bb@Jtc.com");
		ems.add("cc@Jtc.com");
		
		List<Integer> mks=new ArrayList<Integer>();
		mks.add(100);
		mks.add(99);
		mks.add(100);
		
		Set<Long> phn=new HashSet<Long>();
		phn.add((long) 111111);
		phn.add((long) 5677736);
		phn.add((long) 3425254);
		
		Map<String,Long> ref=new HashMap<String,Long>();
		ref.put("aaaaaa", (long) 222222);
		ref.put("bbbbbb", (long) 233333);
		ref.put("cccccc", (long) 344444);
		
		//Creating Object of Student Class and save it into Database i.e. studentdetails
		
//		Student stu=new Student("Sam","10-10-1991","B.Tech",cous,ems,mks,phn,ref);
//		s.save(stu);
		
//		Student stu1=(Student) s.load(Student.class, 1);
//		System.out.println(stu1.getSid()+" "+stu1.getSname()+" "+stu1.getDob()+" "+stu1.getQualification());
//		System.out.println(".................");
//		System.out.println(stu1.getCourses());
//		System.out.println(stu1.getMarks());
//		System.out.println(stu1.getEmails());
//		System.out.println(stu1.getPhone());
//		System.out.println(stu1.getRefs());
		
		
		tx.commit();
		s.close();
		sf.close();

	}

}
