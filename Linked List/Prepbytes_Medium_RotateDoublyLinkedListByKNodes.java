import java.io.*;
import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/DLLPCC
// Explanation - https://www.youtube.com/watch?v=fUs3B2ti97M
// T.C - O(n), S.C - O(1)
public class Prepbytes_Medium_RotateDoublyLinkedListByKNodes {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode prev;
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
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
                this.tail=node;
                this.head.next=null;
                this.head.prev=null;
                this.tail.next=null;
                this.tail.prev=null;
            } else {
                node.prev=this.tail;
                this.tail.next=node;
                this.tail=node;
                this.tail.next=null;
            }
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

// Complete the rotateDoublyList function below.

/*
For your reference:
SinglyLinkedListNode {
int data;
SinglyLinkedListNode next;
SinglyLinkedListNode prev;
}
To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/

    static SinglyLinkedListNode rotateDoublyList(SinglyLinkedListNode head,int k) {
        if(k == 0){ // if no rotation required
            return head;
        }

        // e.g. 1,2,3,4,5 (k=2)
        SinglyLinkedListNode current = head;
        int count = 1;  // use count to reach that node, from which we have to detach 1st half of the linked list
                        // and attach it to the tail of 2nd half of linked list
                        // count must be set as 1 initially, because current is already at head, if we will set count as 0 initially,
                        // and then iterate k times, then we will go one node ahead of the required partitioning node
        while(count < k && current != null){    // count < k AND checking if we get a value of k which is greater than number of nodes, and we reach end of the linked list
            current = current.next;
            count++;
        }

        // now current has reached the partitioning node, i.e. the end of the 1st half of the linked list
        // current is at 2
        SinglyLinkedListNode NthNode = current; // making NthNode as this node which is at the end of the 1st half of the linked list
                                                // NthNode is at 2

        while(current.next != null){    // now send current node to the last node of the linked list so that head of the 1st half can be connected
                                        // to the tail of the 2nd half
            current = current.next;
        }   // now current is at 5

        current.next = head;    // connecting next of last node of 2nd half to the head of the 1st half
                                // 5.next is connected to 1
        head.prev = current;    // also connecting prev of head of 1st half to the end of the 2nd half
                                // prev of 1 is connected to 5
        head = NthNode.next;    // head = 2.next i.e. 3 is the new head

        head.prev = null;   // 3.prev = null
        NthNode.next = null;    // 2.next = null

        return head;
    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            int k = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            printLinkedList(rotateDoublyList(llist.head,k));
        }
        scanner.close();
    }
}