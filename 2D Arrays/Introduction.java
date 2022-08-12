import java.util.*;

public class Introduction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements :");
        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println("Your 2-D matrix is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
