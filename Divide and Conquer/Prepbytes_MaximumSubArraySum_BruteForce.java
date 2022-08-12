// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/video/20d4b6ccc6604fb0845e5c16e07c5e77

// T.C - O(n^2)

public class Prepbytes_MaximumSubArraySum_BruteForce {
    public static int solve(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum += arr[j];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {20, 0, 19, 2, -20, -3, 4, -14};

        int ans = solve(arr);
        System.out.println(ans);
    }
}
