import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/UNIQUESORT
public class Prepbytes_Medium_SortedInAUniqueWay_ThanosSort {
    public static int maxLength(int[] arr, int start, int end){
        int length = 1;
        for(int i=start; i<end; i++){
            if(arr[i] <= arr[i+1]){
                length++;
            }
            else{
                length =  -1;
                break;
            }
        }
        return length;
    }

    public static int thanosSort(int[] arr, int start, int end){
        if(start < 0 || end > arr.length){
            return 0;
        }
        int mid = start+(end-start)/2;
        int value = maxLength(arr, start, end);

        if(value == -1){
            int leftMax = thanosSort(arr, start, mid);
            int rightMax = thanosSort(arr, mid+1, end);

            return Math.max(leftMax, rightMax);
        }
        else{
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int ans = thanosSort(arr, 0, n-1);
            System.out.println(ans);
        }
    }
}
