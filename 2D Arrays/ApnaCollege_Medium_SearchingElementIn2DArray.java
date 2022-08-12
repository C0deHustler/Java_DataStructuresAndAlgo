import java.util.*;

public class ApnaCollege_Medium_SearchingElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        //declaration of 2-D matrix
        int[][] matrix = new int[rows][cols];
        //input the elements of 2-D arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //input the element to be searched
        int x = sc.nextInt();
        //traversing the 2-D matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //searching and comparing
                if (matrix[i][j] == x) {
                    System.out.println("Indices of your element : (" + i+","+j+")");
                }
            }
        }
    }
}
