// Problem - https://leetcode.com/problems/rotate-image/\
// Explanation - https://www.youtube.com/watch?v=Y72QeX0Efxw&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=13

// T.C - O(n*n) + O(n*n) i.e. O(n*n), transpose + reverse
// S.C - O(1)

public class Striver_RotateMatrix {
    // 1. Transpose the matrix
    // 2. Reverse each row of the transposed matrix
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose of matrix for n*n size matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reversing each row of the new transposed matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotate(matrix);

        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
