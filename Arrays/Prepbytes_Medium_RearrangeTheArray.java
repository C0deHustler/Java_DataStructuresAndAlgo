import java.util.*;
import java.io.*;

public class Prepbytes_Medium_RearrangeTheArray {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            // Auxiliary array to hold modified array
            int[] temp = arr.clone();
            // Indexes of smallest and largest elements
            // from remaining array.
            int small = 0;
            int large = n-1;
            // To indicate whether we need to copy remaining
            // largest or remaining smallest at next position
            boolean flag = true;

            // Store result in temp[]
            
            for(int i=0; i<n; i++){
                if(flag){
                    arr[i] = temp[large--]; // Decrement large after each iteration
                }
                else{
                    arr[i] = temp[small++]; // Incrementing small after each iteration
                }
                flag = !flag;   // The main trick is this, after each iteration, we're changing true to false, and then false to true and vice versa
                                      // Due to this trick, our if and else conditions will get executed alternatively, and we will get our desired result.
            }
            for(int i=0; i<n; i++) {           
                System.out.print(arr[i] +" ");
            }
        }
    }
}
