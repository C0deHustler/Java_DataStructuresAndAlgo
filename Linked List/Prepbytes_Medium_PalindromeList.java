import java.io.*;
import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/PALNDRM
// Problem - https://leetcode.com/problems/palindrome-linked-list/
// Explanation - https://www.youtube.com/watch?v=cL4gHVuFOvk&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=28    Timestamp - 13:13

// Main Logic -
// 1. Find middle of the linked list ( this middle node will be passed as the head of the 2nd half of the linked list to be reversed )
// 2. Reverse the 2nd half of the linked list
// 3. Compare both the linked lists starting from their respective heads and check whether they are palindrome or not

public class Prepbytes_Medium_PalindromeList {

    public class Main{
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

// Complete the palindromeLlist function below.
/*
For your reference:

public SinglyLinkedListNode {
int data;
SinglyLinkedListNode next;
}

To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/

        static boolean palindromeLlist(SinglyLinkedListNode head) {
            if(head == null || head.next == null){
                return true;
            }

            SinglyLinkedListNode middleNode = findMidElement(head);

            SinglyLinkedListNode secondHalfStart = reverse(middleNode);

            SinglyLinkedListNode firstHalfStart = head;

            while(secondHalfStart != null){
                if(firstHalfStart.data != secondHalfStart.data){
                    return false;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }
            return true;
        }
        static  SinglyLinkedListNode reverse(SinglyLinkedListNode head){
            SinglyLinkedListNode current = head;
            SinglyLinkedListNode previous = null;
            SinglyLinkedListNode next = null;

            while(current != null){
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
            return head;
        }

        static  SinglyLinkedListNode findMidElement(SinglyLinkedListNode head){
            SinglyLinkedListNode slowPointer = head;
            SinglyLinkedListNode fastPointer = head;

            while(fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
            return slowPointer;
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
                boolean res =palindromeLlist(llist.head);
                if(res)
                    System.out.println("true");
                else
                    System.out.println("false");
            }
            scanner.close();
        }
    }
}
