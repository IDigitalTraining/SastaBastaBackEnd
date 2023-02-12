package com.sastabasta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastabasta.entities.Product;
import com.sastabasta.repository.ProductRepository;
@Service
public class ProductServiceImp implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product editProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
		
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		return productRepository.findById(productId);
	}
	
	

}
