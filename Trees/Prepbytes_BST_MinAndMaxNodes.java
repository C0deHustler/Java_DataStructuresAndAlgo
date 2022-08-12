// Problem and Explanation - Prepbytes Video

public class Prepbytes_BST_MinAndMaxNodes {
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

        // We'll always go to the leftmost leaf node in the left subtree for the minimum element
        int minNode(Node node){
            if(node.left == null){
                return node.data;
            }
            else{
                return minNode(node.left);
            }
        }

        // We'll always go to the rightmost leaf node in the right subtree for the maximum element
        int maxNode(Node node){
            if(node.right == null){
                return node.data;
            }
            else{
                return maxNode(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BSTMethods tree = new BSTMethods();
        tree.root = new Node(50);
        tree.root.left = new Node(25);
        tree.root.right = new Node(75);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(70);
        tree.root.right.right = new Node(85);

        System.out.println("Maximum Node is: "+tree.maxNode(tree.root));
        System.out.println("Minimum Node is: "+tree.minNode(tree.root));
    }
}
