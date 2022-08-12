import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/GAME1
// Explanation - The first player wants to minimize the last number that would be left on the board, while the second player wants to maximize it.
//                          So we will sort the array in descending order, each time,
//                          P1 wil select the largest element so that smallest element would be left in the last
//                          P1 wil select the smallest element so that largest element would be left in the last
//                          Thus, P1 will pick elements from starting of the array, and P2 will pick elements from the end of the array
//                           After n-1 turns, we will be left with      1. middle element (when n is odd)       2. element just after middle element (when n is even)
public class Prepbytes_Easy_TheLastGame {
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            reverse(arr, 0, n-1);

            if(n%2 != 0){
                System.out.println(arr[(n-1)/2]);
            }
            else{
                System.out.println(arr[n/2]);
            }
        }

    }
}