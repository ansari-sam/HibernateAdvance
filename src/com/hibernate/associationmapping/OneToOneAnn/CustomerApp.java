package com.hibernate.associationmapping.OneToOneAnn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerApp {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			Session s=sf.openSession();
			tx=s.beginTransaction();
			
//			Address add=new Address("Sec-2","Noida","Uttar Pradesh");
//			Customer cust=new Customer("payal","dey","8873521798","deypayal123@gmail.com");
//			cust.setAddress(add);
//			s.save(cust);
//			s.save(add);
			
			Customer cust=(Customer) s.load(Customer.class, 2);
			System.out.println(cust.getCid()+" "+cust.getFirstName()+" "+cust.getLastName()+" "+cust.getPhone()+" "+cust.getEmail());
			
			Address add=cust.getAddress();
			System.out.println(add.getCity()+" "+add.getStreet()+" "+add.getState());
			
			
			
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
