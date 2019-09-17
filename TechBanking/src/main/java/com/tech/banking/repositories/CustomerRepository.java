package com.tech.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.banking.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
