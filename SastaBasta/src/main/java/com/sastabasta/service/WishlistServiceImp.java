package com.sastabasta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastabasta.entities.Product;
import com.sastabasta.entities.Wishlist;
import com.sastabasta.repository.WishlistRepository;
@Service
public class WishlistServiceImp implements WishlistService {
	
	@Autowired
	WishlistRepository wishlistRepository;
	@Autowired
	ProductService productService;

	@Override
	public Wishlist addWishlist(Wishlist wishlist) {
		
		return wishlistRepository.save(wishlist);
	}

	@Override
	public void deleteWishlist(int wishlistId) {
	wishlistRepository.deleteById(wishlistId);
		
	}

	@Override
	public Optional<Wishlist> getWishlistById(int wishlistId) {
		
		return wishlistRepository.findById(wishlistId);
	}

	/*
	 * @Override public void assignProductToWishList(int productId, int wishlistId)
	 * { Wishlist wishlist=null; wishlist=getWishlistById(wishlistId).get(); Product
	 * product=productService.getProductById(productId).get();
	 * wishlist.getProduct().add(product); wishlistRepository.save(wishlist);
	 * 
	 * 
	 * }
	 */
	
	

	

}
