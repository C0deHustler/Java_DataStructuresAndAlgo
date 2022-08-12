import java.util.HashMap;
// Problem - https://leetcode.com/problems/two-sum/
// Explanation - https://www.youtube.com/watch?v=dRUpbt8vHpo&t=7s

public class LeetCode_Easy_TwoSum {
    public static int[] find2Sum(int[] arr, int n, int target){
        int[] result = new int[2];  // making an array of size 2 which will return answer indexes
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            // Logic - arr[2,6,5,8,11], target = 14
            // i = 0; 14 - 2 = 12, if 12 exists in the map, then 2 sum pair exists, but 12 does not exist, so add 2 in map with value 0
            // i = 1; 14 - 6 = 8, if 8 exists in the map, then 2 sum pair exists, but 8 does not exist, so add 6 in map with value 1
            // i = 2; 14 - 5 = 9, if 9 exists in the map, then 2 sum pair exists, but 9 does not exist, so add 5 in map with value 2
            // i = 3; 14 - 8 = 6, if 6 exists in the map, then 2 sum pair exists, and 6 exists in map,
            // so the value of key(6) i.e. 1 will become one of the index
            if(map.containsKey(target - arr[i])){
                result[1] = i;
                result[0] = map.get(target - arr[i]);
                return result;
            }
            map.put(arr[i], i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;

        int[] ans = find2Sum(arr, n, target);
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
