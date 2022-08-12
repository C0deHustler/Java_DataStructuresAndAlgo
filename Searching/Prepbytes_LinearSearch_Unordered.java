import java.util.Scanner;

public class Prepbytes_LinearSearch_Unordered {
    public static int unorderedLinearSearch(int[] arr, int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(unorderedLinearSearch(arr, n, key));
    }
}
