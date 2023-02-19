package com.sastabasta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastabasta.entities.Product;
import com.sastabasta.entities.ProductWebsite;
import com.sastabasta.exceptions.IdNotFoundException;
import com.sastabasta.inputDto.ProductWebsiteInputDto;
import com.sastabasta.repository.ProductRepository;
import com.sastabasta.repository.ProductWebsiteRepository;
@Service
public class ProductWebsiteServiceImp implements ProductWebsiteService{
	@Autowired
	ProductWebsiteRepository productWebsiteRepository;
	@Autowired
	ProductRepository productRepository;
	

	@Override
	public ProductWebsite addProductWebsite(ProductWebsiteInputDto productWebsiteInputDto) {
		
		Product product=new Product(productWebsiteInputDto.getProductName(),productWebsiteInputDto.getProductBrand(),productWebsiteInputDto.getType(),productWebsiteInputDto.getColour(),productWebsiteInputDto.getImage(),null,null);		
		productRepository.save(product);
		ProductWebsite productWebsite=new ProductWebsite(
				productWebsiteInputDto.getAmazonLink(),productWebsiteInputDto.getAmazonRating(),productWebsiteInputDto.getAmazonPrice(),productWebsiteInputDto.getAmazonDiscount(),
				productWebsiteInputDto.getFlipcartLink(),productWebsiteInputDto.getFlipcartRating(),productWebsiteInputDto.getFlipcartPrice(),productWebsiteInputDto.getFlipcartDiscount(),
				productWebsiteInputDto.getMyntraLink(),productWebsiteInputDto.getMyntraRating(),productWebsiteInputDto.getMyntraPrice(),productWebsiteInputDto.getMyntraDiscount()
				);
		
		productWebsite.setProduct(product);
		
		return productWebsiteRepository.save(productWebsite) ;
	}

	@Override
	public ProductWebsite updateProductWebsite(ProductWebsite productWebsite) {
		
		return productWebsiteRepository.save(productWebsite); 
	}

	@Override
	public Optional<ProductWebsite> findProductWebsiteById(int webId) {
		
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

	@Override
	public Product editProduct(ProductWebsite productWebsite,int productId) {
	Product product =productRepository.findById(productId).get();
	//System.out.println(product.getProductName());
     product.setProductWebsite(productWebsite);
     productWebsite.setProduct(product);
     productWebsiteRepository.save(productWebsite);
	return product;
	
	
    
	
	
	}
	
	



//	@Override
//	public ProductWebsite editProductWebsite(ProductWebsiteInputDto productWebsiteInputDto, int webId,
//			int productId) {
//		Optional<Product> product=productRepository.findById(productId);
//		Optional<ProductWebsite> productWebsite=productWebsiteRepository.findById(webId);
//		
//		if(product.isEmpty() || productWebsite.isEmpty()) {
//			throw new IdNotFoundException("Data not found");
//		}
//		
//		else {
//			product.get().setProductName(productWebsiteInputDto.getProductName());
//			product.get().setProductBrand(productWebsiteInputDto.getProductBrand());
//			product.get().setType(productWebsiteInputDto.getType());
//			product.get().setColour(productWebsiteInputDto.getColour());
//			product.get().setImage(productWebsiteInputDto.getImage());
//			productRepository.save(product.get());
//			
//			productWebsite.get().setAmazonLink(productWebsiteInputDto.getAmazonLink());
//			productWebsite.get().setAmazonRating(productWebsiteInputDto.getAmazonRating());
//			productWebsite.get().setAmazonPrice(productWebsiteInputDto.getAmazonPrice());
//			productWebsite.get().setAmazonDiscount(productWebsiteInputDto.getAmazonDiscount());
//			
//			productWebsite.get().setFlipcartLink(productWebsiteInputDto.getFlipcartLink());
//			productWebsite.get().setFlipcartRating(productWebsiteInputDto.getFlipcartRating());
//			productWebsite.get().setFlipcartPrice(productWebsiteInputDto.getFlipcartPrice());
//			productWebsite.get().setFlipcartDiscount(productWebsiteInputDto.getFlipcartDiscount());
//			
//			productWebsite.get().setMyntraLink(productWebsiteInputDto.getMyntraLink());
//			productWebsite.get().setMyntraRating(productWebsiteInputDto.getMyntraRating());
//			productWebsite.get().setMyntraPrice(productWebsiteInputDto.getMyntraPrice());
//			productWebsite.get().setMyntraDiscount(productWebsiteInputDto.getMyntraDiscount());
//			productWebsite.get().setProduct(product.get());						
//			
//		}
//		
//		return productWebsiteRepository.save(productWebsite.get());
//	}	

}
