// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/LVLOD
// Problem - https://leetcode.com/problems/binary-tree-level-order-traversal/

// Explanation - https://www.youtube.com/watch?v=-DzowlcaUmE&t=702s   TimeStamp - 30:40

import java.util.LinkedList;
import java.util.Queue;

public class ApnaCollege_BT_LevelOrderTraversal {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int item){
            this.data = item;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeTraversal {
        Node root;
        TreeTraversal() {
            this.root = null;
        }

        void levelOrderTraversal(Node node){
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            queue.add(null);

            while(!queue.isEmpty()){
                Node currNode = queue.remove();

                if(currNode == null){
                    System.out.println();
                    if(queue.isEmpty()){
                        break;
                    }
                    else{
                        queue.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");

                    if(currNode.left != null){
                        queue.add(currNode.left);
                    }
                    if(currNode.right != null){
                        queue.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Level Order Tree Traversal : ");
        tree.levelOrderTraversal(tree.root);

    }
}
