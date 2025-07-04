package com.SpringSystem.Delottie;

public class FindIIndLargest {
public static int findIIndMax(int[] nums) {
    if(nums.length<2) throw new ArithmeticException("Array too small");
    int first = Integer.MIN_VALUE, second=Integer.MIN_VALUE;
    for(int num: nums) {
        if (num > first) {
            second = first;
            first = num;
        }else if (second<num && first!=num) {
            second=num;
        }
    }
    return second == Integer.MIN_VALUE ? -1 : second;
}
public static void main(String[] args) {
    int[] arr = {3, 4, 2, 1, 4, 5, 2, 5, 2, 2, 2, 5};
    System.out.println(findIIndMax(arr));
    }
}