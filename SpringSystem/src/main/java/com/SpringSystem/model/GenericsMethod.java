package com.SpringSystem.model;
public class GenericsMethod {
public static <T> void printArray(T[] arrays) {
    for(T element: arrays) {
        System.out.println(element+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
Integer[] intArr = {9, 4, 5, 6, 7, 6};
        System.out.println("Print Integer number");
        printArray(intArr);
        String[] strVal = {"Sonu", "neha", "manu", "teena", "renu"};
        printArray(strVal);
    }
}
