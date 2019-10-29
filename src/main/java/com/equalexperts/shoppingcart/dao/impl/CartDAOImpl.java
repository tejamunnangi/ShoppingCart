package com.equalexperts.shoppingcart.dao.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.equalexperts.shoppingcart.dao.CartDAO;
import com.equalexperts.shoppingcart.domain.CartItem;

@Repository
public class CartDAOImpl implements CartDAO {

	private Map<Long, CartItem> itemMap;

	public CartItem getItemById(Long id) {
		return itemMap.getOrDefault(id, new CartItem());
	}

	public Boolean insertItem(CartItem item) {
		itemMap.put(item.getId(), item);
		return true;
	}

	@Override
	public Set<CartItem> getAllItemsInCart() {
		return new HashSet<>(itemMap.values());
	}

}
