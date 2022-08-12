import java.util.Scanner;
// Problem - https://leetcode.com/problems/linked-list-cycle/submissions/

// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/video/fe085cd202354533a01c68b3d39afee9
// Explanation - https://www.geeksforgeeks.org/floyds-cycle-finding-algorithm/

public class Prepbytes_FloydCycle {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        Node head = null;

        void insertAtEnd(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }

        static boolean checkFloyd(Node head){
            Node slow = head;
            Node fast = head;
            int i = 0;  // it's my modification to check in how many iterations did slow ptr collides with fast ptr
            while(slow != null && fast != null && fast.next != null){
                i++;
                System.out.println("Iteration no. - "+i);

                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for(int i=0; i<n; i++){
            int listData = arr[i];
            ll.insertAtEnd(listData);
        }

        ll.head.next.next.next.next.next.next = ll.head.next.next;  // I've connected 6th node from the head to the 2nd node from the head
                                                                    // (same e.g. as discussed in pics notes)
        // 1->2->3->4->5->6->7
        //       ^-----------'           7 is connected to 3 forming a loop

        boolean ans = LinkedList.checkFloyd(ll.head);
        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
