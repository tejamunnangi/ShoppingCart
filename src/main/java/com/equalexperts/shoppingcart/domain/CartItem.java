package com.equalexperts.shoppingcart.domain;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CartItem implements Serializable {
    private static final long serialVersionUID = 3483690045407713799L;
    private Long id;
    private String itemName;
    private String itemDescription;
    private Double cartItemPrice;
    private Integer quantity;
}
