// Problem - https://leetcode.com/problems/count-complete-tree-nodes/
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/video/8ee43a5e3836438b9772a13edeb879e6

public class LeetCode_BT_Medium_CountCompleteTreeNodes {
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
//        public int countNodes(TreeNode root) {
//            if(root == null){
//                return 0;
//            }
//            else{
//                int leftSize = countNodes(root.left);
//                int rightSize = countNodes(root.right);
//                return leftSize + rightSize + 1;
//            }
//        }
//    }
}
