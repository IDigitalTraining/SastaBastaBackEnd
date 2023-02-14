package com.sastabasta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastabasta.entities.ProductWebsite;
import com.sastabasta.repository.ProductWebsiteRepository;
@Service
public class ProductWebsiteServiceImp implements ProductWebsiteService{
	@Autowired
	ProductWebsiteRepository productWebsiteRepository;
	

	@Override
	public ProductWebsite addProductWebsite(ProductWebsite productWebsite) {
		
		return productWebsiteRepository.save(productWebsite) ;
	}

	@Override
	public ProductWebsite updateProductWebsite(ProductWebsite productWebsite) {
		
		return productWebsiteRepository.save(productWebsite); 
	}

	@Override
	public Optional<ProductWebsite> findProductWebsite(int webId) {
		
		return productWebsiteRepository.findById(webId);
	}

	@Override
	public void deleteProductWebsiteById(int webId) {
		productWebsiteRepository.deleteById(webId);
		
	}

	@Override
	public List<ProductWebsite> findAllProduct() {
		return (List<ProductWebsite>) productWebsiteRepository.findAll();
	}

}
