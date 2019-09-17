package com.tech.banking.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tech.banking.models.Customer;
import com.tech.banking.repositories.CustomerRepository;

public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	CustomerRepository custRepository;

	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return custRepository.findAll();
	}

	@Override
	public Optional<Customer> findOne(Long id) {
		// TODO Auto-generated method stub
		return custRepository.findById(id);
	}

	@Override
	public Customer addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return custRepository.save(cust);
	}

}
