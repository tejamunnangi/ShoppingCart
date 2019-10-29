package com.equalexperts.shoppingcart.service.impl;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equalexperts.shoppingcart.dao.CartDAO;
import com.equalexperts.shoppingcart.domain.CartUpdateResponse;
import com.equalexperts.shoppingcart.domain.CartItem;
import com.equalexperts.shoppingcart.domain.ShoppingCart;
import com.equalexperts.shoppingcart.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	private static final String ADD_SUCCESS_MESSAGE = "Item added to the cart successfully";
	private static final String ADD_FAILED_MESSAGE = "Item could not be added to the cart. Please try again.";

	@Autowired
	private CartDAO cartDAO;

	public CartUpdateResponse addItem(CartItem item) {
		System.out.printf("Adding item {} to cart.", item.getId());
		CartUpdateResponse response = buildCartUpdateResponse(cartDAO.insertItem(item));
		System.out.println(response.getResponseMessage());
		return response;
	}

	public ShoppingCart getCart() {
		Set<CartItem> itemsInCart = cartDAO.getAllItemsInCart();
		Double totalCartPrice = itemsInCart.stream().collect(Collectors.summingDouble(CartItem::getCartItemPrice));
		return null;
	}

	// This can be replaced by a response builder in the controller.
	private CartUpdateResponse buildCartUpdateResponse(Boolean isSuccess) {
		CartUpdateResponse response = new CartUpdateResponse();
		response.setIsResponseSuccess(isSuccess);
		response.setResponseDateTime(LocalDateTime.now());
		String responseMessage = isSuccess ? ADD_SUCCESS_MESSAGE : ADD_FAILED_MESSAGE;
		response.setResponseMessage(responseMessage);
		return response;
	}
}
