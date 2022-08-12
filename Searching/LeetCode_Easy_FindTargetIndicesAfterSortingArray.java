import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Problem - https://leetcode.com/problems/find-target-indices-after-sorting-array/

public class LeetCode_Easy_FindTargetIndicesAfterSortingArray {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3,6,3};
        int target = 3;

        List<Integer> ans = targetIndices(arr, target);
        System.out.println(ans);
    }
}
