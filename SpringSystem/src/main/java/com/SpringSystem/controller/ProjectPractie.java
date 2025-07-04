package com.SpringSystem.controller;

import java.util.*;

public class ProjectPractie {
    public static void main(String[] args) {

                Map<String, Integer> st = new HashMap<>();
                st.put("apple", 1);
                st.put("banana", 2);
                st.put("orange", 3);
                for(Map.Entry<String, Integer> res : st.entrySet()) {
                    System.out.println(res.getKey() + "  "+ res.getValue());
                }
                
                System.out.println(st);
                int hascode = "banana".hashCode();
                int bucketIndex = hascode % 16;
                System.out.println(bucketIndex);
            }
        }

