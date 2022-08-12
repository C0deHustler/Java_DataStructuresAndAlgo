// Explanation - Prepbytes Video

public class Prepbytes_BT_HeightAndSizeOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int item){
            data = item;
            left = null;
            right = null;
        }
    }
    static class TreeTraversal{
        Node root;
        TreeTraversal(){
            root = null;
        }

        int heightOfTree(Node node){
            // When we hit the base condition
            if(node == null){
                return -1;  // Why -1 ?? -> Very well explained in the dry run of Prepbytes Video
            }
            else{
               int leftHeight = heightOfTree(node.left);
               int rightHeight = heightOfTree(node.right);

               if(leftHeight > rightHeight){
                   return leftHeight + 1;   // we're doing this +1 to compensate for that -1
               }
               else{
                   return rightHeight + 1;  // we're doing this +1 to compensate for that -1
               }
            }
        }
        // Size of Tree is same as Count of Nodes in a Tree
        int sizeOfTree(Node node){
            if(node == null){
                return 0;
            }
            else{
                int leftSize = sizeOfTree(node.left);
                int rightSize = sizeOfTree(node.right);
                return leftSize + rightSize + 1;    // +1 because, if A is parent node, and B and C are its child node
                                                    // leftSize -> count of B
                                                    // rightSize -> count of C
                                                    // + 1 -> count of A
                                                    // thus, return leftSize + rightSize + 1
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
        //tree.root.left.left.left = new Node(8);

        int height = tree.heightOfTree(tree.root);
        System.out.print("Height of Tree is : "+height);
        System.out.println();

        int size = tree.sizeOfTree(tree.root);
        System.out.print("Size of Tree is : "+size);
        System.out.println();
    }
}
