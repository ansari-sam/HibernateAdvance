package com.hibernate.DAO;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void AddCustomer(Customer customer) {
		
		new CustomerDaoImpl().addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int cid) {
		
		return new CustomerDaoImpl().getCustomerById(cid);
	}

	@Override
	public void UpdateCustomerById(int cid, String Phone) {
		new CustomerDaoImpl().UpdateCustomerById(cid, Phone);
		
	}

	@Override
	public void DeleteCustomer(int cid) {
		new CustomerDaoImpl().DeleteCustomer(cid);
	}

	

}
