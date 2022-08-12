import java.util.*;
import java.io.*;

// Time Complexity = O(n^2)
public class Prepbytes_Medium_MaximumDifference_BasicApproach {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    sum = (Math.abs(arr[i]-arr[j]))+(Math.abs(i-j));
                    if(sum > max){
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }

    }
}