// Problem - https://leetcode.com/problems/running-sum-of-1d-array/

public class LeetCode_Easy_RunningSumOf1DArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            int[] ans = new int[nums.length];

            int var = 0;
            for(int i=0; i<nums.length; i++){
                var += nums[i];
                ans[i] = var;
            }
            return ans;
        }
    }
}
