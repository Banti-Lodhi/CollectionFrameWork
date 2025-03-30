package com.SpringSystem.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CoreCodding {
    //Palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = str.length()-1;
        while (left<right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
//Factorial
    public static int Factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int factorial = n * Factorial(n-1);
        return factorial;
    }
    //check prime
    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2; i<Math.sqrt(n); i++) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    //5.Counts vowels and constants
    public static void countVowelConstants(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int constants = 0;
        for(char ch : str.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }else {
                constants++;
            }
        }
    }
        System.out.println("Vowels "+ vowels + "Constants "+constants);
    }
    //Sort Arrays
    public static void sortArrays(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted elements == "+ Arrays.toString(arr));
    }
    //Merged two Arrays
    public static int[] mergedArr(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }
    //max element
    public static int maxValue(int[] num) {
        int max = num[0];
        for(int val:num) {
            if(val > max) {
                max = val;
            }
        }
        return max;
    }

    //remove duplicate value
    public static int[] removeDuplicateValue(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int val : arr) {
            set.add(val);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for(int num : set) {
            result[i++] = num;
        }
        return result;
        }

        //
    public static void main(String[] args) {
        //Palindrome
        System.out.println("palindrome");
        String str = "madam";
        String str1 = "SonuShina";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        //Factorial
        System.out.println("factorial");
        System.out.println(Factorial(20));

        //isPrime Number
        System.out.println("Prine number");
        System.out.println(isPrime(20));

        //count vowels and constants
        System.out.println("count vowels and constants");
        String string = "Sony Shina is good girl for someone";
        countVowelConstants(string);

        //Sort array
        System.out.println("sort array");
        int[] arr = {9, 3, 5, 6, 2, 5, 6, 6};

        sortArrays(arr);

        //merrged two array
        System.out.println("merged value");
        int[] arr1 = {3, 5, 2, 5, 6, 7, 6};
        int[] arr2 = {3, 6, 7, 3, 6, 2, 6};
        int[] mergeded = mergedArr(arr1, arr2);
        System.out.println(Arrays.toString((mergeded)));

        //max value
        System.out.println("max value");
        System.out.println(maxValue(arr));

        //remove duplicate value
        System.out.println("remove duplicate");
        int[] removeDup = removeDuplicateValue(arr2);
        System.out.println(Arrays.toString(removeDup));
    }
}
