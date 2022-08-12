import java.io.*;
import java.util.*;
// One of the most Important
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/RVRSEKNDE
// Problem - https://leetcode.com/problems/reverse-nodes-in-k-group/
// Explanation - https://www.youtube.com/watch?v=Of0HPkk3JgI

// Time Complexity: O(N)
// Reason: Nested iteration with O((N/k)*k) which makes it equal to O(N).

// Space Complexity: O(1)
// Reason: No extra data structures are used for computation.

public class Prepbytes_Medium_ReverseInAGroup {
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

// Complete the reverseKnodes function below.

    /*
    For your reference:

    SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    }
    To create a new node use below constructor
    public SinglyLinkedListNode(int nodeData)
    */
    static SinglyLinkedListNode reverseKnodes(SinglyLinkedListNode head,int k) {
        if(head == null || k == 1){
            return  head;
        }

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        dummy.next = head;

        SinglyLinkedListNode current = dummy;
        SinglyLinkedListNode nex = dummy;
        SinglyLinkedListNode pre = dummy;

        int count = 0;
        while(current.next != null){
            current = current.next;
            count++;
        }

        while(count >= k){
            current = pre.next;
            nex = current.next;
            for(int i=1; i<k; i++){
                current.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = current.next;
            }
            pre = current;
            count = count - k;
        }
        return dummy.next;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            int k=scanner.nextInt();
            printLinkedList(reverseKnodes(llist.head,k));

        }
        scanner.close();
    }
}