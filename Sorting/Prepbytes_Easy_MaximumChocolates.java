import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/EASYPROB
// Need of sorting in decreasing order - when we need to find maximum results
public class Prepbytes_Easy_MaximumChocolates {
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
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

            reverse(arr, 0, n-1);   // reversing a sorted array will give a decreasingly sorted array, which will help in finding the max amount of chocolates taken

            int ans = 0;
            for(int i=0; i<n; i+=2){    // i+=2 because they tina is picking alternatively
                ans += arr[i];
            }
            System.out.println(ans);
        }
    }
}