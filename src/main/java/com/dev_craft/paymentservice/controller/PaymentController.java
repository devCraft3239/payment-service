package com.dev_craft.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dev_craft.paymentservice.service.PaymentService;

@RequestMapping("/api/payments")
@RestController
public class PaymentController {


    @Autowired
    PaymentService paymentService;

    @PostMapping("")
    public ResponseEntity<String> makePayment(
            @RequestParam Long orderId,
            @RequestParam Double amount) {
        paymentService.processPayment(orderId, amount);
        return ResponseEntity.ok("Payment successful!");
    }
}
