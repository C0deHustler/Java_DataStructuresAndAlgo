import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/SUBSUM
// Explanation - https://www.youtube.com/watch?v=rYkfBRtMJr8

// Explanation is for finding all the sum of subsets, not the ultimate sum of all the subsets, so modifications made to get ans.
// See recursive tree in register notes.
public class Prepbytes_Hard_Subsets {
    public static int sumOfSubsets(int index, int sum, int[] arr, int n){
        int ans = 0;

        if(index == n){
            return sum;
        }
        ans += sumOfSubsets(index+1, sum+arr[index], arr, n);
        ans += sumOfSubsets(index+1, sum, arr, n);

        return ans;
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
            System.out.println(sumOfSubsets(0, 0, arr, n));
        }
    }
}




