package com.SpringSystem.Delottie;

import java.util.HashMap;
import java.util.Map;

public class DelottieIInd {
    public static int[] pairWithValue(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {2, 11, 9, 15};
        int target = 9;
        int[] result = pairWithValue(nums, target);
        System.out.println("indicates " + result[0] + ", " + result[1]);
     }
}
