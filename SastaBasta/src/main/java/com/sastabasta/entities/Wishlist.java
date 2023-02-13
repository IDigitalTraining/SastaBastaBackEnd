package com.sastabasta.entities;

import org.hibernate.sql.results.graph.instantiation.internal.ArgumentDomainResult;

import jakarta.persistence.Entity;

@Entity
public class Wishlist {
	
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
