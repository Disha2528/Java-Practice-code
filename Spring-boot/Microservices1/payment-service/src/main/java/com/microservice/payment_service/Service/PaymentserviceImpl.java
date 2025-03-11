package com.microservice.payment_service.Service;

import com.microservice.payment_service.Entity.Payment;
import com.microservice.payment_service.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Random;

@Service
public class PaymentserviceImpl implements PaymentService{

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public Payment doPayment(@RequestBody Payment payment) {

        payment.setPaymentStatus(paymentProcessing());
        return paymentRepo.save(payment);
    }

    public String paymentProcessing(){
        //api should be 3rd party payment gateway(paypal,paytm)
        return new Random().nextBoolean()?"success":"false;";
    }
}
