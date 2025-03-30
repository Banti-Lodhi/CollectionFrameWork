package com.SpringSystem.Delottie;

import java.util.*;

public class Delotie {
    public static List<int[]> findPairsWithSum(int[] array, int target) {
        Set<Integer> seen = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for(int val: array) {
            int complement = target-val;
            if(seen.contains(complement)) {
                result.add(new int[]{complement, val});
            }
            seen.add(val);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {-1, 1, 1, 2, 6, 4, 6, 7};
        int target = 9;
        List<int[]> pairsWithSum = findPairsWithSum(array, target);
        for(int[] pairs : pairsWithSum) {
        System.out.println(Arrays.toString(pairs));
    }
}
}
