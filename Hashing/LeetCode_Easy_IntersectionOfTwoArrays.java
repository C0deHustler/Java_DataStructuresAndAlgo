import java.util.*;
// Problem - https://leetcode.com/problems/intersection-of-two-arrays/
public class LeetCode_Easy_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums1){
            set.add(ele);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for(int ele : nums2){
            if(set.contains(ele)){
                intersection.add(ele);
            }
        }

        int index = 0;
        int[] ans = new int[intersection.size()];
        for(int ele : intersection){
            ans[index++] = ele;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        int[] ans = intersection(arr1, arr2);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
