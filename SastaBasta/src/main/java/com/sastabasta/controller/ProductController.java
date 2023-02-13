package com.sastabasta.controller;

import java.util.List;
import java.util.Map;
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

import com.sastabasta.entities.Customer;
import com.sastabasta.entities.Product;
import com.sastabasta.service.CustomerService;
import com.sastabasta.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addproduct")
	private ResponseEntity<Product> addProduct( @RequestBody Product product) { 
		
			return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/filter")
	public ResponseEntity<List<Product>> filterProducts(@RequestBody Map<String, String> map){		
		return new ResponseEntity<List<Product>>(productService.filterProduct(map),HttpStatus.OK);
	}

}
