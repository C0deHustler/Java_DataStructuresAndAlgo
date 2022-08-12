import java.util.Arrays;
// Problem - https://leetcode.com/problems/longest-consecutive-sequence/
// Explanation - https://www.youtube.com/watch?v=qgizvmgeyUM&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=23

// Time Complexity: We are first sorting the array which will take O(N * log(N)) time, and then we are running a for loop which will take O(N) time.
// Hence, the overall time complexity will be O(N * log(N)).

// Space Complexity: The space complexity for the above approach is O(1) because we are not using any auxiliary space

// Sort the array and then check for the longest consecutive sequence
public class Striver_LongestConsecutiveSequence_BruteForce {
    public static int solve(int[] arr){
        if(arr.length == 0 || arr == null){
            return 0;
        }
        Arrays.sort(arr);

        int ans = 1;
        int curr = 1;
        int prev = arr[0];

        for(int i=1; i<arr.length; i++){
            if(prev + 1 == arr[i]){
                curr++;
            }
            else if(prev != arr[i]){
                curr = 1;
            }
            ans = Math.max(curr, ans);
            prev = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 9, 4, 3, 1};

        int ans = solve(arr);
        System.out.println("Length of longest consecutive sequence is : "+ans);
        // Longest consecutive sequence is [1, 2, 3, 4]
    }
}
