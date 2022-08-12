// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/MINDIST
// Explanation - https://www.youtube.com/watch?v=0fjNH2SLJng

public class Prepbytes_Medium_ShortestDistance {
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
    static class problemMethods{
        Node root;
        problemMethods(){
            root =  null;
        }

        // Main method
        int minDistance(Node root, int a, int b){
            int temp;
            // In upcoming methods, we'll consider "a" as the smaller key while "b" as the bigger key, because for any particular root node,
            // "a" will be treated in its left subtree, while "b" in the right subtree
            if(a > b){
                temp = a;
                a = b;
                b = temp;
            }
            return distanceBtwNodes(root, a, b);
        }

        // Method to find distance between 2 nodes
        int distanceBtwNodes(Node root, int a, int b){
            if(root == null){
                return 0;
            }
            // if both a and b lie in the left subtree w.r.t root node (we'll keep changing root node in each recursive calls accordingly)
            else if(a < root.data && b < root.data){
                return distanceBtwNodes(root.left, a, b);
            }
            // if both a and b lie in the right subtree w.r.t root node (we'll keep changing root node in each recursive calls accordingly)
            else if(a > root.data && b > root.data){
                return distanceBtwNodes(root.right, a, b);
            }
            // It can be considered as the base case since no matter whatever case we take, in the end, this condition has to be executed.
            // In above 2 "else if" cases we're just making recursive calls, but this condition will actually implement some operations
            // When "a" lies in left subtree and "b" lies in the right subtree w.r.t root node
            else if(a <= root.data && b >= root.data){
                // Now we'll calculate distance of "a" from root and "b" from root and then add both of them
                return distanceFromRoot(root, a) + distanceFromRoot(root, b);
            }
            return 0;
        }

        // Method to find distance of an individual node from the root
        int distanceFromRoot(Node root, int key){
            // when we'll find our key node
            if(root.data == key){
                return 0;
            }
            // if key lies in the left subtree
            else if(key < root.data){
                return 1 + distanceFromRoot(root.left, key);    // keep adding 1 since with each recursive call, we're moving one step down in BST
            }
            else{
                return 1 + distanceFromRoot(root.right, key);   // same as above
            }
        }

    }
    public static void main(String[] args) {
        problemMethods tree = new problemMethods();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(9);
        tree.root.right.right = new Node(21);
        tree.root.right.right.left = new Node(19);
        tree.root.right.right.right = new Node(25);

        int ans = tree.minDistance(tree.root, 3, 9);
        System.out.println("Minimum distance between nodes is : "+ ans);

        int ans1 = tree.minDistance(tree.root, 1, 25);
        System.out.println("Minimum distance between nodes is : "+ ans1);
    }
}
