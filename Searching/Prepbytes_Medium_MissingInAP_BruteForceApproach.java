import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/MISSAP
// Explanation - https://www.geeksforgeeks.org/find-missing-number-arithmetic-progression/     Method-1 written in C++
public class Prepbytes_Medium_MissingInAP_BruteForceApproach {
    public static int findMissing(int[] arr, int n){
        int a = arr[0];
        int l = arr[n-1];
        int sumAP;

        if((a+l)%2 == 0){
            sumAP = (a+l)/2;
            sumAP = sumAP * (n+1);
        }
        else{
            sumAP = (n+1)/2;
            sumAP = sumAP * (a+l);
        }
        int arrSum = 0;
        for(int i=0; i<n; i++){
            arrSum += arr[i];
        }
        return sumAP - arrSum;
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

            int ans = findMissing(arr, n);
            System.out.println(ans);
        }
    }
}
