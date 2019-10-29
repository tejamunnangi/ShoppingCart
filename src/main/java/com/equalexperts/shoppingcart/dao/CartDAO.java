package com.equalexperts.shoppingcart.dao;

import java.util.Set;

import com.equalexperts.shoppingcart.domain.CartItem;

public interface CartDAO {

	/**
	 * Get an item by id.
	 * 
	 * @param id
	 *            id of the item.
	 * @return Item that matches with the given id.
	 */
	CartItem getItemById(Long id);

	/**
	 * Get all items in the cart.
	 * 
	 * @return set of all items in the cart.
	 */
	Set<CartItem> getAllItemsInCart();

	/**
	 * Persists the given item.
	 * 
	 * @param item
	 *            Item to be persisted
	 * @return True if item is persisted, else false.
	 */
	Boolean insertItem(CartItem item);

}
