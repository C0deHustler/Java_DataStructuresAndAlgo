// Problem - https://takeuforward.org/data-structure/set-matrix-zero/
// Explanation - https://www.youtube.com/watch?v=M65xBewcqcI&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=8
// T.C - O((n*m)+(n*m)), because we linearly traversed the matrix twice
// S.C - O(n) + O(m), for taking 2 dummy arrays

import java.util.Arrays;

public class Striver_SetMatrixZero_BruteForceSeBetter {
    public static void setZero(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] dummy1 = new int[rows];
        int[] dummy2 = new int[columns];

        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(matrix[i][j] == 0){
                    dummy1[i] = 0;  // dummy1 will handle rows
                    dummy2[j] = 0;  // dummy2 will handle columns
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                // since dummy1 was initialised for rows, and i iterates for the rows, dummy1[i]
                // since dummy2 was initialised for columns, and j iterates for the columns, dummy2[j]
                if(dummy1[i] == 0 || dummy2[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZero(matrix);

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
