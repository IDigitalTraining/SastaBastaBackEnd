package com.sastabasta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Data @Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Product {
	@Id
//	https://youtu.be/oTJ89wcz5Ec
	private int productId;
	private String productName;
	private String productBrand;
	private String type;
	private String colur;
	private byte[] image;
	
}
