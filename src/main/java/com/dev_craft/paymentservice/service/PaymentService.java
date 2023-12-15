package com.dev_craft.paymentservice.service;

import com.dev_craft.paymentservice.entity.Payment;
import com.dev_craft.paymentservice.repository.PaymentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

//    @Transactional(propagation = Propagation.REQUIRED_NEW)
    @Transactional()
    public void processPayment(Long orderId, double amount) {
        Payment payment = new Payment();
        payment.setOrderId(orderId);
        payment.setAmount(amount);
        payment.setPaymentStatus("SUCCESS");
        paymentRepository.save(payment);
    }
}
