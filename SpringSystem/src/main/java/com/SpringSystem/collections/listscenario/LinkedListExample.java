package com.SpringSystem.collections.listscenario;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        //Declare a linkedlist
       LinkedList<String> linked = new LinkedList<>();
        //add elelments
        linked.add("Request1");
        linked.add("Request2");
        linked.add("Request3");
        linked.add("Request4");
       //processing first request(poll)
        System.out.println("Processing "+ linked.poll()); //removes and returns the first element

        //Iterating over the LinkedList
        for(String str : linked) {
            System.out.println(str);
        }

        //adding a request at the beginning
        linked.addFirst("Urgent Request");
        //adding a request at the end of linked list
        linked.addLast("Comment the request");

        //get a request at the beginning
        linked.getFirst();
        //get a request at the end of linked list
        linked.getLast();
        //set a request at the given index
        linked.set(2, "request_n");

        //addAll to add more request at one time

        System.out.println("after adding first and last in linked "+linked);


        //removing last request
        linked.removeLast();
        System.out.println("after removing last element "+linked);
        //removing first request
        linked.removeFirst();
     Iterator<String> stringIterator = linked.descendingIterator();
while(stringIterator.hasNext()) {
 System.out.println(stringIterator.next());
}
     System.out.println("after removing first element "+linked);
     System.out.println(linked.contains("request_n"));
     System.out.println(linked.offer("george"));

     // removeFirstOccurrence, removeLastOccurrence
     linked.add("Zara");
     linked.removeFirstOccurrence("Zara");
     System.out.println("After removing first occurrence of 'Zara': " + linked);
     linked.removeLastOccurrence("Zara");
     System.out.println("After removing last occurrence of 'Zara': " + linked);

     LinkedList<Integer> str = new LinkedList<>();
     str.add(3);
     str.add(5);
     str.add(7);
     str.add(9);
     String str1 = str.toString();
     boolean b = linked.addAll(Collections.singleton(str1));
     System.out.println(b);
    }
}
