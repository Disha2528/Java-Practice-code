package com.microservice.order_service.controller;

import com.microservice.order_service.common.TransactionRequest;
import com.microservice.order_service.common.TransactionResponse;
import com.microservice.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/bookOrder" )
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request){

       return orderService.bookOrder(request);
       //do a rest call to payment and pass the order id

    }



}
