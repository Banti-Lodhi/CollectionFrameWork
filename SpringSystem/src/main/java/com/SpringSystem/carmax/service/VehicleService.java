package com.SpringSystem.carmax.service;


import com.SpringSystem.carmax.model.Vehicle;

public class VehicleService {
    public void printTaxDetails(Vehicle v) {
        v.displayInfo();
        System.out.println("Tax: ₹" + v.calculateTax());
    }
}
