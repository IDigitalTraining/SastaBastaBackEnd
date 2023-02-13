package com.sastabasta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastabasta.entities.Wishlist;
import com.sastabasta.repository.WishlistRepository;
@Service
public class WishlistServiceImp implements WishlistService {
	
	@Autowired
	WishlistRepository wishlistRepository;

	@Override
	public Wishlist addWishlist(Wishlist wishlist) {
		
		return wishlistRepository.save(wishlist);
	}

	@Override
	public void deleteWishlist(int wishlistId) {
	wishlistRepository.deleteById(wishlistId);
		
	}
	

	

}
