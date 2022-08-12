import java.util.*;
// Problem - https://leetcode.com/problems/pascals-triangle/submissions/
// Explanation - https://www.youtube.com/watch?v=6FLvhQjZqvM&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=9

// Time Complexity: We are creating a 2D array of size (numRows * numCols) (where 1 <= numCols <= numRows),
//                  and we are traversing through each of the cells to update it with its correct value,
//                  so Time Complexity = O(numRows2).

//Space Complexity: Since we are creating a 2D array, space complexity = O(numRows2).

public class LeetCode_Easy_PascalTriangle {

    public static List<List<Integer>> solve(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> currentRow = null;
        List<Integer> previousRow = null;

        for(int i = 0; i < numRows; i++){
            currentRow = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    currentRow.add(1);
                }
                else{
                    currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
                }
            }
            previousRow = currentRow;
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = solve(n);
        for(List<Integer> ele : ans){
            System.out.println(ele);
        }
    }
}
