package com.hibernate.DAO;

public class GetCustomerService {
	
	static CustomerService customerservice;
	
	static {
		customerservice=new CustomerServiceImpl(); 
	}
	
	public static CustomerService getCustomerService() {
		
		return customerservice;
	}

}
