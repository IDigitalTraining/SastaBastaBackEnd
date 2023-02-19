package com.sastabasta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sastabasta.entities.Product;
import com.sastabasta.entities.ProductWebsite;
import com.sastabasta.exceptions.CustomerNotFoundException;
import com.sastabasta.inputDto.ProductWebsiteInputDto;
import com.sastabasta.service.ProductService;
import com.sastabasta.service.ProductWebsiteService;

@RestController
@RequestMapping("productWebsite")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductWebsiteController {
	@Autowired
	ProductWebsiteService productWebsiteService;
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/addProductWebsite")
	private ResponseEntity<ProductWebsite> addCustomer(@RequestBody ProductWebsiteInputDto productWebsiteInputDto) { 
		return new ResponseEntity<ProductWebsite>(productWebsiteService.addProductWebsite(productWebsiteInputDto) , HttpStatus.OK);
	}
	
//	@PutMapping("/editProductWebsite")
//	public ResponseEntity<ProductWebsite> editProductWebsite(@RequestBody ProductWebsite productWebsite) {
//		return new ResponseEntity<ProductWebsite>(productWebsiteService.addProductWebsite(productWebsite) , HttpStatus.OK);
//	}
	
	@DeleteMapping("deleteById/{id}")
	public void deleteProductWebsiteById(@PathVariable int id){
		productWebsiteService.deleteProductWebsiteById(id);
	}
	
	@GetMapping("/getProductWebite/{webId}")
	public ResponseEntity<Optional<ProductWebsite>> getByCustId(@PathVariable int webId) {
		return new ResponseEntity<Optional<ProductWebsite>>(productWebsiteService.findProductWebsiteById(webId) ,HttpStatus.FOUND);
	}
	
//	 @PutMapping("/{productId}/addProductToProductWebsite/{productWebsiteId}")
//		private ResponseEntity<ProductWebsite> addProductToProductWebsite(@PathVariable int productId, @PathVariable int productWebsiteId) throws CustomerNotFoundException{
//			
//			Product product =productService.getProductById(productId).get();
//			//Customer customer =customerService.getCustomerById(customerId).get();
//			ProductWebsite productWebsite = productWebsiteService.findProductWebsiteById(productWebsiteId).get();
//			//wishlist.setCustomer(customer);
//			product.setProductWebsite(productWebsite);
//			productWebsite.setProduct(product);
//	    	return new ResponseEntity<ProductWebsite>(productWebsiteService.addProductWebsite(productWebsite),HttpStatus.OK);
//		}
	
	@GetMapping("getAll")
	private ResponseEntity<List<ProductWebsite>> getAllProductWebsite(){
		return new ResponseEntity<List<ProductWebsite>>(productWebsiteService.findAllProduct(),HttpStatus.OK);
		
	}
	
	
	

}
