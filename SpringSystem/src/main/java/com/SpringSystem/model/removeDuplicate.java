package com.SpringSystem.model;

import java.util.*;

public class removeDuplicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 4, 1, 4, 4, 2, 3, 5, 6,7, 3);

        Set<Integer> removeDup = new HashSet<>(list);

        List<Integer> uniqueSort = new ArrayList<>(removeDup);
        System.out.println(uniqueSort);



    }
}