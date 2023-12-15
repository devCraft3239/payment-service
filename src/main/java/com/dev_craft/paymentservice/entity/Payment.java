package com.dev_craft.paymentservice.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "payments")
public class Payment {
    private Long id;
    private String paymentStatus;
    private Long orderId;
    private double amount;
}
