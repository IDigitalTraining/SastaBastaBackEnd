package com.sastabasta.service;

import java.util.Optional;

import com.sastabasta.entities.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Product editProduct(Product product);
	public void deleteProduct(int productId);
	public Optional<Product> getProductById(int productId);
	
	
}
