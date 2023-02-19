package com.sastabasta.service;

import com.sastabasta.entities.Admin;
import com.sastabasta.exceptions.EmailOrPasswordException;

public interface AdminService {
	
	public Admin findByEmailAndPassword(String email,String password) throws EmailOrPasswordException;
	public Admin addAdmin(Admin admin);

}
 