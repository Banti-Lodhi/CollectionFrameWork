package com.SpringSystem.oopsConcept    ;
class Persons {
    void sound() {
        System.out.println("fast sound");
    }
    class student extends Persons {
        @Override
        void sound() {
            System.out.println("Quick sound");
        }
    }
}

class Calculator {
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double c) {
        return a+c;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
}
public class PolyMorphismExample {
    public static void main(String[] args) {
     Persons obj = new Persons();
     obj.sound();

     Calculator calculator = new Calculator();
        System.out.println(calculator.add(23, 45));
        System.out.println(calculator.add(23, 45, 65));
        System.out.println(calculator.add(34.5, 34.56));
    }
}
