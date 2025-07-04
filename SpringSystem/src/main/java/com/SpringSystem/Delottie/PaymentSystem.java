package com.SpringSystem.Delottie;

abstract class BasePaymentProcessor implements PaymentGateway {
    protected String merchantId;

    public BasePaymentProcessor(String merchantId) {
        this.merchantId = merchantId;
    }

    protected abstract String buildRequest(double amount, String currency);
    protected abstract String parseResponse(String rawResponse);

    @Override
    public String processPayment(double amount, String currency) {
        if (!validate(amount)) {
            throw new IllegalArgumentException("Invalid amount");
        }

        if (!PaymentGateway.getSupportedCurrencies().contains(currency)) {
            throw new IllegalArgumentException("Unsupported currency");
        }

        String request = buildRequest(amount, currency);
        System.out.println("Sending request: " + request);
        String response = "Mock response for " + amount + " " + currency;
        return parseResponse(response);
    }
}

// Concrete implementations
class PayPalProcessor extends BasePaymentProcessor {
    public PayPalProcessor(String merchantId) {
        super(merchantId);
    }

    @Override
    protected String buildRequest(double amount, String currency) {
        return String.format("PAYPAL|%s|%.2f|%s", merchantId, amount, currency);
    }

    @Override
    protected String parseResponse(String rawResponse) {
        return "PayPal transaction: " + rawResponse;
    }
}

class StripeProcessor extends BasePaymentProcessor {
    public StripeProcessor(String merchantId) {
        super(merchantId);
    }

    @Override
    protected String buildRequest(double amount, String currency) {
        return String.format("STRIPE|%s|%.2f|%s", merchantId, amount, currency);
    }

    @Override
    protected String parseResponse(String rawResponse) {
        return "Stripe charge: " + rawResponse;
    }

    // Additional Stripe-specific method
    public void saveCreditCard(String token) {
        System.out.println("Saving card with token: " + token);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPalProcessor("PP123");
        System.out.println(paypal.processPayment(100.50, "USD"));

        StripeProcessor stripe = new StripeProcessor("ST456");
        System.out.println(stripe.processPayment(75.25, "EUR"));
    stripe.saveCreditCard("tok_visa");
    }
}
