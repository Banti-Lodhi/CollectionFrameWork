package com.SpringSystem.Delottie;
import java.util.*;
public class GroupElement {
    public static List<List<String>> GroupElements(String[] str) {
        Map<String, List<String>> result = new HashMap<>();
        for(String st: str) {
           char[] ch = st.toCharArray();
            String val = new String(ch);
            result.computeIfAbsent(val, k -> new ArrayList<>()).add(st);
        }
        return new ArrayList<>(result.values());
    }
    public static void main(String[] args) {
       String[] Input = {"bat", "tab", "eat", "tea", "tan", "nat"};


       List<List<String>> result = GroupElements(Input);
       for(List<String> str: result) {
           System.out.println(str);
       }
    }
}
