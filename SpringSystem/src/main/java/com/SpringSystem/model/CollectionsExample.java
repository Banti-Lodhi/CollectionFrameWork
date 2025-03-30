package com.SpringSystem.model;
//linked list
 class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CollectionsExample {
     public static Node reverseNode(Node head) {
         Node prev = null;
         Node currents = head;
         Node next = null;

         while (currents != null) {
             next = currents.next;
             currents.next = prev;
             prev = currents;
             currents = next;
         }
         return prev;
     }
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 5;
//        arr[1] = 6;
//        arr[2] = 8;
//        System.out.println(arr[2]);
//        arr[3] = 4;
//        for (int i = 2; i < arr.length-1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        //deleting the last element
//        arr[arr.length-1] = 0;
//
//        //printing array
//        for(int num: arr) {
//            System.out.println("arr "+ num);
//        }

        //linked list inserting data
//        Node head = new Node(10);
//        head.next = new Node(30);
//        head.next.next = new Node(40);

//inserting at the begining
//        Node newNode = new Node(5);
//        newNode.next = head;
//        head = newNode;
//delete the node 20 from array
//        Node temp = head;
//        while (temp.next != null && temp.next.data != 20) {
//          temp= temp.next;
//        }
//        if(temp.next != null) {
//            temp.next = temp.next.next;
//        }

        //reverse the node value
        Node head = new Node(10);
        head.next = new Node(50);
        head.next.next = new Node((60));
        head.next.next.next = new Node(70);

        Node reverseNode = reverseNode(head);
        Node currents = reverseNode;
        System.out.print("reverse value ");
        while(currents != null) {

            System.out.print(currents.data+" ");
            currents = currents.next;
        }
        //printing linked list
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
    }
}
