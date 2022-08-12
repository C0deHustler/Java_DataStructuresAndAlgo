// Problem - https://leetcode.com/problems/delete-node-in-a-bst/
// Explanation - Prepbytes Video and ApnaCollege Video TimeStamp - 34:00

public class Prepbytes_BST_Deletion {
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
    static class BSTMethod{
        Node root;
        BSTMethod(){
            root = null;
        }

        // Same logic as discussed in Prepbytes_BST_Insertion.java
        void remove(int key){
            root = deletion(root, key);
        }

        Node deletion(Node node, int key){
            // Check whether the node is null or not i.e. if we want to delete a node which does not even exist in the tree
            if(node == null){
                return node;
            }
            // Searching the node which has to be deleted
            // If node is not null, then make comparisons so that we can reach the required node which needs to be deleted
            if(key < node.data){
                node.left = deletion(node.left, key);
            }
            else if(key > node.data){
                node.right = deletion(node.right, key);
            }
            // When we've finally reached the node which has to be deleted
            else{
                // Case - 1 : No Child node (Leaf Node)
                if(root.left == null && root.right == null){
                    return null;
                }
                // Case - 2 : One child
                // Checking whether the node to be deleted has any left or right child or not
                else if(node.left == null){
                    return node.right;
                }
                else if(node.right == null){
                    return node.left;
                }
                // Case - 3 : Two children
                // If the node to be deleted is having both children nodes, then
                // 1. we'll find the inorder successor node using the "inorderSuccessor()" method
                Node IS = inorderSuccessor(node.right);   // we'll pass "node.right" because inorder successor will always lie in the right subtree

                // 2. copy the inorder successor data in the place of data of the node which has to be deleted
                node.data = IS.data;

                // 3. Delete the inorder successor
                node.right = deletion(node.right, node.data);   // why node.right ?? -> explained above
            }
            return node;
        }

        // Method to find inorder successor.
        // Inorder successor is the leftmost child node in the right subtree of the node (node which has to be deleted)
        // Inorder successor has either 0 or only 1 child
        Node inorderSuccessor(Node node){
            // As per pictorial tree visualization, if our node to be deleted is root node, then inorder successor
            // will be the leftmost leaf node in the right subtree ( which we can also verify by finding inorder traversal,
            // and then finding inorder successor)
            // That's why, we'll keep searching for the leftmost leaf node until we reach null node
            // Iterative method of searching  node
            while(node.left != null){
                node = node.left;   // Updating node to keep going towards left node
            }
            // Finally, return the inorder successor
            return node;
        }

        // inorder traversal to show that BST is build correct or not since it return sorted values in increasing order
        void inOrderTraversal(Node node){
            if(node == null){
                return;
            }
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BSTMethod tree = new BSTMethod();
        tree.root = new Node(50);
        tree.root.left = new Node(25);
        tree.root.right = new Node(75);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(70);
        tree.root.right.right = new Node(85);

        System.out.println("InOrder Traversal of Tree is :");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("InOrder traversal of Tree after deleting 50 is :");
        tree.remove(50);
        tree.inOrderTraversal(tree.root);
    }
}
