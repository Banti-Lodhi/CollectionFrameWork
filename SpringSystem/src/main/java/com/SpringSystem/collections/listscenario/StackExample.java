package com.SpringSystem.collections.listscenario;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push element
        stack.push("google.com");
        stack.push("youtube.com");
        stack.push("stackoverflow.com");
        stack.push("gemini.com");

        //Going back to previous page
        System.out.println("Back to: "+stack.pop());
//displays the stack
        System.out.println(stack);
        //peek at the top element without removing element
        System.out.println("Top history item: "+stack.peek());
        System.out.println(stack);
        //checking if the stack is empty
        System.out.println("check the stack is empty or not: "+stack.isEmpty());
    }
}
