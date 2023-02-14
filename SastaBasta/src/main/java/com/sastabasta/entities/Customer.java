package com.sastabasta.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	private int custId;
	private String custName;
	private long mobileNo;	
	private String email;
	
	@JsonIgnore
	@OneToOne(mappedBy = "customer")
	private Wishlist wishlist;
	
	
	
	
	
	public Customer(int custId, String custName, long mobileNo, String email, Wishlist wishlist) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.wishlist = wishlist;
	}



	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public long getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Wishlist getWishlist() {
		return wishlist;
	}



	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}
	
	



	public Customer() {
		
	} 
	 
	
	

}
