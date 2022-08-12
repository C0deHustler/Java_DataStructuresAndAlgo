import java.util.*;
import java.io.*;

public class Prepbytes_Hard_Addition_Multiplication_Matrix {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size and column size of both arrays : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int M = m;  // because we want 2 matrices of same size
        int N = n;  // because we want 2 matrices of same size

        // Declaration of 2 arrays of same size
        int[][] arr = new int[m][n];
        int[][] Arr = new int[M][N];

        // Input elements of 1st array
        System.out.println("Enter the elements of 1st array : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Input elements of 2nd array
        System.out.println("Enter the elements of 2nd array : ");
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                Arr[i][j] = sc.nextInt();
            }
        }

        // Declaring an array for storing sum of above 2 arrays
        int[][] sum = new int[m][n];
        // Summation of 2 arrays
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum[i][j] = arr[i][j] + Arr[i][j];
            }
        }

        // Declaring an array for product of 2 arrays
        int[][] product = new int[m][N];
        // Product of 2 arrays
        for(int i=0; i<m; i++){ // Iteration over rows of 1st matrix
            for(int j=0; j<N; j++){ // Iteration over columns of 2nd matrix
                for(int k=0; k<n; k++){ // Multiplication of rows of 1st matrix with columns of 2nd matrix
                    product[i][j] += arr[i][k] * Arr[k][j]; // Keep updating our product in this matrix
                }
            }
        }

        // Printing the sum array
        System.out.println("Your sum : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        // Printing the product array
        System.out.println("Your product : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<N; j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}