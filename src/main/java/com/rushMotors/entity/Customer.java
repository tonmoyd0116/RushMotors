package com.rushMotors.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name="customer")
@Entity
public class Customer {
    @Id
    private String customerId;
    @Column(nullable = false)
    private String customerFirstName;
    @Column(nullable = false, unique = true)
    private String customerEmail;
    private String customerLastName;
    @Column(nullable = false,unique = true)
    private String customerPhoneNumber;
    @Column(nullable = false)
    private String customerAddress;
}
