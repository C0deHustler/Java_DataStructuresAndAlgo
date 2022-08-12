import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MAXIMUM
public class Prepbytes_Hard_FindMaximum_BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MIN_VALUE;
        int diff = 0;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                diff = j-i;
                if(diff > ans && arr[j] > arr[i]){
                    ans = diff;
                }
            }
        }
        System.out.println(ans);
    }
}
