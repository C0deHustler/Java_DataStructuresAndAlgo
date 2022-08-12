import java.io.*;
import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/MERGEKSORLIST
// Problem - https://leetcode.com/problems/merge-k-sorted-lists/
// Explanation - https://www.youtube.com/watch?v=wugaUVZ8PVw
// Time complexity: O(NlogK) where K is the number of linked lists and N is the total number of nodes in two lists.
// Space complexity : O(1)

public class Prepbytes_Hard_MergeKSortedLinkedLists {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(){}
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

// Complete the mergeKLists() function below.

    /*
    For your reference:
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(){}
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    */
    static SinglyLinkedListNode mergeKLists(SinglyLinkedListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        return mergeKLists(lists, 0, lists.length-1);
    }
    static SinglyLinkedListNode mergeKLists(SinglyLinkedListNode[] lists, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return lists[start];
        }
        int mid = (start+end)/2;

        SinglyLinkedListNode l1 = mergeKLists(lists, start, mid);
        SinglyLinkedListNode l2 = mergeKLists(lists, mid+1, end);

        return mergeTwoLists(l1, l2);
    }
    static SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode list1, SinglyLinkedListNode list2) {
        if(list1 == null || list2 == null){
            return (list1 != null ? list1 : list2);
        }

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode previous = dummy;

        SinglyLinkedListNode c1 = list1;
        SinglyLinkedListNode c2 = list2;

        while(c1 != null && c2 != null){
            if(c1.data < c2.data){
                previous.next = c1;
                c1 = c1.next;
            }
            else{
                previous.next = c2;
                c2 = c2.next;
            }

            previous = previous.next;
        }

        previous.next = (c1 != null ? c1 : c2);

        return dummy.next;
    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = 1;
        while (testCases-- > 0) {
            int k=scanner.nextInt();
            SinglyLinkedListNode []headList = new SinglyLinkedListNode[k];
            int p=0;
            for(int j=0;j<k;j++) {
                SinglyLinkedList llist = new SinglyLinkedList();
                int llistCount = scanner.nextInt();
                for (int i = 0; i < llistCount; i++) {
                    int llistItem = scanner.nextInt();
                    llist.insertNode(llistItem);
                }
                headList[p++] = llist.head;
            }
            printLinkedList(mergeKLists(headList));
        }
        scanner.close();
    }
}