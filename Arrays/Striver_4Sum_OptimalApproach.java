import java.util.ArrayList;
import java.util.Arrays;
// Problem - https://leetcode.com/problems/4sum/
// Problem - https://takeuforward.org/data-structure/4-sum-find-quads-that-add-up-to-a-target-value/

// Explanation - https://www.youtube.com/watch?v=4ggF3tXIAp0&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=22
// T.C - O(n^3)
// S.C - O(1)

// Intuition:
// In the brute force approach we fixed three-pointers and did a binary search to find the fourth.
// Now we'll sort the array, then over here we will fix two-pointers and then find the remaining two elements using
// two pointer technique (2sum approach where we've used earlier to find 2 elements having target sum)

// Approach:
// Sort the array, and then fix two pointers, so the remaining sum will be (target – (arr[i] + arr[j])).
// Now we can fix two pointers, one front, and another back, and easily use a two-pointer to find the remaining two numbers of the quad.
// In order to avoid duplications, we jump the duplicates, because taking duplicates will result in repeating quads.
// We can easily jump duplicates, by skipping the same elements by running a loop.

public class Striver_4Sum_OptimalApproach {
    public static ArrayList<ArrayList<Integer>> sum(int[] arr, int target){
        // A list of lists containing quadruplets to store final answer i.e. the lists of 4Sums
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();


        int n = arr.length;
        Arrays.sort(arr);   // sort the array

        // Initializing 1st pointer as i
        for(int i=0; i<n; i++){
            // Initializing 2nd pointer as j
            for(int j=i+1; j<n; j++){
                // target2 is the target sum for which 2sum approach will be used to find the 2 elements having the target sum
                // thus in the end we'll get all 4 elements (arr[i], arr[j], 1st element of 2sum, 2nd element of 2sum)
                int target2 = target - (arr[i] + arr[j]);

                int front = j+1;    // front pointer will be the starting point for searching within the range of 2sum
                int back = n-1;     // back pointer will be the ending point for searching within the range of 2sum

                while(front < back){
                    // increment front if sum is less than the required target
                    if((arr[front]+arr[back]) < target2){
                        front++;
                    }
                    // decrement back if sum is more than the required target
                    else if((arr[front]+arr[back]) > target2){
                        back--;
                    }
                    // if we found 2 elements having sum equal to target2
                    else{
                        // Make a ArrayList to store the list of quadruplets
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[front]);
                        quad.add(arr[back]);
                        // add list of quadruplets in the final ans ArrayList
                        ans.add(quad);

                        // if array is sorted (2, 2, 2, 3, 3, 3, 4, 4...)
                        // and suppose front pointer is at 1st 2 and back is at last 4, then even if we increment or decrement both of these
                        // pointers, but still we'll do some unnecessary steps since array is already sorted
                        // so instead, we'll skip all duplicate 2's, and will directly jump to 3
                        while(front < back && arr[front] == quad.get(2)){
                            front++;
                        }
                        // same logic for back pointer, we'll skip duplicate 4's and directly jump to 3
                        while(front < back && arr[back] == quad.get(3)){
                            back--;
                        }
                    }
                }
                // Just like what we did for front and back to avoid duplicates
                // Similar thing we'll do for avoiding duplicates in the case pointer i and similarly pointer j
                // (j+1)th element is our element just next after jth element
                // j+1 < n -> (j+1)th element must lie inside array range
                // arr[j+1] == arr[j] -> if (j+1)th element is similar to jth element i.e. duplicates, then increment j to skip duplicates
                while(j+1 < n && arr[j+1] == arr[j]){
                    j++;
                }
            }
            // same logic as discussed above for j pointer
            while(i+1 < n && arr[i+1] == arr[i]) {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        ArrayList<ArrayList<Integer>> ans = sum(arr, target);
        for(ArrayList<Integer> ele: ans){
            System.out.println(ele);
        }
    }
}
