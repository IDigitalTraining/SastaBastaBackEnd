package com.sastabasta.service;

import com.sastabasta.entities.Wishlist;

public interface WishlistService {
	
	public Wishlist addWishlist(Wishlist wishlist);
	public void deleteWishlist(int wishlistId);

}
