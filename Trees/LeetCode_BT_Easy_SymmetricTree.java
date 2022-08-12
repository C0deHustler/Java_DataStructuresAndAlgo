// Problem - https://leetcode.com/problems/symmetric-tree/
// Explanation - It is a modified version of Prepbytes_Medium_MirrorReflection (Read the LeetCode problem to understand the modification)

public class LeetCode_BT_Easy_SymmetricTree {
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

    // Because of the modification of the LeetCode problem, instead of passing root, we're passing left and right child as per the required conditions
    // Because in this problem, we don't have to check that if 2 trees are mirror image of each other,
    // instead, we've to check -
    // Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

//    class Solution {
//
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
//        public boolean checkSame(TreeNode node1, TreeNode node2){
//            if(node1 == null && node2 == null){
//                return  true;
//            }
//            else if(node1 != null && node2 != null){
//                return ((node1.val == node2.val)
//                        && (checkSame(node1.left, node2.left))
//                        && (checkSame(node1.right, node2.right)));
//            }
//            return false;
//        }

//        public boolean isSymmetric(TreeNode root) {
//
//            invert(root.right);
//
//            boolean ans = checkSame(root.left, root.right);
//
//            if(ans)
//                return true;
//            return false;
//        }
//    }
}
