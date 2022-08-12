// Problem - https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/SUMTR

// Explanation - https://www.youtube.com/watch?v=XpeA8w44xeo

// T.C - O(n), order of nodes since we're visiting each node
// S.C - O(h), order of height (since we use stack frames in the recursive calls)

public class Prepbytes_Medium_ConvertSumTree {
    //User function template for JAVA

    /*Complete the Given Function

    Node is as follows:
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }*/
//    class Solution{
          // Dry run the code to understand deeply

//        public int solve(Node root){
//            if(root == null){
//                return 0;
//            }
//
//            int a = solve(root.left);
//            int b = solve(root.right);
    // Storing the data of root in a variable x, because data of root node will be modified, and we'll need this x during returning the final call
//            int x = root.data;
    // Data of root modified
//            root.data = a + b;
    // returning the sum of a, b and original root data, after modifying the root data (line 36) as per sum tree conditions
//            return a + b + x;
//        }

//        public void toSumTree(Node root){
//            solve(root);
//        }
//    }
}
