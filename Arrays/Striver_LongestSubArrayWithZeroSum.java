import java.util.HashMap;
// Problem - https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1#
// Problem - https://takeuforward.org/data-structure/length-of-the-longest-subarray-with-zero-sum/

// Explanation - https://www.youtube.com/watch?v=xmguZ6GbatA&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=24

// Time Complexity: O(N), as we are traversing the array only once
// Space Complexity: O(N), in the worst case we would insert all array elements prefix sum into our hashmap

// Intuition:
// Now let’s say we know that the sum of subArray(i, j) = S, and we also know that sum of subArray(i, x) = S where i < x < j.
// We can conclude that the sum of subArray(x+1, j) = 0.
// So in this problem, we’ll store the prefix sum of every element, and if we observe that 2 elements have same prefixed sum,
// we can conclude that the 2nd part of this subArray sums to zero, and then we'll then compare that which maxLen is bigger
// the one which we already have or the length of subArray(x+1, j) i.e. [ length of subArray(i, x) - length of subArray(i, j) ]

public class Striver_LongestSubArrayWithZeroSum {
    public static int method(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            // we're calculating prefix sum after each iteration
            sum += arr[i];
            // if sum of prefix will become 0, then just increment i by 1 to get the length of the subArray
            // it means that subArray will start from index 0 and will end at index i
            if(sum == 0){
                maxLen = i+1;
            }
            else{
                // here we use our main intuition, that a particular sum (subArray(i, j) == SUM) already exists in the map,
                // and we encountered another sum with same value i.e. (subArray(i, x) == SUM)
                // it means that there  exists a range of elements i.e. subArray(x+1, j) with sum == 0
                if(map.containsKey(sum)){
                    maxLen = Math.max(maxLen, i - map.get(sum));// so we'll take the maximum length
                }
                else{
                    // or else keep putting prefix sums with their indexes
                    map.put(sum, i);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};

        int ans = method(arr);
        System.out.println(ans);
    }
}
