// Problem - https://leetcode.com/problems/search-in-a-binary-search-tree/
// Explanation - Prepbytes Video

public class Prepbytes_BST_Searching {
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
    static class BSTMethods {
        Node root;

        BSTMethods() {
            root = null;
        }

        void find(int key){
            Node node = search(root, key);
            if(node != null){
                System.out.println("The node with value "+key+" exists in the tree.");
            }
            else{
                System.out.println("The node with value "+key+" does not exists in the tree.");
            }
        }

        Node search(Node node, int key){
            if(node == null || node.data == key){
                return node;
            }
            else if(key < node.data){
                return search(node.left, key);
            }
            else{
                return search(node.right, key);
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

        tree.find(75);
        tree.find(22);
    }
}
