import java.util.ArrayList;
import java.util.List;
// Problem - https://leetcode.com/problems/combination-sum/

// Explanation - https://www.youtube.com/watch?v=OyZFFqQtu98&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=50

// Time Complexity: O(2^t * k) where t is the target, k is the average length

// Reason: Assume if you were not allowed to pick a single element multiple times, every element will have a couple of options:
// pick or not pick which is 2^n different recursion calls, also assuming that the average length of every combination generated is k.
// (to put length k data structure into another data structure)

// Why not (2^n) but (2^t) (where n is the size of an array)?
// Assume that there is 1 and the target you want to reach is 10 so 10 times you can “pick or not pick” an element.

// Space Complexity: O(k*x), k is the average length and x is the no. of combinations

public class Striver_CombinationSum {

    public static void findCombinationSum(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        // when we reach the end of array
        if(index == arr.length){
            // if we've got our target
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // As we'll keep adding elements in ds for checking for combination sum, we'll also keep subtracting that element from the target,
        // which means, that once target == 0, it means we've found our combination,
        // as per this, we can only decide to pick the same element again if and only if it is less than target,

        // Point - 1 ->
        // e.g. target = 7, ds = [2,2], so the updated target = 7 - (2 + 2) -> 3, now we can only add one more 2 in ds if 2 is less than 3,

        // Point - 2 ->
        // which is true, so now, target = 3 - 2 -> 1, and ds = [2, 2, 2], but now we cannot add one more 2 in ds since
        // 2 is greater than target(i.e. 1)

        // Point - 3 ->
        // Since one more 2 cannot be taken, so now move to next index, and whether to pick element at new index or not, that we'll decide in next
        // recursive call when we'll be standing at that new index, so for now, we'll just move to next index without picking any element
        // i.e. we'll make no manipulation in target and ds

        // Point - 4 ->
        // since we're doing all manipulation in a single ds (data structure) and storing its deep copy once base case gets hit
        // so after returning from each recursive call, we'll remove the last element from ds i.e. we'll backtrack,
        // so that we'll again get our same ds back which can be sent ahead for another recursive calls ( i.e. the calls of Point-3)

        if(arr[index] <= target){
            ds.add(arr[index]); // 1.
            findCombinationSum(index, arr, target - arr[index], ans, ds);   // 2.
            // BackTracking (4.)
            ds.remove(ds.size() - 1);
        }
        // 3.
        findCombinationSum(index + 1, arr, target, ans, ds);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationSum(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int target = 8;

        List<List<Integer>> result = combinationSum(arr, target);
        System.out.println(result);
    }
}
