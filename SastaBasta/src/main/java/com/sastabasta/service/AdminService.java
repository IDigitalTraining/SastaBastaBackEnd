package com.sastabasta.service;

import com.sastabasta.entities.Admin;

public interface AdminService {
	
	public Admin findByEmailAndPassword(String email,String password);
	public Admin addAdmin(Admin admin);

}
 