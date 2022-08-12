// Problem - https://leetcode.com/problems/n-ary-tree-preorder-traversal/

// Explanation - https://www.youtube.com/watch?v=DAIN1ZzvFeA

// T.C - O(n)
// S.C - O(n), when skewed tree
//       O(maxHeight of tree), in general case

public class LeetCode_Easy_NaryTreePreOrderTraversal {
    /**
    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    */

//    class Solution {
//        ArrayList<Integer> result = new ArrayList<>();
//
//        public List<Integer> preorder(Node root) {
//            if(root == null){
//                return result;
//            }
//            solve(root);
//            return result;
//        }
//
//        public void solve(Node node){
//            if(node.children == null){
//                return;
//            }
//            result.add(node.val);
//            for(Node child : node.children){
//                solve(child);
//            }
//        }
//    }
}
