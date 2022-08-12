import java.util.Scanner;
// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/video/8d9e18d5b6f646719e150f7f5a80ba13
public class Prepbytes_2StackIn1Array {
    // Use this input
    // 10
    // 7
    // 3
    // 1 2 3 4 5 6 7 8 9 10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input size of the array

        stackArray sa = new stackArray(n);

        int stack1 = sc.nextInt();  // input size of the stack1
        int stack2 = sc.nextInt();  // input size of the stack2
        int element;

        // input elements in stack1
        for(int i=0; i<stack1; i++){
            element = sc.nextInt();
            sa.push1(element);
        }
        // input elements in stack2
        for(int i=0; i<stack2; i++){
            element = sc.nextInt();
            sa.push2(element);
        }

        // Printing elements of stack1
        System.out.println("Stack1 : ");
        sa.print1();

        // Printing elements of stack2
        System.out.println("Stack2 : ");
        sa.print2();

        // pushing 1 extra element in stack1 to cause stack overflow
        sa.push1(12);

        int num = sa.top1 + 1;    // number of elements in stack1
        // pop out all elements of stack1
        while(num != 0){
            sa.pop1();
            num--;
        }
        // again popping out element from stack1 to cause stack underflow
        // (i.e. stack is already empty, no more elements can be further popped out)
        sa.pop1();
    }
}
// A new style of using and declaring class
class stackArray {
    public int size;
    public int top1;
    public int top2;
    public int[] arr;

    // Parameterized Constructor for making stack array
    stackArray(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    // For pushing element into stack1
    void push1(int data) {
        if (top1 < top2 - 1) {
            arr[++top1] = data;
        } else {
            System.out.println("Stack1 overflow.");
        }
    }

    // For pushing element into stack2
    void push2(int data) {
        if (top1 < top2 - 1) {
            arr[--top2] = data;
        } else {
            System.out.println("Stack2 overflow.");
        }
    }

    // For popping out element from stack1
    void pop1() {
        if (top1 > -1) {
            int poppedElement = arr[top1--];
            System.out.println("Popped element of Stack1 : " + poppedElement);
        } else {
            System.out.println("Stack1 underflow");
        }
    }

    // For popping out element from stack2
    void pop2() {
        if (top2 < size) {
            int poppedElement = arr[top2++];
            System.out.println("Popped element of Stack2: " + poppedElement);
        } else {
            System.out.println("Stack2 underflow");
        }
    }

    // For printing elements of stack1
    void print1() {
        for (int i = top1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // For printing elements of stack2
    void print2() {
        for (int i = top2; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
