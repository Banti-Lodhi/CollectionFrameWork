package com.SpringSystem.Delottie;

import java.util.*;

public class MajorityFunc {
public static void majority(int[] nums) {
    int n = nums.length;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++) {
        if(map.containsKey(nums[i])) {
            map.put(nums[i], map.get(nums[i])+1);
        }else {
            map.put(nums[i], 1);
        }
    }
    for(int key : map.keySet()) {
        if(map.get(key) > n/3) {
            System.out.println("Is this my majority key "+key);
        }
    }
}

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 1, 1, 4, 1, 4, 3};
        majority(nums);
    }
}
