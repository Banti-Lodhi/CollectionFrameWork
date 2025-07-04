package com.SpringSystem.wipro;
import java.util.*;
public class wipro {
    public static String HighestSecondString(List<String> string) {
        return string.stream().filter(r->r.length()==3).
                sorted(Comparator.comparingInt(wipro::countVowels))
                .sorted(Comparator.comparingInt(wipro::countVowels).reversed())
                .skip(1).findFirst().orElse(null);

    }
    private static int countVowels(String s) {
        return (int) s.toLowerCase().chars().
                filter(c->"aeiou".indexOf(c)!=-1).count();
    }
    public static void main(String[] args) {
    List<String> str = Arrays.asList("xyzz", "ac", "bca", "abc");
        System.out.println(HighestSecondString(str));
    }
}