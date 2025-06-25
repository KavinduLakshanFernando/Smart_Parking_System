package org.example.paymentservice.controller;

import org.example.paymentservice.dto.PaymentDTO;
import org.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<PaymentDTO> processPayment(@RequestBody PaymentDTO paymentDTO) {
        paymentService.processPayment(paymentDTO);
        return ResponseEntity.ok(paymentDTO);
    }
}
