public class Prepbytes_StackUsingArray {
    // Implementation of stack using array
    static class StackArray{
        int top = -1;
        int max = 1000; // max size of the stack
        int[] stack = new int[max];

        boolean isFull(){
            if(top == (max-1)){
                return true;
            }
            return false;
        }
        boolean push(int data){
            if(isFull()){
                System.out.println("Stack is full.");
                return false;
            }
            stack[++top] = data;    // initially top=-1, ++top = ++(-1)= 0, so when 1st element will be pushed,
                                    // then it will be stored at index=0, and so on.
            return true;
        }

        boolean isEmpty(){
            if(top < 0){
                return true;
            }
            return false;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            int data = stack[top];
            top--;  // reducing top, because once top element is popped out, then next top will be element just below the previously popped out element.

            return data;
        }
    }
    public static void main(String[] args) {
        StackArray sa = new StackArray();

        sa.push(2);
        sa.push(4);
        sa.push(6);
        sa.push(8);

        int poppedElement = sa.pop();
        System.out.println("Element popped : "+poppedElement);

        poppedElement = sa.pop();
        System.out.println("Element popped : "+poppedElement);

        poppedElement = sa.pop();
        System.out.println("Element popped : "+poppedElement);

        poppedElement = sa.pop();
        System.out.println("Element popped : "+poppedElement);

        sa.pop();
    }
}
