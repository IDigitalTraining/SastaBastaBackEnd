package com.sastabasta.exceptions;

public class ProductAlreadyPresentWishListException extends RuntimeException {

    public ProductAlreadyPresentWishListException(String msg) {
        super(msg);
    }
}
