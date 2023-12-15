package com.dev_craft.paymentservice.entity;

import jakarta.persistence.Entity;

@Entity(name= "orders")
public class Order {
    private Long id;
    private String status;
    private String address;
    private String paymentId;
    private double amount;
}
