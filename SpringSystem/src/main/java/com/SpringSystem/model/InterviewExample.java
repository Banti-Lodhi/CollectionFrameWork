package com.SpringSystem.model;

public class InterviewExample {
    //    public static int subStr(int[] nums) {
//        int currentSum = nums[0];
//        int maxSum = nums[0];
//        for(int i=0; i<nums.length; i++) {
//           currentSum = Math.max(nums[i], nums[i]+currentSum);
//           maxSum = Math.max(maxSum, currentSum);
//        }
//        return maxSum;
//    }
//    public static void main(String[] args) {
//int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.println(subStr(nums));
//    }
//    1.Reverse String
    public static void main(String[] args) {
//        String str = "Sonu Shina";
//        StringBuilder reverse = new StringBuilder(str).reverse();
//        System.out.println(reverse);
//
////        2.String palindrome
//    if(str.equals(reverse)) {
//            System.out.println("palindrome string");
//        }else {
//            System.out.println("string is not palindrome");
//        }
//    //3.Fibonacci the string
//    int num1 = 0, num2 = 1, n=10;
//        System.out.print("Fibbonacci Series "+num1);
//    for(int i=2; i<n; i++) {
//        int num3 = num1 + num2;
//        System.out.print(num3+", ");
//        num1 = num2;
//        num2 = num3;
//    }
    //Factorial
    int n1=5;
    int factorial = 1;
    for(int i=1; i<n1; i++) {
        factorial*=i;
    }
        System.out.println("factrial number = "+ factorial);

    //prime number
        boolean isPrime = true;
        int n2 = 11;
         for(int i=2; i<Math.sqrt(n2); i++) {
             if(i%2 == 0) {
                 isPrime = false;
                 break;
             }
         }
        System.out.println(isPrime);
    }
}