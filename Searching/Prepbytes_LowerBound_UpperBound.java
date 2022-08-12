import java.util.Arrays;
import java.util.Scanner;
// Explanation - https://www.youtube.com/watch?v=gcYvFVZ_LUA
public class Prepbytes_LowerBound_UpperBound {
    public static int lowerBound(int[] arr, int start, int end, int key){
        while(end-start > 1){
            int mid = start+(end-start)/2;
            if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        if(arr[start] >= key){
            return start;
        }
        if(arr[end] >= key){
            return end;
        }
        return -1;
    }
    public static int upperBound(int[] arr, int start, int end, int key){
        while(end-start > 1){
            int mid = start+(end-start)/2;
            if(arr[mid] <= key){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        if(arr[start] > key){
            return start;
        }
        if(arr[end] > key){
            return end;
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
        Arrays.sort(arr);

        int t = sc.nextInt();
        while(t-- > 0){
            int key = sc.nextInt();
            int lb_index = lowerBound(arr, 0, n-1, key);
            int ub_index = upperBound(arr, 0, n-1, key);
            System.out.println("Index of lower bound - "+lb_index+" "+"\nLower Bound element - "+(lb_index != -1 ? arr[lb_index] : -1));
            System.out.println("Index of upper bound - "+ub_index+" "+"\nUpper Bound element - "+(ub_index != -1 ? arr[ub_index] : -1));
        }

    }
}
