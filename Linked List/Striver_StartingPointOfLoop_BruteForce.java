// Problem - https://takeuforward.org/data-structure/starting-point-of-loop-in-a-linked-list/
// Problem - https://leetcode.com/problems/linked-list-cycle-ii/

// Explanation - https://www.youtube.com/watch?v=QfbOhn0WZ88&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=38

// Time Complexity: O(N)
// Reason: Iterating the entire list once.

// Space Complexity: O(N)
// Reason: We store all nodes in a hash table.

public class Striver_StartingPointOfLoop_BruteForce {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    // Approach -
    // We can store nodes in a hash set so that, if a loop exists, the head will encounter the same node again.
    // This node will be present in the set and hence, we can detect the loop.

//    public class Solution {
//        public ListNode detectCycle(ListNode head) {
//            HashSet<ListNode> set = new HashSet<>();
//            ListNode temp = head;
//
//            while(temp != null){
//                if(set.contains(temp)){
//                    return temp;
//                }
//                else{
//                    set.add(temp);
//                }
//                temp = temp.next;
//            }
//            return null;
//        }
//    }
}
