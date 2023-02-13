package com.sastabasta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	
	@Id
	private int custId;
	private String custName;
	private long mobileNo;	
	private String email;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustNameString(String custNameString) {
		this.custName = custNameString;
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
	public Customer(int custId, String custNameString, long mobileNo, String email) {
		super();
		this.custId = custId;
		this.custName = custNameString;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public Customer() {
		
	} 
	 
	
	

}
