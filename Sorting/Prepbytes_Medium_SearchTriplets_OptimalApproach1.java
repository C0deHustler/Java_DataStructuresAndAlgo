import java.util.Arrays;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/TRIPLET
// Explanation - https://www.geeksforgeeks.org/find-triplet-sum-two-equals-third-element/

// Use of sorting - When we have to return the maximum triplet sum with maximum value of n3, then sorting will help.

public class Prepbytes_Medium_SearchTriplets_OptimalApproach1 {
    public static void searchTriplets(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){  // since we want maximum sum, i will start from n-1, so that each time we will compare sum of
                                    // arr[j] and arr[k] with the largest values of the array
                                    // and if nothing goes well(while condition fails), then decrement i by 1 place
            int j = 0;
            int k = i-1;
            while(j < k){
                if(arr[j]+arr[k] == arr[i]){
                    System.out.println(arr[j]+arr[k]+" "+arr[j]+" "+arr[k]);
                    return; // Directly desired answer(maximum triplet with the largest value of n3) will be returned, and then
                            // program will end.
                }
                else if(arr[j]+arr[k] > arr[i]){
                    k--;    // if sum is greater than the larger value of array, then decrement n3
                }
                else{
                    j++;    // if sum is less than the larger value of array, then increment n2
                }
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            searchTriplets(arr, n);
        }
    }
}
