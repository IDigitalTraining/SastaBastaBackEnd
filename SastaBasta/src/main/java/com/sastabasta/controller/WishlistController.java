package com.sastabasta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sastabasta.entities.Customer;
import com.sastabasta.entities.Wishlist;
import com.sastabasta.service.WishlistService;

public class WishlistController {
	
	@Autowired
	WishlistService wishlistService;
	
	@PostMapping("/addcwishlist")
	private ResponseEntity<Wishlist> addWishlist( @RequestBody Wishlist wishlist) { 
		
			return new ResponseEntity<Wishlist>(wishlistService.addWishlist(wishlist) , HttpStatus.OK);
	}

	@DeleteMapping("/deletewishlist")
	public void removeWishlist(@PathVariable Wishlist wishlist ){wishlistService.removeWishlist(wishlist);}

}
