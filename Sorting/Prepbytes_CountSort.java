import java.util.Scanner;
// Detailed explanation in c++ notes and cpp code
public class Prepbytes_CountSort {
    public static void countSort(int[] arr, int n){
        int[] output = new int[n];
        int k = 0;
        for(int i=0; i<n; i++){
            k = Math.max(k, arr[i]);
        }

        int[] count = new int[k+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        for(int i=1; i<=k; i++){
            count[i] += count[i-1];
        }

        for(int i=n-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        countSort(arr, n);

        for(int i=0; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
