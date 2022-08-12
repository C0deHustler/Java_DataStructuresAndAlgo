// Problem - https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
// Problem - https://leetcode.com/problems/intersection-of-two-linked-lists/

// Explanation - https://www.youtube.com/watch?v=u4FWXfgS8jw&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=34

// Time Complexity: O(2*max(length of list1,length of list2))
// Reason: Uses the same concept of difference of lengths of two lists.

// Space Complexity: O(1)
// Reason: No extra data structure is used

public class Striver_IntersectionPointOfYLinkedList_OptimalApproach2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    // Approach -
    // The difference of length method requires various steps to work on it. Using the same concept of difference of length,
    // a different approach can be implemented. The process is as follows:-

    // 1. Take two dummy nodes for each list. Point each to the head of the lists.
    // 2. Iterate over them. If anyone becomes null, point them to the head of the opposite lists and continue iterating until they collide.

//    public class Solution {
//        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            if(headA == null || headB == null){
//                return null;
//            }
//
//            ListNode a = headA;
//            ListNode b = headB;
//
    // we'll keep moving both dummy nodes of list1 and list2, if any dummy node reaches null, then we'll again start its traversal
    // from the head of other list, i.e. if dummy1 reaches null, then it will again start traversal from head of list2
    // vice versa
//            while(a != b){
//                a = (a == null) ? headB : a.next;
//                b = (b == null) ? headA : b.next;
//            }
//
//            return a;
//        }
//    }
}
