package com.microservice.payment_service.Repository;

import com.microservice.payment_service.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
}
