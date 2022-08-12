// Problem - https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/#
// Explanation - https://www.geeksforgeeks.org/find-subarray-with-given-sum/

public class GFG_Medium_FindSubArrayWithGivenSum_NonNegativeInteger_OptimalApproach {
    public static void solve(int[] arr, int n, int sum){
        int currSum = arr[0];
        int start = 0;  // this will keep track of the elements which will be removed from the starting of the window if currSum > sum
        for(int i=1; i<=n; i++){    // i=1 because 1st element (0th index element) has already been added in the currSum
                                    // i<=n Important, because to reach the last element, we need to do n iterations
            // keep removing elements from the start of the window while
            // 1. currSum > sum
            // 2. it will make sure that if only 1 element is left in the window, then this single element should not be removed,
            // and we'll move forward to add more elements in the window
            while(currSum > sum && start < i-1){
                currSum = currSum - arr[start];
                start++;
            }
            if(currSum == sum){
                int p = i-1;    // logic explained in brute force approach
                System.out.println("SubArray lies between indexes "+start+" and "+p);
                return;
            }
            if(i < n){  // this condition will make sure that if subArray will be of a single element at the last index (Test case - 2),
                        // then we'll not add that last element which do not even exist in the array
                        // Test case - 2, when we'll be in the 6th iteration(last iteration), then n = 6, but array has index till 5,
                        // so we cannot add arr[6] in the array or else we'll get runtime error
                        // that's why i<n
                currSum += arr[i];
            }
        }
        System.out.println("No subArray found.");
    }
    public static void main(String[] args) {
        // Test case - 1
        int[] arr1 = {1, 4, 20, 3, 10, 5};
        int n1 = arr1.length;
        int sum1 = 33;

        solve(arr1, n1, sum1);

        // Test case - 2
        int[] arr2 = {1, 2, 20, 3, 10, 5};
        int n2 = arr2.length;
        int sum2 = 5;

        solve(arr2, n2, sum2);
    }
}
