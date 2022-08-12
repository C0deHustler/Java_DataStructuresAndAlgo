import java.util.*;

public class Prepbytes_Medium_FindTheMissing_OptimalApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n-1];   // elements of array are always stored in int range
            // Why long at some places and why not long for array???   => explanation in gallery pics
            long total = ((long)n*(n+1))/2;    // Formula for sum of N numbers
            long sum = 0;   // sum also stored in long, because for large values of n, sum can go out of range of int

            for(int i=0; i<n-1; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];  // Calculation of sum of elements of an array
            }
            System.out.println((total-sum));    // It will return the missing number.
        }
    }
}
