public class Prepbytes_ReverseSinglyLinkedList {
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
            }
            else{
                Node tempNode = head;
                while(tempNode.next != null){
                    tempNode = tempNode.next;
                }
                tempNode.next = newNode;
            }
        }
        void reverse(){
            Node current = head;
            Node prev = null;
            Node next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        void print(){
            Node tempNode = head;
            while(tempNode != null){
                System.out.print(tempNode.data+" ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(8);
        ll.insertAtEnd(6);
        ll.insertAtEnd(4);
        ll.insertAtEnd(2);
        ll.print();

        ll.reverse();
        ll.print();
    }
}
