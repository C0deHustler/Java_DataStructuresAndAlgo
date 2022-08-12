// Problem and Explanation - https://www.youtube.com/watch?v=qAeitQWjNNg&t=1611s  TimeStamp - 17:00

public class ApnaCollege_BST_BuildBST {
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

    public static Node insert(Node node, int val){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val < node.data){
            node.left = insert(node.left, val);
        }
        else{
            node.right = insert(node.right, val);
        }

        return node;
    }
    // Inorder traversal will always give us sorted values if BST is correctly build
    public static void inorderTraversal(Node node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7, 6};
        Node root = null;

        for(int value : values) {
            root = insert(root, value);
        }

        System.out.println("Inorder Traversal of BST is : ");
        inorderTraversal(root);
    }
}
