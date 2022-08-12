import java.util.Arrays;
// LeetCode - https://leetcode.com/problems/maximum-units-on-a-truck/
// Explanation - Based on Knapsack Problem ( Prepbytes_FractionalKnapsack.java )

public class LeetCode_Easy_MaximumUnitsOnATruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        // Arrays.sort(arr, (a, b) -> Integer.compare(b[0],a[0]));   sort a 2D array in decreasing order
        // Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]);    sort a 2D array in increasing order
        // 2D array will be sorted in decreasing order on the basis of index 1.
        Arrays.sort(boxTypes, (a, b) -> {
            return b[1] - a[1]; // b[] - a[], that's why decreasing order
        });

        int flag = 0;   // same logic as Prepbytes_FractionalKnapsack
        int maxUnits = 0;
        int n = boxTypes.length;

        int i = 0;  // same logic...
        for(i=0; i<n; i++){
            int currWeight = boxTypes[i][0];    // numberOfBoxes[i]
            int currUnits = boxTypes[i][1];     // numberOfUnitsPerBox[i]

            if(truckSize > 0 && currWeight < truckSize){
                maxUnits += currUnits * currWeight; // as per Leetcode problem -> numberOfUnitsPerBox[i] is the number of units in each box of
                                                    // the type i, and "Return the maximum total number of units that can be put on the truck."
                                                    // See Leetcode test case for better understanding
                truckSize -= currWeight;
            }
            else{   // Same logic...
                flag = 1;
                break;
            }
        }
        // Same Logic...
        if(flag == 1){
            maxUnits = maxUnits + (boxTypes[i][1] * truckSize); // We'll just add those number of units, whose space is left in truck i.e. truckSize
                                                                // truckSize is the space left since after each iteration, truckSize is getting reduced
        }
        return maxUnits;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;

        int ans = maximumUnits(boxTypes, truckSize);
        System.out.println(ans);
    }
}
