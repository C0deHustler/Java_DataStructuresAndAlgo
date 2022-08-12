import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem - https://leetcode.com/problems/subsets-ii/

// Explanation - https://www.youtube.com/watch?v=RIn3gOkbhQE&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=54

// Time Complexity: O(2^n) for generating every subset and O(k)  to insert every subset in another data structure if the average
// length of every subset is k.
// Overall O(k * 2^n).

// Space Complexity: O(2^n * k) to store every subset of average length k. Auxiliary space is O(n)  if n is the depth of the recursion tree

public class Striver_SubsetsII {
    public static void findSubsets(int index, int[] arr, List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));

        for(int i = index; i< arr.length; i++){
            if(index != i && arr[i] == arr[i-1]){
                continue;
            }

            ds.add(arr[i]);

            findSubsets(i+1, arr, ds, ansList);

            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();

        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        List<List<Integer>> ans = subsetsWithDup(arr);
        System.out.println(ans);
    }
}
