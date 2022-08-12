// Problem - https://leetcode.com/problems/container-with-most-water/
// Explanation - https://www.youtube.com/watch?v=qUDp8IUbZto&t=176s

// T.C - O(n)
// S.C - O(1)

public class LeetCode_Medium_ContainerWithMostWater {
    public static int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int water = 0;

        while(left < right){
            int width = right - left;
            int height = Math.min(nums[left], nums[right]);

            int tempWater = height * width; // amount of water stored can be seen as 2-D area between 2 heights
            water = Math.max(water, tempWater);

            // Between 2 heights i.e. nums[left] and nums[right], water can only be stored till the height of the minimum of 2 buildings,
            // so if we move the taller building forward or backward, it is of no use, since water will be dependent on small building only,
            // in fact by moving taller building, we'll decrease the width between 2 building which will ultimately reduce the area more,
            // so instead move the smaller building
            if(nums[left] < nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(arr);
        System.out.println(ans);
    }
}
