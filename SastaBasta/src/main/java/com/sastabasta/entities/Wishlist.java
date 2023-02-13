package com.sastabasta.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Wishlist {
	
	@Id
	private int wishlistId;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "wishlist")
	private List<Product> product;
	
	@OneToOne()
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public Wishlist(int wishlistId) {
		super();
		this.wishlistId = wishlistId;
	}

	public Wishlist() {
		
	}
	
	
	

}
