// Problem - https://leetcode.com/problems/validate-binary-search-tree/

// Explanation - https://www.youtube.com/watch?v=f-sj7I5oXEI

// T.C - O(n)
// S.C - O(1)

// We'll define the range for each node, if it's value lies within that range, then it's ok, else it is not a bst.
// See video for pictorial explanation

public class LeetCode_BST_Medium_ValidateBST_OptimalApproach {
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
//        public boolean isValidBST(TreeNode root) {
//            return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
//        }
//
//        public boolean solve(TreeNode node, long minVal, long maxVal){
//            if(node == null){
//                return true;
//            }
//            if(node.val <= minVal || node.val >= maxVal){
//                return false;
//            }
//
//            if(solve(node.left, minVal, node.val) && solve(node.right, node.val, maxVal)){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//
//    }
}
