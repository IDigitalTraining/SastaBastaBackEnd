package com.sastabasta.service;

import java.util.Optional;

import com.sastabasta.entities.Customer;

public interface CustomerService {


	public Customer addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int custId);
	public void deleteById(int custId);
	public Customer editCustomer(Customer customer);
	
	
	

	
	
}
