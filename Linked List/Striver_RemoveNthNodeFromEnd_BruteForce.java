// Problem - https://takeuforward.org/data-structure/remove-n-th-node-from-the-end-of-a-linked-list/
// Problem - https://leetcode.com/problems/remove-nth-node-from-end-of-list/

// Explanation - Read comments

// T.C - O(2n)
// S.C - O(1)

public class Striver_RemoveNthNodeFromEnd_BruteForce {
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
    // 1. Traverse the linked list to count the total number of nodes
    // 2. Find "Nth node to be deleted from the start" which is equivalent to the "Nth node to be deleted from the end" using formula
    //    Nth_node_from_start = TotalNodes - Nth_node_from_end + 1
    // 3. Again traverse the linked list from start by maintaining a counter, as soon as the counter becomes equal to Nth_node_from_start,
    //    delete the required node by connecting previous node to next of the current node
    // 4. In case the node to be deleted is the head node, then update head as head.next, and return the head;


//    class Solution {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//
    // 1.
//            int totalNodes = 1;
//            ListNode curr1 = head;
//            while(curr1.next != null){
//                totalNodes++;
//                curr1 = curr1.next;
//            }
//
    // 2.
//            int Nth_node_from_start = totalNodes - n + 1;
    // 3.
//            int count = 1;
//            ListNode curr2 = head;
//            ListNode prev = null;
//
    // 4.
//            if(Nth_node_from_start == 1){
//                head = head.next;
//            }
    // 3.
//            else{
//                while(count != Nth_node_from_start){
//                    count++;
//                    prev = curr2;
//                    curr2 = curr2.next;
//                }
//                prev.next = curr2.next;
//            }
//
//            return head;
//        }
//    }
}
