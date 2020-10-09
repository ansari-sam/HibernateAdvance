package com.hibernate.associationmapping.OneToManyOrManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JtcCustomerApp {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session s=sf.openSession();
			tx=s.beginTransaction();
			
			JtcCustomer cust=new JtcCustomer();
			cust.setCid(14);
			cust.setFirstName("Deepak");
			cust.setLastName("Shukla");
			cust.setPhone("9897977511");
			cust.setEmail("Dpak@511");
			
			
			Request req1=new Request();
			req1.setRid(15);
			req1.setReqDate("15 May");
			req1.setDescription("Give me live class timing");
			req1.setStatus("Okay1");
			req1.setCustomer(cust);
			
			Request req2=new Request();
			req2.setRid(16);
			req2.setReqDate("16 May");
			req2.setDescription("Give me offline class timing");
			req2.setStatus("Okay2");
			req2.setCustomer(cust);
			
			Request req3=new Request();
			req3.setRid(17);
			req3.setReqDate("17 may");
			req3.setDescription("Give me time slots for day class timing");
			req3.setStatus("Okay3");
			req3.setCustomer(cust);
			
			List<Request> c1=new ArrayList<Request>();
			c1.add(req1);
			c1.add(req2);
			c1.add(req3);
			cust.setRequest(c1);
			
//			s.saveOrUpdate(cust);
//			s.saveOrUpdate(req1);
//			s.saveOrUpdate(req2);
//			s.saveOrUpdate(req3);
			
			//Fetching data from DataBase
//			JtcCustomer jcus=(JtcCustomer) s.get(JtcCustomer.class, 13);
//			System.out.println(jcus);
//			System.out.println(jcus.getRequest().size());;
//			for(Request R:jcus.getRequest()) {
//				System.out.println(R.getRid()+" ,"+R.getDescription()+" ,"+R.getReqDate()+" ,"+R.getStatus()+" --"+R.getCustomer().getCid());
//			}
			
			//Loading Concept
			//LAZY Loading
//			JtcCustomer cust1=(JtcCustomer) s.get(JtcCustomer.class, 13);
//			System.out.println(cust1.getCid()+" : "+ cust1.getFirstName());//By Default Lazy
			//if we want request list then we have to call explicitly with cust1 Object
//			for(Request R:cust1.getRequest()) {
//				System.out.println(R.getRid() +" : "+R.getDescription());
//			}
			
			
			//EAGER Loading---in this loading it will invoke or call query for dependent reference object i.e Request or it will get automatic Request query also
			JtcCustomer cust1=(JtcCustomer) s.get(JtcCustomer.class, 13);
			System.out.println(cust1.getCid()+" : "+ cust1.getFirstName());
			for(Request R:cust1.getRequest()) {
			System.out.println(R.getRid() +" : "+R.getDescription());
		}
	
			tx.commit();
			s.close();
			sf.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	}

}
