package com.SpringSystem.model;

import java.util.*;

public class ExamplePractice {
    public static List<int[]> pairsWithTarget(int[] array, int target) {
        Set<Integer> seen = new HashSet<>();
        List<int[]> result = new ArrayList<>();
        for(int val : array) {
            int complement = target-val;
            if(seen.contains(complement)) {
                result.add(new int[] {complement, val});
            }
            seen.add(val);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 3, 4, 1, 4, 6, 7};
        int target = 9;
       List<int[]> results =  pairsWithTarget(array, target);
       for(int[] res: results) {
           System.out.print(Arrays.toString(res));
       }
    }
}