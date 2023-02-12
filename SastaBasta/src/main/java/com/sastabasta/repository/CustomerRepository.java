package com.sastabasta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sastabasta.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {	  
	
	

}
