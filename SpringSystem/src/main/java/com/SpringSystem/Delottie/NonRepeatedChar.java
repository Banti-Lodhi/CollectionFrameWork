package com.SpringSystem.Delottie;
import java.util.*;
public class NonRepeatedChar {
    public static Character nonrepeatedchar(String s) {
        Map<Character, Integer> result = new LinkedHashMap<>();
        for(char cs : s.toCharArray()) {
            result.put(cs, result.getOrDefault(cs, 0)+1);
        }
for(Map.Entry<Character, Integer> entry : result.entrySet()) {
    if(entry.getValue() == 1) {
        return entry.getKey();
    }
}
return null; //non found any value
    }

    public static void main(String[] args) {
        String s = "yalayam";
        Character result = nonrepeatedchar(s);
        if(result != null) {
            System.out.println("First non repeated word in String "+result);
        }else {
            System.out.println("No non found the non repeated char");
        }
    }
}
