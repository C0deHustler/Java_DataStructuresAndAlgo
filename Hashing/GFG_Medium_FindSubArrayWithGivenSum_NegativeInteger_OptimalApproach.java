import java.util.HashMap;
// Problem - https://www.geeksforgeeks.org/find-subarray-with-given-sum-in-array-of-integers/
// Explanation - https://www.youtube.com/watch?v=XzwUBIkR9pA&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=28
// Dry run with explanation - In Register Notes
public class GFG_Medium_FindSubArrayWithGivenSum_NegativeInteger_OptimalApproach {
    public static void subArraySum(int[] arr, int n, int sum){
        int currSum = 0;
        int start = 0;  // will keep track of the starting index of the subArray
        int end = -1;   // will keep track of the ending index of the subArray
        HashMap<Integer, Integer> map = new HashMap<>();    // Creating a HashMap, <Integer, Integer> i.e. <key, value>

        for(int i=0; i<n; i++){
            currSum += arr[i];  // we'll add elements one by one in the currSum
            // For handling the case, when starting index of the subArray will be 0.
            // in further operation, we're subtracting sum from the currSum to get answer, but if subArray will start from index 0,
            // then we don't need to do any subtraction, thus for handling that case, we're checking this "if" condition
            if(currSum == sum){
                start = 0;  // obviously index 0 will be the starting index of the subArray
                end = i;    // the index till which we had iterated till now, will become the end
                break;  // then break, since we got our answer
            }
            // This whole logic explained in register notes with dry run
            if(map.containsKey(currSum - sum)){
                start = map.get(currSum - sum)+1;
                end = i;
                break;  // break since we got our answer
            }
            map.put(currSum, i);    // at the end of each iteration, we'll add
                                    // key -> currSum
                                    // value -> index of the array
        }
        // After coming out of the loop, if end == -1, it means no such subArray exists since our end is still -1
        if(end == -1){
            System.out.println(-1);
        }
        else{
            System.out.println(start+" "+end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 15, -5, 15, -10, 5};
        int n = arr.length;
        int sum = 5;
        subArraySum(arr, n, sum);


    }
}
