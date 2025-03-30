package com.SpringSystem.oopsConcept;
abstract class Vehicle {
    abstract void vehicle();
}
class car extends Vehicle {
    @Override
    void vehicle() {
        System.out.println("Four wheeler bullet car...");
    }
}
    class Bike extends Vehicle {
        @Override
        void vehicle() {
            System.out.println("Two Wheeler bike train...");

    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle vehicle = new car();
        Vehicle vehicle1 = new Bike();
        vehicle.vehicle();
        vehicle1.vehicle();
    }
}
