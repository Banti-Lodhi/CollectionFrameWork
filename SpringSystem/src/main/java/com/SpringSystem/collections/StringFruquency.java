package com.SpringSystem.collections;

import java.util.*;

public class StringFruquency {
    public static void main(String[] args) {
        
        //frequency of string exists times
//        List<String> strList = Arrays.asList("Sona", "sona", "Sona", "Riya", "Shyam", "Maduri", "Shakshi", "Riya");
//
//        Map<String, Integer> frequency = new HashMap<>();
//
//        for(String str : strList) {
//            frequency.put(str, frequency.getOrDefault(str, 0)+1);
//        }
//        System.out.println("Frequency map "+frequency);
        
        //find commom number between two string
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 9, 2, 7, 4);
        
        Set<Integer> set = new HashSet<>(list1);
        List<Integer> stoList = new ArrayList<>();
        for (Integer num : list2) {
            boolean contains = set.contains(num);
            if(contains) {
                stoList.add(num);
            }
        }
        System.out.println("Common element between both list "+stoList);
    }
}
