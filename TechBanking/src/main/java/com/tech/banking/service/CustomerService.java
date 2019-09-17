package com.tech.banking.service;

import java.util.List;

import com.tech.banking.models.Customer;

public interface CustomerService {

	 Customer addCustomer(Customer cust);
	 List<Customer> viewCustomers();
	 Customer findCustomer();
	// int deleteCustomer(Customer cust);
	
}
