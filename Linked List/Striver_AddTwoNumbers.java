// Problem - https://leetcode.com/problems/add-two-numbers/
// Explanation - https://www.youtube.com/watch?v=LBVsXSMOIk4&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=33

// Time Complexity: O(max(m,n)). Assume that m and n represent the length of l1 and l2 respectively,
// the algorithm above iterates at most max(m,n) times.

// Space Complexity: O(max(m,n)). The length of the new list is at most max(m,n)+1.

// Must read this article for clear logical approach - https://takeuforward.org/data-structure/add-two-numbers-represented-as-linked-lists/

public class Striver_AddTwoNumbers {
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
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            ListNode dummy = new ListNode();
//            ListNode temp = dummy;
//
//            int carry = 0;
//
//            while(l1 != null || l2 != null || carry != 0){
//                int sum = 0;
//
//                if(l1 != null){
//                    sum += l1.val;
//                    l1 = l1.next;
//                }
//
//                if(l2 != null){
//                    sum += l2.val;
//                    l2 = l2.next;
//                }
//
//                sum += carry;
//                carry = sum / 10;
//
//                ListNode node = new ListNode(sum % 10);
//                temp.next = node;
//                temp = temp.next;
//            }
//
//            return dummy.next;
//        }
//    }
}
