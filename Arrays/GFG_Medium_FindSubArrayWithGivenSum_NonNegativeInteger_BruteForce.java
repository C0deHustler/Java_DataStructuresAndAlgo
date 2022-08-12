// Problem - https://www.geeksforgeeks.org/find-subarray-with-given-sum/
// T.C - O(n^2)
// S.C - O(1)
public class GFG_Medium_FindSubArrayWithGivenSum_NonNegativeInteger_BruteForce {
    public static void solve(int[] arr, int n, int sum){
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum = arr[i];
            for(int j=i+1; j<n; j++){
                // Before adding the jth element in currSum, we'll check if currSum == sum,
                // for handling that case when the 1st element of the array will be equal to the sum
                if(currSum == sum){
                    int p = j-1;    // since we're adding jth element in currSum at the last, that's why we'll return j-1 ain the answer
                    System.out.println("SubArray exists between indices "+i+" and "+p);
                    return;
                }
                if(currSum > sum || j == n){
                    break;
                }
                currSum += arr[j];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum = 33;

        solve(arr, n, sum);
    }
}
