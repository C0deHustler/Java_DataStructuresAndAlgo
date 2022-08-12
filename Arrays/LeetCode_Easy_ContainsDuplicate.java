import java.util.HashSet;
// Problem - https://leetcode.com/problems/contains-duplicate/
public class LeetCode_Easy_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int ele : nums) {
            if (set.contains(ele)) {
                return true;
            }
            set.add(ele);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7,3,2,9,2};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
}
