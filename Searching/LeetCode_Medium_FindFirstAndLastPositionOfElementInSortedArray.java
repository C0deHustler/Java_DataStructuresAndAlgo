// Problem - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// Explanation - https://www.youtube.com/watch?v=Y7LiLNdayF0

// T.C - O(log n)
// S.C - O(1)

public class LeetCode_Medium_FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] solve(int[] nums, int target) {
        int[] ans = {-1, -1};

        int low = 0;
        int high = nums.length - 1;

        // Finding first index
        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                ans[0] = mid;   // storing first occurrence index at ans[0]
                high = mid - 1; // even though we found target element, but what if first occurrence of target is to more left of current position,
                                // so keep searching for first occurrence in the left half until low becomes greater than high
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        // resetting low and high
        low = 0;
        high = nums.length - 1;

        // Finding last index
        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                ans[1] = mid;   // storing last occurrence index at ans[1]
                low = mid + 1;  // even though we found target element, but what if last occurrence of target is to more right of current position,
                                // so keep searching for last occurrence in the right half until low becomes greater than high
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,8,9,10};
        int target = 8;

        int[] ans = solve(arr, target);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
