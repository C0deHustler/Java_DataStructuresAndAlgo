import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/FINDMED
// Problem - https://leetcode.com/problems/median-of-two-sorted-arrays/

// Explanation - https://www.youtube.com/watch?v=NTop3VTjmxk

// Time Complexity : O(log(m,n))
// Reason – We are applying binary search on the array which has a minimum size.

// Space Complexity: O(1)
// Reason – No extra array is used

public class Prepbytes_Hard_FindMedian {
    public static double solve(int[] nums1, int[] nums2, int n, int m){
        // we want array1 to be smaller than array2, so if array2 is smaller than the array1, then we'll pass them as per our needs
        if(m < n) {
            return solve(nums2, nums1, m, n);
        }

        int n1 = n; // length of 1st array
        int n2 = m; // length of 2nd array

        int low = 0;    // we can take minimum of 0 element from array1
        int high = n1;  // and we can take maximum of n1 elements from array1

        while(low <= high){
            int cut1 = (low + high) / 2;    // number of elements we'll pick from array1
            int cut2 = ((n1 + n2 + 1) / 2) - cut1;  // number of elements we'll pick from array2

            // if we'll pick 0 elements from array1, then left1 will be the minimum value,
            // or else the element just before cut1(i.e. the partition line for array1) will be the left1
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            // if we'll pick 0 elements from array2, then left2 will be the minimum value,
            // or else the element just before cut2(i.e. the partition line for array2) will be the left2
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            // if we'll pick all elements from array1, then there will be no right element left, so right1 will be the maximum value,
            // or else the element just after cut1(i.e. the partition line for array1) will be the right1
            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            // if we'll pick all elements from array2, then there will be no right element left, so right2 will be the maximum value,
            // or else the element just after cut2(i.e. the partition line for array2) will be the right2
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

            // if the selection is valid i.e. cut1 and cut2 are valid
            if(left1 <= right2 && left2 <= right1){
                // if total number of elements is even
                if((n1 + n2) % 2 == 0){
                    // return average of 2 most middle elements i.e median
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }
                // if total number of elements is odd
                else{
                    // return max of left1 and left2 i.e. median
                    return Math.max(left1, left2);
                }
            }
            else if(left1 > right2){
                // since left1 is greater than right2, we need to reduce left1 by moving towards left in the array since array is sorted, thus
                // we'll go in the 1st half, so high = mid - 1
                high = cut1 - 1;
            }
            else{
                // or else move to 2nd half, i.e. low = mid + 1
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                arr2[i] = sc.nextInt();
            }

            double ans = solve(arr1, arr2, n, m);

            if((n + m) % 2 != 0){
                int median = (int)ans;
                System.out.println(median);
            }
            else{
                System.out.println(ans);
            }
        }
    }
}