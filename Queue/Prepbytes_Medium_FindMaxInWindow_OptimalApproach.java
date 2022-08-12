import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/MAXSUB
// Problem - https://leetcode.com/problems/sliding-window-maximum/
// Problem - https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1/

// Explanation - https://www.youtube.com/watch?v=MCvGwtkqJS0
// T.C - O(n)
// S.C - O(k)

public class Prepbytes_Medium_FindMaxInWindow_OptimalApproach {
    public static void findMax(int[] arr, int n, int k){
        Deque<Integer> q = new ArrayDeque<>();  // initialization of a Deque (element can be added from both front and rear in a Deque)

        int i;  // initializing this "i" outside "for" loops since the same value of i will be used when this "i" will come out of 1st "for" loop
        // Processing first window ( first k elements of array)
        for(i=0; i<k; i++){
            // For every element, the previous smaller element is useless, so we'll keep removing them from the rear
            while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]){
                q.removeLast(); // remove from rear
            }
            // else we'll add from the rear
            q.addLast(i);   // Important point - we're adding and removing indexes, not elements
        }
        // Process rest of the elements i.e. from arr[k] to arr[n-1]
        for(; i<n; i++){
            // The element at the front of the queue is the largest element (not element, but the index of that element) of the window,
            // so print it
            System.out.print(arr[q.peek()]+" ");

            // Remove the element which are out of this window
            while(!q.isEmpty() && q.peek() <= i-k){
                q.removeFirst();
            }

            // Remove all elements smaller than the currently being added element    ( Remove the useless elements )
            while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]){
                q.removeLast();
            }
            // Add current element at the rear of queue
            q.addLast(i);
        }
        // Print the maximum element of the last window
        System.out.print(arr[q.peek()]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        findMax(arr, n, k);
    }
}
