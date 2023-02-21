package com.sastabasta.service;

import java.util.List;
import java.util.Optional;

import com.sastabasta.entities.Product;
import com.sastabasta.entities.ProductWebsite;
import com.sastabasta.exceptions.CommonProductWebsiteLinkException;
import com.sastabasta.inputDto.ProductWebsiteInputDto;

public interface ProductWebsiteService {
	
	public ProductWebsite addProductWebsite(ProductWebsiteInputDto productWebsiteInputDto) ;
	public ProductWebsite updateProductWebsite(ProductWebsite productWebsite);
	public Optional<ProductWebsite> findProductWebsiteById(int webId);
	public void deleteProductWebsiteById(int webId);
	public List<ProductWebsite> findAllProduct();
	//public ProductWebsite editProductWebsite(ProductWebsiteInputDto productWebsiteInputDto,int webId,int productId);
	public Product editProduct(ProductWebsite productWebsite,int productId);
	
}
