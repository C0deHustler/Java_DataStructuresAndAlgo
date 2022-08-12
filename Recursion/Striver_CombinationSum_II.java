import java.util.*;
// Problem - https://leetcode.com/problems/combination-sum-ii/

// Explanation - https://www.youtube.com/watch?v=G1fRTGRxXU8&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=51

// Time Complexity: O(2^n*k)
// Reason: Assume if all the elements in the array are unique then the no. of subsequence you will get will be O(2^n).
// we also add the ds to our ans when we reach the base case that will take “k”//average space for the ds.

// Space Complexity:O(k*x)
// Reason: if we have x combinations then space will be x*k where k is the average length of the combination.

// Working logic is quite same as Striver_CombinationSum.java
// 1. we'll sort the array to easily get only unique elements in the combination
// See dry run and recursion tree to understand in-depth code

public class Striver_CombinationSum_II {
    public static void findCombinationSum(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = index; i < arr.length; i++){
            // we'll consider the 1st element we'll encounter, but if we've passed that 1st element (i.e. i > index), and that new element is
            // same as previous element i.e. duplicate, so we'll skip these duplicates
            if(i > index && arr[i] == arr[i-1]){
                continue;
            }
            // with each recursive calls, we'll keep adding elements in ds, and as a result our target will also keep reducing,
            // as when target == 0, we've found our combination, but what if we need only 3 more to reach our target combination sum,
            // but element is 4, so adding 4 will make combination sum more than target, so in such case, just break from loop
            // why break -> since array is sorted, so if arr[i] is greater than remaining subtracted target, then obviously arr[i+1],arr[i+1],...
            // will also exceed the combination sum
            if(arr[i] > target){
                break;
            }

            // this part same as Striver_CombinationSum.java (Do read the comments of that problem)
            ds.add(arr[i]);
            findCombinationSum(i+1, arr, target - arr[i], ans, ds); // i+1 -> moving to next index
                                                                               // target - arr[i] -> like this, when target == 0, combination sum found
            ds.remove(ds.size() - 1);   // backtracking
        }
    }

    public static List<List<Integer>> solve(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // 1.
        Arrays.sort(candidates);
        findCombinationSum(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> result = solve(arr, target);
        for(List<Integer> ele : result){
            System.out.println(ele);
        }
    }
}
