// Problem - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
// Explanation - https://www.youtube.com/watch?v=rPbzUW7usJE (See video for understanding Method.1 and Method.2)

// Method.1 -> The Best method (in single traversal), we'll consider each node as the only digit of the binary, but when we'll go ahead in
//             linked list, we'll realize that it is not the only digit, so for making compensation, we'll increase the power of all previous nodes
//             by raising their exponential power by 1 i.e. multiplying them by 2.

// Method.2 -> Find the length of the linked list in 1 traversal, and then do normal conversion from binary to decimal, but by using a small trick

// Method.3 -> Reverse the linked list and then do conversion as we do normal conversion for a binary integer to decimal

// Method.4 -> By using in-built method

public class LeetCode_Easy_ConvertBinaryNumberToInteger_Optimal {
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

    // Method.1
//    class Solution {
//        public int getDecimalValue(ListNode head) {
//            int ans = 0;
//            ListNode curr = head;
//            while(curr != null){
//                ans = ans * 2;
//                ans += curr.val;
//                curr = curr.next;
//            }
//            return ans;
//        }
//    }

    // Method.2
//    class Solution {
//        public int getDecimalValue(ListNode head) {
//            int len = 0;
//            ListNode curr = head;
//            while(curr != null){
//                len++;
//                curr = curr.next;
//            }
//
//            int ans = 0;
//            ListNode temp = head;
//            while(temp != null){
//                ans = ans + (int)(temp.val * (Math.pow(2, --len)));
//                temp = temp.next;
//            }
//            return ans;
//        }
//    }

    // Method.4
//    class Solution {
//        public int getDecimalValue(ListNode head) {
//            String binary = "";
//
//            ListNode curr = head;
//            while(curr != null){
//                binary = binary + curr.val;
//                curr = curr.next;
//            }
//
//            int ans = Integer.parseInt(binary, 2);
//            return ans;
//        }
//    }
}
