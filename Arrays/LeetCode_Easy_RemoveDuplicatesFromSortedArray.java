// Problem - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Explanation - https://www.youtube.com/watch?v=Fm_p9lJ4Z_8

// As a brute force, we can use "set" to store unique elements, which will tell the count of duplicate elements
// T.C - O(n logn) + O(n) -> n for traversing the array, log n for inserting into the set, n for removing all elements from set in case of worst case
// S.C - O(n) due to set

// Approach used in this problem:
// Optimal - T.C - O(n), S.C - O(1)

public class LeetCode_Easy_RemoveDuplicatesFromSortedArray {
    // We will use a 2 pointer approach
    public static int findUnique(int[] nums){
        int len = nums.length;
        int i = 0;  // 1st pointer at 1st element i.e. index 0
        int j = 1;  // 2nd pointer at 2nd element i.e. index 1
        // Till the time 2nd pointer is not out of the array
        while(j < len){
            // if both pointers are on duplicate elements, then keep moving 2nd pointer ahead until it finds a non-duplicate element
            if(nums[i] == nums[j]){
                j++;
            }
            // if both pointers are on different elements
            else{
                i++;    // increment 1st pointer because we'll update the i++ element with j pointer element, because as per problem,
                        // we also need to arrange all duplicates at the starting of the array
                nums[i] = nums[j];  // doing the update
                j++;    // incrementing 2nd pointer so that it will continue the search for duplicate elements
            }
        }
        // returning the count of number of duplicate elements
        return i+1;
    }
    // Same working logic as the findUnique method, here, we'll return the updated array
    public static int[] removeDup(int[] nums){
        int len = nums.length;
        int i = 0;
        int j = 1;
        while(j < len){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,4,4};

        int uniqueCount = findUnique(arr);
        System.out.println("Number of unique elements are : "+uniqueCount);

        int[] ans = removeDup(arr);
        System.out.println("Final array with Duplicates elements at front :");
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
