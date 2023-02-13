package com.sastabasta.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sastabasta.entities.Wishlist;
import com.sastabasta.repository.WishlistRepository;

public class WishlistServiceImp implements WishlistService{
	
	@Autowired
	WishlistRepository wishlistRepository;

	@Override
	public Wishlist addWishlist(Wishlist wishlist) {
		
		return wishlistRepository.save(wishlist);
		
	}

}
