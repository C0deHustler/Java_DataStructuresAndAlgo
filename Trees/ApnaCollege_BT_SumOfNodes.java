// Problem and Explanation - https://www.youtube.com/watch?v=-DzowlcaUmE&t=2255s  TimeStamp - 46:45

public class ApnaCollege_BT_SumOfNodes {
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

        int sumOfNodes(Node node){
            if(node == null){
                return 0;
            }
            int leftSum = sumOfNodes(node.left);
            int rightSum = sumOfNodes(node.right);
            return leftSum + rightSum + node.data;
        }
    }

    public static void main(String[] args) {
        TreeTraversal t = new TreeTraversal();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.right.left = new Node(6);

        int sum = t.sumOfNodes(t.root);
        System.out.println("Sum of Nodes : "+sum);
    }
}

