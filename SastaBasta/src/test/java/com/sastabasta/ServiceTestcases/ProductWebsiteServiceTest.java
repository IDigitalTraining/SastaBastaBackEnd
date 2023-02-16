package com.sastabasta.ServiceTestcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sastabasta.entities.Customer;
import com.sastabasta.entities.ProductWebsite;
import com.sastabasta.exceptions.CustomerNotFoundException;
import com.sastabasta.exceptions.EmptyCustomerListException;
import com.sastabasta.repository.ProductWebsiteRepository;
import com.sastabasta.service.ProductWebsiteService;

@SpringBootTest
public class ProductWebsiteServiceTest {

	@Autowired
	private ProductWebsiteService productService;

	@MockBean
	private ProductWebsiteRepository productWebsiteRepository;

	private ProductWebsite productWebsite;

	private ProductWebsite productWebsite1;

	@BeforeEach
	public void ProductWebsiteTestSetup() {
		productWebsite = new ProductWebsite();
		productWebsite.setWebId(1);
		productWebsite.setWebName("Flipkart");
		productWebsite.setProductLink(
				"https://www.flipkart.com/plexy-large-35-l-laptop-backpack-echo-2-0-unisex-smart/p/itm240c3eff82a84?pid=BKPGHUQRAV2TZJTG&lid=LSTBKPGHUQRAV2TZJTGLWGFAB&marketplace=FLIPKART&q=bags+men&store=reh%2F4d7%2Fx9i&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&fm=search-autosuggest&iid=en_sH0tvvcDUImWoD0M9Pz82HXYI6w%2Fvsh%2Fo4pgLRfw5RcCDnVL3dEDJq3MQYpD0%2B0AuWZiEI7%2FMA%2B2jtspiEl0hQ%3D%3D&ppt=sp&ppn=sp&ssid=xvtzh6eqtc0000001676455321759&qH=2d3c362411bf6395");
		productWebsite.setProductRating(4);
		productWebsite.setProductPrice(400);
		productWebsite.setProductDiscount(1000);

		productWebsite1 = new ProductWebsite();
		productWebsite.setWebId(2);
		productWebsite.setWebName("Amazon");
		productWebsite.setProductLink(
				"https://www.flipkart.com/plexy-large-35-l-laptop-backpack-echo-2-0-unisex-smart/p/itm240c3eff82a84?pid=BKPGHUQRAV2TZJTG&lid=LSTBKPGHUQRAV2TZJTGLWGFAB&marketplace=FLIPKART&q=bags+men&store=reh%2F4d7%2Fx9i&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&fm=search-autosuggest&iid=en_sH0tvvcDUImWoD0M9Pz82HXYI6w%2Fvsh%2Fo4pgLRfw5RcCDnVL3dEDJq3MQYpD0%2B0AuWZiEI7%2FMA%2B2jtspiEl0hQ%3D%3D&ppt=sp&ppn=sp&ssid=xvtzh6eqtc0000001676455321759&qH=2d3c362411bf6395");
		productWebsite.setProductRating(4);
		productWebsite.setProductPrice(450);
		productWebsite.setProductDiscount(950);
	}

	@Test
	public void addProductWebsiteTest() {
		Mockito.when(productWebsiteRepository.save(productWebsite)).thenReturn(productWebsite);

		assertThat(productService.addProductWebsite(productWebsite)).isEqualTo(productWebsite);
	}

	@Test
	public void getAllProductWebsiteTest() {
		List<ProductWebsite> productWebsiteList = new ArrayList<>();

		productWebsiteList.add(productWebsite);
		productWebsiteList.add(productWebsite1);

		Mockito.when(productWebsiteRepository.findAll()).thenReturn(productWebsiteList);

		assertThat(productService.findAllProduct()).isEqualTo(productWebsiteList);
	}

	@Test
	public void updateProductWebsiteTest() {
		Mockito.when(productWebsiteRepository.save(productWebsite)).thenReturn(productWebsite);

		Mockito.when(productWebsiteRepository.findById(1)).thenReturn(Optional.of(productWebsite));

		productWebsite.setWebName("Flipkart");
		productWebsite.setProductLink("xyz");
		productWebsite.setProductRating(4);
		productWebsite.setProductPrice(450);
		productWebsite.setProductDiscount(1800);

		ProductWebsite result = productService.updateProductWebsite(productWebsite);

		assertEquals("Flipkart", result.getWebName());
		assertEquals("xyz", result.getProductLink());
		assertEquals(4, result.getProductRating());
		assertEquals(450, result.getProductPrice());
		assertEquals(1800, result.getProductDiscount());
	}

	@Test
	public void getProductWebsiteByIdTest() {

		Mockito.when(productWebsiteRepository.findById(1)).thenReturn(Optional.of(productWebsite));

		assertThat(productService.findProductWebsiteById(1)).isEqualTo(Optional.of(productWebsite));
	}

	@Test
	public void deleteProductWebsiteByIdTest() {
		Mockito.when(productWebsiteRepository.findById(1)).thenReturn(Optional.of(productWebsite));

		Mockito.doNothing().when(productWebsiteRepository).deleteById(1);

		productService.deleteProductWebsiteById(1);

		verify(productWebsiteRepository, times(1)).deleteById(1);

	}

}
