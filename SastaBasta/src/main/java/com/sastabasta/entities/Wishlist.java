package com.sastabasta.entities;

import java.util.List;
import java.util.Optional;

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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Wishlist(int wishlistId, List<Product> product, Customer customer) {
		super();
		this.wishlistId = wishlistId;
		this.product = product;
		this.customer = customer;
	}

	public Wishlist() {
		
	}
	
	


	

	
	
	
	

}
