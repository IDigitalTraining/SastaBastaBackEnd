package com.sastabasta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sastabasta.entities.Customer;
import com.sastabasta.entities.Product;
import com.sastabasta.entities.Wishlist;
import com.sastabasta.exceptions.CustomerNotFoundException;
import com.sastabasta.service.CustomerService;
import com.sastabasta.service.ProductService;
import com.sastabasta.service.WishlistService;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {
	@Autowired
	WishlistService wishlistService;
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addWishlist")
	private ResponseEntity<Wishlist> addWishlist( @RequestBody Wishlist wishlist) { 
			return new ResponseEntity<Wishlist>(wishlistService.addWishlist(wishlist) , HttpStatus.OK);
	}
	
	@DeleteMapping("deleteById/{id}")
	public void deleteWishlistById(@PathVariable int id){
		wishlistService.deleteWishlist(id);
	}
	/*
	 * @PostMapping("/assignProduct/{productId}/To/{wishlistId}") public void
	 * assignProductToWishList(@PathVariable int productId,@PathVariable int
	 * wishlistId) { wishlistService.assignProductToWishList(productId, wishlistId);
	 * }
	 */
	
	@PutMapping("/{wishlistId}/setCustomer/{customerId}")
	private ResponseEntity<Wishlist> addWishListToCustomer(@PathVariable int wishlistId, @PathVariable int customerId) throws CustomerNotFoundException{
		
		Wishlist wishlist =wishlistService.getWishlistById(wishlistId).get();
		Customer customer =customerService.getCustomerById(customerId);
		wishlist.setCustomer(customer);
    	return new ResponseEntity<Wishlist>(wishlistService.addWishlist(wishlist),HttpStatus.OK);
	}

}
