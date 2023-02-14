package com.sastabasta.service;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.sastabasta.entities.Wishlist;

public interface WishlistService {
	
	public Wishlist addWishlist(Wishlist wishlist);
	public void deleteWishlist(int wishlistId);
	public Optional<Wishlist> getWishlistById(int wishlistId);
	//public void assignProductToWishList(int productId,int wishlistId );

}
