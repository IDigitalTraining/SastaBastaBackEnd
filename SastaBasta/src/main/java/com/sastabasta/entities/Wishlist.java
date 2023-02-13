package com.sastabasta.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wishlist {
	@Id
	private int wishlistId;

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public Wishlist() {
		
	}

	public Wishlist(int wishlistId) {
		super();
		this.wishlistId = wishlistId;
	}
	
	
	

}
