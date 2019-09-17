package com.tech.banking.dao;

import java.util.List;
import java.util.Optional;

import com.tech.banking.models.Customer;

public interface CustomerDao {

	List<Customer> findAll();
	
   Optional<Customer>  findOne(Long id);
	
	Customer addCustomer(Customer cust);
	
}
