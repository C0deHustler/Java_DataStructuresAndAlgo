import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/MAXSUB
// Explanation - https://www.youtube.com/watch?v=MCvGwtkqJS0
// T.C - O(n * k)
// S.C - O(1)

public class Prepbytes_Medium_FindMaxInWindow_BruteForce {
    public static void function(int[] arr, int n, int k){
        int max;
        for(int i = 0; i <= n-k; i++){  // traversing complete array till (n-k)
            max = arr[i];
            for(int j = 1; j < k; j++){ // finding the maximum element in the k-sized window
                if(arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        function(arr, n, k);
    }
}
