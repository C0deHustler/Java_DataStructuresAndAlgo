import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
// Problem - https://leetcode.com/problems/3sum/
// Problem - https://takeuforward.org/data-structure/3-sum-find-triplets-that-add-up-to-a-zero/

// Explanation - https://www.youtube.com/watch?v=onLoX6Nhvmg&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=42

// Time Complexity : O(N^2)
// Space Complexity : O(3*k)  // k is the no.of triplets

// Approach -
// 1. Sort the array
// 2. We've to find 3 elements whose sum == 0, i.e. a + b + c = 0 -> a + b = -c
// 3. So we'll use iterator "i" to specify "c"
// 4. And then we'll use 2 pointer approach by keeping "low" pointer at the start and "high" pointer at the end
// 5. we'll keep checking whether arr[low] + arr[high] == - (arr[i]), is sum is low, then low++, if sum is greater, then high--
//
public class Striver_3Sum_OptimalApproach {

    public static List<List<Integer>> threeSum(int[] nums) {
        // 1.
        Arrays.sort(nums);

        List<List<Integer>> result = new LinkedList<>();

        for(int i=0; i<nums.length - 2; i++){   // nums.length - 2, because if "i" will be fixed, and we'll use 2 pointers also, so we need to stop
                                                // at nums.length - 2

            if(i == 0 || ( i > 0 && nums[i] != nums[i - 1])){

                // 2.
                int low = i+1;
                int high = nums.length - 1;
                // 3.
                int sum = -nums[i];

                // 4.
                while(low < high){
                    // 5.
                    if(nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        // if arr = [-3,-2,-2,-2,-1,-1,0,0,1,2,2,3,3]
                        // suppose low is at index 1 (i.e. -2) and high is at last index (i.e. 3), and we found one "3Sum Pair" as our answer
                        // so to avoid repetitive duplicate checking for repeating low and high, we'll run these 2 while loops used below
                        while(low < high && nums[low] == nums[low+1]){
                            low++;
                        }
                        while(low < high && nums[high] == nums[high-1]){
                            high--;
                        }
                        // on basis of above example, after coming out of while loop, low will be at last -2, high will be at first 3
                        // so after low++ -> low will be at -1
                        // after high-- -> high will be at last 2
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high] < sum){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = threeSum(arr);

        System.out.println(ans);
    }
}
