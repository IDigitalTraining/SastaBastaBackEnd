package com.sastabasta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sastabasta.entities.Product;
import com.sastabasta.entities.ProductWebsite;

public interface ProductWebsiteRepository extends CrudRepository<ProductWebsite, Integer> {
//	public ProductWebsite findByWebName(String webName);
//	public ProductWebsite findByproductLink(String productLink );
//	public ProductWebsite findByProductRating(String productRating);
//	public ProductWebsite findProductPrice(String productPrice);
//	public ProductWebsite findProductDiscount(String productDiscount);
	
	public ProductWebsite findByProduct (Product product);
	
	

}
