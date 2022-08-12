// Problem - https://leetcode.com/problems/find-pivot-index/

// Explanation - https://www.youtube.com/watch?v=AH-YhFNJoas&list=LL&index=10&t=569s

// T.C - O(n)
// S.C - O(1)

public class LeetCode_Easy_PivotIndex {
//    class Solution {
//        public int pivotIndex(int[] nums) {
//            int sum = 0;
//            for(int i=0; i<nums.length; i++){
//                sum += nums[i];
//            }
//
//            int lsum = 0;
//            int rsum = sum;
//
//            for(int i=0; i<nums.length; i++){
//                rsum = rsum - nums[i];
//
//                if(lsum == rsum){
//                    return i;
//                }
//
//                lsum = lsum + nums[i];
//            }
//
//            return -1;
//        }
//    }
}
