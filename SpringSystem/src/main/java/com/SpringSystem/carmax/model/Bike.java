package com.SpringSystem.carmax.model;

public class Bike extends Vehicle {
    public Bike(String regNo, double price) {
        super(regNo, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }
}

