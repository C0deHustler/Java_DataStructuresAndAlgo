// Problem - https://takeuforward.org/data-structure/rotate-a-linked-list/

// Explanation - https://www.youtube.com/watch?v=9VPm6nEbVPA&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=40

// Time Complexity: O(Number of nodes present in the list * k) i.e O(n*k)
// Reason: For k times, we are iterating through the entire list to get the last element and move it to first.

// Space Complexity: O(1)
// Reason: No extra data structures are used for computations

public class Striver_RotateALinkedList_BruteForce {
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
    // 1. Take curr to the last node
    // 2. Take prev to 2nd last node
    // 3. Connect curr to the head
    // 4. Connect prev to null
    // 5. Update head as curr
    // Repeat this procedure for k number of times

//    class Solution {
//        public ListNode rotateRight(ListNode head, int k) {
//            if(head == null || head.next == null){
//                return head;
//            }
//
//            for(int i=0; i<k; i++){
//                ListNode curr = head;
//                ListNode prev = null;
//
//                while(curr.next != null){
//                    prev = curr;
//                    curr = curr.next;
//                }
//                curr.next = head;
//                prev.next = null;
//                head = curr;
//            }
//            return head;
//        }
//    }
}
