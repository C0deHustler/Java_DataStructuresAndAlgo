// Problem - https://leetcode.com/problems/trapping-rain-water/

// Explanation - https://www.youtube.com/watch?v=UZG3-vZlFM4&t=2s

// Time Complexity: O(3*N) as we are traversing through the array only once. And O(2*N) for computing prefix and suffix array.

// Space Complexity: O(N)+O(N) for prefix and suffix arrays.

import java.util.*;
import java.lang.*;

public class Prepbytes_Hard_TrappingRainwaterProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input the size of array
        int n = sc.nextInt();
        // Declaration of array
        int[] arr = new int[n];
        // Input elements of array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Declaration of left and right arrays to store leftMaxBuilding and rightMaxBuilding respectively
        int[] left = new int[n];
        int[] right = new int[n];
        // Declaration of answer variable
        int water = 0;
        // Assigning 0 (starting point) to 'left' since 'left' will store leftMaxBuilding moving from left to right
        left[0] = arr[0];
        // Assigning n-1 (ending point) to 'right' since 'right' will store rightMaxBuilding moving from right to left
        right[n-1] = arr[n-1];
        // A loop for finding leftMaxBuilding for each separate building
        for(int i=1; i<n; i++){ // i=1 because we will not include our 1st building (i.e. building at i=0)
            left[i] = Math.max(left[i-1], arr[i]);
        }
        // A loop for finding rightMaxBuilding for each separate building
        for(int i=n-2; i>=0; i--){ // i=n-2 because we will not include our last building (i.e. building at i=n-1)
            right[i] = Math.max(right[i+1], arr[i]);
        }
        // Loop for incrementing answer variable
        for(int i=0; i<n; i++){
            water += (Math.min(left[i], right[i] )) - arr[i];
        }
        System.out.println(water);
    }
}
