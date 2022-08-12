import java.util.*;
import java.io.*;

public class Prepbytes_Medium_LowerAndUpperTriangularMatrices {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing Lower Triangular Matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<=i; j++){
                System.out.print(arr[i][j]+" ");
            }
            for(int j=1; j<n-i; j++){
                System.out.print(0+" ");
            }
            System.out.println();
        }

        // Logic for making an Upper Triangular matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i>j) {
                    arr[i][j] = 0;
                }
            }
        }
        // Printing Upper Triangular Matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
