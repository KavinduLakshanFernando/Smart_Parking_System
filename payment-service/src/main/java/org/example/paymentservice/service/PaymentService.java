package org.example.paymentservice.service;

import org.example.paymentservice.dto.PaymentDTO;

public interface PaymentService {
    PaymentDTO processPayment(PaymentDTO paymentDTO);
}
