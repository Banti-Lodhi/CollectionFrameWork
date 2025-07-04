package com.SpringSystem.carmax.service;


import com.SpringSystem.carmax.payment.PaymentGateway;

public class CheckoutService {
    private PaymentGateway gateway;

    public CheckoutService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void checkout(double amount) {
        gateway.processPayment(amount);
    }
}

