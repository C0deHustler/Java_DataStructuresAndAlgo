import java.util.*;
// Problem - https://leetcode.com/problems/spiral-matrix/

public class ApnaCollege_Hard_SpiralOrderMatrixTraversal {

    public static void Spiral(int arr[][]){
        int ROW = arr.length;
        int COLUMN = arr[0].length;

        int row_start = 0, row_end = ROW-1, col_start = 0, col_end = COLUMN-1;
        //spiral printing
        while(row_start <= row_end && col_start <= col_end ){
            //for row_start
            for(int col=col_start; col<=col_end;col++){
                System.out.print(arr[row_start][col]+" ");
            }
            row_start++;
            //for col_end
            for(int row=row_start; row<=row_end; row++){
                System.out.print(arr[row][col_end]+" ");
            }
            col_end--;
            //for row_end
            if(row_start <= row_end){
                for(int col=col_end; col>=col_start; col--){
                    System.out.print(arr[row_end][col]+" ");
                }
            }
            row_end--;
            //for col_start
            if(col_start <= col_end){
                for(int row=row_end; row>=row_start; row--){
                    System.out.print(arr[row][col_start]+" ");
                }
            }
            col_start++;
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        Spiral(matrix);
    }
}
