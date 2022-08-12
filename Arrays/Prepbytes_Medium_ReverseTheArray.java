import java.util.Scanner;

public class Prepbytes_Medium_ReverseTheArray {
    //Function for reversing the array
    public static void reverseArray(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //Function for printing the array
    public static void printArray(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    //Main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr, n);
        System.out.println();

        reverseArray(arr,0,n-1);
        printArray(arr, n);
    }
}
