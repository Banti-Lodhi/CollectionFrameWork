package com.SpringSystem.Delottie;

import java.util.List;

interface PaymentGateway {
    String processPayment(double amount, String currency);
    default boolean validate(double amount) {
        return amount > 0;
    }
    static List<String> getSupportedCurrencies() {
        return List.of("USD", "EUR", "GBP");
    }
}
