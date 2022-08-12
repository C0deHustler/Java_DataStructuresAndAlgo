import java.util.*;
import java.io.*;
// Problem - https://mycode.prepbytes.com/problems/arrays/SMLGRTNUM
public class Prepbytes_Easy_IC_SmallerGreaterEqualNumbers {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int count1 = 0;
            int count2 = 0;
            int count3 = 0;

            for(int i=0; i<n; i++){
                if(arr[i]<k){
                    count1++;
                }
                else if(arr[i]>k){
                    count2++;
                }
                else{
                    count3++;
                }
            }

            System.out.print(count1+" "+count2+" "+count3);
            System.out.println();
        }

    }
}