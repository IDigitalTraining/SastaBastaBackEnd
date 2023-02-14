package com.sastabasta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sastabasta.entities.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	public List<Product> findAllByProductBrand(String productBrand);
	public List<Product> findAllByType(String type);
	public List<Product> findAllByColour(String colour);
	

}
