// Problem - https://leetcode.com/problems/single-element-in-a-sorted-array/
// Explanation - https://www.youtube.com/watch?v=PzszoiY5XMQ&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=65

// T.C - O(log n)
// S.C - O(1)

// Logic - Must read the article, very well explained - https://takeuforward.org/data-structure/search-single-element-in-a-sorted-array/
// In a sorted array with 0-based indexing, if each element exists 2 times, then
// 1st occurrence - even index, 2nd occurrence - odd index
// but if in between them, a single element exists, then before that element, above discussed indexing will be followed,
// but after single element, indexing will be changed,
// 1st occurrence - odd index, 2nd occurrence - even index

public class LeetCode_Medium_SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 2; // why - 2 ?? 6:44

        while(low <= high){
            int mid = low + (high - low)/2;

            if(mid % 2 == 0){
                // Checking whether we're in the left half
                if(nums[mid] == nums[mid+1]){
                    // Shrinking left half
                    low = mid + 1;
                }
                else{
                    // Shrinking right half
                    high = mid - 1;
                }
            }
            else{
                // checking whether we're in the right half
                if(nums[mid] == nums[mid + 1]){
                    // shrinking right half
                    high = mid - 1;
                }
                else{
                    // shrinking left half
                    low = mid + 1;
                }
            }
        }
        return nums[low];   // after all operations, single element will be at the lo
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,6,6,9,9};

        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
}
