// Problem - https://takeuforward.org/data-structure/starting-point-of-loop-in-a-linked-list/
// Problem - https://leetcode.com/problems/linked-list-cycle-ii/

// Explanation - https://www.youtube.com/watch?v=QfbOhn0WZ88&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=38

// Time Complexity: O(N)
// Reason: We can take overall iterations and club them to O(N)

// Space Complexity: O(1)
// Reason: No extra data structure is used.

// Read Striver's article for in depth understanding of intuition https://takeuforward.org/data-structure/starting-point-of-loop-in-a-linked-list/
// Approach:
// The following steps are required:
// 1. Initially take two pointers, fast and slow. The fast pointer takes two steps ahead while the slow pointer will take a single step
// ahead for each iteration.
// 2. We know that if a cycle exists, fast and slow pointers will collide.
// 3. If the cycle does not exist, the fast pointer will move to NULL
// 4. Else, when both slow and fast pointer collides, it detects a cycle exists.
// 5. Take another pointer, say entry. Point to the very first of the linked list.
// 6. Move the slow and the entry pointer ahead by single steps until they collide.
// 7. Once they collide we get the starting node of the linked list.

// But why use another pointer, or entry?
// Let’s say a slow pointer covers the L2 distance from the starting node of the cycle until it collides with a fast pointer.
// L1 is the distance traveled by the entry pointer to the starting node of the cycle. So, in total, the slow pointer covers the L1+L2 distance.
// We know that a fast pointer covers some steps more than a slow pointer. Therefore, we can say that a fast pointer will surely cover
// the L1+L2 distance. Plus, a fast pointer will cover more steps which will accumulate to nC length where C is the length of the cycle
// and n is the number of turns. Thus, the fast pointer covers the total length of L1+L2+nC.

// We know that the slow pointer travels twice the fast pointer. So this makes the equation to
// 2(L1+L2) = L1+L2+nC.
// This makes the equation to
// L1+L2 = nC.
// Moving L2 to the right side
// L1 = nC-L2
// and this shows why the entry pointer and the slow pointer would collide.

public class Striver_StartingPointOfLoop_OptimalApproach {
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
//    public class Solution {
//        public ListNode detectCycle(ListNode head) {
//            if(head == null || head.next == null){
//                return null;
//            }
//
//            ListNode slow = head;
//            ListNode fast = head;
//            ListNode entry = head;
//
//            while(fast.next != null && fast.next.next != null){
//                slow = slow.next;
//                fast = fast.next.next;
//
//                if(slow == fast){
//                    while(slow != entry){
//                        entry = entry.next;
//                        slow = slow.next;
//                    }
//                    return slow;
//                }
//            }
//            return null;
//        }
//    }
}
