package com.sastabasta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastabasta.entities.Admin;
import com.sastabasta.repository.AdminRespository;

@Service
public class AdminServiceImp implements AdminService{
	
	@Autowired
	AdminRespository adminRespository;

	@Override
	public Admin findByEmailAndPassword(String email, String password) {
		return adminRespository.findByEmailAndPassword(email, password);
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRespository.save(admin);
	}
	

}
