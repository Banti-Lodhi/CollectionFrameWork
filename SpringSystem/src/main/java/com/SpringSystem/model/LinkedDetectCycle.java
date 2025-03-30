package com.SpringSystem.model;

public class LinkedDetectCycle {
    public static boolean linkedCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = head.next;
            fast = head.next.next;
            if(fast == slow) {
                return true;
            }
        }
return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        boolean isLinkedCycle = linkedCycle(head);
        System.out.println("has cycle"+ isLinkedCycle);
    }
}
