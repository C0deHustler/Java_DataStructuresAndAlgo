import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/QUALITY
// Explanation - https://www.prepbytes.com/blog/arrays-interview-programming/quality-factor/
public class Prepbytes_Hard_QualityFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        long moves = 0;
        int current = 0;

        for(int i=0; i<n; i++){
            moves = moves + Math.abs(arr[i]-current);
            current = arr[i];
        }
        System.out.println(moves);
    }
}
