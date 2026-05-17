package com.rushMotors.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name="order")
@Entity
public class Order {
    private String OrderId;
    private String orderCreatedAt;
    private String orderStatus;
    private String orderDeliveryDate;
    private List<LineItems> lineItemsList;
    private String orderTotalAmount;
    private String customerId;
}
