public class Prepbytes_SinglyLL_InsertionAndDeletion {
    // Class for Node
    static class Node{
        int data;
        Node next;
        // Parameterized Constructor
        Node(int data){
            this.data = data;
            this.next = null;   // default address is null
        }
    }
    
    // Class for Linked List
    static class SinglyLinkedList{
        Node head = null;   // By default, head is pointing to null

        void insertAtBeginning(int data){   // See Pics Notes for understanding Steps-1,2,3
            Node newNode = new Node(data);  // Step-1
            newNode.next = head;    // Step-2
            head = newNode;     // Step-3
        }
        void insertAtEnd(int data){
            Node newNode = new Node(data);  // Step-2
            // If Linked List is empty
            if(head == null){
                head = newNode;     // our new node will become the only single element of the Linked List
            }
            // If Linked List is not empty
            else {
                Node tempNode = head;   // Step-1
                while (tempNode.next != null) {
                    tempNode = tempNode.next;
                }
                tempNode.next = newNode;    // Step-3
            }
        }
        void insert(int num, int data){ // num is the node after which we want to insert new node, data is the data for new node
            Node tempNode = head;   // create a temp node for searching the "num"
            // first then keep iterating until we find out "num", and also check whether our linked list is not empty
            while(tempNode.data != num && tempNode != null){
                tempNode = tempNode.next;   // keep updating tempNode to keep moving it forward
            }
            Node newNode = new Node(data);  // once we find our "num", create the new node that we want to insert
            // What we did and why we did that in next 2 lines, explained in cpp notes with diagram
            newNode.next = tempNode.next;   // first connect newNode to the node(which will exist after newNode is inserted)
            tempNode.next = newNode;    // then connect tempNode to the newNode
        }
        void delete(int num){   // delete the num from the list
            Node currentNode = head;   // make tempNode for traversing purpose and initialize it with pointing to head
            Node prevNode = null;   // prevNode will keep track of the node just before the currentNode
            while(currentNode.data != num && currentNode.next != null){   // search for the num to be deleted AND
                                                                    // also check whether we reached last node or the list is already empty
                prevNode = currentNode; // keep updating prevNode from null to the node just before the currentNode and so on
                currentNode = currentNode.next;
            }
            // Checking whether num is the starting node
            if(currentNode == head){   // if this is true, then it means node to be deleted is the head node
                if(head == null){   // and we'll also check that list is not empty
                    System.out.println("List Is empty.");   // if empty, the print this
                    return;
                }
                head = head.next;   // if node to be deleted is the head node, and list is not empty,
                return;             // then just reference the head to the next node
                                    // T.C for deletion at the start is O(1)
            }
            // this means the node to be deleted is not the head node
            prevNode.next = currentNode.next;   // and thus we will skip the "num" i.e.
                                                // delete the node  by abolishing its reference (explained in notes pics)
        }
        void printList(){
            Node tempNode = head;
            while(tempNode != null){    // traverse from head to null
                System.out.print(tempNode.data+" ");
                tempNode = tempNode.next;   // keep updating tempNode
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertAtBeginning(5);
        sll.insertAtEnd(7);
        sll.insertAtEnd(13);
        sll.insertAtEnd(15);
        sll.printList();

        sll.insert(7, 9);
        sll.insert(9, 11);
        sll.printList();

        sll.delete(5); // deleting from starting node
        sll.printList();
        sll.delete(11);    // deleting any random node
        sll.printList();

        sll.delete(15);    // deleting the last node
        sll.printList();
    }
}
