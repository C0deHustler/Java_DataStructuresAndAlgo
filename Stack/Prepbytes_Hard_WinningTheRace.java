import java.util.Scanner;
import java.util.Stack;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/WINRACE

public class Prepbytes_Hard_WinningTheRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Making a stack in which we'll keep pushing elements with each iteration
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);  // push the 1st element by ourselves since the leftmost racer would have nobody to compete with
        System.out.print(-1+" ");   // since the leftmost racer cannot compete i.e. cannot overtake anyone, so directly print -1

        for(int i=1; i<n; i++){ // loop that will traverse complete array starting from the 2nd racer to the last racer
            int numberToCheck = arr[i]; // the racer for which we'll check that whether he can overtake anyone or not

            boolean reachedHere = false;    // Very important (Dry run this example to understand its importance)
//            Input -
//            30
//            7 9 6 3 2 9 10 5 2 8 6 8 2 4 7 1 1 8 7 1 7 2 2 4 10 6 5 7 8 2
//            Output -
//            -1 7 -1 -1 -1 2 9 2 -1 2 2 6 -1 2 4 -1 -1 1 1 -1 1 1 1 2 4 4 4 5 7 1

            Stack<Integer> tempStack = (Stack<Integer>) stack.clone();  // since we cannot take the risk of doing too many manipulations in
            // the main stack, so we'll make a clone tempStack to do all operations while maintaining the original stack
            // And we'll declare this tempStack each time inside for loop, so that after each iteration, no matter how many push or pop
            // we do in the tempStack, but with start of a new iteration, we'll get a new clone tempStack each time

            while(!tempStack.isEmpty()){    // checking whether left sided racer can be overtaken or not
                                            // ( consider traversing racers on the left of the mainRacer(numberToCheck) as if
                                            // we are traversing elements from the top of the stack ).
                int numberPopped = tempStack.pop(); // like this, we will access the closest racer on the left each time, and we'll also pop that element out
                if(numberPopped < numberToCheck){   // if this leftRacer (numberPopped) is slower than mainRacer(numberToCheck),
                                                    // then just overtake him (print the leftRacer)
                    reachedHere = true; // make this flag true, it will tell that we found a racer which cam be overtaken
                    System.out.print(numberPopped+" ");
                    break;  // no need to check more, as soon as we found that any 1 racer that can be overtaken, just break from the loop
                }
            }
            // if we cannot find any racer on our left who can be overtaken, then just print -1
            // Role of flag - flag was initially false, and if it is still false, then we'll be sure than we did not find anyone who can be overtaken
            // If we do not use flag in this code -
            // Then if we find a racer at the leftmost position(i.e. the last element of stack) who can be overtaken,
            // and we overtake him(i.e. pop him out and also print his name)
            // but now our stack is empty, and on reaching here, we find stack empty, and we unnecessarily print -1(which is wrong),
            // because we already found 1 such racer who can be overtaken
            // Thus with the help of flag, we'll be sure that -1 will only be printed when
            // 1. stack is empty(i.e. we searched for all such racers who can be overtaken by popping them out)
            // 2. so far we have not printed any result for this iteration
            if(tempStack.isEmpty() && !reachedHere){
                System.out.print(-1+" ");
            }
            // Keep adding new racer ( racer for which we'll check) at the end of each iteration in the main istack
            stack.add(numberToCheck);
        }

    }
}
