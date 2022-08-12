import java.util.*;
import java.io.*;

public class Prepbytes_Easy_ScalarMultiplication {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[][] arr = new int[M][N];

            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<M; i++){
                int ans = 1;
                for(int j=0; j<N; j++){
                    ans = K * arr[i][j];
                    System.out.print(ans+" ");
                }
                System.out.println();
            }
    }
}