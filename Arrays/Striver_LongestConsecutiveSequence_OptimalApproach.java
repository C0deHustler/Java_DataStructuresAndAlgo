import java.util.HashSet;
// Problem - https://leetcode.com/problems/longest-consecutive-sequence/
// Explanation - https://www.youtube.com/watch?v=qgizvmgeyUM&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=23

// Time Complexity: The time complexity of the above approach is O(N) because we traverse each consecutive subsequence only once.
// Space Complexity: The space complexity of the above approach is O(N) because we are maintaining a HashSet.

// Approach: We will first push all are elements in the HashSet. Then we will run a "for" loop and check for any number(x),
// if it is the starting number of the consecutive sequence,
// by checking if the HashSet contains (x-1) or not.
// If ‘x’ is the starting number of the consecutive sequence, we will keep searching for the numbers y = x+1, x+2, x+3,...
// And stop at the first ‘y’ which is not present in the HashSet.
// Using this we can calculate the length of the longest consecutive subsequence

public class Striver_LongestConsecutiveSequence_OptimalApproach {
    public static int solve(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            set.add(ele);
        }

        int longestStreak = 1;

        // run a "for" loop and check for any number(x),
        for(int ele: arr){
            // if it is the starting number of the consecutive sequence,
            // by checking if the HashSet contains (x-1) or not.
            if(!set.contains(ele - 1)){
                int currElement = ele;
                int currStreak = 1;

                // If set does not contain (x-1), we'll start searching from x, x+1, x+2,....until we reach x+something which does not exist in set
                while(set.contains(currElement + 1)){
                    currStreak += 1;    // incrementing the currStreak
                    currElement += 1;   // incrementing the currElement
                }

                longestStreak = Math.max(currStreak, longestStreak);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 9, 4, 3, 1};

        int ans = solve(arr);
        System.out.println("Length of longest consecutive sequence is : "+ans);
        // Longest consecutive sequence is [1, 2, 3, 4]
    }
}
