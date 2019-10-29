package com.equalexperts.shoppingcart.service;

import com.equalexperts.shoppingcart.domain.CartUpdateResponse;
import com.equalexperts.shoppingcart.domain.CartItem;
import com.equalexperts.shoppingcart.domain.ShoppingCart;

public interface ShoppingCartService {
    /**
     * Method to add one item to shopping cart.
     * @param item Item to be added to the shopping cart
     * @return Custom response object with the information about add item action.
     */
    CartUpdateResponse addItem(CartItem item);

    /**
     * Get shopping cart items and total cost.
     * @return ShoppingCart DTO with set of items and total cost.
     */
    ShoppingCart getCart();
}
