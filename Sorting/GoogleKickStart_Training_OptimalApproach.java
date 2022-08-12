import java.util.Arrays;
import java.util.Scanner;
// Problem - https://codingcompetitions.withgoogle.com/kickstart/round/0000000000050e01/00000000000698d6
// Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/video/482ce9bc832643c1bf4ec6eca8a40506
public class GoogleKickStart_Training_OptimalApproach {
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

            int[] prefix = new int[n+1];    // n+1 because we'll do 1-based indexing in prefix array
            for(int j=0; j<n; j++){     // j=0 because arr[] will be involved in making of prefix[] array, and arr[] follows 0-based indexing, so to take care of that, start with j=0
                prefix[j+1] = prefix[j] + arr[j];   // j+1 because of 1-based indexing as we have started our loop from j=0
            }

            long ans = Long.MAX_VALUE;
            for(int i=p-1; i<n; i++){
                long currSum = prefix[i] - prefix[i-(p-1)]; // " - prefix[i-(p-1)] "     Most important to handle Case-"Lakdi"
                                                                                    // here, we are subtracting the element which is just before the starting of current window to get accurate result
                long finalHours = (p-1)*arr[i] - currSum;
                ans = Math.min(ans, finalHours);
            }

            System.out.println("Case #"+x+": "+ans);
            x++;
        }
    }
}
