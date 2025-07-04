package com.SpringSystem.carmax.payment;

public class Paytm implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via Paytm");
    }
}
