// Problem - https://leetcode.com/problems/insert-into-a-binary-search-tree/
// Explanation - Prepbytes Video

public class Prepbytes_BST_Insertion {
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
    static class BSTMethods{
        Node root;
        BSTMethods(){
            root = null;
        }

        // For insertion, we need 2 parameters:
        // 1. Node for checking whether right child and left child is empty or not
        // 2. Key value to insert by making comparisons
        // Instead of passing 2 parameters each time, we can pass just the key value from the main class
        // So that root will be checked and updated in "insert" method recursively and key values will be passed in the "add" method
        void add(int key){
            root = insert(root, key);
        }
        // See Prepbytes Insertion Video to understand dry run of recursion deeply
        Node insert(Node node, int key){
            if(node == null){
                node = new Node(key);
                return node;
            }
            if(key < node.data){
                node.left = insert(node.left, key);
            }
            else{
                node.right = insert(node.right, key);
            }

            return node;
        }
        // Inorder traversal to check whether BST is correct or not, since inorder of BST is always sorted in increasing order
        void inorderTraversal(Node node){
            if(node == null){
                return;
            }
            inorderTraversal(node.left);
            System.out.print(node.data+" ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BSTMethods tree = new BSTMethods();

        int[] arr = {50, 25, 15, 75, 30, 70, 85, 10, 23, 46, 84, 90};
        for(int values: arr){
            tree.add(values);
        }
        System.out.println("Inorder Traversal of BST is : ");
        tree.inorderTraversal(tree.root);
        // Trick to check whether BST is built right or not ->
        // Inorder of BST is always sorted in increasing order
    }
}
