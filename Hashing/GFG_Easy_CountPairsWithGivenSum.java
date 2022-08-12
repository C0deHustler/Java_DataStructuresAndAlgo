import java.util.HashMap;
// Problem - https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1#

// Explanation - Logic same as Hashing - LeetCode_Medium_SubArraySumEqualsK.java

// The only difference between this problem and Hashing - LeetCode_Medium_SubArraySumEqualsK.java problem is that :
// In this problem, we've to find number of pairs
// In Leetcode problem, we've to find subArray
// E.g. n=3, arr[] = 1,1,1 , k=2
// then for this problem - ans = 3 (arr[0], arr[1]),(arr[1], arr[2]) and (arr[0], arr[2])
// but for Leetcode problem - ans = 2 (arr[0], arr[1]), (arr[1], arr[2]), since we've to find subArray, so (arr[0],arr[2]) will be wrong

// That's why both these problems have a little changes in the code,
// In this problem, in each iteration, we'll map current element with its count in hashmap
// In Leetcode problem, in each iteration, we'll map current sum (prefix sum so far)  with its count in hashmap

public class GFG_Easy_CountPairsWithGivenSum {
    public static int countPairs(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<n; i++){
            // Since we don't have to find subArray, and we only have to find number of pairs, so instead of finding prefix sum logic,
            // we'll directly put arr[i] in the map
            if(map.containsKey(k - arr[i])){
                count += map.get(k - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int n = arr.length;
        int k = 6;

        int ans = countPairs(arr, n, k);
        System.out.println(ans);
    }
}
