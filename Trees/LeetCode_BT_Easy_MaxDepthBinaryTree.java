// Problem - https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/video/8ee43a5e3836438b9772a13edeb879e6

public class LeetCode_BT_Easy_MaxDepthBinaryTree {
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
    // if we've to find height, then we'll return -1
    // in height, we're counting no. of edges from leaf node to root node, so return -1, since 2 nodes are connected by 1 edge\

    // if we've to find depth, we'll return 0
    // in depth, we're counting no. of nodes from leaf node to edge node, so return 0
    // (A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.)

//    class Solution {
//        public int maxDepth(TreeNode root) {
//            if(root == null){
//                return 0;
//            }
//            else{
//                int leftDepth = maxDepth(root.left);
//                int rightDepth = maxDepth(root.right);
//
//                if(leftDepth > rightDepth){
//                    return leftDepth + 1;
//                }
//                else{
//                    return rightDepth + 1;
//                }
//            }
//        }
//    }
}
