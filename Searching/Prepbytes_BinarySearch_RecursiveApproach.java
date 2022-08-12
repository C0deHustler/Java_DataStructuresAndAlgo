import java.util.Scanner;
// Elements in a binary search must be in sorted order
public class Prepbytes_BinarySearch_RecursiveApproach {
    public static int binarySearch(int[] arr, int start, int end, int key){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;

        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid] > key){
            return binarySearch(arr, start, mid-1, key);
        }
        else{
            return binarySearch(arr, mid+1, end, key);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(binarySearch(arr, 0, arr.length-1, key));
    }
}
