package com.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void addCustomer(Customer customer) {
		Transaction Tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			session=sf.openSession();
			Tx=session.beginTransaction();
			
			Integer Id=(Integer) session.save(customer);
			System.out.println("Customer is created with Cid :"+Id);
			
			Tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}finally {
			session.close();
		}
		
	}

	@Override
	public Customer getCustomerById(int cid) {
		Transaction Tx=null;
		Session session=null;
		Customer customer=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			session=sf.openSession();
			Tx=session.beginTransaction();
			
			customer=(Customer) session.get(Customer.class, cid);
			if(customer!=null) {
				return customer;
			}else {
				System.out.println("Customer doesn't exist with provided Id...");
			}
			Tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}finally {
			session.close();
		}
		return customer;
	}

	@Override
	public void UpdateCustomerById(int cid, String Phone) {
		Transaction Tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			session=sf.openSession();
			Tx=session.beginTransaction();
			
			Customer customer=(Customer) session.get(Customer.class, cid);
			if(customer!=null) {
			customer.setPhone(Phone);
			session.update(customer);
			
			}else {
				System.out.println("Customer doesn't exist with provided Id...");
			}
			Tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}finally {
			session.close();
		}
		
	}

	@Override
	public void DeleteCustomer(int cid) {
		Transaction Tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtilAnnotation.getSessionFactory();
			session=sf.openSession();
			Tx=session.beginTransaction();
			
			Customer customer=(Customer) session.get(Customer.class, cid);
			if(customer!=null) {
			session.delete(customer);
			}else {
				System.out.println("Customer doesn't exist with provided Id...");
			}
			Tx.commit();
			System.out.println("Data deleted from your DB as ID Provided by You.......: "+cid);
			
		}catch(Exception e) {
			e.printStackTrace();
			if(Tx!=null)
				Tx.rollback();
		}finally {
			session.close();
		}
		
	}

}
