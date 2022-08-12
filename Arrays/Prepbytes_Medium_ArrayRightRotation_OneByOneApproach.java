import java.util.*;
import java.io.*;

public class Prepbytes_Medium_ArrayRightRotation_OneByOneApproach {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }

            int temp;
            for(int i=1; i<=K; i++){
                temp = arr[N-1];
                for(int j=N-1; j>0; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }

            for(int i=0; i<N; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}