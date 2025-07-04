package com.SpringSystem.oopsConcept;

import java.util.*;
import java.util.stream.Collectors;

public class FilterOutEvenNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 2, 5, 6, 2, 5, 6, 6, 3, 6);
        //return all even numbers
         List<Integer> num = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(num);
        //sum of squares of all even numbers
        int sumNumber = numbers.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
        System.out.println(sumNumber);

        //Avoids the null checks
        String nums = null;
      Optional<String> str =  Optional.ofNullable(nums);
        System.out.println(str.orElse("Default value"));
    }
}
