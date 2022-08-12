import java.util.*;
import java.io.*;

//      https://www.prepbytes.com/blog/arrays-interview-programming/saitamas-punch/

public class Prepbytes_Hard_SaitamaPunch {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();

            long sum = 0;
            long curr_time = arr[0] + k;

            for(int i=1; i<n; i++){
                if(curr_time <= arr[i]){
                    sum += k;
                }
                else{
                    sum += arr[i] - arr[i-1];
                }
                curr_time = arr[i] + k;
            }
            /* adding time for the last punch */
            sum += k;

            System.out.println(sum);

        }
    }
}