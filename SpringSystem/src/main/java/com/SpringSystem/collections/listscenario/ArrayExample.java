package com.SpringSystem.collections.listscenario;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] fixedArray = {23, 24, 21, 35, 54};
        //traverse of it
        for (int arr : fixedArray) {
            System.out.println(arr);
        }
        System.out.println("Second way to traverse the element");
        //Iterating over the array
        for(int i=0; i<fixedArray.length; i++) {
            System.out.println(fixedArray[i]);
        }
        //accessing the elements in the array
        System.out.println("find the indexed the number" +fixedArray[3]);
        //Modifying the array
        fixedArray[2] = 4;
        System.out.println("change the number to other given number "+fixedArray[2]);
     for (int arr: fixedArray) {
         System.out.println(arr);
     }
        //array length
        System.out.println("Calculate the length of the array "+fixedArray.length);

    }
}
