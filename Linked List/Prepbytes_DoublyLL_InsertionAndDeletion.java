public class Prepbytes_DoublyLL_InsertionAndDeletion {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    static class DoublyLinkedList{
        Node head = null;   // initially head is null

        void insertAtBeginning(int data){   // T.C = O(1)
            Node newNode = new Node(data);  // initialization of a new node

            if(head == null){   // if list is empty
                head = newNode; // new node will become the head node
                return;
            }
            newNode.next = head;    // else next of newNode will point to head node
            head.prev = newNode;    // prev of head node will point to newNode
            head = newNode; // update head to newNode
        }

        void insertAtEnd(int data){ // T.C for traversing till end = O(n) and T.C for inserting node at end = O(1)
            Node newNode = new Node(data);

            if(head == null){   // checking if list is empty
                head = newNode;
                return;
            }
            // if list is not empty
            Node tempNode = head;   // tempNode for traversing till last node
            while(tempNode.next != null){   // while loop will iterate until we reach last node i.e null
                tempNode = tempNode.next;   // keep updating tempNode
            }
            // Once we reach last node
            tempNode.next = newNode;    // connect next of last node to the new node to be inserted at last
            newNode.prev = tempNode;    // connect prev of new Node to be inserted at the last to tempNode( i.e. now the 2nd last node)
        }

        void insert(int num, int data){     // T.C = O(n) for traversing, T.C = O(1) for insertion
                                            // num is the node after which we want to insert new node, data is the data for new node
            Node tempNode = head;   // create a temp node for searching the "num"
            Node newNode = new Node(data);  // once we find our "num", create the new node that we want to insert
            if(head == null){   // if list is empty
                head = newNode; // newNode becomes its only node(i.e. head node)
                return;
            }
            // if list is not empty
            // first then keep iterating until we find out "num", and also check whether our linked list is not empty
            while(tempNode.data != num && tempNode != null){
                tempNode = tempNode.next;   // keep updating tempNode to keep moving it forward
            }
            // next 4 steps explained with diagram in pics notes
            newNode.next = tempNode.next;   // Step-1
            if(newNode.next != null){   // checking whether num is the last node, and we've to insert newNode at the last position
                newNode.next.prev = newNode;    // Step-2
            }
            tempNode.next = newNode;    // Step-3
            newNode.prev = tempNode;    // Step-4
        }

        void delete(int num){   // num is the node to be deleted
                                // T.C = O(n) for searching the node to be deleted if the node is at any random place and,
                                // T.C = O(1) for deletion
            // if list is empty
            if(head == null){
                System.out.println("List is empty.");
                return;
            }
            // if list is not empty
            Node delNode = head;    // delNode for searching the node to be deleted
            while(delNode != null && delNode.data != num){  // if delNode is not the last node AND until we found our node to be deleted
                delNode = delNode.next;
            }
            // if node to be deleted is the 1st node
            if(delNode == head){    // 2 -> 3 -> -> 4 -> 5, and we have to delete 2
                head = head.next;   // update head to the next node i.e. head -> 3, and now latest head is 3
                head.prev = null;   // update head.prev (i.e. prev of 3 to null)
                return;
            }
            delNode.prev.next = delNode.next;
            if(delNode.next != null){
                delNode.next.prev = delNode.prev;
            }
        }
        void print(){
            Node tempNode = head;
            while(tempNode != null){    // (tempNode != null) is correct, if (tempNode.next != null) then it will print only till 2nd last node of the list
                System.out.print(tempNode.data+" ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(4);
        dll.insertAtBeginning(2);
        dll.print();

        dll.insertAtEnd(6);
        dll.insertAtEnd(8);
        dll.print();

        dll.insert(6, 7);
        dll.print();

        dll.insert(8, 10);
        dll.print();

        dll.delete(2);  // delete the 1st node
        dll.print();

        dll.delete(7);  // delete any middle random node
        dll.print();

        dll.delete(10); // delete the last node
        dll.print();
    }
}
