package com.sastabasta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sastabasta.entities.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	

}
