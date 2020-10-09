package com.BookStoreApplication;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OrderOItemAddApp {

	public static void main(String[] args) {
		Transaction Tx=null;
		try {
		SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
		Session session=sf.openSession();
		Tx=session.beginTransaction();
		
		//Fetching Customer Data for One
		Customer cust =(Customer) session.get(Customer.class, 1);
		
		//Fetching Book Data
		Book b1=(Book) session.get(Book.class, 1);
		Book b2=(Book) session.get(Book.class, 2);
		
		//Creating Object Of OrderItem
		OrderItem oi1=new OrderItem(1,99.99);
		oi1.setBook(b1);
		//session.save(oi1);
		
		OrderItem oi2=new OrderItem(1,89.99);
		oi2.setBook(b2);
		//session.save(oi2);
		
		//Create Object Of ShippingAddress
		ShippingAddress add=new ShippingAddress("Sec-22","Noida","UttarPradesh");
		session.save(add);
		
		//Set OrderItem In Order Object
		Set<OrderItem> orderItems=new HashSet<OrderItem>();
		orderItems.add(oi1);
		orderItems.add(oi2);
		
		//Create Object of Order
		Order order=new Order(2,200.89,new Date(),"New");
		order.setOrderShipAddress(add);
		order.setOrderItems(orderItems);
		
//		Set<Order> orders=new HashSet<Order>();//Set Order in Customer Object
//		orders.add(order);
//		cust.setOrders(orders);
		
		order.setCustomer(cust);
		session.save(order);
		
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
