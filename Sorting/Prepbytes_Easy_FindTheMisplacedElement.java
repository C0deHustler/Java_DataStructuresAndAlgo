import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/REPLACE
public class Prepbytes_Easy_FindTheMisplacedElement {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n  =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int[] clone = new int[n];
            for(int i=0; i<n; i++){
                clone[i] = arr[i];
            }

            Arrays.sort(arr);

            int count = 0;
            for(int i=0; i<n; i++){
                if(arr[i] != clone[i]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}