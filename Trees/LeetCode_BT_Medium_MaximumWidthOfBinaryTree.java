// Problem - https://leetcode.com/problems/maximum-width-of-binary-tree/
// Explanation - https://www.youtube.com/watch?v=ZbybYvcVLks

// T.C - O(N), because of level order traversal, we'll iterate each and every node of the tree
// S.C - O(N), because of Queue data structure

public class LeetCode_BT_Medium_MaximumWidthOfBinaryTree {
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
//  Since Java does not support "Pair" like C++, so we'll make a class for storing "Pair" by ourselves
//  A Pair will store (node, num) i.e. the tree node and the num(index assigned to it)
//        class Pair{
//            TreeNode node;
//            int num;
//
//            Pair(TreeNode _node, int _num){
//                node = _node;
//                num = _num;
//            }
//        }
//
//        public int widthOfBinaryTree(TreeNode root) {
//            if(root == null){
//                return 0;
//            }
//
//            int ans = 0;
//            Queue<Pair> q = new LinkedList<>();
//            q.add(new Pair(root, 0)); // Hard coding the root node as the first Pair in Queue
//
    // Number of times "while" loop runs = Number of levels in the tree
//            while(!q.isEmpty()){
//                int size = q.size();
//                int minIndex = q.peek().num;  // It will be the index of first node of each level of binary tree i.e. the minimum index for each level
//                int first = 0;
//                int last = 0;
//
    // Number of times "for" lop runs = Number of non-null nodes exists in a particular level
//                for(int i=0; i<size; i++){
//                    int currIndex = q.peek().num - minIndex;  // it is the modified index that we saw in video, i.e. subtracting minIndex of
//                                                              // each level from every other indexes to convert it into low range indexing
//                                                              // so that runtime error does not happens
//                    TreeNode node = q.peek().node;
//                    q.remove();
//
//                    if(i == 0){
//                        first = currIndex;
//                    }
//                    if(i == size - 1){
//                        last = currIndex;
//                    }
//
//                    if(node.left != null){
//                        q.add(new Pair(node.left, currIndex * 2 + 1));    // we'll use this formula for indexing of left child
//                    }
//                    if(node.right != null){
//                        q.add(new Pair(node.right, currIndex * 2 + 2));   // we'll use this formula for indexing of right child
//                    }
//                }
//                ans = Math.max(ans, last - first + 1);
//            }
//            return ans;
//        }
//    }
}
