package com.SpringSystem.Delottie;

import java.util.*;

public class CountCharOccurence {
    public static Map<String, Integer> countOccurence(String string) {
        String[] spString = string.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String vals : spString) {
            map.put(vals, map.getOrDefault(vals, 0)+1);
        }
        char[] val = string.toCharArray();
        Map<Character, Integer> valb = new HashMap<>();
        for(char vals: val) {
            valb.put(vals, valb.getOrDefault(vals, 0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String str = "hello world";
        char target = 'l';

        String string = "hello hello world world sing song hello";
        String tar = "hello";
       char[] val= string.toCharArray();

        String[] words = string.split("\\s+");
        System.out.println(words);

//        1. Using for loop
        int count = 0;
        int counts = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == target) {
                count++;
            }
        }
        for(String word : words) {
            if(word.equals(tar)) {
                counts++;
            }
        }
        System.out.println(target+ " char in it string "+count+" times arising");
        System.out.println(tar+ " string in it string "+counts+" times arising");

//        2. java 8 feature add
        long  streamCount = str.chars().filter(ch-> ch==target).count();
        System.out.println("Use java method inside of it "+streamCount);

long streamCounts = Arrays.stream(words).filter(ch -> ch.equals(tar)).count();
        System.out.println("Word count in the string "+ streamCounts);
        //3.use of collection framework
        Map<Character, Integer> chars = new HashMap<>();
        for(char st : str.toCharArray()) {
            chars.put(st, chars.getOrDefault(st, 0)+1);
        }
        System.out.println("All Character count "+ chars);

        Map<String, Integer> countString = new HashMap<>();
        for(String sr : words) {
            countString.put(sr, countString.getOrDefault(sr, 0)+1);
        }
        System.out.println(countString);


        //use of function method inside of it
        System.out.println("Use of occurence value");
        System.out.println(countOccurence(string));
    }
}
