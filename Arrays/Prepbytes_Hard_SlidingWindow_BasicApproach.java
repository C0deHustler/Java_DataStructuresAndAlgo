import java.util.*;

public class Prepbytes_Hard_SlidingWindow_BasicApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum;
        int max_sum = -1;   // only when we have positive integers in our array
        for(int i=0; i+k-1<n; i++){ // i+k-1<n explained in gallery notes ( i<=n-k can also be used) like we did in
                                    // Queue - Prepbytes_Medium_FindMaxInWindow_BruteForce
            sum = 0;
            for(int j=i; j<i+k; j++){   // j<i+k explained in gallery notes
                sum += arr[j];
            }
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        System.out.println("Maximum sum for consecutive k="+k+" elements is : "+max_sum);
    }
}
