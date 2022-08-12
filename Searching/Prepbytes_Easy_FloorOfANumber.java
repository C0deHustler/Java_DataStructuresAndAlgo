import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/FLOOR
// Explanation - https://www.geeksforgeeks.org/floor-in-a-sorted-array/
public class Prepbytes_Easy_FloorOfANumber {
    public static int solve(int[] arr, int n, int x){
        if(x >= arr[n-1]){
            return (n-1);
        }
        else if(x < arr[0]){
            return (-1);
        }
        for(int i=0; i<n; i++){
            if(arr[i] > x){
                return (i-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr, n, x));
        }
    }
}
