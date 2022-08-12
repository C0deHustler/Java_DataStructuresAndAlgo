// Problem - https://leetcode.com/problems/concatenation-of-array/

public class LeetCode_Easy_ConcatenationOfArray {
    // Method - 1
    public static int[] concat1(int[] nums){
        int[] ans = new int[2*nums.length];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            ans[k++] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            ans[k++] = nums[i];
        }
        return ans;
    }
    // Method - 2 (Better)
    public static int[] concat2(int[] arr){
        int[] ans = new int[2*arr.length];

        for(int i=0; i<arr.length; i++){
            ans[i] = ans[i + arr.length] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = concat1(arr);
        for(int ele: ans){
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] arr2 = {1,3,5};
        int[] ans2 = concat1(arr2);
        for(int ele: ans2){
            System.out.print(ele+" ");
        }
    }
}
