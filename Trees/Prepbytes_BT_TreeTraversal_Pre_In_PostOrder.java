// Problem - https://leetcode.com/problems/binary-tree-inorder-traversal/
// Problem - https://leetcode.com/problems/binary-tree-preorder-traversal/
// Problem - https://leetcode.com/problems/binary-tree-postorder-traversal/

// Explanation - PrepBytes Videos + Gallery Pics

public class Prepbytes_BT_TreeTraversal_Pre_In_PostOrder {
    // Class for node
    static class Node{
        int data;   // Data
        Node left;  // Pointer to left child
        Node right; // Pointer to right child
        // Parameterized Constructor
        Node(int item){
            data = item;    // The value (item) passed by the user will be stored in data of Node
            left = null;    // initially, left and right pointer will point to null
            right = null;
        }
    }

    // Class for traversing of tree
    static class TreeTraversal{
        Node root;  // Taking an initial root by ourselves

        TreeTraversal(){    // By default, root will be null
            root = null;
        }

        // We'll not pass data of a node here (like in the case of Linked list), instead we'll pass the whole node as a parameter
        void preOrderTraversal(Node node){  // T.C = O(n)
            if(node == null){
                return;
            }

            System.out.print(node.data+" ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

        void inOrderTraversal(Node node){   // T.C = O(n)
            if(node == null){
                return;
            }

            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }

        void postOrderTraversal(Node node){   // T.C = O(n)
            if(node == null){
                return;
            }

            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data+" ");
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

        System.out.println("Pre-Order traversal is : ");
        tree.preOrderTraversal(tree.root);  // Since "root" is a variable of "TreeTraversal" Class, so to access it, we'll use object "tree"
        System.out.println();

        System.out.println("In-Order traversal is : ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Post-Order traversal is : ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }
}
