import java.util.Arrays;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/TRIPLET
// Explanation - https://www.geeksforgeeks.org/find-triplet-sum-two-equals-third-element/

// Use of sorting - Here, we will not get the maximum answer, instead we will get our pair of 1st triplets.

public class Prepbytes_Medium_SearchTriplets_OptimalApproach2 {
    public static boolean binarySearch(int[] arr, int low, int high, int sum){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == sum){
                return true;
            }
            else if(arr[mid] > sum){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    public static void searchTriplet(int[] arr, int n){
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                // we will send the sum of arr[i] and arr[j] to check in the array(starting from j) in the form of binary search.
                if(binarySearch(arr, j, n-1, arr[i]+arr[j])){
                    System.out.println(arr[i]+arr[j]+" "+arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            searchTriplet(arr, n);
        }
    }
}
