import java.util.ArrayList;
import java.util.List;
// Problem - https://leetcode.com/problems/subsets/
// Explanation - Prepbytes_Hard_PowerSetOfString_NonLexicographicalOrder_RecursiveApproach.java

public class LeetCode_Medium_Subsets {
    public static void solve(int[] nums, int index, List<Integer> ds, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        // Adding element of current index in ds
        ds.add(nums[index]);
        // Recursive call for next index when element is picked
        solve(nums, index + 1, ds, result);
        // Backtracking
        ds.remove(ds.size() - 1);
        // Recursive call for next index when element is not picked
        solve(nums, index + 1, ds, result);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(nums, 0, ds, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}
