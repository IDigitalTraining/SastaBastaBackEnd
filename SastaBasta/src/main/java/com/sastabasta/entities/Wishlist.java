package com.sastabasta.entities;

import org.hibernate.sql.results.graph.instantiation.internal.ArgumentDomainResult;

import jakarta.persistence.Entity;
import com.sastabasta.entities.Product;

@Entity
public class Wishlist {
	
	private int wishlistId;

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	private Product prod;

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public Wishlist() {
		
	}


	public Wishlist(int wishlistId, Product prod) {
		super();
		this.wishlistId = wishlistId;
		this.prod = prod;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Wishlist{" +
				"wishlistId=" + wishlistId +
				", prod=" + prod +
				'}';
	}

}
