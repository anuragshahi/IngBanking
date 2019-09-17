package com.tech.banking.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.banking.dao.CustomerDao;
import com.tech.banking.models.Customer;

@RestController
@RequestMapping(value={"/user"})
public class CustomerController {

	@Autowired
	CustomerDao custDao;
	
    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomers(){
		System.out.println("controller");
		return custDao.findAll();
			
	}

	@GetMapping(value = "/customer/{id}" )
	public Optional<Customer>  getCustomer(@PathVariable(value = "id") Long id){
		return custDao.findOne(id);
		
	}
    @PostMapping(value="/addcustomer",headers="Accept=application/json")
	public Customer addCustomer(@RequestBody Customer cust) {
		return custDao.addCustomer(cust);
		
	}
	
	
}
