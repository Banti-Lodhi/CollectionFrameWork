package com.SpringSystem.carmax;

import com.SpringSystem.carmax.model.Bike;
import com.SpringSystem.carmax.model.Car;
import com.SpringSystem.carmax.model.Vehicle;
import com.SpringSystem.carmax.payment.PaymentGateway;
import com.SpringSystem.carmax.payment.Razorpay;
import com.SpringSystem.carmax.service.CheckoutService;
import com.SpringSystem.carmax.service.VehicleService;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("UP32-CAR123", 600000);
        Vehicle bike = new Bike("UP32-BIKE456", 80000);

        VehicleService vehicleService = new VehicleService();
        vehicleService.printTaxDetails(car);
        vehicleService.printTaxDetails(bike);

        PaymentGateway gateway = new Razorpay();  // polymorphism
        CheckoutService checkout = new CheckoutService(gateway);
        checkout.checkout(600000);
    }
}