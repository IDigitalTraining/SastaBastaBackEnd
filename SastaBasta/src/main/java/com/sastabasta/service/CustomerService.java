package com.sastabasta.service;

import java.util.*;
import java.util.Optional;

import com.sastabasta.entities.Customer;
import com.sastabasta.exceptions.EmailOrPasswordException;

public interface CustomerService {


	public Customer addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int custId);
	public void deleteById(int custId);
	public Customer editCustomer(Customer customer);
	public List<Customer> findAllCustomer();
	public Customer findByEmailAndPassword(String email,String password) throws EmailOrPasswordException;
	
	
	

	
	
}
