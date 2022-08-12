import java.io.*;
import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/ADDONE
// Explanation - https://www.youtube.com/watch?v=EQQ-5FmghRw

public class Prepbytes_Medium_AddOneToTheNumber {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;
        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head)
    {
        SinglyLinkedListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

// Complete the addOneToList function below.

    /*
    For your reference:

    SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    }
    To create a new node use below constructor
    public SinglyLinkedListNode(int nodeData)

    */
    static SinglyLinkedListNode addOneToList(SinglyLinkedListNode head) {

        head = reverse(head);   // we will reverse the list
        boolean flag = true;    // it will tell whether 1 is added to the number or not

        SinglyLinkedListNode current = head;

        while(current != null && flag == true){ // iterate till we reach the end of the list AND till we add 1 to the number

            // if 9 is the last node after reversing, then we have to convert 9 into 1, and add one additional 0 at the head of the list
            // and also update this 0 as the head,
            // ( because when list will be reversed again after complete iteration, then this head will become the tail of the list)
            // Inside while loop - null<-9<-9<-9<-head, we encounter 9 as last node, then, null<-1<-0<-0<-0<-head, after coming out of the while loop,
            // again reverse the list, head->1->0->0->0->null
            if(current.data == 9 && current.next == null){
                current.data = 1;   // updating 9 to 1

                SinglyLinkedListNode temp = new SinglyLinkedListNode(0);    // making a tempNode with data "0" to insert at the head
                temp.next = head;   // insertion at the head
                head = temp;    // updating the head

                current = current.next;
            }
            // if we encounter 9, but it is not the last node
            else if(current.data == 9){
                current.data = 0;   // update the data as 0
                current = current.next;
            }
            else{
                // all other cases, we will increment i.e. add 1
                current.data = current.data + 1;

                current = current.next;
                flag = false;   // update flag as false to show that addition has been done, and we can come out of the loop
            }
        }

        head = reverse(head);   // again reversing back the list to get head at it's right position
        return head;
    }

    // Function for reversing the list
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head){
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode previous = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            printLinkedList(addOneToList(llist.head));
        }
        scanner.close();
    }
}