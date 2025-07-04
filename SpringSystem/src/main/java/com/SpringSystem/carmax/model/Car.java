package com.SpringSystem.carmax.model;

public class Car extends Vehicle {
    public Car(String regNo, double price) {
        super(regNo, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.1;
    }
}

