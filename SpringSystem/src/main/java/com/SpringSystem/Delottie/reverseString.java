package com.SpringSystem.Delottie;

public class reverseString {
//    public static void reverseString(char[] s) {
//     int left =0, right = s.length-1;
//while (left < right) {
//    char temp = s[left];
//    s[left] = s[right];
//    s[right] = temp;
//    left++;
//    right--;
//}
//    }

    //fizzbuzz
    public static void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
        public static boolean isPalindrome(String reverseVal) {
        int left=0, right=reverseVal.length()-1;
        while(left<right) {
            if(reverseVal.charAt(left++) != reverseVal.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String palindrome = "madam";
        System.out.println("Is it a palindrome true/false: " +isPalindrome(palindrome));
        String str = "Sona Shina is biggest chairman of india";
//        StringBuilder reverseString = new StringBuilder(str).reverse();
//        System.out.println(reverseString);
//       char[] arrchar = str.toCharArray();
//         reverseString(arrchar);
//        System.out.println(new String(str));

        FizzBuzz(100);
       StringBuilder str1 = new StringBuilder(str).reverse();
        System.out.println(str1);
    }
}
