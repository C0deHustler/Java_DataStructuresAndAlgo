import java.util.Arrays;
import java.util.Scanner;
// Problem - https://codingcompetitions.withgoogle.com/kickstart/round/0000000000050e01/00000000000698d6
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/video/482ce9bc832643c1bf4ec6eca8a40506
public class GoogleKickStart_Training_BruteForceApproach {
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(x <= t){
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            reverse(arr, 0, n-1);

            int min = Integer.MAX_VALUE;
            for(int i=0; i<((n-p)+1); i++){
                int minHours = 0;
                int currentElement = arr[i];
                int currentIndex = i;
                for(int j=1; j<p; j++){
                    minHours += currentElement - arr[currentIndex +j];
                }
                min = Math.min(min, minHours);
            }
            System.out.println("Case #"+x+": "+min);
            x++;
        }
    }
}
