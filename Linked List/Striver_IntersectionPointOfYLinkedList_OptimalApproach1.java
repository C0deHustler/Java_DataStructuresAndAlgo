// Problem - https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
// Problem - https://leetcode.com/problems/intersection-of-two-linked-lists/

// Explanation - https://www.youtube.com/watch?v=u4FWXfgS8jw&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=34

//Time Complexity:
// O(2 * max(length of list1,length of list2)) + O(abs(length of list1-length of list2)) + O(min(length of list1,length of list2))
// Finding length of both lists + incrementing the head of the list which is longer + traversing until we find common node
// Thus in worst case : O(2 * m) where m is the longer linked list
// Reason: Finding the length of both lists takes max(length of list1, length of list2) because it is found simultaneously for both of them. Moving the head pointer ahead by a difference of them. The next one is for searching.

// Space Complexity: O(1)
// Reason: No extra space is used.

public class Striver_IntersectionPointOfYLinkedList_OptimalApproach1 {
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
    // We will reduce the search length. This can be done by searching the length of the shorter linked list. How? Let’s see the process.

    // 1. Find length of both the lists.
    // 2. Find the positive difference of these lengths.
    // 3. Move the dummy pointer of the larger list by difference achieved. This makes our search length reduced to the smaller list length.
    // 4. Move both pointers, each pointing two lists, ahead simultaneously if both do not collide.

//    public class Solution {

    // Method for finding the difference between the lengths og both the lists
//        public int getDiff(ListNode headA, ListNode headB){
//            ListNode tempA = headA;
//            ListNode tempB = headB;
//
//            int lenA = 0;
//            int lenB = 0;
//
//            while(tempA != null || tempB != null){
//                if(tempA != null){
//                    lenA++;
//                    tempA = tempA.next;
//                }
//                if(tempB != null){
//                    lenB++;
//                    tempB = tempB.next;
//                }
//            }
//            return (lenA - lenB);
//        }
//
//        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            int diff = getDiff(headA, headB);

    // if diff is -ve, it means 2nd list is longer, so we'll increment it's head so that it becomes equivalent to head of 1st list
//            if(diff < 0){
//                while(diff++ != 0){
//                    headB = headB.next;
//                }
//            }
    // vice versa
//            else{
//                while(diff-- != 0){
//                    headA = headA.next;
//                }
//            }
//
    // now both the heads are at equivalent points i.e. they both will reach null simultaneously when incremented together
//            while(headA != null){
//                if(headA == headB){
//                    return headA;
//                }
//                headA = headA.next;
//                headB = headB.next;
//            }
//            return null;
//        }
//    }
}
