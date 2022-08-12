import java.util.HashMap;
// Problem - https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1/#
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/hashing/video/369c133fd59f4d4197896d5c2d522fd1

public class Prepbytes_Medium_LargestZeroSumSubArray {
    public static int subArraySum(int[] arr, int n){
        int max_len = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            // Since we've to find a subArray, so we'll use prefix sum concept
            sum += arr[i];

            // if so far we've not found any subArray, then an element which is 0, will become the subArray with length 1
            if(arr[i] == 0 && max_len == 0){
                max_len = 1;
            }
            // if sum of prefix will become 0, then just increment i by 1 to get the length of the subArray
            // it means that subArray will start from index 0 and will end at index i
            if(sum == 0){
                max_len = i+1;
            }
            // if a value for a key already exits in the map,
            // then we can check whether subtraction of current index (i) and the index where already this same key exists (map.get(sum)) is longer,
            // or the already existing max_len is longer
            if(map.get(sum) != null){
                max_len = Math.max(max_len, i - map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int[] arr = {3, -3, 4, 5, -6, 20, 30};
        int n = arr.length;
        int ans = subArraySum(arr, n);
        System.out.println(ans);
    }
}
