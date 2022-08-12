import java.util.Arrays;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/MEDIAN1
// Explanation - https://www.geeksforgeeks.org/maximize-median-after-doing-k-addition-operation-on-the-array/?ref=rp
public class Prepbytes_Medium_MedianAgain {
    // Function to check operation can be performed or not
    public static boolean possible(int[] arr, int n, int mid, int k){
        int add = 0;
        for(int i = n/2-(n+1)%2; i<n; i++){
            if(mid - arr[i] > 0){
                // Number of operation to perform s.t. mid is median
                add += (mid - arr[i]);
                if(add > k){
                    return false;
                }
            }
        }
        // If mid is median of the array
        if(add <= k){
            return true;
        }
        else{
            return false;
        }
    }
    // Function to find max median of the array
    public static int findMaxMedian(int[] arr, int n, int k){
        int low = 1;    // Lowest possible median
        int maximum = 0;
        // Finding the largest element of the array and making it equal to maximum
        for(int i=0; i<n; i++){
            maximum = Math.max(maximum, arr[i]);
        }

        int high = k + maximum; // Highest possible median
        while(low <= high){ // binary search style

            int mid = (high+low)/2; // finding mid element

            // Checking for mid is possible for the median of array after doing at most k operation
            // kind of binary search, if yes, then continue search in 2nd half, if no, then continue search in 1st half
            if(possible(arr, n, mid, k)){
                low = mid+1;    // 2nd half
            }
            else{
                high = mid-1;   // 1st half
            }
        }

        if(n%2 == 0){   // return max possible answer if n is even
            if(low-1 < arr[n/2]){
                return (arr[n/2] + low-1)/2;
            }
        }
        // return max possible answer if n is odd
        return low-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);   // sort the array

            int ans = findMaxMedian(arr, n, k);
            System.out.println(ans);
        }
    }
}