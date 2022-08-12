import java.io.*;
// Problem - https://mycode.prepbytes.com/problems/divide-and-conquer/MXSBSM
// LeetCode - https://leetcode.com/problems/maximum-subarray/
// (but some cases will give time limit exceed), so use Kadane's Algo

// Kadane's Algo method in LeetCode_Easy_MaximumSubArray_KadanesAlgo in Arrays Module

// Explanation - https://www.youtube.com/watch?v=ohHWQf1HDfU and Prepbytes Video

// T.C - O(n logn)

public class Prepbytes_MaximumSubArraySum_OptimalApproach {
    public static int solve(int[] arr, int low, int high){
        if(low == high){
            return arr[low];
        }

        int mid = low + (high - low)/2;
        int sum = 0;

        int leftMax = Integer.MIN_VALUE;
        for(int i=mid; i>=low; i--){
            sum += arr[i];
            if(sum > leftMax){
                leftMax = sum;
            }
        }

        sum = 0;
        int rightMax = Integer.MIN_VALUE;
        for(int i=mid+1; i<=high; i++){
            sum += arr[i];
            if(sum > rightMax){
                rightMax = sum;
            }
        }

        int leftArrayMax = solve(arr, low, mid);
        int rightArrayMax = solve(arr, mid+1, high);

        return Math.max(leftMax+rightMax, Math.max(leftArrayMax, rightArrayMax));
    }

    public static void main(String args[]) throws IOException {
        int[] arr = {20, 0, 19, 2, -20, -3, 4, -14};

        int ans = solve(arr, 0, arr.length-1);
        System.out.println(ans);

        int[] arr2 = {3, -2, 5, -1};

        int ans2 = solve(arr2, 0, arr2.length-1);
        System.out.println(ans2);
    }
}