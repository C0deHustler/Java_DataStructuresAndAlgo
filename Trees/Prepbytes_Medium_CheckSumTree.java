// Problem - https://practice.geeksforgeeks.org/problems/sum-tree/1/#
// Explanation - https://www.youtube.com/watch?v=zqA8FwxXSdU

// T.C - O(n), order of nodes since we're visiting each node
// S.C - O(h), order of height (since we use stack frames in the recursive calls)

public class Prepbytes_Medium_CheckSumTree {
    /* Complete the function checkSumTree given below
For your reference

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
//    public long f = 1;
//
//    long solve(Node node){
//        if(node == null){
//            return 0;
//        }
//        if(node.left == null && node.right == null){
//            return node.value;
//        }
//        if(f == 0){
//            return 0;
//        }
//        long a = solve(node.left);
//        long b = solve(node.right);
//
//        if(a + b != node.value){
//            f = 0;
//        }
//
//        return a + b + node.value;
//    }
//
//    boolean checkSumTree(Node node) {
//        f = 1;
//        solve(node);
//        if(f == 1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
}
