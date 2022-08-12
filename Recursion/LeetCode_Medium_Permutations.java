import java.util.*;
// Problem - https://leetcode.com/problems/permutations/

// Explanation - https://www.youtube.com/watch?v=YK78FU5Ffjw&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=12

// T.C - O(n! * n), n! -> for n, n! permutations will be generated,
//                  and loop will run n times
// S.C - O(n) + O(n), because of ds and freq[] array

public class LeetCode_Medium_Permutations {
    public static void findPermutation(int[] nums, boolean[] freq, List<Integer> ds, List<List<Integer>> ans){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<nums.length; i++){
            // if the current element has not yet been added to ds, then add it
            if(!freq[i]){
                freq[i] = true; // update it to "true", so that it will not be taken again
                ds.add(nums[i]);    // add that element in ds
                findPermutation(nums, freq, ds, ans);
                // backtracking
                ds.remove(ds.size() - 1);   // remove the latest added element from ds
                freq[i] = false;    // set freq of that element as "false", so that it can be considered for adding into ds for other recursive calls
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        findPermutation(nums, freq, ds, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);
    }
}
