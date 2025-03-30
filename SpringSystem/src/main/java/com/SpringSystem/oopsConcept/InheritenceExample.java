package com.SpringSystem.oopsConcept;
interface getCalculateArea {
    double calculateArea();
}

class CircleArea implements getCalculateArea {
    double radius;
    CircleArea(double r) {
        this.radius = r;
    }
    double pi = Math.PI;
    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }
}

class rectangle implements getCalculateArea {
    double width, height;

    rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
}
class Animal {
    void eat() {
        System.out.println("Animal eating...");
    }
    }
class Dog extends Animal {
        void eat() {
            System.out.println("Dog eating the food");
        }
    }
        class Cats extends Animal {
            void eat() {
                System.out.println("Cat eat...");
            }

}

abstract  class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle is created...");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("rectangle is created...");
    }
}

public class InheritenceExample {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.eat();

        Shape circle = new Circle();
        Shape circle1 = new Rectangle();
        circle.draw();
        circle1.draw();


        getCalculateArea getcalcute = new CircleArea(2.4);
        System.out.println(getcalcute.calculateArea());
        getCalculateArea getcalcuteRec = new rectangle(23, 44);
        System.out.println(getcalcuteRec.calculateArea());

    }
}
