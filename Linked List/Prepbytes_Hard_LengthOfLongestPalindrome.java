import java.io.*;
import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/LPLDRM
// Explanation Video - https://www.youtube.com/watch?v=nLAnmS4n48I
// Explanation Code - https://www.geeksforgeeks.org/length-longest-palindrome-list-linked-list-using-o1-extra-space/
// T.C - O(n^2), because we are traversing the list 2 times (1st time - normally, 2nd time - by reversing the prefix of the list)
// S.C - O(1)
public class Prepbytes_Hard_LengthOfLongestPalindrome {
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

// Complete the longestPalindrome function below.

    /*
    For your reference:

    SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    }
    To create a new node use below constructor
    public SinglyLinkedListNode(int nodeData)
    */
    static int longestPalindrome(SinglyLinkedListNode head) {
        if(head == null){   // if there is no node in the list
            return 0;
        }
        if(head.next == null){  // if there is only 1 node in the list, because a single character is also a palindrome of itself
            return 1;
        }

        SinglyLinkedListNode next = null;
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = head;
        int result = 1;

        while(current != null){
            // we are reversing the nodes prefix by prefix as we move forward and keep comparing their nodes with the rest of the non-reversed list
            next = current.next;
            current.next = previous;

            // in case of odd no. of nodes in palindrome list
            result = Math.max(result, 2 * countCommon(previous, next)+1);   // multiply by 2 (see explanation video)
            // in case of even no. of nodes in palindrome list
            result = Math.max(result, 2 * countCommon(current, next));

            previous = current; // moving previous by one node ahead
            current = next; // moving current by one node ahead
        }
        return result;
    }

    static int countCommon(SinglyLinkedListNode a, SinglyLinkedListNode b){
        int count = 0;

        // we get reversed nodes here, so we are traversing a reversed prefix here
        while(a != null && b != null){
            if(a.data == b.data){
                count++;
            }
            else{
                break;
            }

            a = a.next; // moving ahead in a reversed list
            b = b.next; // moving ahead in a reversed list
        }
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = 1;
        while (testCases-- > 0) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            System.out.println(longestPalindrome(llist.head));
        }
        scanner.close();
    }
}