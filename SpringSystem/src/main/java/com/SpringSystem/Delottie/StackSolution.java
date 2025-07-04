package com.SpringSystem.Delottie;

import java.util.Stack;

public class StackSolution {
    public static boolean StackBracket(String s) {
        Stack<Character> chars = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='(') chars.push(')');
            else if (c=='{') chars.push(']');
            else if (c=='[') chars.push(']');
            else if (chars.isEmpty() || chars.pop()!=c) {
                return false;
            }
        }
        return chars.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(StackBracket("Mathmatics"));
    }
}
