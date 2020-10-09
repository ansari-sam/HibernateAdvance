package com.hibernate.HQL;

import java.util.List;

import org.hibernate.Query;
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
			
			
//			for(int i=10;i<=30;i++) {
//				Student_Details std=new Student_Details();
//				std.setId(i);
//				std.setName("Name "+i);
//				std.setCity("City "+i);
//				session.save(std);
//			}
			
			//Fetching Data from Database using HQL (Hibernate Query Language)
			//Select all Data from Database
//			String query="from Student_Details";
//			Query q=session.createQuery(query);
//			List<Student_Details> list1=q.list();
//			System.out.println(list1);
//			for(Student_Details sd:list1) {
//				System.out.println(sd.getId()+" : "+sd.getName()+" : "+sd.getCity());
//			}
			
			//Updating Data HQL Query
//			String qry="update Student_Details set City='Noida' where Student_ID=16";
//			Query q=session.createQuery(qry);
//			Query q1=session.createQuery("update Student_Details set City='Noida' where Student_ID=16");
//			Query q1=session.createQuery("update Student_Details set City=:c where Student_ID=:id");//Dynamic query execution
//			Query q1=session.createQuery("update Student_Details as S set S.City=:c where Student_ID=:id");//Dynamic query execution
//			q1.setParameter("c", "Delhi");
//			q1.setParameter("id", "19");
//			int a=q1.executeUpdate();
//			System.out.println("Details Updated: "+a);
			
			
			//Delete HQL Query
//			Query query=session.createQuery("delete Student_Details where Student_ID=11");
//			int b=query.executeUpdate();
//			System.out.println("Deleted : "+b);
			
//			Query query=session.createQuery("delete from Student_Details as S where S.id=:id");//Dynamic query execution(Alias Selectio)
//			query.setParameter("id", 13);
//			int b=query.executeUpdate();
//			System.out.println("Deleted : "+b);
			
			//Pagination Using hibernate
			Query q=session.createQuery("from Student_Details");
//			q.setFirstResult(0);
//			q.setMaxResults(5);
			
			q.setFirstResult(5);//set  starting  point
			q.setMaxResults(10);//set length from starting point
			
			List<Student_Details>list1=q.list();
			
			for(Student_Details sd:list1) {
				System.out.println(sd.getId()+" : "+sd.getName()+" : "+sd.getCity());
			}
			
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
