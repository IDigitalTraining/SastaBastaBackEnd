package com.sastabasta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;
import com.sastabasta.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {	  
	
	public Optional<Customer> findByEmail(String email);

}
