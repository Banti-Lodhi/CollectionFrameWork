package com.SpringSystem.Delottie;

import java.util.Scanner;

public class ChangeUppToLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String...");
       String str = input.nextLine();
       input.close();

       StringBuilder inp = new StringBuilder();
       char[] chars = str.toCharArray();

       int len = chars.length;
       for(int i=0; i<len; i++) {
           char ch = chars[i];

           if(Character.isUpperCase(ch)) {
               inp.append(Character.isLowerCase(ch));
           }else if(Character.isLowerCase(ch)) {
               inp.append(Character.isUpperCase(ch));
           }else {
               inp.append(ch);
           }
       }
        System.out.println(String.valueOf(inp));
    }
}
