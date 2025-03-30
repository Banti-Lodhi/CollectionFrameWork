package com.SpringSystem.collections.listscenario;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declare an ArrayList
        List<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing an element
        System.out.println("Student at index 1: " + names.get(1));

        // Removing an element
        names.remove("Bob");
        System.out.println("List after removal: " + names);

        // Iterating over the ArrayList
        for (String name : names) {
            System.out.println(name);
        }

        // Checking size
        System.out.println("Total students: " + names.size());

        // Modifying elements
        names.set(0, "Alex");
        System.out.println("Updated list: " + names);
    }
}

