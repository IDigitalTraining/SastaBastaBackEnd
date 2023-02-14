package com.sastabasta.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sastabasta.entities.Customer;
import com.sastabasta.exceptions.CustomerAlreadyPresentException;
import com.sastabasta.repository.CustomerRepository;
@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;


	@Override
	public Customer addCustomer(Customer customer) {
		if(customer.getCustId()<0)
		  throw new CustomerAlreadyPresentException("Enter Valid Customer Id");
		else {
			if(customerRepository.findByEmail(customer.getEmail()).isPresent() || customerRepository.findById(customer.getCustId()).isPresent()) {
				 throw new CustomerAlreadyPresentException("Email already Registered");
			}
			
		}
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


	@Override
	public List<Customer> findAllCustomer() {
		
		return (List<Customer>) customerRepository.findAll();
	}


	
}
