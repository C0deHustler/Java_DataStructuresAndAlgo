import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/MEDIAN
// Need of sorting -  Whenever we need to find median
public class Prepbytes_Easy_MedianOfSortedArray {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // we need a sorted array for finding median.

        System.out.println(arr[(n-1)/2]);    // Since n will always be odd as per the given input condition,
                                                                // so this formula will work, but if n will be even then we need to apply some other formula
    }
}