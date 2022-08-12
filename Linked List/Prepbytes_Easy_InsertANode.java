import java.lang.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/video/fe085cd202354533a01c68b3d39afee9
// Explanation - https://www.tutorialcup.com/interview/linked-list/insert-node-in-the-sorted-linked-list.htm

// Method submitted in compiler -
// Complete the insertSortedNode function below.

//  For your reference:
//
//  SinglyLinkedListNode {
//      int data;
//      SinglyLinkedListNode next;
//  }
//  To create a new node use below constructor
//  public SinglyLinkedListNode(int nodeData)
//
//  static SinglyLinkedListNode insertSortedNode( SinglyLinkedListNode head, int value) {
//
//        SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
//        SinglyLinkedListNode previous = null;
//        SinglyLinkedListNode current = head;
//
//        while(current != null && value > current.data){
//          previous = current;
//          current = current.next;
//        }
//        newNode.next = current;
//        if(previous == null){
//          head = newNode;
//        }
//        else{
//          previous.next = newNode;
//        }
//        return head;
//        }

public class Prepbytes_Easy_InsertANode {
    public static class MyLinkedList {
        class Node {
            Node next = null;
            int val = 0;
            public Node(int val) {
                this.val = val;
            }
        }
        private Node head;
        private int size;

        public MyLinkedList() {
            this.head = null;
            this.size = 0;
        }

        public void addAtHead(int val) {
            Node node = new Node(val);
            if (this.size == 0) {
                this.head = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        public void sortedInsert(int val) {
            Node newNode = new Node(val);
            Node previous = null;
            Node current = head;

            while (current != null && val > current.val) {
                previous = current;
                current = current.next;
            }

            newNode.next = current;
            if (previous == null)
                head = newNode;
            else
                previous.next = newNode;

        }

        public void printList() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) throws java.lang.Exception {

        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(10);
        obj.addAtHead(7);
        obj.addAtHead(4);
        obj.printList();

        obj.sortedInsert(6);
        obj.printList();

    }
}

