import java.util.HashMap;
// Problem - https://leetcode.com/problems/contains-duplicate-ii/
public class LeetCode_Easy_ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if(Math.abs(i - j) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;

        boolean ans = containsNearbyDuplicate(arr, k);
        System.out.println(ans);
    }
}
