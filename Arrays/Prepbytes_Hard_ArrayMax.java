import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/ARRMAX
public class Prepbytes_Hard_ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int maxSum = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){ // i<n, not i<(n-k)
                int sum = 0;
                for(int j=i; j<n; j+=k){    // j+=k, since we are hopping in jumps of increments of k
                    sum = sum + arr[j];
                    maxSum = Math.max(maxSum, sum); // Finding maxSum after each iteration of j loop because of this condition -
                                                                                // " He can stop moving to (i + k) at any time he wishes. Find the maximum possible value in the array after Arnab stops."
                }
            }
            System.out.println(maxSum);
        }
    }
}
//Sample Test Cases to practice -
//Input
//        10
//        10 2
//        -5 9 -10 2 -7 -3 -9 -8 -8 2
//        10 3
//        -5 8 -8 7 -7 9 6 -10 9 -6
//        10 4
//        2 0 -2 -1 -1 6 -9 0 9 1
//        10 5
//        9 -4 -3 10 -6 2 7 -7 2 -3
//        10 6
//        -6 1 9 -5 -3 -10 -3 -7 -4 7
//        10 7
//        2 0 -4 -4 -5 -1 9 6 4 2
//        10 8
//        -2 9 -8 -7 -10 -5 -4 6 9 -2
//        10 2
//        -3 2 6 -4 8 4 8 0 6 -10
//        10 9
//        3 5 -6 -10 -4 4 -9 7 0 -7
//        10 1
//        -2 8 -8 8 3 3 9 1 8 0
//        Output
//        11
//        18
//        10
//        12
//        9
//        9
//        9
//        28
//        7
//        32