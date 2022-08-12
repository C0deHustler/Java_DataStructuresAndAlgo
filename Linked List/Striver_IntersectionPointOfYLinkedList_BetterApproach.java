// Problem - https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/

// Explanation - https://www.youtube.com/watch?v=u4FWXfgS8jw&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=34

// Time Complexity: O(n+m)
// Reason: Iterating through list 1 first takes O(n), then iterating through list 2 takes O(m).

// Space Complexity: O(n)
// Reason: Storing list 1 node addresses in HashSet.

public class Striver_IntersectionPointOfYLinkedList_BetterApproach {
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
//            HashSet<ListNode> set = new HashSet<>();
//
//            ListNode tempA = headA;
//            while(tempA != null){
//                set.add(tempA);
//                tempA = tempA.next;
//            }
//
//            ListNode tempB = headB;
//            while(tempB != null){
//                if(set.contains(tempB)){
//                    return tempB;
//                }
//                tempB = tempB.next;
//            }
//            return null;
//        }
//    }
}
