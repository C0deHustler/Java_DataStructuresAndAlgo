import java.util.HashMap;
// Problem - https://leetcode.com/problems/subarray-sum-equals-k/
// Problem - https://practice.geeksforgeeks.org/problems/subarray-range-with-given-sum2804/1/

// Explanation Video - https://www.youtube.com/watch?v=20v8zSo2v18
// Very well explained with dry run, see dry run along with your code to understand deeply

// Same logic used like Hashing - GFG_Medium_FindSubArrayWithGivenSum_NegativeInteger_OptimalApproach.java
// Do read comments of this GFG problem to understand a major difference between both these type of problem

public class LeetCode_Medium_SubArraySumEqualsK {
    public static int countSubArray(int[] arr, int n, int sum){
        int count = 0;
        int currSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // implementing the 1st key with value as 1 by ourselves  (Important)

        for(int i=0; i<n; i++){
            // Whenever we've to find a subArray, then we'll find prefix sum i.e currSum += arr[i]
            currSum += arr[i];  // same logic as Hashing - GFG_Medium_FindSubArrayWithGivenSum_NegativeInteger_OptimalApproach.java

            if(map.containsKey(currSum - sum)){
                count += map.get(currSum - sum);    // we'll add the value of key(currSum - sum) in count
                // Doing this instead of count++, because in dry run, we can see that at some point, key will repeat in HashMap,
                // so instead of making a duplicate of that key, we'll increment the value of that key (we'll do this in next line of code)
            }
            // 1. we'll store currSum as the key
            // 2. and if key is new, then store 1 in its value, else add 1 (i.e. increment) in its original value
            map.put(currSum, ( map.getOrDefault( currSum, 0 ) + 1 ) );
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};
        int n1 = arr1.length;
        int sum1 = 5;

        int ans1 = countSubArray(arr1, n1, sum1);
        System.out.println("Number of subArrays with sum = "+sum1+" are "+ans1);

        int[] arr2 = {10, 15, -5, 15, -10, 5};
        int n2 = arr2.length;
        int sum2 = 5;

        int ans2 = countSubArray(arr2, n2, sum2);
        System.out.println("Number of subArrays with sum = "+sum2+" are "+ans2);
    }
}
