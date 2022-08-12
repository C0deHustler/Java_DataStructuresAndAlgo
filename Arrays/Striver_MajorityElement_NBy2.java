// Problem - https://leetcode.com/problems/majority-element/
// Problem - https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/

// Explanation - Pics Notes
// https://www.youtube.com/watch?v=X0G5jEcvroo

// Read the comments of Prepbytes_Hard_MajorityElement_MooresVotingAlgo.java, those comments are much better
public class Striver_MajorityElement_NBy2 {
    public static void main(String[] args){
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;


        int count = 1;  // assuming count to be 1 initially
        int ansIndex = 0;  // assuming the first index of array as Majority Element initially
        for(int i=1 ;i<n; i++){ // i=1, because we've declared ansIndex as our first element index (i=0), so we'll start our loop from i=1,
            if(arr[i] == arr[ansIndex]){ // Checking if the current element of the array is equal to the element
                // present at our self assumed Majority element index
                count++;    // if yes, then increment
            }
            else{
                count--;    // if no, then decrement
            }
            // if count becomes 0, then re-initialize the ansIndex as i and count as 1.
            if(count == 0){
                ansIndex = i;   // Important point
                count = 1;
            }
        }

        // Separate code for checking, that the ansIndex we are getting at the end, whether it is the Majority element or not
        int newCount = 0;
        // loop to find the frequency of possible majority element
        for(int i=0; i<n ;i++) {
            if (arr[i] == arr[ansIndex]) {   // Checking if arr[i] is equal to ansIndex
                newCount++;
            }
        }
        if(newCount > n/2){
            System.out.println("Majority element is : "+arr[ansIndex]+"\n and last index : "+ansIndex+"\n with count = "+newCount);
        }
        else{
            System.out.println("No majority element exists.");
        }
    }
}
