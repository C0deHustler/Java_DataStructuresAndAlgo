// Problem - https://leetcode.com/problems/max-consecutive-ones/

// Time Complexity: O(N) since the solution involves only a single pass.
// Space Complexity: O(1) because no extra space is used.

public class LeetCode_Easy_MaxConsecutiveOnes {
    public static int solve(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;

                if(count > maxCount){
                    maxCount = count;
                }
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0};

        int ans = solve(arr);
        System.out.println(ans);
    }
}
