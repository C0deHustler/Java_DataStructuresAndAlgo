import java.util.Scanner;
// Problem - https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1/#
// Explanation - https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
public class GFG_Easy_Segregate0sAnd1s {
    public static void sort01(int[] arr, int n){
        int left = 0;
        int right = n-1;
        while(left < right){
            while(left < right && arr[left] == 0){
                left++;
            }
            while(left < right && arr[right] == 1){
                right--;
            }
            if(left < right){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scanner.nextInt();
            }

            sort01(arr, n);

            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
