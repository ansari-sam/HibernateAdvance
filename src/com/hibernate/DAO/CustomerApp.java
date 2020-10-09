package com.hibernate.DAO;

public class CustomerApp {
	

	public static void main(String[] args) {
		
		//GetCustomerService: class get Object of CustomerService (Interface) which are implemented by CustomerServiceImpl
		CustomerService customerservice=GetCustomerService.getCustomerService();
		
		//We can directly create Object of CustomerService as below
		//CustomerService customerservice=new CustomerServiceImpl();
		
		
		//Add Customer details to Database
		//Customer customer1=new Customer("Saddam","sam@123","Noida","8893765423");
		Customer customer2=new Customer("som3","som3@123","Noida-21","111233444423");
		customerservice.AddCustomer(customer2);
		
		
		//Get Customer By ID
//		Customer customer=customerservice.getCustomerById(1);
//		System.out.println(customer);
//		System.out.println(customer.getCid()+": "+customer.getName()+" : "+customer.getEmail());
		
		//Updated Customer data by getting id from db
//		customerservice.UpdateCustomerById(2, "222222222");
		
		//Delete Data of Customer from DB by Taking their ID Only
//		customerservice.DeleteCustomer(3);
		
	}

}
