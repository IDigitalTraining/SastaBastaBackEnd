package com.sastabasta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
//	https://youtu.be/oTJ89wcz5Ec
	private int productId;
	private String productName;
	private String type;
	private String colur;
	private byte[] image;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColur() {
		return colur;
	}
	public void setColur(String colur) {
		this.colur = colur;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Product(int productId, String productName, String type, String colur, byte[] image) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.type = type;
		this.colur = colur;
		this.image = image;
	}
	public Product() {
		
	}
	
	
	
	

}
