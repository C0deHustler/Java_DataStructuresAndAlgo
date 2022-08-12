// Problem - https://leetcode.com/problems/same-tree/
// Explanation - https://www.youtube.com/watch?v=BhuvF_-PWS0

// T.C - O(n)
// S.C - O(n)

public class LeetCode_BT_Easy_SameTree {
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
//        public boolean isSameTree(TreeNode p, TreeNode q) {
//            if(p == null && q == null){
//                return true;
//            }
//
//            else if(p != null && q != null){
//                return ((p.val == q.val)
//                        && (isSameTree(p.left, q.left))
//                        && (isSameTree(p.right, q.right)));
//            }
//
//            return false;
//        }
//    }
}
