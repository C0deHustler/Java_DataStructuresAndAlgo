// Problem - https://leetcode.com/problems/search-a-2d-matrix-ii/
// Problem - https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1/#
// Problem - https://takeuforward.org/data-structure/search-in-a-sorted-2d-matrix/

// Explanation - CPP notes
// T.C - O(n*m)
// S.C - O(1)

// Major Conditions :
// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.

public class Striver_SearchInSorted2DMatrix_II {
    public static boolean search(int[][] matrix, int x){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0;
        int c = cols - 1;

        // Suppose we're standing at any x element, since both rows and columns are sorted, so we know that
        // elements to the left of x will be smaller than it
        // elements to the down of x will be larger than it
        // this approach will be used to optimally search for an element in a sorted 2-D matrix
        while(r < rows && c >= 0){
            if(matrix[r][c] == x){
                System.out.println(x+" found at indexes ["+r+", "+c+"]");
                return true;
            }
            else if(matrix[r][c] > x){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11}, {2, 5, 8, 12}, {3, 6, 9, 16}, {10, 13, 14, 17}};
        int x = 8;
        int y = 16;
        int z = 24;

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
