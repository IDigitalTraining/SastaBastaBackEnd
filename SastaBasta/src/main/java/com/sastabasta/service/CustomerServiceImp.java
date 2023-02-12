package com.sastabasta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastabasta.entities.Customer;
import com.sastabasta.repository.CustomerRepository;
@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;


	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
		
		
	}


	@Override
	public Optional<Customer> getCustomerById(int custId) {
		return customerRepository.findById(custId);
	}


	@Override
	public void deleteById(int custId) {
	 
		customerRepository.deleteById(custId);
		
	}


	@Override
	public Customer editCustomer(Customer customer) {
		return customerRepository.save(customer);
	}


	
}
