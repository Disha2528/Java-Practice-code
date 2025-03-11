package com.microservice.order_service.service;

import com.microservice.order_service.common.Payment;
import com.microservice.order_service.common.TransactionRequest;
import com.microservice.order_service.common.TransactionResponse;
import com.microservice.order_service.entity.Order;
import com.microservice.order_service.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceimpl implements OrderService{

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private RestTemplate template;


    @Override
    public TransactionResponse bookOrder(TransactionRequest request) {
        String response="";
        Order order=request.getOrder();
        Payment payment=request.getPayment();
        payment.setOrderId(order.getPrice());

        //rest call
          Payment paymentResponse=  template.postForObject("http://PAYMENT-SERVICE/payment/doPayment",payment, Payment.class);
        response= paymentResponse.getPaymentStatus().equals("success")? "Payment processing successful and order placed":"there is a failure in payment api order added to cart";



        orderRepo.save(order);
          return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);



    }
}
