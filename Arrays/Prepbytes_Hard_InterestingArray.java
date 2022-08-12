import java.util.*;
import java.io.*;
// https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/INDKEY
public class Prepbytes_Hard_InterestingArray {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            boolean flag = false;
            int sum = 0;
            int s = 0;
            int e = n-1;
            while(s < e){
                sum = arr[s]+arr[e];
                if(sum == k){
                    flag = true;
                    System.out.println(s+" "+e);
                    break;
                }
                if(sum < k){
                    s++;
                }
                else{
                    e--;
                }
            }
            if(!flag){
                System.out.println("no answer");
            }
        }

    }
}