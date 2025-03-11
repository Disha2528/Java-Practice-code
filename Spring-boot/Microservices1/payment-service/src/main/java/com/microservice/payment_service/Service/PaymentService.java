package com.microservice.payment_service.Service;

import com.microservice.payment_service.Entity.Payment;

public interface PaymentService {
    public Payment doPayment(Payment payment);
}
