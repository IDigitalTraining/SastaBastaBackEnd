package com.sastabasta.entities;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity 
public class Product {
	@Id
//	https://youtu.be/oTJ89wcz5Ec
	private int productId;
	private String productName;
	private String productBrand;
	private String type;
	private String colur;
	private byte[] image;
	
	@ManyToMany()
	@JoinTable(name = "product_wishlist", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "productId"), inverseJoinColumns = @JoinColumn(name = "wishlist_id", referencedColumnName = "wishlistId"))
	private List<Wishlist> wishlist;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<ProductWebsite> productWebsites;
	
	public Product(int productId, String productName, String productBrand, String type, String colur, byte[] image) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productBrand = productBrand;
		this.type = type;
		this.colur = colur;
		this.image = image;
	}
	public Product() {
		
	}
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
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
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
	
	
	
	
}
