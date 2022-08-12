// Problem - https://leetcode.com/problems/range-sum-of-bst/

// Explanation - DRY RUN THE CODE

// T.C - O(n), worst case(in case of skewed binary tree), for average case-> number of nodes traversed
// S.C - O(n), stack space due to recursion

public class LeetCode_BST_Easy_RangeSumOfBST {
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
//        public int rangeSumBST(TreeNode root, int low, int high) {
//            if(root == null){
//                return 0;
//            }
//            int sum = 0;
//
    // if value of root lies within the range
//            if(root.val >= low && root.val <= high){
//                sum += root.val;
//            }
    // agar chhote aadmi ko dabaane ka option hai, to usse tab tak dabaao jab tak tum khud uske level pr naa aa jao
    // Use the above example to relate with this conditional statement,
    // root.val -> dabaane wala aadmi (i.e. hum khud), low -> jisse dabaya jayega, root.left -> dabaane ke liye aur uss level me neechne ghusna
//            if(root.val > low){
//                sum += rangeSumBST(root.left, low, high);
//            }
    // agar bade aadmi tak pahochne ka option hai, to waha tab tak jaao jab tak tum khud uss level pr naa aa jao
    // Use the above example to relate with this conditional statement,
    // root.val -> upar chaddhne wala admi (i.e. hum khud), high -> bada aadmi, root.right -> bade logo ko ilaaka
//            if(root.val < high){
//                sum += rangeSumBST(root.right, low, high);
//            }
//
//            return sum;
//        }
//    }
}
