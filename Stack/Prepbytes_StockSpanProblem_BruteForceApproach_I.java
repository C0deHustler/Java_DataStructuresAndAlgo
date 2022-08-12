import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/video/af14098cddb849deadc93c5399142701
// Explanation - Pics Notes
// S.C - O(n)
// T.C - O(n^2)
public class Prepbytes_StockSpanProblem_BruteForceApproach_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int[] span = new int[n];    // Space Complexity will be O(n) because of this extra array used
            span[0] = 1;
            for(int i=1; i<n; i++){
                span[i] = 1;
                for(int j=i-1; j>=0; j--){
                    if(arr[j] <= arr[i]){
                        span[i]++;
                    }
                    else{
                        break;
                    }
                }
            }

            for(int i=0; i<n; i++){
                System.out.print(span[i]+" ");
            }
            System.out.println();
        }
    }
}
