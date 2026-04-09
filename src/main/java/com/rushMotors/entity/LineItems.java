package com.rushMotors.entity;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LineItems {
    @Column(nullable = false)
    private String lineItemId;
    @Column(nullable = false)
    private String lineItemName;
    @Column(nullable = false)
    private String lineItemPrice;
    @Column(nullable = false)
    private String lineItemQuantity;
}
