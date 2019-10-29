package com.equalexperts.shoppingcart.addproduct.domain;

import java.io.Serializable;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class ShoppingCart implements Serializable {
    private static final long serialVersionUID = -3364360324623809842L;
    private Set<Item> itemSet;
    private Double totalAmount;
}
