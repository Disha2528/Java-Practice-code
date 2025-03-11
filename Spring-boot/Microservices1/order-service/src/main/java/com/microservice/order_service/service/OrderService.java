package com.microservice.order_service.service;

import com.microservice.order_service.common.TransactionRequest;
import com.microservice.order_service.common.TransactionResponse;

public interface OrderService {



    public TransactionResponse bookOrder(TransactionRequest request);
}