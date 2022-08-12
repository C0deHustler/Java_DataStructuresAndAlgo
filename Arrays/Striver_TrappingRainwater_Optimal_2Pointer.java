// Problem - https://leetcode.com/problems/trapping-rain-water/

// Explanation - https://www.youtube.com/watch?v=m18Hntz4go8&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=43   8:50

// Time Complexity: O(N) because we are using 2 pointer approach.

// Space Complexity: O(1) because we are not using anything extra.

public class Striver_TrappingRainwater_Optimal_2Pointer {
    public static int solve(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int res = 0;

        int leftMax = 0;
        int rightMax = 0;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] > leftMax){
                    leftMax = height[left];
                }
                else{
                    res += leftMax - height[left];
                }
                left++;
            }
            else if(height[right] < height[left]){
                if(height[right] > rightMax){
                    rightMax = height[right];
                }
                else{
                    res += rightMax - height[right];
                }
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int ans = solve(arr);
        System.out.println(ans);
    }
}
