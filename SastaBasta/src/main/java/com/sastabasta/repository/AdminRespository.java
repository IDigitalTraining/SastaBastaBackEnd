package com.sastabasta.repository;

import org.springframework.data.repository.CrudRepository;


import com.sastabasta.entities.Admin;

public interface AdminRespository extends CrudRepository<Admin, Integer>{
	public Admin findByEmailAndPassword(String email,String password);

}
