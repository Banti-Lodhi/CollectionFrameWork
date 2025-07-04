package com.SpringSystem.carmax.payment;

public class Razorpay implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via Razorpay");
    }
}

