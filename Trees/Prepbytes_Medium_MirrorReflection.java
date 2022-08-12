import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/MIRTRE
// Explanation - It is combination of 1. Invert a tree and 2. Check for identical tree
// 1. LeetCode_BT_Easy_InvertBinaryTree
// 2. LeetCode_BT_Easy_SameTree

// First we'll invert any one of the tree, then we'll check whether now both trees are identical or not

// Main methods at line 93

public class Prepbytes_Medium_MirrorReflection {
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
class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    Node createNode(long value) {
        Node t = new Node(value);
        return t;
    }

    Node replaceNegativeOne(Node root) {
        if (root == null || (root.value == -1 && root.left == null && root.right == null)) {
            return null;
        }
        root.left = replaceNegativeOne(root.left);
        root.right = replaceNegativeOne(root.right);
        return root;
    }

    Node createTreeByLevelTree(Scanner sc) {

        long n, m;
        Queue<Node> queue = new LinkedList<>();
        Node t;
        root = null;
        while (sc.hasNext()) {
            n = sc.nextLong();
            if (queue.isEmpty()) {
                root = createNode(n);
                ((LinkedList<Node>) queue).add(root);
                continue;
            }
            m = sc.nextLong();
            t = ((LinkedList<Node>) queue).peekFirst();
            ((LinkedList<Node>) queue).pop();
            t.left = createNode(n);
            t.right = createNode(m);
            if (t.left.value != -1)
                ((LinkedList<Node>) queue).add(t.left);
            if (t.right.value != -1)
                ((LinkedList<Node>) queue).add(t.right);
            if (queue.isEmpty())
                break;
        }
        return root;
    }

    void deleteTree(Node node) {
        node = null;
    }

/* Complete the function checkMirrorTree given below
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

    void invert(Node node){
        if(node == null){
            return;
        }
        invert(node.left);
        invert(node.right);

        Node temp;
        temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    boolean checkSame(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return  true;
        }
        else if(node1 != null && node2 != null){
            return ((node1.value == node2.value)
                    && (checkSame(node1.left, node2.left))
                    && (checkSame(node1.right, node2.right)));
        }
        return false;
    }

    boolean checkMirrorTree(Node node1, Node node2) {
        invert(node2);
        boolean ans = checkSame(node1, node2);

        if(ans)
            return true;
        return false;
    }


}

    public void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.root = bt.createTreeByLevelTree(sc);
        bt.root = bt.replaceNegativeOne(bt.root);
        BinaryTree bt1 = new BinaryTree();
        bt1.root = bt1.createTreeByLevelTree(sc);
        bt1.root = bt1.replaceNegativeOne(bt1.root);
        if(bt.checkMirrorTree(bt.root, bt1.root))
            System.out.println("true");
        else
            System.out.println("false");
        bt.deleteTree(bt.root);
    }
}