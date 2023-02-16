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

import com.sastabasta.entities.Product;
import com.sastabasta.entities.Wishlist;
import com.sastabasta.inputDto.ProductInputDto;
import com.sastabasta.service.ProductService;
import com.sastabasta.service.WishlistService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	@Autowired
	WishlistService wishlistService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct( @RequestBody Product product) { 
		
			return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/allProducts")
	public ResponseEntity<List<Product>> getAllPrduct(){
		return new ResponseEntity<List<Product>>(productService.getAllProduct(),HttpStatus.OK);
	}
	
	
	@GetMapping("/filter")
	public ResponseEntity<List<Product>> filterProducts(@RequestBody Map<String, String> map){		
		return new ResponseEntity<List<Product>>(productService.filterProduct(map),HttpStatus.OK);
	}
	
	@GetMapping("/brand")
	public ResponseEntity<List<Product>> getProductsByBrand(@PathVariable String brand){
		return new ResponseEntity<List<Product>>(productService.findProductsByBrand(brand),HttpStatus.OK);
	}
	
	@GetMapping("/type")
	public ResponseEntity<List<Product>> getProductsByType(@PathVariable String type){
		return new ResponseEntity<List<Product>>(productService.findProductsByType(type),HttpStatus.OK);
	}
	
	@GetMapping("/colour")
	public ResponseEntity<List<Product>> getAllProductsByColour(@PathVariable String colour){
		return new ResponseEntity<List<Product>>(productService.findProductsByColour(colour) ,HttpStatus.OK);
	}
	
	@GetMapping("/getProduct/{productId}")
	public ResponseEntity<Optional<Product>> getProductById(@PathVariable int productId){
		return new ResponseEntity<Optional<Product>>(productService.getProductById(productId),HttpStatus.OK);
	}
	 @PutMapping("/{productId}/addWishlist/{wishlistId}")
	    private ResponseEntity<Product> addProductToWishlist(@PathVariable int productId, @PathVariable int wishlistId){
		 
		 
		 Product product = productService.getProductById(productId).get();
	        Wishlist wishlist=wishlistService.getWishlistById(wishlistId).get();
	       
	        product.getWishlist().add(wishlist);
	        return new ResponseEntity<Product>(productService.addProduct(product),HttpStatus.ACCEPTED);
		 
	 }
	 @PostMapping("/add/dto")
		ResponseEntity<Product> addProductDto(@RequestBody ProductInputDto productInputDto) {
			
			return new ResponseEntity<Product>(productService.addProductDto(productInputDto), HttpStatus.OK);
		}
	 
	 @DeleteMapping("/deleteProduct/{productId}")
	 void deleteProdcut (@PathVariable int productId){
		 productService.deleteProduct(productId);
	 }
		
		
	

}
