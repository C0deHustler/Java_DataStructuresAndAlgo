// Problem - https://leetcode.com/problems/search-a-2d-matrix/submissions/
// Problem - https://takeuforward.org/data-structure/search-in-a-sorted-2d-matrix/

// Explanation - https://www.youtube.com/watch?v=ZYpYur0znng&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=15
// T.C - O(log(m*n))
// S.C - O(1)

// Major Conditions :
// 1. Integers in each row are sorted from left to right.
// 2. The first integer of each row is greater than the last integer of the previous row.

public class Striver_SearchInSorted2DMatrix_I {
    public static boolean search(int[][] matrix, int target){
        if(matrix.length == 0){
            return false;
        }

        int rows = matrix.length;;
        int cols = matrix[0].length;

        // On the basis of given 2 conditions, if we traverse matrix from left to right(in 1st row), then again left to right(in 2nd row) and so on...
        // we'll observe a sorted array of elements, so we'll simply use binary search to find our element
        // to optimize space, we'll not store all elements in an extra array
        // in fact we'll do array style indexing of each element of the matrix using this method
        // matrix[][] = [1, 3, 5, 7]
        //              [10, 11, 16, 20]
        //              [23, 30, 34, 60]
        // array on basis of our observation - [1, 3, 5, 7,10, 11, 16, 20, 23, 30, 34, 60]
        // let's take element 34
        // location in array - 10
        // location in matrix - [2, 2]
        // we'll use this formula to find this [2, 2]
        // mid = 10
        // mid / cols will give us starting index -> 10 / 4 = 2
        // mid % cols will give us ending index -> 10 % 4 = 2
        // like this we'll implement simple 1-D array binary search in a 2-D matrix
        // See video for more understanding
        int low = 0;
        int high = (rows * cols) - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(matrix[mid / cols][mid % cols] == target){
                return true;
            }
            else if(matrix[mid / cols][mid % cols] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int x =11;
        int y = 23;
        int z = 28;

        boolean ans1 = search(matrix, x);
        if(ans1){
            System.out.println(x+" exists in the matrix.");
        }
        else{
            System.out.println(x+" does not exists in the matrix.");
        }
        System.out.println();

        boolean ans2 = search(matrix, y);
        if(ans2){
            System.out.println(y+" exists in the matrix.");
        }
        else{
            System.out.println(y+" does not exists in the matrix.");
        }
        System.out.println();

        boolean ans3 = search(matrix, z);
        if(ans3){
            System.out.println(z+" exists in the matrix.");
        }
        else{
            System.out.println(z+" does not exists in the matrix.");
        }
        System.out.println();
    }
}
