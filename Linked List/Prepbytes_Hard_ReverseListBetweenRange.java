import java.io.*;
import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/REVK
// Problem - https://leetcode.com/problems/reverse-linked-list-ii/
// Explanation - https://www.youtube.com/watch?v=BE0hruM5O5U
public class Prepbytes_Hard_ReverseListBetweenRange {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;
        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head)
    {
        SinglyLinkedListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

// Complete the reverseInRange function below.

    /*
    For your reference:

    SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    }
    To create a new node use below constructor
    public SinglyLinkedListNode(int nodeData)
    */
    static SinglyLinkedListNode reverseInRange(SinglyLinkedListNode head, int start, int end) {
        if(head == null || start == end){
            return head;
        }

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);   // to keep track of the original head
        dummy.next = head;

        SinglyLinkedListNode nodeBeforeSublist = dummy;
        int pos = 1;
        while(pos < start){
            nodeBeforeSublist = nodeBeforeSublist.next;
            pos++;
        }

        SinglyLinkedListNode workingPtr = nodeBeforeSublist.next;
        while(start < end){
            SinglyLinkedListNode nodeToBeExtracted = workingPtr.next;
            workingPtr.next = nodeToBeExtracted.next;

            nodeToBeExtracted.next = nodeBeforeSublist.next;
            nodeBeforeSublist.next = nodeToBeExtracted;

            start++;
        }
        return dummy.next;

    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = 1;
        while (testCases-- > 0) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            printLinkedList(reverseInRange(llist.head,l,r));
        }
        scanner.close();
    }
}