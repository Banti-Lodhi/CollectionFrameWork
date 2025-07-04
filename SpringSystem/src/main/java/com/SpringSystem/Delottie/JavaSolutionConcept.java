package com.SpringSystem.Delottie;

import java.util.*;

public class JavaSolutionConcept {
    public static void main(String[] args) {
        int[] result = {3, 4, 2, 4, 5, 9, 8, 2};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int n: result) {
            if(!seen.add(n)) {
                duplicates.add(n);
            }
        }
        System.out.println("Duplicates string value "+duplicates);

        Map<Integer, Integer> res = new HashMap<>();
        for(int n: result) {
            res.put(n, res.getOrDefault(n, 0)+1);
        }
        for(Map.Entry<Integer, Integer> val: res.entrySet()) {
            System.out.println(val.getKey()+" "+val.getValue());
        }
    }
    }

