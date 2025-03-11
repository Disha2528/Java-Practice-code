package com.microservice.order_service.common;

import com.microservice.order_service.entity.Order;


public class TransactionResponse {
    private Order order;
    private double amount;
    private String transactionId;
    private String message;

    public TransactionResponse() {
    }

    public TransactionResponse(Order order, double amount, String transactionId, String message) {
        this.order = order;
        this.amount = amount;
        this.transactionId = transactionId;
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
