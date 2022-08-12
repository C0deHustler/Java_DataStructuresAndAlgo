// Problem - https://leetcode.com/problems/merge-two-sorted-lists/
// Problem - https://takeuforward.org/data-structure/merge-two-sorted-linked-lists/

// Explanation -   youtube.com/watch?v=mBUcaPvEawI   (Out of the world detailed explanation)

// T.C - O(m+n) where m and n are the size of both the sorted linked list
// S.C - O(1)

public class Striver_MergeTwoSortedLinkedList {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */

//    class Solution {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            if(list1 == null || list2 == null){
//                return (list1 != null ? list1 : list2);   // if list 1 is not null, the return list1, else return list2
//            }
//
//            ListNode dummy = new ListNode(-1);    // a dummy node which will point to the head of the sorted list in the end of the whole operation
//            ListNode previous = dummy;    // previous node will iterate through both the lists and will help in sorting both the list together
//                                          // put previous == dummy, because it will help us in avoiding null pointer exception,
                                            // e.g. head.prev will give error
                                            // but since dummy will always be before head (i.e. 1st node of the final sorted list), then head.prev
                                            // will not give error

            // use c1 and c2 to iterate, since it's a better practice, and we will not lose our head in any case
//            ListNode c1 = list1;  // iterating node for list1
//            ListNode c2 = list2;  // iterating node for list2
//
//            while(c1 != null && c2 != null){  // iterate until we reach end of one of the list
//                if(c1.val < c2.val){
//                    previous.next = c1;
//                    c1 = c1.next;
//                }
//                else{
//                    previous.next = c2;
//                    c2 = c2.next;
//                }
//
//                previous = previous.next; // keep updating previous to next node after each iteration
//            }
//
            // connecting tail of the list which ended first to the remaining part of the other list
//            previous.next = (c1 != null ? c1 : c2);
//
//            return dummy.next;    // dummy.next will become the new head of the complete sorted list
//        }
//    }
}
