// Problem - https://takeuforward.org/data-structure/remove-n-th-node-from-the-end-of-a-linked-list/
// Problem - https://leetcode.com/problems/remove-nth-node-from-end-of-list/

// Explanation - https://www.youtube.com/watch?v=Lhu3MsXZy-Q
//                  Read comments

// T.C - O(n)
// S.C - O(1)

public class Striver_RemoveNthNodeFromEnd_OptimalApproach {
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
    // 1. Take a dummy node (i.e. start), and point it's next to head
    // 2. Take 2 pointers (i.e. slow and fast), and point it to start
    // 3. Move fast pointer ahead by n steps
    // 4. Now move both slow and fast pointer together by 1 step until fast reach the last node
    // 5. Then connect next of slow (slow.next) to the next of the node to be deleted i.e. (slow.next.next)
    // Logic - For anyone wondering WHY this approach works. Here is a quick explanation:
    // When you move the fast pointer to nth node, the remaining nodes to traverse is (size_of_linked_list - n).
    // After that, when you start moving slow pointer and fast pointer by 1 node each, it is guaranteed that slow pointer will cover
    // a distance of (size_of_linked_list - n) nodes. And that's node we want to remove

    // 6. Also handle the edge case when we have to delete the head


//    class Solution {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
    // 1.
//            ListNode start = new ListNode();
//            start.next = head;
//
    // 2.
//            ListNode slow = start;
//            ListNode fast = start;
//
    // 3.
//            for(int i=1; i<=n; i++){
//                fast = fast.next;
//            }
//
    // 6.
//            if(fast.next == null){
//                head = head.next;
//                return head;
//            }
//
    // 4.
//            while(fast.next != null){
//                slow = slow.next;
//                fast = fast.next;
//            }
//
    // 5.
//            slow.next = slow.next.next;
//
//            return head;
//        }
//    }
}
