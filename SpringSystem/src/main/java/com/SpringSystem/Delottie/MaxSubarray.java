package com.SpringSystem.Delottie;

public class MaxSubarray {
    public static int subArray(int[] nums) {
        int maxArr = nums[0];
        int maxEndArr = nums[0];
        for(int i=1; i<nums.length; i++) {
            maxEndArr = Math.max(nums[i], maxEndArr+nums[i]);
            maxArr = Math.max(maxArr, maxEndArr);
        }
        return maxArr;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArray(arr));
    }
}
