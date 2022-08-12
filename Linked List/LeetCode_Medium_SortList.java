// Problem - https://leetcode.com/problems/sort-list/

// Explanation - https://www.youtube.com/watch?v=HUFibUCDt0U&t=419s

// T.C - O(n log(n))
// S.C - O(1)

public class LeetCode_Medium_SortList {
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
    // Main function
//        public ListNode sortList(ListNode head) {
//            if(head == null || head.next == null){
//                return head;
//            }
//            ListNode mid = findMid(head);
//            ListNode secondHead = mid.next;
//            mid.next = null;
//
//            ListNode l1 = sortList(head);
//            ListNode l2 = sortList(secondHead);
//
//            return merge2LL(l1, l2);
//        }
//
    // Method for finding middle
//        public ListNode findMid(ListNode head){
//            ListNode slow = head;
//            ListNode fast = head;
//
//            while(fast.next != null && fast.next.next != null){
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            return slow;
//        }
//
    // Method for merging 2 linked list
//        public ListNode merge2LL(ListNode l1, ListNode l2){
//            if(l1 == null || l2 == null){
//                return (l1 != null) ? l1 : l2;
//            }
//
//            ListNode dummy = new ListNode(-1);
//            ListNode previous = dummy;
//
//            ListNode c1 = l1;
//            ListNode c2 = l2;
//
//            while(c1 != null && c2 != null){
//                if(c1.val < c2.val){
//                    previous.next = c1;
//                    c1 = c1.next;
//                }
//                else{
//                    previous.next = c2;
//                    c2 = c2.next;
//                }
//                previous = previous.next;
//            }
//            previous.next = (c1 != null) ? c1 : c2;
//
//            return dummy.next;
//
//        }
//    }
}
