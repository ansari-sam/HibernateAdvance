package com.BookStoreApplication;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StoreTransactionApp {

	public static void main(String[] args) {
		
		Transaction Tx=null;
		try {
		SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
		Session session=sf.openSession();
		Tx=session.beginTransaction();
		
		//Get Customer Info
		Customer cust=(Customer) session.get(Customer.class, 1);
		System.out.println(".........Get Customer Info......");
		System.out.println(cust.getCusId()+": "+cust.getCusName()+": "+cust.getCusEmail()+": "+cust.getCusPhone());
		
		//Get CreditCard Details
		CreditCard cc=cust.getcCard();
		System.out.println(".........Get CreditCard Details......");
		System.out.println(cc.getCcId()+" :"+cc.getCcNo()+" :"+cc.getCcType()+" :"+cc.getCcExpDate());
		
		//Get Order Info
		
		Set<Order> orders=cust.getOrders();
		for (Order o:orders) {
			System.out.println(".........Get Order Info.......");
			System.out.println(o.getOrderId()+" :"+o.getTotalQty()+": "+o.getTotalCost()+" :"+o.getOrderStatus());
			
			System.out.println(".........Get Shipping Address.......");
			ShippingAddress add=o.getOrderShipAddress();
			System.out.println(add.getAddId()+" :"+add.getStreet()+" :"+add.getCity()+" :"+add.getState());
			
			Set<OrderItem> items=o.getOrderItems();
			System.out.println(o.getOrderId());
			for(OrderItem oi:items) {
				System.out.println(".........Get Ordered Items.......");
				System.out.println(oi.getOiId()+": "+oi.getOiQty()+" :"+oi.getOiCost()+": "+oi.getBook().getbId());
			}
		}
		
		
		
		Tx.commit();
		session.close();
		System.out.println("Recorded Data");
		
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
			Tx.rollback();
		}
	}

}
