import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/video/af14098cddb849deadc93c5399142701
// Explanation - Pics Notes
// S.C - O(1)
// T.C - O(n^2)
public class Prepbytes_StockSpanProblem_BruteForceApproach_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int span = 1;    // Space Complexity will be O(1) because of no extra array used, instead we used a variable
            System.out.print(span+" ");
            for(int i=1; i<n; i++){
                span = 1;
                for(int j=i-1; j>=0; j--){
                    if(arr[j] <= arr[i]){
                        span++;
                    }
                    else{
                        break;
                    }
                }
                System.out.print(span+" ");
            }
        }
    }
}
