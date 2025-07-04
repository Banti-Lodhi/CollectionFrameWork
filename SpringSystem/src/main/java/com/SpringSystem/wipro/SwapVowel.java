package com.SpringSystem.wipro;

import java.util.stream.Collectors;

public class SwapVowel {
    public static String swapVowel(String str, char vowel1, char vowel2) {

        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++) {
          if(ch[i] == vowel1) {
              ch[i] = vowel2;
          }else if(ch[i] == vowel2){
             ch[i] = vowel1;
          }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
String str = "hello";
char ch = 'e';
char ch1 = 'o';
        System.out.println(swapVowel(str, ch, ch1));
        String input = "hello";
       String st = input.chars().mapToObj(c-> {
            if(c=='e') return 'o';
            if(c=='o') return 'e';
            return (char)c;
        }).map(String::valueOf).collect(Collectors.joining());
        System.out.println(st);
    }
}
