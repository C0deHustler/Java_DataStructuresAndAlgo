// Problem - https://leetcode.com/problems/validate-binary-search-tree/

// Explanation - Inorder Traversal of BST is sorted, so we'll store inorder traversal of bst in a list, and will check whether that list is sorted or not

// T.C - O(2n) i.e. O(n), for inorder traversal + for traversing list for checking for sorting
// S.C - O(n), list will take space for storing n nodes

public class LeetCode_BST_Medium_ValidateBST_BruteForce {
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
//        List<Integer> list = new ArrayList<>();
//
//        public void inorderTraversal(TreeNode node){
//            if(node == null){
//                return;
//            }
//            inorderTraversal(node.left);
//            list.add(node.val);
//            inorderTraversal(node.right);
//        }
//
//        public boolean isValidBST(TreeNode root) {
//            inorderTraversal(root);
//
//            for(int i=0; i<list.size()-1; i++){
//                if(list.get(i) < list.get(i+1)){
//                    continue;
//                }
//                else{
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
}
