import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/PEAKELE
public class  Prepbytes_Medium_PeakHouse{
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int ans = -1;
            for(int i=0; i<n; i++){
                if(arr[i] > max){
                    max = arr[i];
                    ans = i;
                }
            }
            System.out.println(ans);
        }

    }
}