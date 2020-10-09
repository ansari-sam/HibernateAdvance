package com.BookStoreApplication;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerCcardApp {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
		SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
		Session session=sf.openSession();
		Tx=session.beginTransaction();
		
		//Creating CrediCard Object---I get difficulty to add Customer_Id column in CreditCard Table
		CreditCard cc1=new CreditCard(9866,"Visa",124,new Date());
		session.save(cc1);
		
		//Creating Object of SilverCustomer
		SilverCustomer sc1=new SilverCustomer("sam","sam@123",7877,"Noida-11",9,"sam@123");
		sc1.setcCard(cc1);
		session.save(sc1);
		
		//Creating Object of GoldCustomer
		Map<String,String> refs=new HashMap<String,String>();
		refs.put("Minu", "6654");
		refs.put("Nilam", "3354");
		
		CreditCard cc2=new CreditCard(7688,"Visa",788,new Date());
		session.save(cc2);
		
		GoldCustomer gc1=new GoldCustomer("Payal","Dey@123",7877,6677,refs,900);
		gc1.setcCard(cc2);
		session.save(gc1);
		
		Tx.commit();
		session.close();
		System.out.println("Record Inserted");
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
			Tx.rollback();
		}

	}

}
