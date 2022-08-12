import java.util.Scanner;

public class Prepbytes_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<(n-1); i++){
            int max = arr[i];
            int loc = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < max){
                    max = arr[j];
                    loc = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[loc];
            arr[loc] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
