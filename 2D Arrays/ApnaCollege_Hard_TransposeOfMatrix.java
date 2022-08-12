import java.util.*;

public class ApnaCollege_Hard_TransposeOfMatrix {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;  // row
        int n = matrix[0].length;   // col

        int[][] ans = new int[n][m];    // new int[col][row]

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[i][j] = matrix[j][i];   // ans[col][row] = matrix[row][col]
            }
        }
        return ans;
    }

    // This logic will work only for square matrix
    //swapping upper half elements with lower half elements
//    for(int i=0; i<n; i++){
//        for(int j=i; j<n; j++){ // j=i because we're swapping only upper half elements above diagonal with lower half elements
//            int temp = matrix[i][j]; // no change in the diagonals
//            matrix[i][j] = matrix[j][i];
//            matrix[j][i] = temp;
//        }
//    }

    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] ans = transpose(matrix);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans.length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}