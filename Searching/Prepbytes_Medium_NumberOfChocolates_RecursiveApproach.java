import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/NUMCHOC
public class Prepbytes_Medium_NumberOfChocolates_RecursiveApproach {
    public static int function(int[] arr, int start, int end, int key){
        if(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] <= key && (mid+1>end || arr[mid+1] > key)){
                return mid+1;
            }
            else if(arr[mid]<=key){
                return function(arr, mid+1, end, key);
            }
            else{
                return function(arr, start, mid-1, key);
            }
        }
        return 0;   // if no cases passes, then return 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int q = sc.nextInt();
        int[] qarr = new int[q];
        for(int i=0; i<q; i++){
            qarr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++){
            int ans = function(arr, 0, n-1, qarr[i]);
            System.out.println(ans);
        }
    }
}