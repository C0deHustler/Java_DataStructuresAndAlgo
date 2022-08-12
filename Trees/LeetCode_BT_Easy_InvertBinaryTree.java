// Problem - https://leetcode.com/problems/invert-binary-tree/
// Explanation - https://www.youtube.com/watch?v=_i0jqdVkObU

// T.C - O(n) i.e. number of nodes
// S.C - O(1), if we don't consider stack frame memory used during recursion, and if we consider, then S.C - O(h)

public class LeetCode_BT_Easy_InvertBinaryTree {
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
//        public void invert(TreeNode node){
//            if(node == null){
//                return;
//            }
//            invert(node.left);
//            invert(node.right);
//
//            TreeNode temp;
//            temp = node.left;
//            node.left = node.right;
//            node.right = temp;
//        }
//
//        public TreeNode invertTree(TreeNode root) {
//            invert(root);
//            return root;
//        }
//    }
}
