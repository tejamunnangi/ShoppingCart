package com.equalexperts.shoppingcart.addproduct.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CartUpdateResponse implements Serializable {
    private static final long serialVersionUID = -1665776933530087436L;
    private Boolean isResponseSuccess;
    private String responseMessage;
    private LocalDateTime responseDateTime;
}
