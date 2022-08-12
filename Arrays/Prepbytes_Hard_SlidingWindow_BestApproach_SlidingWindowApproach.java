import java.util.*;

public class Prepbytes_Hard_SlidingWindow_BestApproach_SlidingWindowApproach {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int max_sum = sum;
        for(int i=k; i<n; i++){
            sum += arr[i] - arr[i-k];
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        System.out.println("Maximum sum for k="+k+" consecutive elements is : "+max_sum);
    }
}
