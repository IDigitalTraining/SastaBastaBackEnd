package com.sastabasta.service;

import java.util.List;
import java.util.Optional;

import com.sastabasta.entities.ProductWebsite;

public interface ProductWebsiteService {
	
	public ProductWebsite addProductWebsite(ProductWebsite productWebsite);
	public ProductWebsite updateProductWebsite(ProductWebsite productWebsite);
	public Optional<ProductWebsite> findProductWebsiteById(int webId);
	public void deleteProductWebsiteById(int webId);
	public List<ProductWebsite> findAllProduct();
}
