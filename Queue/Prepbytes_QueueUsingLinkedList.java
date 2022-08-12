public class Prepbytes_QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class QueueLL{
        // Initially front and rear will point to null
        Node front = null;
        Node rear = null;

        boolean isEmpty(){
            if(front == null && rear == null){
                return true;
            }
            return false;
        }

        // Enqueue - O(1), nodes will be added from the last
        void add(int data){
            Node newNode = new Node(data);
            if(rear == null){   // if list is empty, and the node to be added will be the 1st node of the list
                front = rear = newNode;
                return;
            }
            // If list is not empty, new nodes will be inserted from the tail
            rear.next = newNode;    // connect rear to the newNode
            rear = rear.next;   // update the rear as the newNode
        }

        // Dequeue - O(1), nodes will be removed from the start
        int remove(){
            // if the list is empty
            if(front == null){
                System.out.println("Queue is empty.");
                return -1;
            }
            int data = front.data;  // data of the node to be removed
            front = front.next; // since 1st node will be removed, update front to the 2nd node
            // if list only has 1 node, and after removing that node, front will point to null, but rear would still be pointing to the node which
            // was just deleted, so we'll also update rear to null.
            if(front == null){
                rear = null;
            }
            return data;
        }

        int peek(){ // it will return the element at the front of the list
            if(front == null){
                System.out.println("Queue is empty.");
                return -1;
            }
            return front.data;
        }
    }
    public static void main(String[] args) {
        QueueLL qll = new QueueLL();

        qll.add(2);
        qll.add(4);
        qll.add(6);
        qll.add(8);
        qll.add(10);
        qll.add(12);

        int x = qll.remove();
        System.out.println("1st element removed from the queue : "+x);

        System.out.println("Remaining elements of the queue : ");
        while(!qll.isEmpty()){
            System.out.print(qll.peek()+" ");
            qll.remove();
        }
    }
}
