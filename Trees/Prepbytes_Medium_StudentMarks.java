// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/AVGPT
// Problem - https://leetcode.com/problems/average-of-levels-in-binary-tree/
// Average of Levels of Binary Tree

// Explanation - https://www.youtube.com/watch?v=NW3aCTwdXxs

// main method at line 91

import java.util.*;

public class Prepbytes_Medium_StudentMarks {
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

        Node createTreeByLevelTree() {
            Scanner sc = new Scanner(System.in);
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

/*
Complete the function findAverageLevel given below.
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
        // From Here, It is the main method
        // Level order traversal is also considered as Breadth First Search Traversal
        // Most of the operations are same as implementation of Level Order Traversal, but we'll make some changes to find average of a level
        void findAverageLevel(Node node) {
            Queue<Node> q = new LinkedList<>();
            q.add(node);

            float lvl_sum = 0;
            while (!q.isEmpty()) {
                int size = q.size();

                lvl_sum = 0; // update lvl_sum each time as 0, since after each iteration of "while" loop, we're moving towards next level of tree
                for (int i = 0; i < size; i++) {
                    Node currNode = q.remove();
                    lvl_sum += currNode.value;

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
                float lvl_avg = lvl_sum / size;
                System.out.printf("%.2f", lvl_avg);
                System.out.print(" ");
            }
        }
    }
}
