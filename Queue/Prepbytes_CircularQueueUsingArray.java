public class Prepbytes_CircularQueueUsingArray {
    // add(Enqueue) = O(1)
    // peek = O(1)
    // remove(Dequeue) = O(1)
    static class Queue{
        int arr[];  // we don't know the size of the array yet, the size will be passed by the user through the means of parameterized constructor.
        int size;   // size of the array
        int rear = -1;  // initially rear will be -1
        int front = -1; // initially front will be -1

        Queue(int n){   // Parameterized Constructor
            arr = new int[n];   // n is given by the user
            this.size = n;
        }

        // Check whether queue is empty or not
        boolean isEmpty(){
            if(rear == -1 && front == -1){ // it means that rear and front have not pointed to any element so far, which shows that array is still empty
                return true;
            }
            return false;
        }

        // Check whether Queue is full or not
        boolean isFull(){
            if( (rear+1) % size == front){  // this formula is used to dynamically check whether empty space is available in the array
                                            // or not for new element to be added from the rear. But if rear == front,
                                            // it means that queue is full.
                return true;
            }
            return false;
        }

        // Enqueue - O(1)
        void add(int data){ // data to be added
            if(isFull()){
                System.out.println("Queue is full.");
                return;
            }
            // When we'll be adding 1st element in the queue
            if(front == -1){
                front = 0;
            }
            // if 1st element has already been added, then simply add rest of the elements using this method
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue - O(1)
        int remove(){
            if(isEmpty()){  // if(front == -1){ return -1 }    this logic will also work
                System.out.println("Queue is empty.");
                return -1;
            }
            int result = arr[front];    // a variable named front already exists, so to avoid confusion, we'll use result
            // When only a single element exists in the queue, then both front and rear point to  it.
            if(rear == front){
                // if only a single element exists in the queue, and we also remove that, then front and rear will again become back to -1.
                rear = -1;
                front = -1;
            }
            // if we have more than 1 element
            else{
                front = (front + 1) % size; // increment front by using the dynamic formula
            }
            return result;
        }

        // Peek - O(1)
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();


        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);

        System.out.println("Element removed from the queue : "+q.remove());
        System.out.println("Element removed from the queue : "+q.remove());

        System.out.println("Element added in the queue : 12");
        q.add(12);
        System.out.println("Element added in the queue : 14");
        q.add(14);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
