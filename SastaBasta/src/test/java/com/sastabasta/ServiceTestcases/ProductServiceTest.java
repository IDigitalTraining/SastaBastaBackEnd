package com.sastabasta.ServiceTestcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sastabasta.entities.Product;
import com.sastabasta.service.ProductService;
//import com.sastabasta.exceptions.ProductNotFoundException;

@SpringBootTest
class ProductServiceTest {
	
	@Autowired
	ProductService productService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void addProductTest(){
//		Product pro = new Product();
//		pro.setProductName("Gym Bag");
//		pro.setProductBrand("Wildcraft");
//		pro.setType("test");
//		pro.setColour("Green");
//		Product newPro= productService.addProduct(pro);
//		assertEquals("Gym Bag",newPro.getProductName());
//		assertEquals("Wildcraft",newPro.getProductBrand());
//		assertEquals("test",newPro.getType());
//		assertEquals("Green",newPro.getColour());
//		
//	}
//	
	@Test
	void updateProduct()  {
		Product pro = new Product();
		pro.setProductId(0);
		pro.setProductName("Gym Bag");
		pro.setProductBrand("Skybags");
		pro.setType("test");
		pro.setColour("Green");
		Product updatedProduct =productService.editProduct(pro);
		
		assertEquals("Gym Bag", updatedProduct.getProductName());
		assertEquals("Skybags",updatedProduct.getProductBrand());
		assertEquals("Green",updatedProduct.getColour());
	}
	
//	
//	
//	@Test
//	void deleteProductTest() throws ProductNotFoundException {
//		Product pro = productService.deleteProduct(1);
//		assertEquals("Gym Bag", pro.getProductName());
//	}
//	
//	@Test
//	void getProductByIdTest() {
//		Optional<Product> productDetails = productService.getProductById(2);
//		Product pro=productDetails.get();
//		assertEquals("Gym Bag", pro.getProductName());
//		assertEquals("Skybags", pro.getProductBrand());
//	}
//	
//	@Test
//	void getAllProductTest() {
//		List<Product> products = productService.getAllProduct();
//		assertEquals(1, products.size());
//		Product product = products.get(0);
//		assertEquals("Skybags", product.getProductBrand());
//	}
//	
//	@Test
//	void findProductsByBrandTest() {
//		List<Product> products = productService.findProductsByBrand("Skybags");
//		Product product = products.get(0);
//		assertEquals("Gym Bag", product.getProductName());
//	}
//	
//	@Test
//	void findProductsByTypeTest() {
//		List<Product> products = productService.findProductsByType("test");
//		Product product = products.get(0);
//		assertEquals("Gym Bag", product.getProductName());
//	}
//	
//	@Test
//	void findProductsByColourTest() {
//		List<Product> products = productService.findProductsByColour("Green");
//		Product product = products.get(0);
//		assertEquals("Gym Bag", product.getProductName());
//	}
//	

}
