package com.SpringSystem.model;

public class MergeSortArr {
    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;
        while (i<arr1.length && j<arr2.length) {
              if(arr1[i] < arr2[j]) {
                  result[k++] = arr1[i++];
              }else {
                  result[k++] = arr2[j++];
              }
        }
        while (i<arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j<arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
    int[] arr1 = {3, 4, 5, 6, 7, 8};
    int[] arr2 = {6, 7, 3, 7, 3, 7};
        int[] mergedArr = mergeArr(arr1, arr2);
        for(int arr : mergedArr) {
            System.out.print(arr+ " ");
        }
    }
}
