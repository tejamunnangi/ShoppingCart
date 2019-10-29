package com.equalexperts.service;

import java.util.Set;

import com.equalexperts.shoppingcart.addproduct.domain.CartUpdateResponse;
import com.equalexperts.shoppingcart.addproduct.domain.Item;
import com.equalexperts.shoppingcart.addproduct.domain.ShoppingCart;

public interface ShoppingCartService {
    /**
     * Method to add one item to shopping cart.
     * @param item Item to be added to the shopping cart
     * @return Custom response object with the information about add item action.
     */
    CartUpdateResponse addItem(Item item);

    /**
     * Method to add several items to the shopping cart.
     * @param items List of items to be added to the shopping cart.
     * @param quantity Number of items to be added.
     * @return Set of responses for each item added.
     */
    Set<CartUpdateResponse> addItems(Set<Item> items, int quantity);
    
    /**
     * Get shopping cart items and total cost.
     * @return ShoppingCart DTO with set of items and total cost.
     */
    ShoppingCart getCart();
}
