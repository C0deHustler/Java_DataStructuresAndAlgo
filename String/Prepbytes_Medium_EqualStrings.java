import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/EQUALSTR
// Explanation -
// https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
// https://www.geeksforgeeks.org/minimum-move-end-operations-make-strings-equal/
public class Prepbytes_Medium_EqualStrings {
    public static int minimumMoves(String[] a, int size){
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            int count = 0;
            String temp = "";
            for(int j=0; j<size; j++){
                temp = a[j]+a[j];
                int index = temp.indexOf(a[i]);
                if(index != -1){
                    count += index;
                }
                else{
                    count = -1;
                }
            }
            ans = Math.min(ans, count);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.next();
            }
            System.out.println(minimumMoves(arr, n));
        }
    }
}
