public class Prepbytes_ReverseDoublyLinkedList {
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
            newNode.prev = tempNode;
        }
        void reverse(){
            Node current = head;
            Node previous = null;

            while(current != null){
                previous = current.prev;
                current.prev = current.next;
                current.next = previous;
                current = current.prev;
            }
            if(previous != null){
                head = previous.prev;
            }
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
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtEnd(2);
        dll.insertAtEnd(4);
        dll.insertAtEnd(6);
        dll.insertAtEnd(8);
        dll.insertAtEnd(10);
        dll.print();

        dll.reverse();
        dll.print();
    }
}
