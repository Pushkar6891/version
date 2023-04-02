package com.company.list.singlyLinkedList.eg01creationOfSinglyLinkedList;

public class SinglyLinkedList {

    // 1. Create nested class ListNode
    private ListNode head;

    private static class ListNode {
        // 2. ListNode has data + reference of next ListNode
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Print Elements of SinglyLinkedList
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Find Length of SinglyLinkedList
    public int findLengthOfSinglyLinkedList() {

        // Empty SinglyLinkedList
        if(head == null){
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Print Elements of SinglyLinkedList
    // Find Length of SinglyLinkedList
    // Insert Node at beginning of SinglyLinkedList
    // Insert Node at end of SinglyLinkedList
    // Insert Node at given position of SinglyLinkedList
    // Delete first Node of SinglyLinkedList
    // Delete last Node of SinglyLinkedList
    // Delete Node at given position of SinglyLinkedList
    // Search element in SinglyLinkedList
    // Reverse SinglyLinkedList
    // Find Middle Node in SinglyLinkedList
    // Find Nth Node from end of SinglyLinkedList
    // Remove Duplicates from sorted SinglyLinkedList
    // Insert Node in a sorted SinglyLinkedList
    // Remove a given key from SinglyLinkedList
    // Detect a Loop in SinglyLinkedList
    // Find start of loop in SinglyLinkedList
    // Floyd's Cycle Detection Algorithm
    // Remove a loop from SinglyLinkedList
    // Merge Two Sorted SinglyLinkedList
    // Add Two Numbers using SinglyLinkedList

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // connect ListNode to form a chain
        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth; // 10 -> 1 -> 8 -> 11 -> null

        singlyLinkedList.display();
        System.out.println("Length of SinglyLinkedList : " + singlyLinkedList.findLengthOfSinglyLinkedList());
    }
}