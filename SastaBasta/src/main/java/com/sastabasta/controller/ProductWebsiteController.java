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
import com.sastabasta.exceptions.CommonProductWebsiteLinkException;
import com.sastabasta.exceptions.CustomServiceException;
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
	private ResponseEntity<ProductWebsite> addCustomer(@RequestBody ProductWebsiteInputDto productWebsiteInputDto) throws CustomServiceException {
		try {
			return new ResponseEntity<ProductWebsite>(productWebsiteService.addProductWebsite(productWebsiteInputDto) , HttpStatus.OK);
		} catch (CommonProductWebsiteLinkException e) {
			throw new CustomServiceException(e.getMessage());
		}
	}
	
	@PutMapping("/editProductWebsite/{productId}")
	public ResponseEntity<Product> editProductWebsite(@RequestBody ProductWebsite productWebsite,@PathVariable int productId) {
		return new ResponseEntity<Product>(productWebsiteService.editProduct(productWebsite,productId) , HttpStatus.OK);
	}
	
	@DeleteMapping("deleteById/{id}")
	public void deleteProductWebsiteById(@PathVariable int id){
		productWebsiteService.deleteProductWebsiteById(id);
	}
	
	@GetMapping("/getProductWebite/{webId}")
	public ResponseEntity<Optional<ProductWebsite>> getByCustId(@PathVariable int webId) {
		return new ResponseEntity<Optional<ProductWebsite>>(productWebsiteService.findProductWebsiteById(webId) ,HttpStatus.FOUND);
	}
	

	
	@GetMapping("getAll")
	private ResponseEntity<List<ProductWebsite>> getAllProductWebsite(){
		return new ResponseEntity<List<ProductWebsite>>(productWebsiteService.findAllProduct(),HttpStatus.OK);
		
	}
	
	
	

}
