// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/LCATR
// Problem - https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

// Explanation - https://www.youtube.com/watch?v=cX_kPV_foZc

// T.C - O(h), order of height of the BST
// S.C - O(1), For iterative implementation, if we do it without recursion ( i.e. using while loop)
//       O(h), order of height of the BST, i.e. recursive approach by using stack space


public class Prepbytes_Medium_Ancestors {
    /* Complete the function findLowestAncestor given below
For your reference:

class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
*/

//    Node findLowestAncestor(Node node, int v1, int v2) {
//        if(node == null){
//            return null;
//        }
//
//        Node curr = node;
//
        // If both the nodes i.e. v1 and v2 are smaller than curr node
//        if(v1 < curr.value && v2 < curr.value){
//            return findLowestAncestor(curr.left, v1, v2);
//        }
        // If both the nodes i.e. v1 and v2 are greater than curr node
//        if(v1 > curr.value && v2 > curr.value){
//            return findLowestAncestor(curr.right, v1, v2);
//        }

//        return node;
//    }

}
