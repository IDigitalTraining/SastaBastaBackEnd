/*@Author Vipin Dane

This the service interface for Wishlist module
in which all the methods are declared according 
the to the requirements for Wishlist module

*/


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
