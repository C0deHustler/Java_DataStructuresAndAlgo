import java.util.Scanner;

public class Prepbytes_QueueUsingArray {
    // add(Enqueue) = O(1)
    // peek + remove(Dequeue) = O(n)
    static class Queue{
        int arr[];  // we don't know the size of the array yet, the size will be passed by the user through the means of parameterized constructor.
        int size;   // size of the array
        int rear = -1;  // initially rear will be -1
                        // no need to make front, since front will always be the 1st element of the array

        Queue(int n){   // Parameterized Constructor
            arr = new int[n];   // n is given by the user
            this.size = n;
        }

        // Check whether queue is empty or not
        boolean isEmpty(){
            if(rear == -1){ // it means that rear has not pointed to any element so far, which shows that array is still empty
                return true;
            }
            return false;
        }

        // Enqueue - O(1)
        void add(int data){ // data to be added
            if(rear == size-1){ // if rear is pointing to the last available slot, which means no new element can be added now.
                System.out.println("Queue is full.");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int front = arr[0]; // Queue is FIFO, so front will become the 1st element, and it will be removed
            // Since the slot for the 1st element is now empty, we will shift rest of the elements by 1 places to left
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--; // since all the elements has shifted by 1 place to left, so rear will also shift by 1 place to the left
            return front;
        }

        // Peek -
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[0];
        }

        // Peek() + Remove() = O(n)
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
