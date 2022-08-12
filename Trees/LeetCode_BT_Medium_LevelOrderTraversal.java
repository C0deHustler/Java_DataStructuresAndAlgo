// Problem - https://leetcode.com/problems/binary-tree-level-order-traversal/
// Explanation - https://www.youtube.com/watch?v=XZnWETlZZ14

public class LeetCode_BT_Medium_LevelOrderTraversal {
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
//        public List<List<Integer>> levelOrder(TreeNode root) {
//            List<List<Integer>> result = new ArrayList<>();
//
//            if(root == null){
//                return result;
//            }
//
//            Queue<TreeNode> q = new LinkedList<>();
//            q.add(root);
//
//            while(!q.isEmpty()){
//                int size = q.size();
//                List<Integer> currentLevel = new ArrayList<>();
//                for(int i=0; i<size; i++){
//                    TreeNode currentNode = q.remove();
//                    currentLevel.add(currentNode.val);
//
//                    if(currentNode.left != null){
//                        q.add(currentNode.left);
//                    }
//                    if(currentNode.right != null){
//                        q.add(currentNode.right);
//                    }
//                }
//                result.add(currentLevel);
//            }
//            return result;
//        }
//    }
}
