// Problem - https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Explanation - https://www.youtube.com/watch?v=WszrfSwMz58

// For easy visualization - https://takeuforward.org/data-structure/maximum-sum-path-in-binary-tree/
// It is a complicated hard problem which involves backtracking also, see video for revision purpose

// Time Complexity: O(N).
// Reason: We are doing a tree traversal.

// Space Complexity: O(N)
// Reason: Space is needed for the recursion stack. In the worst case (skewed tree), space complexity can be O(N).

public class LeetCode_BT_Hard_BinaryTreeMaximumPathSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
//    class Solution {
//        public int solve(TreeNode node, int[] maxi){
//            if(node == null){
//                return 0;
//            }
//
    // Math.max will help to ignore those nodes which are negative, so instead of taking -ve value, we'll prefer 0.
//            int left = Math.max(0, solve(node.left, maxi));
//            int right = Math.max(0, solve(node.right, maxi));
//
    // maxi[0] will store the ultimate maximum ans
//            maxi[0] = Math.max(maxi[0], node.val + left + right);
//
//            return node.val + Math.max(left, right);
//        }
//
    // Main Function
//        public int maxPathSum(TreeNode root) {
//            int[] maxi = new int[1];  // Since we cannot pass variable as reference in Java, so we'll take an array of size 1
//            maxi[0] = Integer.MIN_VALUE;
//
//            solve(root, maxi);
//            return maxi[0];
//        }
//    }
}
