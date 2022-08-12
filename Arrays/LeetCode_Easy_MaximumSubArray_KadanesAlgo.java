// Problem - https://leetcode.com/problems/maximum-subarray/
// Explanation - https://www.youtube.com/watch?v=HCL4_bOd3-4

// Must visit this website to understand all possible scenarios -
// https://afteracademy.com/blog/maximum-subarray-sum

// Divide and Conquer Approach - Prepbytes_MaximumSubArraySum_OptimalApproach in Divide and Conquer

public class LeetCode_Easy_MaximumSubArray_KadanesAlgo {
    public static int maximumSubArray(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum = currSum + arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {5, -4, -2, 6, -1};
        int n = arr.length;

        int ans = maximumSubArray(arr, n);
        System.out.println(ans);
    }
}
