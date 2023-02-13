package com.sastabasta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductWebsite {
	@Id
	private int webId;
	private String webName;
	private String productLink;
	private int productRating;
	private double productPrice;
	private double productDiscount;
	
	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "productId")
	private Product product;
	
	public int getWebId() {
		return webId;
	}
	public void setWebId(int webId) {
		this.webId = webId;
	}
	public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public String getProductLink() {
		return productLink;
	}
	public void setProductLink(String productLink) {
		this.productLink = productLink;
	}
	public int getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}
	public ProductWebsite(int webId, String webName, String productLink, int productRating, double productPrice,
			double productDiscount) {
		super();
		this.webId = webId;
		this.webName = webName;
		this.productLink = productLink;
		this.productRating = productRating;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
	}
	public ProductWebsite() {
		
	}
	
	
	

}
