// Problem - https://takeuforward.org/data-structure/rotate-a-linked-list/
// Problem - https://leetcode.com/problems/rotate-list/

// Explanation - https://www.youtube.com/watch?v=9VPm6nEbVPA&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=40

// Time Complexity: O(length of list) + O(length of list – (length of list % k)) i.e. O(N)
// Reason: O(length of the list) for calculating the length of the list. O(length of the list – (length of list%k)) for breaking link.

// Space Complexity: O(1)
// Reason: No extra data structure is used for computation.


// Approach: (Do read this article - https://takeuforward.org/data-structure/rotate-a-linked-list/ )
// Let’s take an example.
// head = [1,2,3,4,5] k = 2000000000
// If we see a brute force approach, it will take O(5 * 2000000000) which is not a good time complexity when we can optimize it.
// We can see that for every k which is multiple of the length of the list, we get back the original list.
// Try to operate brute force on any linked list for k as multiple of the length of the list.

// This gives us a hint that for k greater than the length of the list, we have to rotate the list for k % length of the list.
// This reduces our time complexity.

// Steps to the algorithm:-
// e.g. 1->2->3->4->5, k = 22
// 1. Calculate the length of the list. i.e. len = 5, so now k = k % len -> k = 22 % 5 -> k = 2
// 2. Connect the last node to the first node by traversing the list with the help of length calculated, converting it to a circular linked list.
// 3. Now if we see the list, 1->2->3->4->5
//                            ^-----------|
// 4. end = len - k -> end = 5 - 2 -> end = 3, so we'll move 3 steps from head by using "temp", thus temp = 3
// 5. Update final new head as temp.next, i.e. new head = 3.next -> new head = 4
// 6. make temp as last node by connecting its next to null, i.e. 3.next = null
// thus, head->4->5->1->2->3->null

public class Striver_RotateALinkedList_OptimalApproach {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    class Solution {
//        public ListNode rotateRight(ListNode head, int k) {
//            if(head == null || head.next == null || k == 0){
//                return  head;
//            }
//
    // 1.
//            ListNode temp = head;
//            int len = 1;
//            while(temp.next != null){
//                len++;
//                temp = temp.next;
//            }
//
    // 2.
//            temp.next = head;
    // 1.
//            k = k % len;
    // 4.
//            int end = len - k;
//
//            while(end-- != 0){
//                temp = temp.next;
//            }
    // 5.
//            head = temp.next;
    // 6.
//            temp.next = null;
//
//            return head;
//        }
//    }
}
