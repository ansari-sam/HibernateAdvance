package com.hibernate.DAO;

public interface CustomerService {
	
	public abstract void AddCustomer(Customer customer);
	public abstract Customer getCustomerById(int cid);
	public abstract void UpdateCustomerById(int cid,String Phone);
	public abstract void DeleteCustomer(int cid);
	
}
