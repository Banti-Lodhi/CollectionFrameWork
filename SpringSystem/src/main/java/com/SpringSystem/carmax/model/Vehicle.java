package com.SpringSystem.carmax.model;

public abstract class Vehicle {
    protected String registrationNumber;
    protected double price;

    public Vehicle(String regNo, double price) {
        this.registrationNumber = regNo;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("RegNo: " + registrationNumber + ", Price: ₹" + price);
    }

    public abstract double calculateTax();
}

