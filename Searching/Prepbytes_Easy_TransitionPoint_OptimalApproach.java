import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/TRANSPOINT
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/video/be6e2dea77e2494eb48ffa34e31b1d99
// Also see gallery notes for logic and code understanding
public class Prepbytes_Easy_TransitionPoint_OptimalApproach {
    public static int searchOne(int[] arr, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        
        if(arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0)){
            return mid;
        }
        else if(arr[mid] == 0){
            return searchOne(arr, mid+1, end);
        }
        else{
            return searchOne(arr, start, mid-1);
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

            int ans = searchOne(arr, 0, n-1);
            System.out.println(ans);
        }
    }
}
