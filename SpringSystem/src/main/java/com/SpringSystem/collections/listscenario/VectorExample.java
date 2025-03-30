package com.SpringSystem.collections.listscenario;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Declare a Vector
        Vector<String> users = new Vector<>();

        // Adding elements to Vector
        users.add("User1");
        users.add("User2");
        users.add("User3");

        // Accessing an element
        System.out.println("User at index 1: " + users.get(1));

        // Removing an element
        users.remove("User2");
        System.out.println("Users after removal: " + users);

        // Modifying elements
        users.set(0, "Admin");
        System.out.println("Updated list: " + users);

        // Checking the size of the Vector
        System.out.println("Size of vector: " + users.size());
    }
}

