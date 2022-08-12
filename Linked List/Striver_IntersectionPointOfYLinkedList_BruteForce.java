// Problem - https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/

// Explanation - https://www.youtube.com/watch?v=u4FWXfgS8jw&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=34

// Time Complexity: O(m*n)
// Reason: For each node in list 2 entire lists 1 are iterated.

// Space Complexity: O(1)
// Reason: No extra space is used.

public class Striver_IntersectionPointOfYLinkedList_BruteForce {
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
//    public class Solution {
//        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            while(headB != null){
//                ListNode temp = headA;
//                while(temp != null){
//                    if(temp == headB){
//                        return temp;
//                    }
//                    temp = temp.next;
//                }
//                headB = headB.next;
//            }
//            return null;
//        }
//    }
}
