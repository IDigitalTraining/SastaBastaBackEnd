package com.sastabasta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.sastabasta.service.ProductService;
import com.sastabasta.service.ProductWebsiteService;

@RestController
@RequestMapping("productWebsite")
public class ProductWebsiteController {
	@Autowired
	ProductWebsiteService productWebsiteService;
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/addProductWebsite")
	private ResponseEntity<ProductWebsite> addCustomer(@RequestBody ProductWebsite productWebsite) { 
		return new ResponseEntity<ProductWebsite>(productWebsiteService.addProductWebsite(productWebsite) , HttpStatus.OK);
	}
	
	@PutMapping("/editCustomer")
	public ResponseEntity<ProductWebsite> editCustomer(@RequestBody ProductWebsite productWebsite) {
		return new ResponseEntity<ProductWebsite>(productWebsiteService.addProductWebsite(productWebsite) , HttpStatus.OK);
	}
	
	@DeleteMapping("deleteById/{id}")
	public void deleteProductWebsiteById(@PathVariable int id){
		productWebsiteService.deleteProductWebsiteById(id);
	}
	
	@GetMapping("/getProductWebite/{webId}")
	public ResponseEntity<Optional<ProductWebsite>> getByCustId(@PathVariable int webId) {
		return new ResponseEntity<Optional<ProductWebsite>>(productWebsiteService.findProductWebsiteById(webId) ,HttpStatus.FOUND);
	}
	
	
	
	

}
