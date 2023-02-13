package com.sastabasta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sastabasta.entities.Customer;
import com.sastabasta.entities.Wishlist;
import com.sastabasta.service.WishlistService;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {
	@Autowired
	WishlistService wishlistService;
	
	@PostMapping("/addwishlist")
	private ResponseEntity<Wishlist> addWishlist( @RequestBody Wishlist wishlist) { 
		
			return new ResponseEntity<Wishlist>(wishlistService.addWishlist(wishlist) , HttpStatus.OK);
	}
	
	@DeleteMapping("deletebyid/{id}")
	public void deleteWishlistById(@PathVariable int id){
		wishlistService.deleteWishlist(id);
	}

}
