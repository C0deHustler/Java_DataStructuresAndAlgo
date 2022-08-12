// Problem - https://takeuforward.org/data-structure/set-matrix-zero/
// Explanation - https://www.youtube.com/watch?v=M65xBewcqcI&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=8
// T.C - O((n*m)*(n+m)), S.C - O(1)
// n*m - for linearly traversing the whole matrix
// n+m - for each traversal, we'll traverse entire row and entire column

public class Striver_SetMatrixZero_BruteForce {
    public static void setZero(int[][] matrix){
        // Remember both of these ways to find the size of a matrix (2-D array)
        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){

                if(matrix[i][j] == 0){
                    // we're considering that matrix contains non-negative elements,
                    // that's why we'll change it to -1, so that there will be no chance of a duplicate
                    // Updating elements in that column to -1 initially
                    // Instead of changing directly to 0, first we'll change elements to -1 so that if more 0 will exist in matrix,
                    // then those 0's can be handled and will not be ignored

                    // Updating elements in that column to -1 initially

                    // Those elements which are in that column, but in the rows, which are above the current row ( 0 ke upar waale elements)
                    int ind = i-1;
                    while(ind >= 0){
                        if(matrix[ind][j] != 0){
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    // Those elements which are in that column, but in the rows, which are below the current row ( 0 ke neeche waale elements)
                    ind = i+1;
                    while(ind < rows){
                        if(matrix[ind][j] != 0){
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }

                    // Updating elements in that row to -1 initially

                    // Those elements which are in that row, but in the columns, which are to the left of current column ( 0 ke left waale elmenets)
                    ind = j-1;
                    while(ind >= 0){
                        if(matrix[i][ind] != 0){
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }
                    // Those elements which are in that row, but in the columns, which are to the right of current column ( 0 ke right waale elements)
                    ind = j+1;
                    while(ind < columns){
                        if(matrix[ind][j] != 0){
                            matrix[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }
        // Updating all -1 to 0
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(matrix[i][j] == -1){
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
