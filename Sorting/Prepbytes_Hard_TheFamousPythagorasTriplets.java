import java.util.Arrays;
import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/PYTHTRI1
// Explanation - Same as Prepbytes_Medium_SearchTriplets_OptimalApproach1
public class Prepbytes_Hard_TheFamousPythagorasTriplets {
    public static void pythagorasTriplets(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=n-1; i>=2; i--){
            int j = 0;
            int k = i-1;
            while(j < k){
                if((arr[j]*arr[j])+(arr[k]*arr[k]) == (arr[i]*arr[i])){
                    System.out.println("Yes");
                    return;
                }
                else if((arr[j]*arr[j])+(arr[k]*arr[k]) < (arr[i]*arr[i])){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        System.out.println("No");
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

            pythagorasTriplets(arr, n);
        }
    }
}
