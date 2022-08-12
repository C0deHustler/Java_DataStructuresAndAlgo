// Problem - https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Explanation - https://www.youtube.com/watch?v=_Vo3cQ2xtqk

public class LeetCode_BST_Easy_ConvertSortedArrayToBST {
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
//        public TreeNode solve(int[] nums, int start, int end){
    // it shows that we've reached the child of leaf node i.e. null node
//            if(start > end){
//                return null;
//            }
//
//            int mid = start + (end - start)/2;

    // Directly initializing root of BST as mid of nums, since array is already sorted, so middle of array will be the root of BST
    // And BST will be height-balances BST since array is sorted and we're initializing root as mid-element, so number of elements on left and right
    // of mid-element will be equal, or we can say, that ultimately number of nodes in left subtree and right subtree will be equal,
    // thus BST will be automatically height-balanced

//            TreeNode root = new TreeNode(nums[mid]);
//            root.left = solve(nums, start, mid - 1);
//            root.right = solve(nums, mid + 1, end);
//            return root;
//        }
//
    // Main Method
//        public TreeNode sortedArrayToBST(int[] nums) {
//            if(nums.length == 0){
//                return null;
//            }

//            TreeNode root = solve(nums, 0, nums.length - 1);
//            return root;
//        }
//    }
}
