public class Prepbytes_StackUsingLinkedList {
    // Implementation of stack using Linked List
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class StackLinkedList{
        public static Node head;    // use of static - means ki ye ek hi single head hai, aur poore code me issi head ki baat ho rhi hai
                                    // without the use of static, it will give error

        boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

        void push(int data){    // same as inserting new node at the beginning in the singly linked list
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        int pop(){  // same as deleting the head node in the singly linked list
            if(isEmpty()){
                return -1;
            }
            int top = head.data;   // storing the element in data before popping out the element, because we have to return  the popped out element.
            head = head.next;

            return top;
        }

        int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        StackLinkedList sll = new StackLinkedList();

        sll.push(1);
        sll.push(3);
        sll.push(5);
        sll.push(7);

        while(!(sll.isEmpty())){
            System.out.println(sll.peek());
            sll.pop();
        }
        System.out.println();

        sll.push(2);
        sll.push(4);
        sll.push(6);
        sll.push(8);

        int top = sll.peek();
        System.out.println("Top element is : "+top);
        System.out.println();

        int poppedElement = sll.pop();
        System.out.println("Popped Element : "+poppedElement);
        poppedElement = sll.pop();
        System.out.println("Popped Element : "+poppedElement);
    }
}
