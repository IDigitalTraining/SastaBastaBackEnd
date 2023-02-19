package com.sastabasta.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sastabasta.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {	  
	
	public Optional<Customer> findByEmail(String email);
	public Customer findByEmailAndPassword(String email,String password);

}
