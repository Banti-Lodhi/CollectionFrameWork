package com.SpringSystem.Delottie;

import java.util.Arrays;

public class ArrZeroEnd {
    public static void moveZeroToEnd(int[] num) {
        int index = 0;
        for (int nums : num) {
            if (nums != 0) {
                num[index++] = nums;
            }
        }
        while(index < num.length) {
            num[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 8, 4, 6, 0, 4, 2, 0};
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
