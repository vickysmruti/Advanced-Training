package com.shopping.service;

import java.io.IOException;

import com.shopping.model.Cart;

public interface CartService {

	public void addCart(Cart cart);
	
	public Cart getCartById(long cartId);

	Cart validateCustomer(long cartId) throws IOException;
}
